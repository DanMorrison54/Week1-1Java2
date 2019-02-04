package Java2Week4;

public class ValueOfCoins {
    public static void main(String[]args){
        for(Coins coin:Coins.values()){
            System.out.println("the coin is a "+coin.getName()+" and the value is "+coin.getVal()+"$ (CAD)");
        }
    }
}
