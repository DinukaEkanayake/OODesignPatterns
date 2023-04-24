package adoptor;

public class Main {

    public static void main(String[] args) throws Exception {

        String filename=args[0];

        //using factory method design pattern
        Factory factory=new Factory();

        Player player=factory.getInstaance(filename);

        if (player!=null){
            player.play(filename);
        }
        else {
            throw new Exception("fileformtanotsupported");
        }


    }

}

//Adaptor design pattern