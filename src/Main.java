// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        //створюю всі обєкти
        Pupel p =new Pupel(10,100);
        Elf elf=new Elf(100,300);
        Tnk tnk=new Tnk(10,500);
        Dummy dummy=new Dummy(10);
        Trap trap=new Trap(1);
        War war=new War();
        dummy.printer(p);
        //пастка
        if(trap.triggering(5)){
            elf.damag(trap.getAtt());
        }
        war.r();
        war.r(0,0,1,1);
        //копіюю
        Pupel pop=p.cop(p);
        Pupel pup=p.clone(5);
        //рвр
        p.pvp(elf);
        pop.pvp(elf,tnk);
        pup.pvp(tnk);
        p.pvp(pop);
        //перевіряю чи всі живі
        pup.rip();
        pop.rip();
        tnk.rip2(2);
        p.rip();
        elf.rip();
        //виводжу результат
        p.prin();
        pop.prin();
        pup.prin();
        elf.prin();
        tnk.prin();
    }
}