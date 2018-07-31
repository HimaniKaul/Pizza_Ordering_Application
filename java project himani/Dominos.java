import java.util.*;
import java.io.*;
public class  Dominos  
{
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(isr);
    String name_1 ,f, add ,l,id,s,z;int coss[]=new int[10]; int cos1d[]=new int[10];float price10=0.0f;int vat=0;
    int cos[]=new int[6];int cos1[]=new int[6];String pizza[]=new String[10]; int p1,p3;
    long ph;int select,b,cont,pizz,price1,price2,price3,pizz_1,ba,cat,choice,name,p,back,back1,add_1,email_1,choice_1,choice1,ncat,yes,no,sid,dri,per,choose;
    int quan[]=new int[10]; int cost[]=new int[10];String list[]=new String[9]; Date d=new Date();
    String nlist[]=new String[9];String sidesb[]=new String[10];String desseb[]=new String[10];String sides[]=new String[6];String drinks[]=new String[6];
    Dominos()
    {   String name_1 ,f, add ,l,id,z,s=" "; int add_1,name,p1,p3,email_1,price1,price2,price3,p,back,back1=0;
        list[0]=" ";                   nlist[0]=" ";                   
        list[1]="Spicy veg       ";                  nlist[1]="Spicy Chicken   ";
        list[2]="Freash Veggie   ";             nlist[2]="Chicken Barbeque";
        list[3]="Farm House      ";                nlist[3]="Chicken Feista  ";
        list[4]="Country Special ";            nlist[4]="Chicken Delight ";
        list[5]="Peppy Paneer    ";               nlist[5]="Khema Do Pyaza  ";
        nlist[6]="Zesty Chicken   ";
        list[6]="Gourmet         ";
        list[7]="Dulex Veggie    ";                 nlist[7]="Non Veg Supreme ";
        sides[0]=" ";                                  drinks[0]=" ";                cos1[0]=0;
        sides[1]="Chicken Kickers";      cos[0]=0;    drinks[1]="Choco Lava cake";  cos1[1]=65;
        sides[2]="Garlic Bread   ";    cos[1]=79;     drinks[2]="Butterscoth    ";      cos1[2]=85;
        sides[3]="Lebanese Roll  ";         cos[2]=99;drinks[3]="Banana Splits  ";   cos1[3]=70;
        sides[4]="Italian Pasta  ";       cos[3]=110; drinks[4]="Coke Can       ";          cos1[4]=35; cos1[5]=40;
        sides[5]="Taco Indiana   ";   cos[4]=105;     drinks[5]="Ice Tea        ";
        cos[5]=139;    ba=1;
        long ph=0; int select,b,choose,cont,pizz,pizz_1,cat,choice,choice_1,choice1,yes,no,ncat,sid,dri,per=0;
    }

    public  void input() throws IOException
    {
        System.out.println(" ###### PLEASE ENTER YOUR DETAILS ###### ");
        System.out.println("Enter Your Name");
        name_1=br.readLine();
        name=name_1.length();
        System.out.println("Enter Your Mobile Number");
        while(true)
        {
            try
            {   System.out.println("Enter your 10-Digit Mobile Number");
                ph=Long.parseLong(br.readLine());
                l=Long.toString(ph);
            }
            catch(Exception ex)
            {
                System.out.println("only numbers allowed\n Please try again");
                br.readLine();
                continue;
            }
            break;
        }
        System.out.println("Enter your home address");
        add=br.readLine();
        add_1=add.length();
        System.out.println("Enter your e-mail address");
        id=br.readLine();
        email_1=id.length();
    }

    public  void display() throws IOException
    {
        System.out.println("\f________________________________________________________________");
        System.out.println("........................WELCOME TO DOMINOS.......................");
        System.out.println("________________________________________________________________");
        System.out.println("                      DOMINOS: KUSHION KA TIME!     ");
        System.out.println("_________________________________________________________________");
        for(int l=0;l==b;l++)
        {
            while(true)
            {
                try
                {
                    System.out.println("\f      ########## SELECT  YOUR MENU #########\n");
                    System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("           @  1.ORDER PIZZA 2.Queries  @");
                    System.out.println("           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    select=Integer.parseInt(br.readLine());
                }
                catch(Exception ex)
                {
                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                    continue;
                } 
                if(select==1||select==2 )
                {
                    break;
                }
                else
                {
                    System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN ");
                    br.readLine();
                }
            }
            switch(select)
            {
                case 1:
                System.out.println("\f         ****************************************");
                System.out.println("              ----YOU HAVE SELECTED PIZZA----");
                System.out.println("         ****************************************");
                while(true)
                {
                    try
                    {
                        System.out.println("\n\f         ##########SELECT YOUR CHOICE#############");
                        System.out.println("         #  1.PIZZAS  2. SEND PIZZA RECIPE TO US #");
                        System.out.println("         #########################################");
                        choice=Integer.parseInt(br.readLine());
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(choice==1||choice==2  )
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
                switch (choice)
                {
                    case 1:
                    while(true)
                    {
                        try
                        {
                            System.out.println("\f=================================================");
                            System.out.println("=             YOU HAVE SELECTED PIZZAS          =");
                            System.out.println("=            SELECT YOUR CHOICE OF PIZZAS       =");
                            System.out.println("=================================================");
                            System.out.println("======================================");
                            System.out.println("=         SELECT VEG/NONVEG          = ");
                            System.out.println("=         1.VEG  2.NONVEG            =");
                            System.out.println("======================================");
                            choice1=Integer.parseInt(br.readLine());
                        }
                        catch(Exception ex)
                        {
                            System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                            br.readLine();
                            continue;
                        } 
                        if(choice1==1||choice1==2  )
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                            br.readLine();
                        }
                    }
                    switch(choice1)
                    {
                        case 1:
                        while(true)
                        {   try
                            {
                                System.out.println("\f     --------------------------------------------");
                                System.out.println("                  YOU HAVE SELECTED VEG");
                                System.out.println("      1.CHEESEBURST PIZZA  2.Classic Hand Tossed");
                                choice_1=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(choice_1==1||choice_1==2  )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                        switch(choice_1)
                        {
                            case 1:
                            while(true)
                            {   try
                                {
                                    System.out.println("\f");
                                    System.out.println("           /-------------------------------------\\");
                                    System.out.println("           |              CheeseBurst              |");
                                    System.out.println("           |                Pizza                  |");
                                    System.out.println("           |---------------------------------------|");
                                    System.out.println("           |Category           Small  Medium  Large|");
                                    System.out.println("           |1. (Veg Treat)      90     150     250 |");
                                    System.out.println("           |1.Spicy veg                            |");
                                    System.out.println("           |2.Freash Veggie                        |");
                                    System.out.println("           |3.Farm House                           |        ");
                                    System.out.println("           |4.Country Special                      |      ");
                                    System.out.println("           |---------------------------------------|");
                                    System.out.println("           |2.(Veg Special)     150    210     330 |           ");
                                    System.out.println("           |5.Peppy Paneer                         |");
                                    System.out.println("           |6.Gourmet                              | ");
                                    System.out.println("           |7.Dulex Veggie                         |  ");
                                    System.out.println("           \\--------------------------------------/");
                                    System.out.println("\n Select pizza category \n 1.(Veg Treat) 2.(Veg Special)");
                                    pizz=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(pizz==1||pizz==2 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            switch (pizz)
                            {
                                case 1:
                                System.out.println("Y O U      H A V E    S E L E C T E D ");
                                System.out.println("    V E G   T R E A T  ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("  Now Select Pizza in this category");
                                        cat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(cat==1||cat==2|| cat==3||cat==4 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(cat==1)
                                {
                                    System.out.println("You have selected Spicy Veg");
                                }
                                else if(cat==2)
                                {
                                    System.out.println("You have selected Freash Veggie");
                                }
                                else if(cat==3)
                                {
                                    System.out.println("You have selected Farmhouse");
                                }
                                else if(cat==4)
                                {
                                    System.out.println("You have selected Country Special");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=90; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=150; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=250;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                    break;
                                }
                                pizza[b]=list[cat];
                                break;
                                case 2:
                                System.out.println("Y O U      H A V E    S E L E C T E D ");
                                System.out.println(" V E G   S P E C I A L  ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("\n");
                                        System.out.println("Now Select Pizza in this category");
                                        cat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(cat==5||cat==6|| cat==7 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(cat==5)
                                {
                                    System.out.println("You have selected Peepy Paneer");
                                }
                                else if(cat==5)
                                {
                                    System.out.println("You have selected Gourmeet");
                                }
                                else if(cat==5)
                                {
                                    System.out.println("You have selected Dulex Veggie");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=90+40; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=150+60; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=250+80;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                    break;
                                }
                                pizza[b]=list[cat];
                            }
                            break;
                            case 2:
                            while(true)
                            {   try
                                {
                                    System.out.println("\f");
                                    System.out.println("            /-------------------------------------\\");
                                    System.out.println("            |         Classic Hand Tossed           |");
                                    System.out.println("            |                Pizza                  |");
                                    System.out.println("            |---------------------------------------|");
                                    System.out.println("            |Category           Small  Medium  Large|");
                                    System.out.println("            |1. (Veg Treat)      140    250     310 |");
                                    System.out.println("            |1.Spicy veg                            |");
                                    System.out.println("            |2.Freash Veggie                        |          ");
                                    System.out.println("            |3.Farm House                           |        ");
                                    System.out.println("            |4.Country Special                      |      ");
                                    System.out.println("            |---------------------------------------|");
                                    System.out.println("            |2.(Veg Special)     200    330     410 |           ");
                                    System.out.println("            |5.Peppy Paneer                         |");
                                    System.out.println("            |6.Gourmet                              | ");
                                    System.out.println("            |7.Dulex Veggie                         |  ");
                                    System.out.println("            \\--------------------------------------/");
                                    System.out.println("\n Select pizza category \n 1.(Veg Treat) 2.(Veg Special)");
                                    pizz=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(pizz==1||pizz==2 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            switch (pizz)
                            {
                                case 1:
                                System.out.println("      Y O U    H A V E   S E L E C T E D");
                                System.out.println("           V E G     T R E A T  ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("Now Select Pizza in this category");
                                        cat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(cat==1||cat==2|| cat==3||cat==4 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(cat==1)
                                {
                                    System.out.println("You have selected Spicy Veg");
                                }
                                else if(cat==2)
                                {
                                    System.out.println("You have selected Freash Veggie");
                                }
                                else if(cat==3)
                                {
                                    System.out.println("You have selected Farmhouse");
                                }
                                else if(cat==4)
                                {
                                    System.out.println("You have selected Country Special");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=140; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=250; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=310;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                    break;
                                }
                                pizza[b]=list[cat];
                                break;
                                case 2:
                                System.out.println("      Y O U    H A V E   S E L E C T E D");
                                System.out.println("           V E G     S P E C I A L  ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("Now Select Pizza in this category");
                                        cat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(cat==5||cat==6|| cat==7 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(cat==5)
                                {
                                    System.out.println("You have selected Peepy Paneer");
                                }
                                else if(cat==5)
                                {
                                    System.out.println("You have selected Gourmeet");
                                }
                                else if(cat==5)
                                {
                                    System.out.println("You have selected Dulex Veggie");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN\f");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN\f");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=140+60; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=190+80; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=250+100;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                    break;
                                }
                                pizza[b]=list[cat];
                            }}
                        break;
                        case 2:
                        while(true)
                        {   try
                            {
                                System.out.println("\f------------------------------------");
                                System.out.println("    You Have Selected NonVeg ");
                                System.out.println("------------------------------------");
                                System.out.println("1.CHEESEBURST PIZZA  2.Classic Hand Tossed");
                                choice_1=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(choice_1==1||choice_1==2  )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                        switch(choice_1)
                        {
                            case 1:
                            while(true)
                            {   try
                                {
                                    System.out.println("\f");
                                    System.out.println("          /-------------------------------------\\");
                                    System.out.println("          |              CheeseBurst              |");
                                    System.out.println("          |                Pizza                  |");
                                    System.out.println("          |---------------------------------------|");
                                    System.out.println("          |Category           Small  Medium  Large|");
                                    System.out.println("          |1. (NonVeg Treat)   190    250     350 |");
                                    System.out.println("          |1.Spicy Chicken                        |");
                                    System.out.println("          |2.Chicken Barbeque                     | ");
                                    System.out.println("          |3.Chicken Feista                       | ");
                                    System.out.println("          |4.Chicken Delight                      | ");
                                    System.out.println("          |---------------------------------------|");
                                    System.out.println("          |2.(NonVeg Special)  230    310     430 |");
                                    System.out.println("          |5.Khema Do Pyaza                       |");
                                    System.out.println("          |6.Zesty Chicken                        | ");
                                    System.out.println("          |7.Non Veg Supreme                      |  ");
                                    System.out.println("          \\-------------------------------------/");
                                    System.out.println("\n Select pizza category \n 1.NonVeg Treat 2.NonVeg Special");
                                    pizz=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(pizz==1||pizz==2 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            switch (pizz)
                            {
                                case 1:
                                System.out.println("      Y O U    H A V E   S E L E C T E D");
                                System.out.println("        N O N  V E G     T R E A T  ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("Now Select Pizza in this category");
                                        ncat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(ncat==1||ncat==2|| ncat==3||ncat==4 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(ncat==1)
                                {
                                    System.out.println("You have selected Spicy Chicken");
                                }
                                else if(ncat==2)
                                {
                                    System.out.println("You have selected  Chicken Barbeque");
                                }
                                else if(ncat==3)
                                {
                                    System.out.println("You have selected Chicken Feista");
                                }
                                else if(ncat==4)
                                {
                                    System.out.println("You have selected Chicken Delight");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=190; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=250; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=350;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                }
                                pizza[b]=nlist[ncat];
                                break;
                                case 2:
                                System.out.println("      Y O U    H A V E   S E L E C T E D");
                                System.out.println("       N O N   V E G  S P E I C A L");
                                while(true)
                                {   try
                                    {
                                        System.out.println("Now Select Pizza in this category");
                                        ncat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(ncat==5||ncat==6|| ncat==7 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(ncat==5)
                                {
                                    System.out.println("You have selected Khema Do Pyaza");
                                }
                                else if(ncat==5)
                                {
                                    System.out.println("You have selected Zesty Chicken");
                                }
                                else if(ncat==5)
                                {
                                    System.out.println("You have selected Non Veg Supreme");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=190+40; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=250+60; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=350+80;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                }
                                pizza[b]=nlist[ncat];
                            }
                            break;
                            case 2:
                            while(true)
                            {   try
                                {
                                    System.out.println("\f");
                                    System.out.println("             /-------------------------------------\\");
                                    System.out.println("             |              Classic Hand Tossed      |");
                                    System.out.println("             |                Pizza                  |");
                                    System.out.println("             |---------------------------------------|");
                                    System.out.println("             |Category           Small  Medium  Large|");
                                    System.out.println("             |1. (NonVeg Treat)   220    340     400 |");
                                    System.out.println("             |1.Spicy Chicken                        |");
                                    System.out.println("             |2.Chicken Barbeque                     |          ");
                                    System.out.println("             |3.Chicken Feista                       |        ");
                                    System.out.println("             |4.Chicken Delight                      |      ");
                                    System.out.println("             |---------------------------------------|");
                                    System.out.println("             |2.(NonVeg Special)  280    420     500 |           ");
                                    System.out.println("             |5.Khema Do Pyaza                       |");
                                    System.out.println("             |6.Zesty Chicken                        | ");
                                    System.out.println("             |7.Non Veg Supreme                      |  ");
                                    System.out.println("             \\--------------------------------------/");
                                    System.out.println("\n Select pizza category \n 1.NonVeg Treat 2.NonVeg Special");
                                    pizz=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(pizz==1||pizz==2 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            switch (pizz)
                            {
                                case 1:
                                System.out.println("      Y O U    H A V E   S E L E C T E D");
                                System.out.println("          N O N   V E G   T R E A T  ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("\n");
                                        System.out.println("Now Select Pizza in this category");
                                        ncat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(ncat==1||ncat==2|| ncat==3||ncat==4 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(ncat==1)
                                {
                                    System.out.println("You have selected Spicy Chicken");
                                }
                                else if(ncat==2)
                                {
                                    System.out.println("You have selected  Chicken Barbeque");
                                }
                                else if(ncat==3)
                                {
                                    System.out.println("You have selected Chicken Feista");
                                }
                                else if(ncat==4)
                                {
                                    System.out.println("You have selected Chicken Delight");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=220; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=340; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=400;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                }
                                pizza[b]=nlist[ncat];
                                break;
                                case 2:
                                System.out.println("      Y O U    H A V E   S E L E C T E D");
                                System.out.println("         N O N  V E G     S P E C I A L ");
                                while(true)
                                {   try
                                    {
                                        System.out.println("\nNow Select Pizza in this category");
                                        ncat=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(ncat==5||ncat==6|| ncat==7 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(ncat==5)
                                {
                                    System.out.println("You have selected Khema Do Pyaza");
                                }
                                else if(ncat==6)
                                {
                                    System.out.println("You have selected Zesty Chicken");
                                }
                                else if(ncat==7)
                                {
                                    System.out.println("You have selected Non Veg Supreme");
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println("  ");
                                        System.out.println("Select The Size \n1.Small  2.Medium  3.Large");
                                        per=Integer.parseInt(br.readLine());
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(per==1||per==2 ||per==3 )
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                    }
                                }
                                if(per==1)
                                {
                                    cost[b]=220+60; 
                                }
                                else if(per==2)
                                {
                                    cost[b]=340+80; 
                                }
                                else if(per==3)
                                {
                                    cost[b]=400+100;
                                }
                                while(true)
                                {
                                    try
                                    {
                                        System.out.println (" ");
                                        System.out.println("Quantity of pizza required");
                                        quan[b]=Integer.parseInt(br.readLine());   
                                    }
                                    catch(Exception ex)
                                    {
                                        System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                        br.readLine();
                                        continue;
                                    } 
                                    if(quan[b]>=0)
                                    {
                                        break;
                                    }
                                    else
                                    {
                                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT  AGAIN");
                                        br.readLine();
                                    }
                                }
                                pizza[b]=nlist[ncat];
                            }
                            break;
                        }}
                    break;
                    case 2:
                    System.out.println("\f\n\n\t\tWrite your own recipe of pizzas and send it to us \n\t\tIf it is liked by us your recipe will be the new \n\t\tadded menu of our pamplets.");
                    System.out.println("You can write here:");            
                    String write=br.readLine();
                    System.out.println("Thanks for writing we will surely see your recipe");
                    break;
                }
                break;
                case 2:
                System.out.println("You can write our recipe and sent it to our website www.dominos.com\nor contact us 022-2811035");
                break;
            } 
            while(true)
            {   try
                {
                    System.out.println("PRESS \n1.To opt again  2.To exit from pizza section ");
                    cont=Integer.parseInt(br.readLine());
                }
                catch(Exception ex)
                {
                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                    continue;
                } 
                if(cont==1)
                {
                    b++;
                    break;
                }
                else if(cont==2)
                {
                    sides(); 
                    break;
                }
                else
                {
                    System.out.println("you have not followed the instruction enter correct number.PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                }
            }
        }
    }

    public void sides() throws IOException
    {
        while(true)
        {
            try
            {
                System.out.println("\f                           SIDES         ");
                System.out.println("                   Do you want any Sides??");
                System.out.println("                      1.YES   2.NO");  
                yes=Integer.parseInt(br.readLine());
            }
            catch(Exception ex)
            {
                System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                br.readLine();
                continue;
            } 
            if(yes==1)
            { 
                break;
            }
            if(yes==2)
            { 
                drinks();back=1;
                break;
            }
            else
            {
                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY TO OPT AGAIN");
                br.readLine();
            }
        }
        for(int l=0;l==back;l++)
        {
            if(yes==1)
            {
                while(true)
                {
                    try
                    {
                        System.out.println("\f");
                        System.out.println("             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println("             @    Options                          Cost        @");
                        System.out.println("             @ 1.Chicken Kickers                    79         @");
                        System.out.println("             @ 2.Garlic Spicy Bread                 99         @");
                        System.out.println("             @ 3.Lebanise Roll                      110        @");
                        System.out.println("             @ 4.Italian Pasta                      105        @");
                        System.out.println("             @ 5.Taco Indiana                       139        @");
                        System.out.println("             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println("");
                        sid=Integer.parseInt(br.readLine());
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(sid==1||sid==2 || sid==3 ||sid==4 || sid==5 )
                    { 
                        sidesb[l]=sides[sid];coss[l]=cos[sid];
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
            }
            while(true)
            {
                try
                {
                    System.out.println(" Would you like to order Sides again??");
                    System.out.println("           1.YES   2.NO");  
                    choose=Integer.parseInt(br.readLine());
                }
                catch(Exception ex)
                {
                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                    continue;
                } 
                if(choose==1)
                { 
                    back++;
                    break;
                }
                if(choose==2)
                { 
                    drinks();break;
                }
            }
        }
    }

    public void drinks() throws IOException
    {
        while(true)
        {
            try
            {
                System.out.println("\f                          DESSERTS           ");
                System.out.println("              Would you like to have Desserts&Drinks");
                System.out.println("                     1.YES   2.NO");
                no=Integer.parseInt(br.readLine());
            }
            catch(Exception ex)
            {
                System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                br.readLine();
                continue;
            } 
            if(no==1 )
            { 
                break;
            }
            else if(no==2 )
            { 
                bill();
                back1=1;
                break;
            }
            else
            {
                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY TO OPT AGAIN");
                br.readLine();
            }
        }
        for(int l=0;l==back1;l++)
        {
            if(no==1)
            {
                while(true)
                {
                    try
                    {
                        System.out.println("\f");
                        System.out.println("                @@@@@@@@@@@@@@@@@@@@@=DESSERTS=@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println("                @                     &DRINKS                      @");      
                        System.out.println("                @     Options                              Cost    @");
                        System.out.println("                @ 1.Choco Lava cake                         65     @");
                        System.out.println("                @ 2.Butterscoth                             85     @");
                        System.out.println("                @ 3.Banana Splits                           70     @");
                        System.out.println("                @ 4.Coke Can                                35     @");
                        System.out.println("                @ 5.Ice Tea                                 40     @");
                        System.out.println("                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println(""); 
                        dri=Integer.parseInt(br.readLine());   
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(dri==1||dri==2 || dri==3 ||dri==4 || dri==5 )
                    { 
                        desseb[l]=drinks[dri];cos1d[l]=cos1[dri];
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
            }
            while(true)
            {
                try
                {
                    System.out.println(" Would you like to order for Drinks and Desserts again??");
                    System.out.println("                 1.YES   2.NO");  
                    choose=Integer.parseInt(br.readLine());
                }
                catch(Exception ex)
                {
                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                    continue;
                } 
                if(choose==1)
                { 
                    back1++;
                    break;
                }
                if(choose==2)
                { 
                    bill();
                    break;
                }
            }
        }
    }

    public void bill()
    {System.out.println("\f              ::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("              :                   YOUR BILL                        :");
        System.out.println("              :                        "+d+":" );
        System.out.print("              :NAME :"+name_1);                                                      
        for(int bill=1;bill<=55-(name+9);bill++)
        {
            System.out.print(" ");
        }
        System.out.print(":");
        System.out.println("");
        System.out.print("              :Mobile :"+ph);
        for(int bill=1;bill<=55-(l.length()+11);bill++)
        {
            System.out.print(" ");
        }
        System.out.print(":");
        System.out.println("");
        System.out.print("              :Address:"+add);
        for(int bill=1;bill<=52-(add_1+8);bill++)
        {
            System.out.print(" ");
        }
        System.out.print(":");
        System.out.println("");
        System.out.print("              :Email :"+id);
        for(int bill=1;bill<=55-(email_1+10);bill++)
        {
            System.out.print(" ");
        }
        System.out.print(":");
        System.out.println(" ");       
        System.out.print("              :----------------------------------------------------:\n ");
        System.out.print ("             :Orders                    Cost        Quantity      :\n  "); 
        System.out.println("            :----------------------------------------------------: ");
        for(int j=0;j<=b;j++)
        {
            if(pizza[j]=="Spicy veg       " ||pizza[j]=="Freash Veggie   " ||pizza[j]=="Farm House      " ||pizza[j]=="Country Special " ||pizza[j]=="Peppy Paneer    " ||pizza[j]=="Gourmet         "||pizza[j]=="Dulex Veggie    " ||pizza[j]=="Spicy Chicken   " ||pizza[j]=="Chicken Barbeque" ||pizza[j]=="Chicken Feista  " ||pizza[j]=="Chicken Delight " ||pizza[j]=="Khema Do Pyaza  " ||pizza[j]=="Zesty Chicken   "|pizza[j]=="Non Veg Supreme ")
            { System.out.print  ("              :"+pizza[j]+"          "+cost[j]+"             "+quan[j]); 
                z=Integer.toString(cost[j]);price1=cost[j]*quan[j];f=Integer.toString(quan[j]);
                for(int bill=1;bill<=55-(pizza[j].length()+z.length()+f.length()+26);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print(":"); p=p+price1;
                System.out.println("");
            }}
       
        for(int z1=0;z1<=back;z1++)
        {
            if(sidesb[z1]=="Chicken Kickers" ||sidesb[z1]=="Garlic Bread   " ||sidesb[z1]=="Lebanese Roll  " ||sidesb[z1]=="Italian Pasta  " ||sidesb[z1]=="Taco Indiana   " )
            {
                System.out.print  ("              :"+sidesb[z1]+"           "+coss[z1]); 
                z=Integer.toString(coss[z1]);price2=coss[z1]; p1=p1+price2;
                for(int bill=1;bill<=50-(sidesb[z1].length()+z.length()+9);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print(":");
                System.out.println("");
            }}
       
        for(int k=0;k<=back1;k++)
        {
            if(desseb[k]=="Choco Lava cake" ||desseb[k]=="Butterscoth    " ||desseb[k]=="Banana Splits  " ||desseb[k]=="Coke Can       " ||desseb[k]=="Ice Tea        " )
            {
                System.out.print  ("              :"+desseb[k]+"           "+cos1d[k]); 
                z=Integer.toString(cos1d[k]);price3=cos1d[k];p3=p3+price3;
                for(int bill=1;bill<=51-(desseb[k].length()+z.length()+10);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print(":");
                System.out.println("");
            }}
        
        price10=(p1+p+p3);
         if(price10<=1000.0f )
         {price10 =price10+(price10*5)/100;
         vat=5;}
         if(price10>1000.0f && price10<=4500.0f)
        { price10 =price10+(price10*10)/100;
         vat=10;}
         if(price10>4500.0f && price10<=5000.0f)
         {price10 =price10+(price10*15)/100;
         vat=15;}
         if(price10>5000.0f)
         {price10 =price10+(price10*20)/100;
         vat=20;}
        System.out.print("                  FINAL PRICE: "+price10+" vat%="+vat+"%"+"\n");   
        System.out.println("              ::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    }
  }

