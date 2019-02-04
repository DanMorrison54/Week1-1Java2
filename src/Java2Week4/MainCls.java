package Java2Week4;

public class MainCls {
    public static void main(String[]args){
        StringInstrument bass=new Bass();
        StringInstrument guitar=new Guitar();
        guitar.play();
        bass.play();
        guitar=new Guitar(7);
        bass=new Bass(5);
        bass.play();
        guitar.play();
        System.out.println();
        Bank rbc=new Rbc(700);
        Bank scotia=new ScotiaBank(400);
        scotia.payFees();
        scotia.calcInterest();
        rbc.payFees();
        rbc.calcInterest();
        scotia=new ScotiaBank(400,4.2f);
        rbc=new Rbc(800,2.2f);
        scotia.payFees();
        scotia.calcInterest();
        rbc.payFees();
        rbc.calcInterest();


    }
}
