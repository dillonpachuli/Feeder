public class Main
{
    public static void main(String[] args)
    {
        //Feeder f = new Feeder();
        //System.out.println(f);
        //System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        //System.out.println(g);
        //System.out.println(g.getCurrentFood());
        //System.out.println(randomInt);

        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
    }
}
