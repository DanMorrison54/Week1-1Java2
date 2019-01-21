package JavaWeek2P2;

public class Pet {
    protected String name;
    protected String colour;
    public Pet() {
        name="Sierra";//default name
    }

    public Pet(String name,String colour) {
        this.name = name;
        this.colour=colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void eat(){
        System.out.println(this.name+" eats food");
    }

}
