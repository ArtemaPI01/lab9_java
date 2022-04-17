public class Main {
    public static void main(String[] args){
        Fio fio = new Fio();
        fio.init("a","b", "c");
        Owner alisher = new Owner();
        alisher.init(fio, 0,0);
        alisher.enter();
        alisher.print();
        int N = 5;
        Shop[] ashan = new Shop[N];
        for (int i = 0; i < N; i++){
            ashan[i] = new Shop();
            ashan[i].init("A", "B","C", "10:00-20:00");
            ashan[i].print();
            ashan[i].cloak();
        }
        Shop.CountOfShops();
        Warehouse home = new Warehouse();
        String[] x = {"ABS", "BSD", "DSE"};
        home.init(x, 7);
        home.print();
        home.Poisk("ABS");
        System.out.println(home.Time(20));
        Boxoffice m = new Boxoffice();
        m.init(fio, 20, 20);
        m.print();
        m.Cloak(100);
    }
}
