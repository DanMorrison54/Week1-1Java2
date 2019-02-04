package Java2Week4;

public class Guitar extends StringInstrument {

    Guitar(int numOfStrings){
        super(numOfStrings);
    }
    Guitar(){
        super(6);
    }
    @Override
    void play() {
        System.out.println("a guitar with "+getNumOfStrings()+" strings is rocking");
    }
}
