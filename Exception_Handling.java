import java.util.*;

public class Exception_Handling {

    int n1,n2,result;
    Scanner sc = new Scanner(System.in);

    void calculate() {

        try{
            System.out.println("Enter First Number ");
            n1=sc.nextInt();

            System.out.println("Enter Second Number ");
            n2=sc.nextInt();

            result = n1/n2;
        }

        catch(Exception e){
            System.out.println("Ouch! Exception Detected" +e.getMessage());
            e.printStackTrace();
        }

        System.out.println("The Division is "+result);
    }
    public static void main(String[] args) {

        Exception_Handling obj = new Exception_Handling();
        obj.calculate();
        
    }
    
}
