public class boolp7
{
	public static void main(String[] args)
	{
		boolean b1=true,b2=false;
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		boolean phi = (!(b1 && b2 ) && (b1 || b2 )) || ((b1 && b2) || !(b1 || b2)); 
		System.out.println("VALUE OF PHI ="+phi);
	}
}