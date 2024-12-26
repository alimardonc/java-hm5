import A.Lor;
import A.Xirurg;
import B.Computers.PC;
import B.Sounds.Loudspeaker;
import B.Sounds.Subwoofer;

public class Main {
    public static void main(String[] args) {
        //A
        Xirurg xr = new Xirurg();
        xr.display();
        Lor lor = new Lor();
        lor.display();

        //B
        PC pc = new PC();
        pc.display();
        Loudspeaker ls = new Loudspeaker();
        ls.display();
        Subwoofer sw = new Subwoofer();
        sw.display();
    }
}