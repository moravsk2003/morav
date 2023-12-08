public class Tnk extends Elf{
        private int hp;//хепе
        private int att;
        private boolean live;


        public Tnk() {
                super();
                att = 1;
                hp=10;

                this.live = true;
        }

        public Tnk(int att, int hp) {
                super();
                this.att = att;
                this.hp=hp;
                live=true;
        }
        private void ripe(){
                if(hp<=0){
                        live=false;
                }

        }
        double rip2(int a){
               rip();
               if(a==0) {
                       return damag();
               }
               else{
                       return damag(a);
               }
        }
        void prin3(){
                prin2();
                System.out.println("hp="+hp);
                System.out.println("live="+live);
                System.out.println("att="+att);
        }

        private double damage(){
                return att/2;
        }
        private int damage(int att){
                return hp-att/2;
        }
        private double damag(double att){
                return hp-att/2;
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
                this.hp = hp*2;
        }

        public void setAtt(int att) {
                this.att = att/2;
        }

        public void setLive(boolean live) {
                this.live = live;
        }

}
