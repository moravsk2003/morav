public class Trap extends Elf {
    private int att;
    private boolean live;

    public Trap(int att) {
        super();
        this.att = att;
        live=true;
    }
    class Logic{
        int mas;
        private boolean trigger;

        public Logic(int mas) {
            this.mas = mas;
        }

    }
    public boolean triggering(int m) {
        Logic a=new Logic(10);
        if(a.mas<m&live){
            live=false;
            return true;
        }
        return false;
    }

    public int getAtt() {
        return att;
    }

    public boolean isLive() {
        System.out.println("live="+live);
        System.out.println("att="+att);
        return live;
    }
}
