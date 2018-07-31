
class pi
{
    public static void mn(String s1)
    {
        int count=0;
        int n=s1.length();   
        for(int i=0;i<n;i++)
        {
            char ch=s1.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {count++;}
            System.out.println(count);
        }
    }

    public static void main(String args[])
    {
    String s="Application";
    mn(s);
    }}