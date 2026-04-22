import java.util.Scanner;

public class ExceptionHadling_V1 {
    static String xyz = null;
    public static void Emergency(Exception e){
        System.out.println("Emergency method called due to: " + e.getMessage());
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int [] evenNumber = {2,4,6,8};

        System.out.println("Enter Nominator");
        int nominator;
        nominator = sc.nextInt();

        System.out.println("Enter Denominator");
        int denominator, result;
        denominator = sc.nextInt();

        try {
            // null pointer exception
            System.out.println(xyz.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: xyz is null");
        }

        try {
            // array index out of bound exception
            System.out.println(evenNumber[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: index 4 is invalid");
        }

        try {
            // arithmetic exception
            result = nominator / denominator;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: cannot divide by zero");
        } catch (Exception e) {
            System.out.println("Caught unexpected exception: " + e.getMessage());
            Emergency(e);
        }

        System.out.println("hello");
    }

}
