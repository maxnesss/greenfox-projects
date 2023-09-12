// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid.
//
// Set the 3 sides to 10.4, 13.5, 8.2 and your program should
// produce the following output:
//
// Surface Area: 672.76
// Volume: 1151.28


public class Cuboid {
    public static void main(String[] args) {
        // sizes of sides
        double sideA = 10.4;
        double sideB = 13.5;
        double sideC = 8.2;

        // formula for surface area of cuboid: 2*((a*b)+(a*c)+(b*c))
        double surfaceArea = 2 * ((sideA * sideB) + (sideB * sideC) + (sideA * sideC));
        System.out.println("Surface Area: " + surfaceArea);

        // formula for volume of cuboid: a*b*c
        double volume = sideA * sideB * sideC;
        System.out.println("Volume: " + volume);

    }
}
