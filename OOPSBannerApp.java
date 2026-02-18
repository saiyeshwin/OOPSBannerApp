//OOPS Banner App Use Case 4
//This usecase improves upon the UC3 by using a string array to store the lines of the banner
// We iterate them using for each instead of hard coding print statements
// @author Developer
// @version 4.0
public class OOPSBannerArray{
	public static void main(String[] args){
		String[] arr=new String[7];
		arr[0]=String.join(" ","   ***   ","   ***   ","******   ","   *****");
		arr[1]=String.join(" "," **   ** "," **   ** ","**    ** "," **     ");
		arr[2]=String.join(" ","**     **","**     **","**     **","**      ");
		arr[3]=String.join(" ","**     **","**     **","**    ** ","  ****  ");
		arr[4]=String.join(" ","**     **","**     **","******   ","     ** ");
		arr[5]=String.join(" "," **   ** "," **   ** ","**       ","**    **");
		arr[6]=String.join(" ","   ***   ","   ***   ","**       ","  ****  ");
		for(String line:arr){
			System.out.println(line);
		}
	}
}