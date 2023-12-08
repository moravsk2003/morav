public class Pupel extends Shadow {
    private int hp;//хепе
    private int att;//атака
    private boolean live;


    //конструкт
    public Pupel() {
        super();
        att = 1;
        hp=10;

        this.live = true;
    }
    public Pupel(int att, int hp) {
        super();
        this.att = att;
        this.hp=hp;
        live=true;
    }
    //копії
    Pupel cop (Pupel g){
        
        return g;

    }
    Pupel clone(int x){
        Pupel a =new Pupel(getAtt()*x,getHp()*x);
        return a;
    }
    //пвп
    int pvp(Pupel a) {
        int x = hp / a.getAtt();
        int y = a.getHp() / att;
        if (x < y) {
            rip();
            return 1;
        } else if (x>y) {
            a.rip();
            return 2;
        }else {
            return 0;
        }
    }
    int pvp(Tnk a) {
        int x = hp / a.getAtt();
        int y = a.getHp() / att;
        if (x < y) {
            rip();
            return 1;
        } else if (x>y) {
            a.rip2(0);
            return 2;
        }else {
            return 0;
        }
    }
    int pvp(Elf a) {
        int x = hp / a.getAtt();
        int y = a.getHp() / att;
        if (x < y) {
            rip();
            return 1;
        } else if (x>y) {
            a.rip();
            return 2;
        }else {
            return 0;
        }
    }int pvp(Elf a,Tnk b) {
        int x = b.getHp() / a.getAtt();
        int y = a.getHp() / b.getAtt();
        if (x < y) {
            rip();
            return 1;
        } else if (x>y) {
            a.rip();
            return 2;
        }else {
            return 0;
        }
    }

//перевірка
    void rip(){
        if(hp<=0){
            live=false;
        }

    }
    double damag(){
        return att;
    }
    void prin(){
        System.out.println("hp="+hp);
        System.out.println("live="+live);
        System.out.println("att="+att);
    }
    double damag(int att){
        return hp-att;
    }
    public int getHp() {
        return hp;
    }

    public int getAtt() {
        return att;
    }

    public boolean isLive() {
        return live;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtt(int att) {
        this.att = att;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

}
