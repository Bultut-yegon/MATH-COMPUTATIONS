import java.util.Scanner;
class Multiply{
    public double getValue(double num1, double num2){
        return num1*num2;
    }
}
public class Multi {
    public static void main(String[] args) {
        Scanner pro=new Scanner(System.in);
        System.out.print("Enter num1 :");
        float num1=pro.nextFloat();
        System.out.print("Enter num2 :");
        float num2=pro.nextFloat();
        Multiply value=new Multiply();
        double results=value.getValue(num2, num2);
        System.out.println(results);

    }
    
}
