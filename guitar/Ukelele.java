package guitar;

class Guitar {

    public String guitarName;
    public int fretCount;
    public boolean isPremium;
}

//           Child   extends Parent
public class Ukelele extends Guitar{
    String ukeleleName;
}

class BassGuitar extends Guitar{

}


interface guitarInterface {

    
}

class MainClass{
    public static void main(String[] args) {
        Ukelele ukelele = new Ukelele();

        ukelele.fretCount = 10;
        ukelele.guitarName = "Fender";

    }
}
