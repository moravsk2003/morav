public class Elf extends Pupel {
    private int hp;//хепе
    private int att;//атака
    private boolean live;//житя

//конструктор
    public Elf() {
        att = 1;
        hp=10;

        this.live = true;
    }

    public Elf(int att, int hp) {
        super();
        this.att = att;
        this.hp=hp;
        live=true;

    }
    void rip(){//перевірка
        if(hp<=0){
            live=false;
        }
    }
    void prin2(){//вивід
        prin();
        System.out.println("hp="+hp);
        System.out.println("live="+live);
        System.out.println("att="+att);
    }
    double damag(){
        return att*2;
    }
    double damag(int att){
        return hp-att*2;
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
