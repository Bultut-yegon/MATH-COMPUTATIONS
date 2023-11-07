import java.util.Scanner;
class Summation{
    public double addition(double number_1, double number_2){
        return number_1+number_2;
    }
}
public class MyAdd 
{
    public static void main(String[] args)
     {
      Scanner add=new Scanner(System.in);
      //user enters first number
      System.out.println("enter first number");
      float number_1=add.nextFloat();
      //user enters second number
      System.out.println("enter second number");
      float number_2=add.nextFloat();
      Summation call=new Summation();
      double sum=call.addition(number_1, number_2);
      //sum is calculated and displayed
      //float sum=number_1+number_2;
      System.out.println(sum);
      //close the object
      add.close();
    }
    
}

