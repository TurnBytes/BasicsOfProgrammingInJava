import java.util.Scanner;

public class BankingSystem {

    int bankBalance;
    int limit;
    final float deductionRate = 2.5f;



    public static void main(String[] args) {
        

        BankingSystem account = new BankingSystem();
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<5; i++){

            System.out.println("Please Enter Account Balance: ");
            account.bankBalance =  scanner.nextInt();
    
            System.out.println("Please Ente Limit: ");
            account.limit  = scanner.nextInt();
            
            if(account.bankBalance>account.limit){
                float zakat = (account.deductionRate/100)*account.bankBalance;
                System.out.println(account.bankBalance-zakat);
            }else{
                System.out.println("Da kas looser di");
            }
    
            System.out.println("Acccount Balance: "+ account.bankBalance + " Limit: " + account.limit + " Deduction Rate: " + account.deductionRate);
        }
        

        //System.out.println("Please Enter Deduction Rate: ");
        //account.deductionRate = scanner.nextFloat();
        
        
    }
}
