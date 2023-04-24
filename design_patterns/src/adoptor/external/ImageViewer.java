package adoptor.external;

///assume that this class was written by someone else and cant change it
public class ImageViewer {

    public void show(String filepath){
        System.out.println(filepath);
    }


}


//This class is incompatible with the player interface bcz it has play() and this has show() method.we can't modify this class.
//so use an adapter to make this compatible