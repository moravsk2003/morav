public class Siti {
    private int pop;//популяція
    private long pop2;//популяція
    private int x;//координати
    private int y;//координати

    public Siti(int pop, int x, int y) {
        this.pop = pop;
        this.x = x;
        this.y = y;
        pop2=0;
    }

    void increase(int x) {
        pop += x;

    }


    boolean reset(int pop, int x, int y) {
        this.pop = pop;
        this.x = x;
        this.y = y;
        return true;
    }
    boolean reset(long pop, int x, int y) {
        this.pop2 = pop;
        this.x = x;
        this.y = y;
        return true;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPop() {
        return pop;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

