import java.util.Scanner;
//Basic re-iterated
class InnerDemoFirst {

    int marks;
    private char grad;

    //getter
    public char getGrad() {
        return grad;
    }
    //setter
    public void setGrad(char grad) {
        this.grad = grad;
    }

    public void InformGuardian(char g){

        System.out.println("Your child has secured :"+g);
    }

    public void UserInteraction(char myGrad){
        //char myGrad = demo.getGrad();

        if(myGrad == 'A'){
            System.out.println("Congratulation, You're super genius!");
            this.InformGuardian(myGrad);
            
        }else if (myGrad == 'B') {
            System.out.println("Good, but you need to work hard");
            this.InformGuardian(myGrad);

            
        }else{
            System.out.println("You're loser");
            this.InformGuardian(myGrad);

        }

    }
}

class Main{

     public static void main(String[] args) {
        InnerDemoFirst demo = new InnerDemoFirst();
        Scanner scanner = new Scanner(System.in);
        
        demo.setGrad('B');
        demo.UserInteraction(demo.getGrad());
        
        
     }


}
