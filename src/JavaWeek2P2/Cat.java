package JavaWeek2P2;

public class Cat extends Pet {
    private boolean declawed;
    Cat(String name,String colour){
        super(name,colour);
    }
    Cat(){
        super();
    }

    public boolean isDeclawed() {
        return declawed;
    }

    public void setDeclawed(boolean declawed) {
        this.declawed = declawed;
    }
    public void meow(){
        System.out.println(this.name+" meows");
    }
    public void scratchesFurniture(){
        System.out.println("the furniture has been cut up by "+this.name);
    }
}
