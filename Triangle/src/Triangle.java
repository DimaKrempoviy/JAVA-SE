import java.util.Scanner;

public class Triangle {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String FIRST_SIDE_TRIANGLE = "Enter the first side of the triangle: ";
    private static final String TWO_SIDE_TRIANGLE = "Enter the other side of the triangle: ";
    private static final String THIRD_SIDE_TRIANGLE = "Enter the third side of the triangle: ";
    private static final String TRIANGLE_DOES_NOT_EXIT = "The triangle doesn't exist.";
    private static final String AREA_TRIANGLE = "The area is equal to: ";
    private static final String TRIANGLE_PERIMETER = "The perimeter is: ";
    private static final String FIRST_ANGLE_TRIANGLE = "Angle 1 is: ";
    private static final String TWO_ANGLE_TRIANGLE = "Angle 2 is: ";
    private static final String THIRD_ANGLE_TRIANGLE = "Angle 3 is: ";


    public static void main(String[] args) {
        double sideA = side_Of_A_Triangle(FIRST_SIDE_TRIANGLE);
        double sideB = side_Of_A_Triangle(TWO_SIDE_TRIANGLE);
        double sideC = side_Of_A_Triangle(THIRD_SIDE_TRIANGLE);

        if (!rightTriangle(sideA,sideB,sideC)){
            System.out.println(TRIANGLE_DOES_NOT_EXIT);
        }

        typeTriangle(sideA,sideB,sideC);

        System.out.println(AREA_TRIANGLE + areaTriangle(sideA,sideB,sideC));

        System.out.println(TRIANGLE_PERIMETER + perimeter(sideA, sideB, sideC));

        angles(sideA,sideB,sideC);
            double angleA = angles(sideA,sideB,sideC);
            double angleB = angles(sideB,sideA,sideC);
            double angleC = angles(sideC,sideB,sideA);


            System.out.println(FIRST_ANGLE_TRIANGLE + angleA);
            System.out.println(TWO_ANGLE_TRIANGLE + angleB);
            System.out.println(THIRD_ANGLE_TRIANGLE + angleC);


    }

    private static double side_Of_A_Triangle(String requestMessage) {
        System.out.println(requestMessage);
        return SCANNER.nextDouble();
    }

    private static boolean typeTriangle(double sideA, double sideB, double sideC) {
        if (sideA == sideB && sideB == sideC){
            System.out.println("Equilateral Triangle");
            return Boolean.TRUE;
        }
        else if (((sideA * sideA) + (sideB * sideB)) == (sideC * sideC)
                || ((sideA * sideA) + (sideC * sideC)) == (sideB * sideB)
                || ((sideC * sideC) + (sideB * sideB)) == (sideA * sideA)){
            System.out.println("Right Triangle");
            return Boolean.TRUE;
        }
        else if (sideA != sideB && sideB != sideC && sideC != sideA){
            System.out.println("Scalene Triangle");
            return Boolean.TRUE;
        }
        else if (sideA == sideB || sideC == sideA || sideC == sideB){
            System.out.println("Isosceles Triangle");
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    private static boolean rightTriangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA){
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    private static double areaTriangle(double sideA, double sideB, double sideC) {
        double half_Triangle = (sideA + sideB + sideC) / 2;
        return Math.sqrt(half_Triangle * (half_Triangle - sideA) * (half_Triangle - sideB) * (half_Triangle - sideC));
    }

    private static double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    private static double angles(double sideA, double sideB, double sideC) {
        return Math.acos((sideB * sideB + sideC * sideC - sideA * sideA) / (2 * sideB * sideC)) * 180 / Math.PI;
    }
}