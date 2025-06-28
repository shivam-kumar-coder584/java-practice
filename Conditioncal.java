import java.util.Scanner;
public class Conditioncal {

    public static void main (String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=obj.nextInt();
         System.out.println("enter the second number");
         int num2=obj.nextInt();
         System.out.println("which operation do you want to perform -,+,/,%,*");
         char op=obj.next().charAt(0);
         if(op=='+')
         {    int sum=num1+num2;
            System.out.println(num1+"+"+num2+"="+sum);
         }
         if(op=='-')
         {    int sum=num1-num2;
            System.out.println(num1+"-"+num2+"="+sum);
         }
         if(op=='*')
         {    int sum=num1*num2;
            System.out.println(num1+"*"+num2+"="+sum);
         }
         
//same as peform all the operation 
    }
    
}
