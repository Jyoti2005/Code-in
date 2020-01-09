package codein;

import java.io.*;

class Base
{
int l,b;
Base(int x,int y)
{
l=x;
b=y;
}
int area()
{
return l*b;
}
}
class Derived extends Base
{
int h;
Derived(int x,int y,int z)
{
super(x,y);  //pass values to base class   it calls the constructor of base class
h=z;
}
int volume()
        {
            return (l*b*h);
         }
}
public class Inheritance 
{
    public static void main(String[] args)  throws IOException
    {
        System.out.println("-----------------EXAMPLE  OF SINGLEINHERITANCE---------------------------------------");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter l,b,h: ");
        int l=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int h=Integer.parseInt(br.readLine());
        Derived d=new Derived(l,b,h);
        System.out.println("Area= "+d.area());
        System.out.println("Volume= "+d.volume());
    }
}
