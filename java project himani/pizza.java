
import java.io.*;
public class pizza 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        int e=0;
       secret p1=new secret();
            p1.val();
        System.out.println("\f                    Welcome To Pizza Paradise " );
        while(true)
        {
            try
            {
                System.out.println("Here You Have Options To Select Your Pizza Store \nPress The Number AlongSide Your Pizza Store \n 1.PIZZA HUT \n 2.DOMINOS " );
                e=Integer.parseInt(br.readLine());
            }
            catch(Exception ex)
            {
                System.out.println("only numbers allowed");
                br.readLine();
                continue;
            } 
            if(e==1||e==2  )
            {
                break;
            }
            else
            {
                System.out.println("you have not followed the instruction enter correct no.");
                br.readLine();
            }

        }
        System.out.println("Thanks For Selecting");

        if(e==1)
        {
            load lo=new load();
            lo.lod();
        }
        else if(e==2)
        {
            System.out.println("\f ");
            dom d=new dom();
            d.log1();
            for(double b=0;b<=1000000000;b++)
            {}
            logo obj=new logo();
            obj.display();
        }
        switch(e)
        {
            case 1:
            pizzahut1 p=new pizzahut1();
            p.cal();
            break;
            case 2:
            Dominos ob=new Dominos();
            ob.input();
            ob.display();
           

        }}}
