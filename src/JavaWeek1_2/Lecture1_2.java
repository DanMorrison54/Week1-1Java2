package JavaWeek1_2;
//linked with pckaccessor part of the same lecture on packages.
public class Lecture1_2 {
    public int a;

    public Lecture1_2(int a) {
        this.a = a;
    }

    public Lecture1_2() {
        this.a = (int) (Math.random() * (100 - 50 + 1) + 50);
    }

    public void display() {
        System.out.print(a);
    }
}
