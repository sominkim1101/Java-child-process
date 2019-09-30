

public class Child1 extends Thread {

    private int list[];

    private int sum;

    

    public Child1(int list[])

    {

        this.list = list;

        sum = 0;

    }

    

    @Override

    public void run()

    {

        for(int i=0;i<100;i++)

        {

            sum += list[i];

        }

    }

    

    public int getSum()

    {

        return sum;

    }

}