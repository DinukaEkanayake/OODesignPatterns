package adoptor;

import adoptor.external.ImageViewer;

import java.security.PublicKey;

public class ImageAdaptor implements Player{

    private ImageViewer imageViewer;

    public ImageAdaptor(ImageViewer imageViewer){
        this.imageViewer=imageViewer;
    }

    @Override
    public void play(String filePath) {
        //call the imgviewer.show method

        //1st way to do
       // ImageViewer imageViewer=new ImageViewer();
        imageViewer.show(filePath);

    }
}
