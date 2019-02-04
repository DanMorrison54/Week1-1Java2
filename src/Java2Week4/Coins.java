package Java2Week4;

public enum Coins {
    PENNY(0.01F,"Penny"),
    NICKEL(0.05F,"Nickel"),
    DIME(0.1F,"Dime"),
    QUARTER(0.25F,"Quarter"),
    LOONIE(1.0F,"Loonie"),
    TOONIE(2.0F,"Toonie");

    float val;
    String name;

    public String getName() {
        return name;
    }

    public float getVal() {
        return val;
    }

    Coins(float val,String name){
        this.val=val;
        this.name=name;
    }
}
