//UC-3 OOPS Banner App: To print OOPS using asterisks
//Instead of using + like in UC2 we use String.join() in this usecase
//@author Developer
//@version 3.0
public class OOPSBannerJoin{
	public static void main(String[] args){
		//String.join() is used for better readability and efficiency
		//Each line corresponds to a row in O,O,P,S
		System.out.println(String.join(" ","   ***   ","   ***   ","******   ","   *****"));
		System.out.println(String.join(" "," **   ** "," **   ** ","**    ** "," **     "));
		System.out.println(String.join(" ","**     **","**     **","**     **","**      "));
		System.out.println(String.join(" ","**     **","**     **","**    ** ","  ****  "));
		System.out.println(String.join(" ","**     **","**     **","******   ","     ** "));
		System.out.println(String.join(" "," **   ** "," **   ** ","**       ","**    **"));
		System.out.println(String.join(" ","   ***   ","   ***   ","**       ","  ****  "));
	
	}
}