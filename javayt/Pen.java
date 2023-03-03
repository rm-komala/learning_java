public class Pen{

static String  PenName = "cello";
static int  PenPrice = 5;
static double penPointName = 0.5;
static boolean PenColor= false;

public static void main(String args[])
{
boolean argument1=true;
writable();
holdingThepen();
boolean function = penCapclosing(argument1);

System.out.println("PenName  ="+PenName );
System.out.println("PenPrice  ="+PenPrice );
System.out.println("penPointName ="+penPointName );
System.out.println("PenColor ="+PenColor );

}

static void writable()
{
System.out.println("Invoked  writable()" );
}

static void holdingThepen()
{
System.out.println("invoked  holdingThepen()" );
}

static boolean  penCapclosing(boolean p1)
{
System.out.println("invoked  penCapclosing()");
System.out.println(p1);
boolean returnValue=p1;
return returnValue;
}


}


