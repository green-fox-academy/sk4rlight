public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double sideOne = 100;
        double sideTwo = 150;
        double sideThree = 200;
        double surfaceArea = 2 * (sideOne * sideTwo + sideTwo * sideThree + sideOne * sideThree);
        double volumeOfCuboid = sideOne * sideTwo * sideThree;

        System.out.println(surfaceArea);
        System.out.println(volumeOfCuboid);

    }
}
