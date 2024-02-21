class Base {
    public int x;
    public int getx()
    {
        return x;
    } 
    public void setx (int x)
    {
        System.out.println(" i am in base and setting a row ");
        this.x=x;
    } 
    public void printMe (){
        System.out.println("ia am a constructor");
    }
}
class Derived extends Base {
    public int y ;
    public int gety()
    {
        return y;
    } 
    public void sety (int y){
        this .y=y;
    }
    public void printMe(){
        System.out.println("i am a destructor" );
    } 
    
}
public class inheritance {
    public static void main (String [] args)
    {
        Base b = new Base();
        b.setx(5);
        System.out.println (b.getx());

        // derived class 
        Derived d = new Derived ();
        d.setx (6);System.out.println (d.getx()); 
    }
}
