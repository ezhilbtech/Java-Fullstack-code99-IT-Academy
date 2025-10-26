import java.util.*;
class Gst
{
	static int total_amount=3000;
	static int product1=1200;
	static int product2=1400;
	static int platform_charge=100;
	public static void main(String args[])
	{
		int total_product=product1+product2;
		int amount=total_amount-total_product;
		int gst=amount-platform_charge;
		System.out.println("The Gst amount is:"+gst+"Rs");
		int gst_percentage=total_amount/gst;
		System.out.println("The Gst percentage is:"+gst_percentage+"%");
	}
	
}