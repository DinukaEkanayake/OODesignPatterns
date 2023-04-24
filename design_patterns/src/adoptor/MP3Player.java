package adoptor;

public class MP3Player implements Player {

    @Override
    public void play(String filePath){

        System.out.println("Playing the file "+filePath);

    }


}
