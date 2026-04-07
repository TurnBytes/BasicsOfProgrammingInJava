import java.util.Scanner;

public class Basic{

    public static void gradeCalculation(int sum){
        if(sum > 80)
            System.out.println("A");
        else if(sum > 60)
            System.out.println("B");
        else if(sum > 40)
            System.out.println("C");
        else
            System.out.println("D");

    }
    public static void run(){

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String [] subject = {"AI","OS","JAVA","Network", "Algorithms"};
        int[] numberOne = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Enter Number for " + subject[i]);
            numberOne[i] = sc.nextInt();
            sum += numberOne[i];
    
        }
        System.out.println(sum);
        sc.close();
        gradeCalculation(sum);
    }
    public static void main(String[] args) {
        run();
    

        //int numberTwo;
        //int numberThree;
        //int numberFour;
        //int numberFive;

        //numberOne = sc.nextInt();
        //numberTwo = sc.nextInt();
        ///numberThree = sc.nextInt();
        //numberFour = sc.nextInt();
        //numberFive = sc.nextInt();
        //int sum = numberOne + numberTwo + numberThree + numberFour + numberFive;
        
    }
}