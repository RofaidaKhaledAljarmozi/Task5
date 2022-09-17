
public class Ex1 {
   private int counter;
   public Ex1()
   {
       counter=0;
   }
   public void icrease_value()
   {
       counter=counter+1;
   }
   public void sdisplay_value()
   {
       System.out.println(counter);
   }
   public int undo()
   {
       if(Math.max(counter,0)==counter&&counter!=0)
       {
           counter=counter-1;
           return counter;
       }
       else return 0;
   }
}
