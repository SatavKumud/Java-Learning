package Core_Java;
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


public class Constructor_Practiceset {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setHeight(23);
        System.out.println(c.getHeight());
        c.setRadius(4);
        System.out.println(c.getRadius());
    }
}
