package Java2Week4;

public class Bass extends StringInstrument {
    Bass(int numOfStrings){
        super(numOfStrings);
    }
    Bass(){
        super(4);
    }
    @Override
    void play() {
        System.out.println("a bass with "+getNumOfStrings()+" strings is rocking");

    }
}
