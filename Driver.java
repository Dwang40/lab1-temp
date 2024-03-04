import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException{
        String alphabet = "abcdefhijklmnopqrstuvwxyz";
        File test = new File ("test.txt");
        File alice = new File ("alice.txt");
        File othello = new File ("othello.txt");
        Main a = new Main();

    //a.Freq(a.scan(alice));
    //a.Freq(a.scan(othello));
    //a.Checker();
    //a.Freq(a.scan(alice));
    //a.Freq(a.scan(alice));
    //a.distance(a.Freq(a.scan(alice)), a.Freq(a.scan(othello)));
    //a.distance(othello, alice);
    //a.rotate("May the force be with you", 1);
    //a.atbash(alphabet);
    a.decode("Drp Kyv Wfitv Sv Nzky Pfl");
    }
}
