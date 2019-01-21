package JavaWeek2P2;

public class Dog extends Pet {
    private boolean working;



    public Dog(String name, String colour) {
        super(name, colour);
    }

    public Dog() {
        super();
    }
    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    public void bark(){
        System.out.println(this.name+" barks");

    }
    public void rollOver(){
        System.out.println(this.name+" rolls over");
    }


}
