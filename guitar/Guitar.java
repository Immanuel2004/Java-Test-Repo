package guitar;

// Class is a user defined blueprint which has varibles and methods
public class Guitar {



    // Properities / attributes
    public String guitarName;
    public int fretCount;
    public boolean isPremium;
    
    // Behaviours / methods
    public void playGuitar(){
        System.out.println("Guitar is being played");
    }

    // polymorphism
    public void playGuitar(String guitarName){
        System.out.println(guitarName+" ,Guitar is being played");
    }


    public int calcuate(int a , int b){
        return a * b;
    }

}
