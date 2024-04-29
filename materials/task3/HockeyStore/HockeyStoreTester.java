package midterm.dachi_gobejishvili_1.materials.task3.HockeyStore;

public class HockeyStoreTester {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("Paul");

        Customer c2 = new Customer();
        c2.setName("Ivan");

        HockeyStick hs1 = new HockeyStick();
        hs1.setType("Striker");
        hs1.setSignature("Polowski");

        HockeyStick hs2 = new HockeyStick();
        hs2.setType("Carier");
        hs2.setSignature("George.L.Smith");

        HSMS HSMS = new HSMS();
        HSMS.addHockeyStick(hs1);
        HSMS.addHockeyStick(hs1);
        HSMS.addHockeyStick(hs1);
        HSMS.addHockeyStick(hs2);
        HSMS.addHockeyStick(hs2);

        HSMS.removeHockeyStick(hs1);

        HSMS.printStorage();

    }
}
