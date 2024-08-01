import java.util.*;
public class Stonepaperandscissors 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of points");
        int p=sc.nextInt();
        String ch="";int c=0,cc=0;
        System.out.println("Rules:\n**Enter\'s\'for stone");
        System.out.println("**Enter\'sc\'for scissors");
        System.out.println("**Enter\'pa\'for paper");
        System.out.println("**Enter\'p\'to see the no. of points");
        while(true)
        {
            if(cc==p||c==p)
            break;
            ch=sc.next();
            int chc=(int)(Math.random()*(2-0+1));
            if(ch.equals("s")&&chc==1)
            {
                cc++;
                System.out.println("pa");
            }
            else if(ch.equals("pa")&&chc==2)
            {
               cc++;
               System.out.println("sc");
            }
            else if(ch.equals("sc")&&chc==0)
            {
                cc++;
                System.out.println("s");
            }
            else if(ch.equals("s")&&chc==2)
            {
                c++;
                System.out.println("sc");
            }
            else if(ch.equals("pa")&&chc==0)
            {
                c++;
                System.out.println("s");
            }
            else if(ch.equals("sc")&&chc==1)
            {
                c++;
                System.out.println("pa");
            }
            else if(ch.equals("s")&&chc==0)
            System.out.println("s");
            else if(ch.equals("pa")&&chc==1)
            System.out.println("pa");
            else if(ch.equals("sc")&&chc==2)
            System.out.println("sc");
            else if(ch.equals("p"))
            {
                System.out.println("You: "+c+"\nComp: "+cc);
                p++;
            }
            else
            p++;
        }
        if(c>cc)
        System.out.println("You Win!!\nYou: "+c+"\nComp: "+cc);   
        else if(c<cc)
        System.out.println("You Lose!!\nYou: "+c+"\nComp: "+cc);        
        else
        System.out.println("Draw!!\nYou: "+c+"\nComp: "+cc);
    }
}