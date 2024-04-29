package midterm.dachi_gobejishvili_1.materials.task1;

public abstract class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    public String dachiGobejishvili;

    public String toString() {
        String result = "Fantasy{" +
                "studentName='" + dachiGobejishvili + '\'' +
                '}';

        // TODO must be implemented
        return result;
    }
}

public abstract class MyFantasy extends Fantasy {
    public void run() {
        MyFantasy fantasy = new MyFantasy();

        fantasy.dachiGobejishvili = "Your Name";

        String fantasyString = fantasy.toString();

        System.out.println(fantasyString);
    }

    public static void main(String[] args) {
        MyFantasy myFantasy = new MyFantasy();
        myFantasy.run();
    }
}