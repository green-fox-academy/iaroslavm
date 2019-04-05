public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double width = 10;
        double height = 11;
        double length = 12;

        System.out.println("Surface Area: " + (2 * width * length + 2 * width * height + 2 * length * height));
        System.out.println("Volume: " + (width * height * length));

    }
}