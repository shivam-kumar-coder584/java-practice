import java.util.Scanner;
public class Condition {

    public static void main(String[] args)
    {
        int orignalpass=1233;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your password");
        int password=obj.nextInt();
        if(orignalpass==password)
        {
            System.out.print("your acounnt is open");
        }
        else{
            System.out.print("your password is incorract");
        }

    }
    
}
