package guitar;

public class MainClass {
    public static void main(String[] args) {
        
        // An Object is an instance of a class, through which we can access the variables and methods of that class

        // Todo: Create an object 
    //  class  object       = new  Constructor 
        Guitar fenderGuitar = new Guitar();

        /*
         * 
         * fenderGuitar [
         * 
         *      guitarName 
         *      fretCount
         *      isPremium 
         * 
         * ]
         * 
         * 
         */

         System.out.println("\n\n\n\n-------------------------------------------------------------\n\n");

        // // object.attributeName =  Anything
        //  fenderGuitar.guitarName = "Fender Guitar";
        //  fenderGuitar.fretCount = 14;
        //  fenderGuitar.isPremium = true;


        // // object.methodName
        // fenderGuitar.playGuitar(fenderGuitar.guitarName);
        // fenderGuitar.stopPlaying();

        // System.out.printf("Guitar name = %s",fenderGuitar.guitarName);
        // System.out.printf("\nFret Count = %d",fenderGuitar.fretCount);
        // System.out.printf("\nPremium = %s ",fenderGuitar.isPremium);


        System.out.println("\n\n\n"+fenderGuitar.calcuate(1,2));



    }
}
