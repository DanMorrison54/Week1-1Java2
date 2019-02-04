package Java2Week4;

public abstract class StringInstrument extends Instrument {


    private int numOfStrings;
   StringInstrument(int numOfStrings){
       this.numOfStrings=numOfStrings;
   }
    abstract void play();
    public int getNumOfStrings() {
        return numOfStrings;
    }
}
