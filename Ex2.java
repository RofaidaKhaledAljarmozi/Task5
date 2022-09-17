import java.util.Scanner;
//Simulate a tally counter that can be used to admit a limited number of people. First, the limit is set with
// a call public void setLimit(int maximum) If the click button is clicked more often than the limit, it has no
// effect. (Hint: The call Math.min(n, limit) returns n if n is less than limit, and limit otherwise.)
public class Ex2 {
    private int limit,click;
    public Ex2()
    {
        limit=0;
        click=0;
    }
    public void setLimit()
    {
        System.out.println("please enter the valur of the limit");
        Scanner in=new Scanner(System.in);
        int maximum= in.nextInt();
        limit=maximum;
    }
    public void setclick()
    {
        System.out.println("please enter the valur of the click");
        Scanner in=new Scanner(System.in);
        click= in.nextInt();

    }
    public void getResult()
    {
        if(Math.min(click,limit)==click)
            System.out.println(click);
        else
            System.out.println(limit);
    }
}

