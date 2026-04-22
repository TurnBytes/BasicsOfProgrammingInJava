import java.util.Scanner;

public class ExceptionHadling {
    static String xyz = null;
    public static void Emergency(Exception e){
        System.out.println("Emergency method called due to: " + e.getMessage());
    }
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println(xyz.toLowerCase());
        }catch(NullPointerException e){
            
        }

        int [] evenNumber = {2,4,6,8};
        try{

            System.out.println(evenNumber[4]);
        }catch(ArrayIndexOutOfBoundsException e){

        }
        System.out.println("Enter Nominator");
        int numerator;
        numerator = sc.nextInt();
        

        System.out.println("Enter Denominator");
        int denominator, result;
        denominator = sc.nextInt();
        try{

            result = numerator / denominator;
            System.out.println(result);
        }catch(Exception e){
            e.printStackTrace();
            Emergency(e);
        }

        System.out.println("hello");
    }

}
