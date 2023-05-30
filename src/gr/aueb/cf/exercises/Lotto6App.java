package gr.aueb.cf.exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Lotto6App {
    public static void main(String[] args) {
        int[] numbers = readNumbersFromFile("input.txt");
        if (numbers.length < 7 || numbers.length > 49) {
            System.out.println("Ο αριθμός των αριθμών στο αρχείο πρέπει να είναι από 7 έως 49.");
            return;
        }

        Arrays.sort(numbers);

        try {
            FileWriter writer = new FileWriter("output.txt");

            int[] combination = new int[6];
            generateCombinations(numbers, combination, 0, 0, writer);

            writer.close();
            System.out.println("Οι τελικές εξάδες έχουν εγγραφεί στο αρχείο output.txt.");
        } catch (IOException e) {
            System.out.println("Σφάλμα κατά την εγγραφή του αρχείου εξόδου.");
        }
    }

    public static void generateCombinations(int[] numbers, int[] combination, int startIndex, int currentIndex, FileWriter writer) throws IOException {
        if (currentIndex == 6) {
            if (passesFilters(combination)) {
                writeCombinationToFile(combination, writer);
            }
            return;
        }

        for (int i = startIndex; i < numbers.length; i++) {
            combination[currentIndex] = numbers[i];
            generateCombinations(numbers, combination, i + 1, currentIndex + 1, writer);
        }
    }

    public static boolean passesFilters(int[] combination) {
        return isAtMostEven(combination) && isAtMostOdd(combination) &&
                hasAtMostTwoConsecutive(combination) && hasAtMostThreeSameEnding(combination) &&
                hasAtMostThreeSameTen(combination);
    }

    public static boolean isAtMostEven(int[] combination) {
        int count = 0;
        for (int num : combination) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count <= 4;
    }

    public static boolean isAtMostOdd(int[] combination) {
        int count = 0;
        for (int num : combination) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count <= 4;
    }

    public static boolean hasAtMostTwoConsecutive(int[] combination) {
        for (int i = 0; i < combination.length - 1; i++) {
            if (combination[i + 1] - combination[i] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtMostThreeSameEnding(int[] combination) {
        for (int i = 0; i < combination.length - 2; i++) {
            if (combination[i] % 10 == combination[i + 1] % 10 && combination[i] % 10 == combination[i + 2] % 10) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtMostThreeSameTen(int[] combination) {
        int[] tensCount = new int[5];
        for (int num : combination) {
            int tens = num / 10;
            tensCount[tens - 1]++;
            if (tensCount[tens - 1] > 3) {
                return false;
            }
        }
        return true;
    }

    public static void writeCombinationToFile(int[] combination, FileWriter writer) throws IOException {
        for (int num : combination) {
            writer.write(num + " ");
        }
        writer.write("\n");
    }

    public static int[] readNumbersFromFile(String filename) {
        int[] numbers = new int[50];
        int index = 0;

        try {
            File file = new File(filename);
            java.util.Scanner scanner = new java.util.Scanner(file);

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == -1) {
                    break;
                }
                numbers[index] = number;
                index++;
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("Σφάλμα κατά την ανάγνωση του αρχείου.");
        }

        return Arrays.copyOfRange(numbers, 0, index);
    }
}

