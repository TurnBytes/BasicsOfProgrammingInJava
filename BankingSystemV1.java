import java.util.Scanner;
public class BankingSystemV1 {
    
    int [] bankBalance = new int[7];
    int limit;
    final float deductionRate = 2.5f;


    // remember, this is very basic and contain multiple logical errors-cum-bad practices-- but stay high, we gonna fix it--cheers

    public static void main(String[] args) {
        

        BankingSystemV1 account = new BankingSystemV1();
        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<5; i++){

            System.out.println("Please Enter Account Balance: ");
            account.bankBalance[0] =  scanner.nextInt(); 

            System.out.println("Please Enter Limit: ");
            account.limit  = scanner.nextInt();
            
            if(account.bankBalance[0]>account.limit){
                float zakat = (account.deductionRate/100)*account.bankBalance[i];
                System.out.println(account.bankBalance[0]-zakat);
            }else{
                System.out.println("Da kas looser di");
            }
            
            System.out.println("Account Balance: "+ account.bankBalance[i] + " Limit: " + account.limit + " Deduction Rate: " + account.deductionRate);
        }
        
    }
}





