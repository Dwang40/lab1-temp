import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException{
        File test = new File ("test.txt");
        File alice = new File ("alice.txt");
        Main a = new Main();

       //a.Freq(a.scan(alice));
       //a.Freq(a.scan(alice));
      a.distance(alice, alice);
    }
}
