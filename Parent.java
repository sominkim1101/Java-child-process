

public class Parent {
    public static void main(String args[]) throws InterruptedException
    {
        int list[] = new int[200];
        // fill list with values 1-200
        for(int i=1;i<=200;i++)
        {
            list[i-1] = i;
        }
        
        Child1 p1 = new Child1(list);
        Child2 p2 = new Child2(list);
        
        p1.start();
        p2.start();
        Thread.sleep(100);

        System.out.println("Sum from Child1: "+p1.getSum());
        System.out.println("Sum from Child2: "+p2.getSum());
        System.out.println("Sum = "+(p1.getSum() + p2.getSum()));
    }
}
