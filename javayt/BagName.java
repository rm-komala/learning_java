public class BagName{

static int Bagprice = 1300;
static double  Bagsize = 5.5;
static String BagName = "Rakuten";
static boolean Bagwashable =true;

public static void main(String args[])
{

carrying();
moviable();
Stretchable();

System.out.println("Bagprice  ="+Bagprice );
System.out.println("Bagsize  ="+Bagsize );
System.out.println("BagName ="+BagName );
System.out.println("Bagwashable ="+Bagwashable );

}
static void carrying()
{
System.out.println("Invoked  carrying()" );
}

static void moveable(String "smoothmoveable")
{
System.out.println("invoked  moveable()" );
}

static void   stretchable()
{
System.out.println("invoked stretchable()");

}

}
