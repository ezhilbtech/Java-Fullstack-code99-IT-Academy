import java.lang.*;
class Otp
{
	public static void main(String arg[])
	{
		double otp=Math.random()*999+999;
		int res=(int)otp;
		System.out.println("OTP: "+res);
	}
}