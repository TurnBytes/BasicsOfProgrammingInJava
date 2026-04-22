import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    
    public static void Emergency(){
        System.out.println("Emergency method called due to: ");
    }

    public static void main(String[] args) {
        try{

            FileReader n = new FileReader("data.txt");
        }catch(FileNotFoundException e){
            
        }finally{
            Emergency();
        }
    }
}
