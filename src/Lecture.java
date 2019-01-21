public class Lecture {
    private int studId;
    private char gender;

    Lecture(char gender, int studId) {
        this.gender = gender;
        this.studId = studId;

    }

    Lecture() {
        setGender('m');
        setStudId(6);
        char[] letters = new char[5];
        letters[0] = 'm';
        letters[1] = 'e';
        letters[2] = 'g';
        letters[3] = 'h';
        letters[4] = 'a';
        for (int i = 0; i <= letters.length - 1; i++) {
            System.out.print(letters[i]);
        }
        System.out.println();
        System.out.println(new String(letters));
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }

    }

    public static void main(String args[]) {
        Lecture lecture = new Lecture();
        Lecture lec = new Lecture('F', 543598);
        // System.out.println(lecture);
        //System.out.println(lec);
    }

    public int getStudId() {
        return studId;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Lecture{" +
                "studId=" + studId +
                ", gender=" + gender +
                '}';
    }

    public char getGender() {
        return gender;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
