
public class Child2 extends Thread {
    private int list[];
    private int sum;
    
    public Child2(int list[])
    {
        this.list = list;
        sum = 0;
    }
    
    @Override
    public void run()
    {
        for(int i=100;i<200;i++)
        {
            sum += list[i];
        }
    }
    
    public int getSum()
    {
        return sum;
    }
}
