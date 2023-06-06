package gr.aueb.cf.ch11;

/**
 * Immutable 3D Point.
 */
public class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
      this.point = new Point((int) point.getX(), (int) point.getY());
      this.z = z;
    }

    public Point getPoint() {
        return  new Point((int) this.point.getX(), (int) this.point.getY());
    }

    public int getZ() {
        return z;
    }
}
