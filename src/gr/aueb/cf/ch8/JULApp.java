//package gr.aueb.cf.ch8;
//
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//import java.util.logging.FileHandler;
//import java.util.logging.Handler;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//public class JULApp {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static Scanner getFileDescriptor(String s){
//        file fd = new File(s);
//        logger logger = getLogger();
//
//        try {
//            return new Scanner(fd);
//        } catch (FileNotFoundException e) {
//            logger.severe("File not found" + e.getMessage)
//        }
//
//}
//    public static Logger getLogger() throws IOException {
//        Logger logger = Logger.getLogger(JULApp.class.getName());
//        Handler fileHandler;
//
//        try {
//            fileHandler = new FileHandler("cf.log", true);
//            fileHandler.setFormatter(new SimpleleFormatter());
//        } catch ((IOException e)) {
//            throw new RuntimeException(e);
//        }
//
//        logger.addHandler(fileHandler);
//        return logger;
//    }
//}
