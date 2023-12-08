public class War {
    final int a;
    final int b;
    final int c;

    public War() {
        b=3;
        a=15;
        c=1;
    }
    int r(int x,int y,int z,int k){
        return (a*x+b*y+c*z)/3*k;
    }
    int r(){
        final int x=0;
        final int y=0;
        final int z=1;

        return (a*x+b*y+c*z)/3;
    }
}

