import java.util.*;
import java.io.*;
class pizzahut1 
{
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(isr);
    static Scanner sc=new Scanner(System.in);
    public static void cal() throws IOException
    {
        int e=0; int y=1;int t=0;int sure=0;int var=0;int n_select=0; int grand=0;int ba=1;
        int nt=0;int ve=0;int select=0;int se=0;int order=0; String n1=" "; long ph=0; String email="";
        String n_veg[]={" ","Veg    ","Non-Veg",};String men_u[]=new String[10]; int bo_x[]=new int [10];  
        int ngrand=0;    int quan[]=new int[10]; int  n1_1=0;int cost[]=new int[10];int ngrcos1[]=new int[10];
        String nv_eg[]=new String[10];String add=" "; String side_s[]=new String[10];String sa1="";
        String pizza[]={"","Tomatino       ","Margherita     ","Simply Veg     ","Double Cheese  ","Veggie Crunch  ","Spicy Veg      ","Tandoori       ","Country Feast ","Veggie Lover   "};
        int co_s[]=new int[10];String tc=" ";float price=0.0f;int p=0;int c=0;int v=0;
        String ar_ray[]=new String[10];String drinks1[]=new String[10]; int co_s1[]=new int[10];
        String ngr[]=new String[10]; int ngrcos[]=new int[10];String sa=" ";int vat=0;
        String type_1[]=new String[10];String gr[]=new String[10]; int grcos[]=new int[10];int l1=0; int l2=0;int l3=0;
        String cat[]={"     ","Magic Pan","Pizza","Sides","Dessert&Drinks","Queries"};
        String pizz_a[]={" ","Zesty Chicken  ","Chicken Delight","Corn&Chicken   ","Chick N Spicy  ","Firey Chicken  ","Chicken Italia ","Kadai Chicken  ","ChickenTikka   ","Supreme        ","Pepperoni      "};
        String cat_c[]=new String[10];String gran_d[]={" ","Margherita                ","Veggie Royal              ","Veggie Grand              "};
        int gran[]={0,315,385,445};String ngran_d[]={" ","Chicken jewel             ","Chicken Majestic          ","Chicken Splendor          "};
        int ngcos[]={0,315,385,445};int add_1=0;int emai_l=0;
        String type_[]=new String[10];int per=0;
        String pizza_1[]=new String[10];
        String pizz_a1[]=new String[10];
        String crus_t[]=new String[10];
        int ch=0;int yes=0;String sides[]={" ","Garlic bread        ","Spicy Wings         ","Baked Pasta         ","Italian  Roll       ","Chicken Wings       "};
        int cos[]={0,100,119,109,105,139};
        int arr[]=new int[10];
        int k[]=new int[10];int nve=0;int sid=0;int dri=0;int no=0;
        String menu[]={" ","Veg Magic Solo        ","Veggie Magic Solo     ","Non Veg Magic Solo    ","Non Veggie magic Solo ","Mixed Magic Duo       "};
        int box[]={0,170,220,260,295,265};String drinks[]={" ","Mango Mousse           ","Capichuno              ","Pepsi Can              ","Ice Tea                "};
        int cos1[]={0,99,78,35,40};
        System.out.println("\f" );
        System.out.println("            SHOP NO.105-106,QUEEN'S HILL BLOCK,NEXT TO KOTAK MAHINDRA BANK       ");
        System.out.println("            NARIMAN POINT,OPPOSITE S.K POLICE STATION{OUR MAIN BRANCH IN INDIA}   ");
        System.out.println("                                   ____     __  __   ____                        " );
        System.out.println("                                  / __ \\   / / / /  / __ \\                      ");
        System.out.println("                                 / /_/ /  / /_/ /  / / / /                       ");
        System.out.println("                                / ____/  / __  /  / /_/ /                        ");
        System.out.println("                               /_/   (_) _/ /_(_) _____/                         "); 
        System.out.println("                                 FREE HOME DELIVERY                              ");
        System.out.println("                      WE GURANTEE YOU HOT PIZZA OR ELSE ITS FREE                 ");
        System.out.println("                            www.pizzahutdelivery.com                             ");
        System.out.println("                         call us at:3988-3988/6000-9000                          ");
        System.out.println("");
        System.out.println(" ###### PLEASE ENTER YOUR DETAILS ###### ");
        System.out.println("Enter your name");
        n1=br.readLine();
        n1_1=n1.length();
        while(true)
        {
            try
            {
                System.out.println("Enter your 10-Digit Mobile Number");
                ph=Long.parseLong(br.readLine());
                tc=Long.toString(ph);
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
        email=br.readLine();
        emai_l=email.length();
        for(int jj=0;jj==var;jj++)
        {
            while(true)
            {
                try
                {
                    System.out.println("\f####Select your Categories####");
                    System.out.println("1.Magic Pan   2.Pizza");
                    System.out.println("3.Sides");
                    System.out.println("4.Dessert&Drinks");
                    System.out.println("5.Queries");
                    ch=Integer.parseInt(br.readLine());
                }
                catch(Exception ex)
                {
                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                    continue;
                } 
                if(ch==1||ch==2 || ch==3 ||ch==4 ||ch==5)
                {
                    break;
                }
                else
                {
                    System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                    br.readLine();
                }
            }
            cat_c[var]=cat[ch];
            if(ch==1)
            {
                while(true)
                {
                    try
                    {
                        System.out.println("\f");
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Select your option@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println("                             BOX OF FOUR                                          ");
                        System.out.println("1.Veg Magic Solo:- Onion,Tomato,Green Capsicum,Corn                 Rs 170");
                        System.out.println("2.Veggie Magic Duo:- Tomato and corn,Green capsicum"); 
                        System.out.println("                   Onion,Green Chillies &Paneer                     Rs 220 ");
                        System.out.println("3.Non Veggie Magic solo:-Chunks of chicken,Cheese and onion");
                        System.out.println("                       Chicken Sausage, mexican chicken             Rs260  ");
                        System.out.println("4.Non Veggie Magic Duo:- Chunks of chicken,Cheese and onion");
                        System.out.println("                       Chicken Sausage, mexican chicken &corn       Rs295 ");
                        System.out.println("5.Mixed magic Duo:- 2(Veg and Non-Veg Magic duo)                    Rs265 )");
                        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                        System.out.println("\nEnter Your Choice");
                        se=Integer.parseInt(br.readLine());  
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(se==1||se==2 || se==3 ||se==4 ||se==5 )
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
                men_u[var]=menu[se];
                bo_x[var]=box[se];
            }

            else if(ch==3)
            {
                System.out.println("\f You have selected sides ");
                while(true)
                {
                    try
                    {
                        System.out.println("\f");
                        System.out.println("^^^^^^^^^^^^SIDES^^^^^^^^^^");
                        System.out.println(" Do you want any Sides??");
                        System.out.println("1.YES   2.NO");  
                        yes=Integer.parseInt(br.readLine());
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(yes==1||yes==2 )
                    { 
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
                if(yes==1)
                {
                    while(true)
                    {
                        try
                        {
                            System.out.println("\f");
                            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                            System.out.println("@    Options                          cost        @");
                            System.out.println("@ 1.Garlic bread                       100        @");
                            System.out.println("@ 2.Spicy  Wings                       119        @");
                            System.out.println("@ 3.Baked  Pasta                       109        @");
                            System.out.println("@ 4.Italian Roll                       105        @");
                            System.out.println("@ 5.Chicken Wings                      139        @");
                            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
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
                            break;
                        }
                        else
                        {
                            System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                            br.readLine();
                        }
                    }
                    side_s[var]=sides[sid];                      
                    co_s[var]=cos[sid];
                }
            }
            else if(ch==4)
            {
                System.out.println("\fYou have selected Desserts&Drinks");
                while(true)
                {
                    try
                    {
                        System.out.println("\f");
                        System.out.println("^^^^^^^^^^^^DESSERTS & DRINKS^^^^^^^^^^^^");
                        System.out.println("Would you like to have Desserts&Drinks");
                        System.out.println("1.YES   2.NO");
                        no=Integer.parseInt(br.readLine());
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(no==1||no==2 )
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
                if(no==1)
                {
                    while(true)
                    {
                        try
                        {
                            System.out.println("\f");
                            System.out.println("@@@@@@@@@@@@@@@@@@ DESSERTS & DRINKS@@@@@@@@@@@@@@@@");
                            System.out.println("@                                                  @");      
                            System.out.println("@     Options                              cost    @");
                            System.out.println("@ 1.Mango Mousse                            99     @");
                            System.out.println("@ 2.Capichuno                               78     @");
                            System.out.println("@ 3.Pepsi Can                               35     @");
                            System.out.println("@ 4.Ice Tea                                 40     @");
                            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                            System.out.println(""); 
                            dri=Integer.parseInt(br.readLine());   
                        }
                        catch(Exception ex)
                        {
                            System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                            br.readLine();
                            continue;
                        } 
                        if(dri==1||dri==2||dri==3||dri==4 )
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                            br.readLine();
                        }

                    }
                    drinks1[var]=drinks[dri];
                    co_s1[var]=cos1[dri];
                }
            }
            else if(ch==5)
            {
                System.out.println("\f");
                System.out.println("You Have Any Queries You Can Contact us  6000-9000\nLog on to www.pizzahutdelivery.com");
            }
            else if(ch==2)
            {
                String crust[]={"","Pizza Mia","Pan Pizza","Crown Pizza",};
                while(true)
                {
                    try
                    {
                        System.out.println("\f");
                        System.out.println("====================================");
                        System.out.println("||      Select your crust          ||");
                        System.out.println("|| 1.Pizza Mia    2.Pan Pizza      ||");
                        System.out.println("|| 3.Crown Pizza                   ||");
                        System.out.println("===================================="); 
                        t=Integer.parseInt(br.readLine());
                    }
                    catch(Exception ex)
                    {
                        System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                        continue;
                    } 
                    if(t==1||t==2 || t==3 )
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                        br.readLine();
                    }
                }
                crus_t[var]=crust[t];
                switch(t)
                {
                    case 1: 
                    System.out.println("\f###################You have Selected Pizza Mia###############");
                    System.out.println(" Pizza Mia : The authentic hand streched crust baked to perfection.\n Pizza Mia is prpared with finest MOZZARELLA CHEESE   ");
                    String stri=br.readLine();
                    while(true)
                    {
                        try
                        {
                            System.out.println("\f");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("%  Select    1.VEG    2.NON-VEG    %");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            nt=Integer.parseInt(br.readLine()); 
                        }
                        catch(Exception ex)
                        {
                            System.out.println("only numbers allowed\n PRESS ENTER TO OPT AGAIN");
                            br.readLine();
                            continue;
                        } 
                        if(nt==1||nt==2 )
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("you have not followed the instruction enter correct no.\n  PRESS ENTER TO OPT AGAIN");
                            br.readLine();
                        }
                    }
                    nv_eg[var]=n_veg[nt];
                    switch(nt)
                    {
                        case 1:
                        System.out.println("\f");
                        System.out.println("||||||||||||||||||||||||||||||||||||");
                        System.out.println("||      You have selected VEG     || ");
                        System.out.println("||||||||||||||||||||||||||||||||||||");
                        while(true)
                        {
                            try
                            {
                                System.out.println("\f");
                                System.out.println("======================================================");
                                System.out.println("= Tax Charged              +10       +15        +20  =");
                                System.out.println("= Select the type        Personal   Medium   Family  =");
                                System.out.println("= 1.Classic                80        190      340    =");
                                System.out.println("= 1.Tomatino                                         = ");
                                System.out.println("= 2.Margherita                                       =  ");
                                System.out.println("------------------------------------------------------- ");
                                System.out.println("= 2.Favourite              130       260      440    = ");         
                                System.out.println("= 3.Simply Veg                                       =  "); 
                                System.out.println("= 4.Double Cheese                                    =   ");
                                System.out.println("= 5.Veggie Crunch                                    =   ");
                                System.out.println("= 6.Spicy Veg                                        =    ");
                                System.out.println("------------------------------------------------------- ");
                                System.out.println("= 3.Signature              175       345      500    = ");
                                System.out.println("= 7.Tandoori Paneer                                  =   ");
                                System.out.println("= 8.Country Feast                                    =       ");
                                System.out.println("= 9.Veggie lover                                     =       ");
                                System.out.println("======================================================");
                                System.out.println("Enter the Pizza Type (1.CLASSIC 2.FAVOURITE 3.SIGNATURE)");
                                select=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed\nPRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(select==1||select==2||select==3)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                        switch(select)
                        {
                            case 1: System.out.println("You have selected CLASSIC");
                            while(true)
                            {
                                try
                                {
                                    System.out.println("  ");
                                    System.out.println("Now select the pizza in this category");
                                    ve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(ve==1||ve==2  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizza[ve];
                            if(ve==1)
                            {
                                System.out.println(" You have ordered for Tomatino");
                            }
                            else 
                            {
                                System.out.println("You have ordered for Margherita");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println("  ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
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
                                cost[var]=80+10; 
                            }
                            else if(per==2)
                            {
                                cost[var]=190+10; 
                            }
                            else if(per==3)
                            {
                                cost[var]=340+10;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println (" ");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
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
                            break;
                            case 2: System.out.println("You have selected FAVOURITE ");
                            while(true)
                            {
                                try
                                {
                                    System.out.println("  ");
                                    System.out.println("Now select the pizza in this category");
                                    ve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(ve==3||ve==4||ve==5||ve==6  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizza[ve];
                            if(ve==3)
                            {
                                System.out.println(" You have ordered for Simply Veg");
                            }
                            else if(ve==4) 
                            {
                                System.out.println("You have ordered for Double Cheese");
                            }
                            else if(ve==5) 
                            {
                                System.out.println("You have ordered for Veggie Crunch");
                            }
                            else if(ve==6) 
                            {
                                System.out.println("You have ordered for Spicy Veg");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
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
                                cost[var]=130+15; 
                            }
                            else if(per==2)
                            {
                                cost[var]=260+15; 
                            }
                            else if(per==3)
                            {
                                cost[var]=440+15;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                                break;
                            }break;
                            case 3: System.out.println("You have selected SIGNATURE ");
                            while(true)
                            {
                                try
                                {
                                    System.out.println("  ");
                                    System.out.println("Now select the pizza in this category");
                                    ve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(ve==7||ve==8||ve==9  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }

                            }
                            pizza_1[var]=pizza[ve];
                            if(ve==7) 
                            {
                                System.out.println("You have ordered for Tandoori Paneer");
                            }
                            else if(ve==8) 
                            {
                                System.out.println("You have ordered for Country Feast");
                            }
                            else if(ve==9) 
                            {
                                System.out.println("You have ordered for Veggie Lovers");
                            }

                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
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
                                cost[var]=175+20; 
                            }
                            else if(per==2)
                            {
                                cost[var]=345+20; 
                            }
                            else if(per==3)
                            {
                                cost[var]=500+20;
                            }

                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }

                            }}
                        break;
                        case 2:
                        while(true)
                        {
                            try
                            {
                                System.out.println("\f");
                                System.out.println("======================================================");
                                System.out.println("= Tax Charged              +10       +15        +20  =");
                                System.out.println("=Select the type        Personal    Medium    Family==");
                                System.out.println("=1.Classic                 130        260       440 ==");
                                System.out.println("=1.Zesty Chicken                                    ==  ");
                                System.out.println("=2.Chicken Delight                                  ==   ");
                                System.out.println("=---------------------------------------------------==");
                                System.out.println("=2.Favourite               175        345       500 == ");
                                System.out.println("=3.Corn & Chicken                                   ==   ");
                                System.out.println("=4.Chick N Spicy                                    ==         ");
                                System.out.println("=5.Firey Chicken                                    ==       ");
                                System.out.println("=---------------------------------------------------==  ");
                                System.out.println("=3.Signature               220        395       565 == ");
                                System.out.println("=6.Chicken Italia                                   ==");
                                System.out.println("=7.Kadai Chicken                                    ==");
                                System.out.println("=8.Chicken Tikka                                    ==");
                                System.out.println("=9.Supreme                                          ==");
                                System.out.println("=10.Pepperoni                                       ==");
                                System.out.println("======================================================");
                                System.out.println("Enter the Pizza Type(1.CLASSIC 2.FAVOURITE 3.SIGNATURE)");
                                n_select=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(n_select==1||n_select==2||n_select==3 )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                    }
                    switch(n_select)
                    {
                        case 1: System.out.println("You have selected CLASSIC");
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Now select the pizza in this category");
                                nve=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                continue;
                            } 
                            if(nve==1||nve==2  )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                        pizza_1[var]=pizz_a[nve];
                        if(nve==1)
                        {
                            System.out.println(" You have ordered for Zesty Chicken");
                        }
                        else if(nve==2) 
                        {
                            System.out.println("You have ordered for Chicken Delight");
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                per=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
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
                            cost[var]=130+10; 
                        }
                        else if(per==2)
                        {
                            cost[var]=260+10; 
                        }
                        else if(per==3)
                        {
                            cost[var]=440+10;
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println("  ");
                                System.out.println("Quantity of pizza required");
                                quan[var]=Integer.parseInt(br.readLine());   
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(quan[var]>=0)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }break;
                        case 2: System.out.println("You have selected FAVOURITE ");
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Now select the pizza in this category");
                                nve=Integer.parseInt(br.readLine());

                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(nve==3||nve==4||nve==5  )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                        pizza_1[var]=pizz_a[nve];
                        if(nve==3)
                        {
                            System.out.println(" You have ordered for Corn N Chicken");
                        }
                        else if(nve==4) 
                        {
                            System.out.println("You have ordered for Chick N Spicy");
                        }
                        else if(nve==5) 
                        {
                            System.out.println("You have ordered for Firey Chicken");
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
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
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }

                        if(per==1)
                        {
                            cost[var]=175+15; 
                        }
                        else if(per==2)
                        {
                            cost[var]=345+15; 
                        }
                        else if(per==3)
                        {
                            cost[var]=500+15;
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Quantity of pizza required");
                                quan[var]=Integer.parseInt(br.readLine());   
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(quan[var]>=0)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }break;
                        case 3: System.out.println("You have selected SIGNATURE ");
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Now select the pizza in this category");
                                nve=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(nve==6||nve==7 ||nve==8||nve==9||nve==10 )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }
                        pizza_1[var]=pizz_a[nve];
                        if(nve==6) 
                        {
                            System.out.println("You have ordered for Chicken Italia");
                        }
                        else if(nve==7) 
                        {
                            System.out.println("You have ordered for Kadai Chicken");
                        }
                        else if(nve==8) 
                        {
                            System.out.println("You have ordered for Chicken Tikka");
                        }
                        else if(nve==9) 
                        {
                            System.out.println("You have ordered for Supreme ");
                        }
                        else if(nve==10) 
                        {
                            System.out.println("You have ordered for Pepperoni");
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                per=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed\n PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(per==1||per==2 ||per==3 )
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("only numbers allowed\n PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }
                        }

                        if(per==1)
                        {
                            cost[var]=220+20; 
                        }
                        else if(per==2)
                        {
                            cost[var]=395+20; 
                        }
                        else if(per==3)
                        {
                            cost[var]=565+20;
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Quantity of pizza required");
                                quan[var]=Integer.parseInt(br.readLine());   
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed\n PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(quan[var]>=0)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("only numbers allowed\n PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }

                        }break;
                    }

                    break;
                    case 2:
                    System.out.println("\f");
                    System.out.println("######################## PAN-PIZZA#######################");
                    System.out.println(" Pan Pizza :Our world famous thick crust Pizza which is light & fluffy inside and golden brown \n         and crunchy outside \n    MEETS YOUR MOUTH!!!");
                    String ts=br.readLine();
                    System.out.println("   ");
                    while(true)
                    {
                        try{
                            System.out.println("\f");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("%Select  1.VEG    2.NON-VEG %");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            nt=Integer.parseInt(br.readLine());
                        }
                        catch(Exception ex)
                        {
                            System.out.println("only numbers allowed\n PRESS ENTER TO OPT AGAIN");
                            br.readLine();
                            continue;
                        } 
                        if(nt==1||nt==2  )
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER TO OPT AGAIN");
                            br.readLine();
                        }
                    }
                    nv_eg[var]=n_veg[nt];
                    switch(nt)
                    {
                        case 1:
                        while(true)
                        {
                            try
                            {
                                System.out.println("\f");
                                System.out.println("==================================================");
                                System.out.println("= Tax Charged              +50       +60    +70  =");
                                System.out.println("=Select the type        Personal   Medium  Family=");
                                System.out.println("= 1.Classic               80        190      340 =   ");
                                System.out.println("= 1.Tomatino                                     =  ");
                                System.out.println(" 2.Margherita                                    =  ");
                                System.out.println("=------------------------------------------------- ");
                                System.out.println("= 2.Favourite             130       260      440 = ");         
                                System.out.println("= 3.Simply Veg                                   = "); 
                                System.out.println("= 4.Double Cheese                                =");
                                System.out.println("= 5.Veggie Crunch                                =");
                                System.out.println("= 6.Spicy Veg                                    =");
                                System.out.println("=------------------------------------------------= ");
                                System.out.println("= 3.Signature             175       345      500 = ");
                                System.out.println("= 7.Tandoori Paneer                              =");
                                System.out.println("= 8.Country Feast                                =");
                                System.out.println("= 9.Veggie lover                                 =");
                                System.out.println("==================================================");
                                System.out.println("Enter the Pizza Type (1.CLASSIC 2.FAVOURITE 3.SIGNATURE)");
                                select=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(select==1||select==2||select==3)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                            }

                        }

                        switch(select)
                        {
                            case 1: System.out.println("You have selected CLASSIC");
                            while(true)
                            {
                                try
                                {
                                    System.out.println("Now select the pizza in this category");
                                    ve=Integer.parseInt(br.readLine());

                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(ve==1||ve==2  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }

                            }
                            pizza_1[var]=pizza[ve];
                            if(ve==1)
                            {
                                System.out.println(" You have ordered for Tomatino");
                            }
                            else if(ve==2)
                            {
                                System.out.println("You have ordered for Margherita");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println("");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN ");
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
                                cost[var]=80+50; 
                            }
                            else if(per==2)
                            {
                                cost[var]=190+50; 
                            }
                            else if(per==3)
                            {
                                cost[var]=340+50;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                            }break;
                            case 2: System.out.println("You have selected FAVOURITE ");
                            while(true)
                            {
                                try
                                {
                                    System.out.println("");
                                    System.out.println("Now select the pizza in this category");
                                    ve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO  OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(ve==3||ve==4||ve==5||ve==6  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("enter correct choice  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizza[ve];
                            if(ve==3)
                            {
                                System.out.println(" You have ordered for Simply Veg");
                            }
                            else if(ve==4) 
                            {
                                System.out.println("You have ordered for Double Cheese");
                            }
                            else if(ve==5) 
                            {
                                System.out.println("You have ordered for Veggie Crunch");
                            }
                            else if(ve==6) 
                            {
                                System.out.println("You have ordered for Spicy Veg");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println("");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(per==1||per==2 ||per==3 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("enter correct choice PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                            }

                            if(per==1)
                            {
                                cost[var]=130+60; 
                            }
                            else if(per==2)
                            {
                                cost[var]=260+60; 
                            }
                            else if(per==3)
                            {
                                cost[var]=440+60;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println("");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                { System.out.println("enter correct choice PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }

                            }break;
                            case 3: System.out.println("You have selected SIGNATURE ");
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Now select the pizza in this category");
                                    ve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(ve==7||ve==8||ve==9 )
                                {
                                    break;
                                }
                                else
                                { System.out.println("enter correct choice allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizza[ve];
                            if(ve==7) 
                            {
                                System.out.println("You have ordered for Tandoori Paneer");
                            }
                            else if(ve==8) 
                            {
                                System.out.println("You have ordered for Country Feast");
                            }
                            else if(ve==9) 
                            {
                                System.out.println("You have ordered for Veggie Lovers");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
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
                                    System.out.println("enter correct choice  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            if(per==1)
                            {
                                cost[var]=175+70; 
                            }
                            else if(per==2)
                            {
                                cost[var]=345+70; 
                            }
                            else if(per==3)
                            {
                                cost[var]=500+70;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println("");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                { System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            break;
                        }
                        break;
                        case 2:
                        while(true)
                        {
                            try
                            { 
                                System.out.println("\f");
                                System.out.println("====================================================");
                                System.out.println("= Tax Charged              +50       +60       +70 =");
                                System.out.println("=Select the type        Personal    Medium   Family=");
                                System.out.println("=1.Classic                 130        260       440= ");
                                System.out.println("=1.Zesty Chicken                                   = ");
                                System.out.println("=2.Chicken Delight                                 =    ");
                                System.out.println("=--------------------------------------------------=  ");
                                System.out.println("=2.Favourite               175        345       500= ");
                                System.out.println("=3.Corn & Chicken                                  =");
                                System.out.println("=4.Chick N Spicy                                   =");
                                System.out.println("=5.Firey Chicken                                   = ");
                                System.out.println("=--------------------------------------------------=  ");
                                System.out.println("=3.Signature               220        395       565=  ");
                                System.out.println("=6.Chicken Italia                                  =");
                                System.out.println("=7.Kadai Chicken                                   =");
                                System.out.println("=8.Chicken Tikka                                   =  ");
                                System.out.println("=9.Supreme                                         =");
                                System.out.println("=10.Pepperoni                                      =");
                                System.out.println("====================================================");
                                System.out.println("Enter the Pizza Type (1.CLASSIC 2.FAVOURITE 3.SIGNATURE)");
                                n_select=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(n_select==1||n_select==2||n_select==3)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY TO  OPT AGAIN");
                                br.readLine();
                            }
                        }
                        switch(n_select)
                        {
                            case 1: System.out.println("You have selected CLASSIC");
                            while(true)
                            {
                                try
                                {   System.out.println("");
                                    System.out.println("Now select the pizza in this category");
                                    nve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(nve==1||nve==2  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY TO OPT  AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizz_a[nve];
                            if(nve==1)
                            {
                                System.out.println(" You have ordered for Zesty Chicken");
                            }
                            else if(nve==2) 
                            {
                                System.out.println("You have ordered for Chicken Delight");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(per==1||per==2 ||per==3 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            if(per==1)
                            {
                                cost[var]=130+50; 
                            }
                            else if(per==2)
                            {
                                cost[var]=260+50; 
                            }
                            else if(per==3)
                            {
                                cost[var]=440+50;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT  AGAIN");
                                    br.readLine();
                                }

                            }break;
                            case 2: System.out.println("You have selected FAVOURITE ");
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Now select the pizza in this category");
                                    nve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(nve==3||nve==4 ||nve==5  )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizz_a[nve];
                            if(nve==3)
                            {
                                System.out.println(" You have ordered for Corn N Chicken");
                            }
                            else if(nve==4) 
                            {
                                System.out.println("You have ordered for Chick N Spicy");
                            }
                            else if(nve==5) 
                            {
                                System.out.println("You have ordered for Firey Chicken");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(per==1||per==2 ||per==3 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            if(per==1)
                            {
                                cost[var]=175+60; 
                            }
                            else if(per==2)
                            {
                                cost[var]=345+60; 
                            }
                            else if(per==3)
                            {
                                cost[var]=500+60;
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT  AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            break;
                            case 3: System.out.println("You have selected SIGNATURE ");
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Now select the pizza in this category");
                                    nve=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT  AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(nve==6||nve==7||nve==8||nve==9||nve==10 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no.\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                            pizza_1[var]=pizz_a[nve];
                            if(nve==6) 
                            {
                                System.out.println("You have ordered for Chicken Italia");
                            }
                            else if(nve==7) 
                            {
                                System.out.println("You have ordered for Kadai Chicken");
                            }
                            else if(nve==8) 
                            {
                                System.out.println("You have ordered for Chicken Tikka");
                            }
                            else if(nve==9) 
                            {
                                System.out.println("You have ordered for Supreme ");
                            }
                            else if(nve==10) 
                            {
                                System.out.println("You have ordered for Pepperoni");
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Select The Size \n1.Personal  2.Medium  3.Family");
                                    per=Integer.parseInt(br.readLine());
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed\n PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(per==1||per==2 ||per==3 )
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY TO OPT  AGAIN");
                                    br.readLine();
                                }
                            }
                            while(true)
                            {
                                try
                                {
                                    System.out.println(" ");
                                    System.out.println("Quantity of pizza required");
                                    quan[var]=Integer.parseInt(br.readLine());   
                                }
                                catch(Exception ex)
                                {
                                    System.out.println("only numbers allowed PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                    continue;
                                } 
                                if(quan[var]>=0)
                                {
                                    break;
                                }
                                else
                                {
                                    System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY TO OPT AGAIN");
                                    br.readLine();
                                }
                            }
                        }
                        if(per==1)
                        {
                            cost[var]=220+70;
                        }
                        else if(per==2)
                        {
                            cost[var]=395+70; 
                        }
                        else if(per==3)
                        {
                            cost[var]=565+70;
                        }                            
                        break;
                    }
                    break;
                    case 3:
                    System.out.println("\f");
                    System.out.println("#################################");
                    System.out.println("# You have selected Crown Pizza #");
                    System.out.println("#################################");
                    System.out.println("");
                    System.out.println("Unique crown shaped Pizzas with delicious Veg & Non Veg Kababs \naround the sumptuous toppings in the centre."); 
                    while(true)
                    {
                        try
                        {
                            System.out.println("\f");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            System.out.println("% Select 1.VEG 2.NON-VEG %");
                            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%");
                            nt=Integer.parseInt(br.readLine());
                        }
                        catch(Exception ex)
                        {
                            System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                            br.readLine();
                            continue;
                        } 
                        if(nt==1||nt==2)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY TO OPT AGAIN");
                            br.readLine();
                        }
                    }
                    if(nt==1)
                    {  while(true)
                        {
                            try
                            {
                                System.out.println("\f");
                                System.out.println("###########################");
                                System.out.println("#   You have selected Veg #");   
                                System.out.println("###########################");
                                System.out.println("\n");
                                System.out.println("_____________________________________________________________________________________________");
                                System.out.println("%             Select your menu                                                               %");
                                System.out.println("% 1.Margherita(a classic cheese pizza)                                                RS 315 %");
                                System.out.println("% 2.Veggie Royal(veg kebabs,tomato,onion,green chillies & onion sprinkle)             RS 385 %");
                                System.out.println("% 3.Veggie Grand(veg kababs,mushroom,green capsicum,onion,sweet corn,black olives)    RS 445 %");
                                System.out.println("______________________________________________________________________________________________");
                                grand=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println(" ");
                                System.out.println("only numbers allowed\n \f PRESS ENTER TO OPT AGAIN");
                                continue;
                            } 
                            if(grand==1||grand==2||grand==3)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER KEY OPT AGAIN");
                                br.readLine();
                            }
                        }    gr[var]=gran_d[grand];
                        grcos[var]=gran[grand];
                        if(grand==1)
                        {
                            System.out.println("You have ordered for Margherita"); 
                        }
                        else if(grand==2)
                        {
                            System.out.println("You have ordered for Veggie Royal"); 
                        }
                        else if(grand==3)
                        {
                            System.out.println("You have ordered for Veggie Grand");   
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Quantity of pizza required");
                                quan[var]=Integer.parseInt(br.readLine());   
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed  PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(quan[var]>=0)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no.  PRESS ENTER KEY OPT AGAIN");
                                br.readLine();
                            }
                            break;
                        }}
                    if(nt==2)
                    {
                        while(true)
                        {
                            try
                            {
                                System.out.println("\f");
                                System.out.println("################################");
                                System.out.println("#  You have selected Non-Veg   #");
                                System.out.println("################################");
                                System.out.println("");
                                System.out.println("__________________________________________________________________________________________");
                                System.out.println("             Select your option                                                           %");
                                System.out.println("%1.Chicken Jewel(chicken kebabs,tomato,orengano sprankle)                          RS 415 %");
                                System.out.println("%2.Chicken Magestic(chicken kebabs,hot n spicy,olive,orengano sprankle)            RS 475 % ");
                                System.out.println("%3.Chicken Splendor(chicken kebabs,chicken tikka,olive,orengano sprankle)          RS 525 % ");
                                System.out.println("__________________________________________________________________________________________");
                                ngrand=Integer.parseInt(br.readLine());
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(ngrand==1||ngrand==2||ngrand==3)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no.\n \f PRESS ENTER KEY OPT AGAIN");
                                br.readLine();
                            }
                        }
                        ngr[var]=ngran_d[ngrand];
                        ngrcos1[var]=ngcos[ngrand];
                        if(ngrand==1)
                        {
                            System.out.println("You have ordered for Chicken Jewel"); 
                        }
                        else if(ngrand==2)
                        {
                            System.out.println("You have ordered for Chicken Magestic");
                        }
                        else if(ngrand==3)
                        {
                            System.out.println("You have ordered for Chicken Splendor");  
                        }
                        while(true)
                        {
                            try
                            {
                                System.out.println(" ");
                                System.out.println("Quantity of pizza required");
                                quan[var]=Integer.parseInt(br.readLine());   
                            }
                            catch(Exception ex)
                            {
                                System.out.println("only numbers allowed PRESS ENTER TO  OPT AGAIN");
                                br.readLine();
                                continue;
                            } 
                            if(quan[var]>=0)
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("you have not followed the instruction enter correct no. PRESS ENTER TO OPT AGAIN ");
                                br.readLine();
                            }
                        }
                        break;
                    }
                }}
            while(true)
            {
                try
                {
                    System.out.println("Do you want to order anything more \n1.YES \n2.Display Final Bill ");
                    order=Integer.parseInt(br.readLine());
                }

                catch(Exception ex)
                {
                    System.out.println();
                    System.out.println("only numbers allowed\n\f");
                    System.out.println("PRESS ENTER TO OPT AGAIN");
                    br.readLine();
                    continue;
                } 
                if(order==1)
                {
                    var++;
                    System.out.println(" ");  
                    break;
                }
                else if(order>1 || order>2)
                {
                    break;
                }
                else
                {
                    System.out.println(" thanks"); 
                    break;
                }

            }}
        System.out.println("\f");
        System.out.println("*******************************************************");
        System.out.println("*                       PIZZA HUT                     *");            
        System.out.println("*                   FREE HOME DELIVERY                *");
        System.out.println("*=====================================================*");
        System.out.println("*                        YOUR BILL                    *");
        System.out.println("*                                                     *");
        System.out.print("*NAME :"+n1);                                                      
        for(int bill=1;bill<=55-(n1_1+8);bill++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        System.out.print("*");
        System.out.print("Mobile :"+ph);
        for(int bill=1;bill<=55-(tc.length()+10);bill++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        System.out.print("*");
        System.out.print("Address:"+add);
        for(int bill=1;bill<=55-(add_1+10);bill++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");
        System.out.print("*");
        System.out.print("Email :"+email);
        for(int bill=1;bill<=55-(emai_l+9);bill++)
        {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println(" ");
        System.out.print("*-----------------------------------------------------*");
        System.out.println(" ");
        System.out.println("*YOUR ORDER                COST       QUANTITY        *");
        for(int z=0;z<=var;z++)
        {
            if(pizza_1[z]=="Tomatino       "||pizza_1[z]=="Margherita     "||pizza_1[z]=="Simply Veg     "||pizza_1[z]=="Double Cheese  "||pizza_1[z]=="Veggie Crunch  "||pizza_1[z]=="Spicy Veg      "||pizza_1[z]=="Tandoori       "||pizza_1[z]=="Country Feast "||pizza_1[z]=="Veggie Lover   "||pizza_1[z]=="Zesty Chicken  "||pizza_1[z]=="Chicken Delight"||pizza_1[z]=="Corn&Chicken   "||pizza_1[z]=="Chick N Spicy  "||pizza_1[z]=="Firey Chicken  "||pizza_1[z]=="Chicken Italia "||pizza_1[z]=="Kadai Chicken  "||pizza_1[z]=="ChickenTikka   "||pizza_1[z]=="Supreme        "||pizza_1[z]=="Pepperoni      ")
            {
                System.out.print("*");
                for(int zz=z;zz==z;zz++)
                {
                    for(int lin=zz;lin==zz;lin++)
                    {
                        System.out.print(pizza_1[lin]+"            "+cost[zz]+"          "+quan[lin]); sa=Integer.toString(cost[zz]);sa1=Integer.toString(quan[lin]);
                    }
                    for(int bill=1;bill<=55-(pizza_1[zz].length()+4+sa.length()+sa1.length()+20);bill++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    System.out.println(" ");
                    System.out.print("*|" +crus_t[zz]+"       ||"+nv_eg[zz]+ "                          "+" *");
                    System.out.println(" ");
                    p=quan[zz]*cost[zz];
                }
            }
            if(men_u[z]=="Veg Magic Solo        "||men_u[z]=="Veggie Magic Solo     "||men_u[z]=="Non Veg Magic Solo    "||men_u[z]=="Non Veggie magic Solo "||men_u[z]=="Mixed Magic Duo       ")
            {
                System.out.print("*"+men_u[z]+"    "+bo_x[z]);
                for(int bill=1;bill<=55-(men_u[z].length()+9);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println(" "); l1=bo_x[z];
            }
            if(side_s[z]=="Garlic bread        "||side_s[z]=="Spicy Wings         "||side_s[z]=="Baked Pasta         "||side_s[z]=="Italian  Roll       "||side_s[z]=="Chicken Wings       ")
            {
                System.out.print("*"+side_s[z]+"      "+co_s[z]);
                for(int bill=1;bill<=55-(side_s[z].length()+11);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");l2= co_s[z];
            }
            if(drinks1[z]=="Mango Mousse           "||drinks1[z]=="Capichuno              "||drinks1[z]=="Pepsi Can              "||drinks1[z]=="Ice Tea                ")
            {
                System.out.print("*"+drinks1[z]+"    "+co_s1[z]);
                int len=drinks[z].length();
                for(int bill=1;bill<=55-(len+8);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println(" ");l3=co_s1[z];
            }
            if( gr[z]=="Margherita                "||gr[z]=="Veggie Royal              "||gr[z]=="Veggie Grand              ")
            {
                System.out.print("*"+gr[z]+grcos[z]+"           "+quan[z]); sa=Integer.toString(quan[z]);
                for(int bill=1;bill<=55-(gr[z].length()+sa.length()+16);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println(" ");c=grcos[z]*quan[z];
            }
            if(ngr[z]=="Chicken jewel             "||ngr[z]=="Chicken Majestic          "||ngr[z]=="Chicken Splendor          ")
            {
                System.out.print("*"+ngr[z]+ngrcos1[z]+"           "+quan[z]); sa=Integer.toString(quan[z]);
                for(int bill=1;bill<=55-(ngr[z].length()+sa.length()+16);bill++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println(" ");v=ngrcos1[z]*quan[z];
            }
            price=v+l1+l2+l3+c+p;
        }

        if(price<=1000.0f )
        {price =price+(price*5)/100;
            vat=5;}
        if(price>1000.0f && price<=4500.0f)
        { price =price+(price*10)/100;
            vat=10;}
        if(price>4500.0f && price<=5000.0f)
        {price =price+(price*15)/100;
            vat=15;}
        if(price>5000.0f)
        {price =price+(price*20)/100;
            vat=20;}
        System.out.print("    Final price="+price  +  "    vat charged= "+vat+"%");System.out.println(" ");
        System.out.println("*******************************************************");
    }}