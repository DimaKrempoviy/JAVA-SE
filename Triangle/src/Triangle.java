import java.util.Scanner;

public class Triangle
{
    static double Area;

    static double function(double a, double b , double c){
        double p = a+b+c;
        return p;
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter the other side of the triangle: ");
        double b = sc.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double c = sc.nextDouble();


        System.out.println("Please select an action: ");
        System.out.println("1.   Is it a triangle?");
        System.out.println("2.   What type of triangle?");
        System.out.println("3.   Area of the triangle");
        System.out.println("4.   Perimeter of a triangle");
        System.out.println("5.   Angles of a triangle");
        System.out.print("Your choice: ");

        int userChoose = sc.nextInt();

        switch (userChoose) {

            case 1:{
                if (a + b > c && a + c > b && b + c > a)
                    System.out.println("The triangle exists.");
                else
                    System.out.println("The triangle doesn't exist.");
            }break;
            case 2:{
                if(a<=0 || b<=0 || c<=0)
                    System.out.println("InvalidInput");
                else if(a>=(b+c) || c>=(b+a) || b>=(a+c))
                    System.out.println("Not a Triangle");
                else if(a==b && b==c)
                    System.out.println("Equilateral Triangle");
                else if(((a*a)+(b*b))==(c*c) || ((a*a)+(c*c))==(b*b) || ((c*c)+(b*b))==(a*a))
                    System.out.println("Right Triangle");
                else if(a!=b && b!=c && c!=a)
                    System.out.println("Scalene Triangle");
                else if(a==b || c==a || c==b)
                    System.out.println("Isosceles Triangle");
            } break;
            case 3: {
                double s = (a + b + c) / 2;
                Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("The area is equal to: " + Area);
            } break;
            case 4: {
                System.out.println("The perimeter is: "+function(a, b, c));
            }
            case 5: {
                double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c)) * 180 / Math. PI;
                double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c)) * 180 / Math. PI;
                double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b)) * 180 / Math. PI;

                System.out.println("Angle 1 is: " + angleA);
                System.out.println("Angle 2 is: " + angleB);
                System.out.println("Angle 3 is: " + angleC);
            }
        }
    }
}