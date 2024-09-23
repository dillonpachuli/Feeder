public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);
        int random = (int) ((Math.random() / 2) * 100);
        if (random < 5)
        {
            boolean bear = true;
            System.out.println(bear);
        }
        else if (random < 10)
        {
            random = 0;
        }
        System.out.println(random);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
    }
}
