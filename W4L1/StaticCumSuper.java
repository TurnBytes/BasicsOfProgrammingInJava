package W4L1;

public class StaticCumSuper {
    public static void song(){

        String [] tracks = {"Song1", "Song2", "Song3"};

            //for(int i = 0; i < tracks.length; i++)
              //  System.out.println(tracks[i]);

            for (String track : tracks) {
                
                System.out.println(track + " downloaded Successfully!");
                try{

                    Thread.sleep(2000);
                }catch(InterruptedException e){

                }
            }
    }

    public static void main(String[] args) {
        StaticCumSuper obj = new StaticCumSuper();
        StaticCumSuper.song();        
    }
}
