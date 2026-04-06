package W4L1;
import java.util.Random;

public class AutoVehicle {

    public static void song(){

        String [] environment = {"School", "motorway", "town"};
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            String randomEnv = environment[random.nextInt(environment.length)];//random number

            if(randomEnv.equals("School"))
            {   System.out.print("Entered School Area: ");
                for(int j= 0; j<10; j++){
                System.out.print("---> ");
                try{
                    Thread.sleep(3000);
                }catch(Exception e){

                }
            }System.out.println();

            }else if(randomEnv.equals("motorway")){
                System.out.print("Entered motorway: ");
                for(int j= 0; j<10; j++){
                    System.out.print("---> ");
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){

                    }
                }System.out.println();
            }else {
                System.out.print("Entered town: ");
                for(int j= 0; j<10; j++){
                    System.out.print("---> ");
                    try{
                        Thread.sleep(2000);
                    }catch(Exception e){

                    }
                }System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        AutoVehicle obj = new AutoVehicle();
        AutoVehicle.song();        
    }
}
