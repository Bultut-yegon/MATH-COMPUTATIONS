import java.util.Scanner;
class All{
    public double circlecircumference(double radius){
        return (3.142857*(radius*2));
    }
    public double circlearea(double radius){
        return 3.142857*radius*radius;
    }
    public double multiply(double num1, double num2){
        return num1*num2;
    }
    public double trianglearea(double base, double height){
        return 0.5*base*height;
    }
    public double recperimeter(double length, double width){
        return 2*(length+width);
    }
    public double addition(double num1 , double num2){
        return num1+num2;
    }
    public double division(double num1, double num2){
        return num1/num2;
    }
    public double subtraction(double num1, double num2){
        return num1-num2;
    }
}

public class Whole {
    public static void main(String[] args) {
        Scanner perform=new Scanner(System.in);
        All both=new All();
        System.out.println("1. perimeter of Rectangle");
        System.out.println("2.Area of a Circle");
        System.out.println("3.Circumference of circle");
        System.out.println("4.Addition");
        //System.out.println("5.");
        System.out.println("5.subtraction");
        System.out.println("6.Division");
        System.out.println("7.multiplication");
        System.out.println("8.Area of triangle");
        System.out.println("Choose the shape for your operation:");
        int operation=perform.nextByte();
        switch(operation){
            case 1:
            System.out.print("Enter the lenght: ");
            float lenght=perform.nextFloat();
            System.out.print("Enter the width: ");
            float width=perform.nextFloat();
            double result=both.recperimeter(lenght, width);
            System.out.println(result);
            break;
            case 2:
            System.out.print("Enter the radius ");
            float radius=perform.nextFloat();
            
            double result1=both.circlearea(radius);
            System.out.println(result1);
            break;
            case 3:
            System.out.print("Enter the radius: ");
            float radius1=perform.nextFloat();
            double result2=both.circlecircumference(radius1);
            System.out.println(result2);
            break;
            case 4:
            System.out.print("Enter the first no: ");
            float num1=perform.nextFloat();
            System.out.print("Enter the second no: ");
            float num2=perform.nextFloat();
            double result3=both.addition(num1, num2);
            System.out.println(result3);
            break;
            case 5:
            System.out.print("Enter the first no: ");
            float sub1=perform.nextFloat();
            System.out.print("Enter the second no: ");
            float sub2=perform.nextFloat();
            double result4=both.subtraction(sub1, sub2);
            System.out.println(result4);
            break;
            case 6:
            System.out.print("Enter the first no: ");
            float div1=perform.nextFloat();
            System.out.print("Enter the second no: ");
            float div2=perform.nextFloat();
            double result5=both.division(div1, div2);
            System.out.println(result5);
            break;
            case 7:
            System.out.print("Enter the first no: ");
            float mul1=perform.nextFloat();
            System.out.print("Enter the second no: ");
            float mul2=perform.nextFloat();
            double result6=both.multiply(mul1, mul2);
            System.out.println(result6);
            break;
            case 8:
            System.out.print("Enter the base: ");
            float base=perform.nextFloat();
            System.out.print("Enter the height: ");
            float height=perform.nextFloat();
            double result7=both.trianglearea(base, height);
            System.out.println(result7);
            break;
        }
        perform.close();
    }
    
}
