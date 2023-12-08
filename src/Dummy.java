public class Dummy {
    static int hp;//хп
    static int att=0;

    public Dummy(int hp) {
        this.hp=hp;
    }
    static int pve(Pupel a) {
        int x = hp / a.getAtt();
        int y = a.getHp()*10 / a.getAtt();
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    static void printer(Pupel a) {
        System.out.println("ви тренерувались"+pve(a)*3);
    }

}
