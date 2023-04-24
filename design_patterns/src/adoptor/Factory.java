package adoptor;

import adoptor.external.ImageViewer;

public class Factory {

    Player player = null;
    public Player getInstaance(String filename){
        if (filename.endsWith(".mp3")){
            player=new MP3Player();
        } else if (filename.endsWith(".mp4")) {
            player=new MP4Player();
        }else if (filename.endsWith(".mkv")) {
            player=new MKVPlayer();
        }else if (filename.endsWith(".jpg")) {
            //player=new ImageViewer();//this error comes bcz the class imgeviewer incompatible with player
            player=new ImageAdaptor(new ImageViewer());
        }


       return player;
    }

}
