//OOPS Banner App Use Case 5
//This usecase extends the UC4 by defining and populating a string array in a more concise manner to store the lines of the banner
//This enhances the readability and maintainability
// @author Developer
// @version 5.0
public class OOPSBannerArray{
	public static void main(String[] args){
		//Each line represents  a row in banner to hold letters O,O,P,S
		String[] lines={
			String.join(" ","   ***   ","   ***   ","******   ","   *****"),
			String.join(" "," **   ** "," **   ** ","**    ** "," **     "),
			String.join(" ","**     **","**     **","**     **","**      "),
			String.join(" ","**     **","**     **","**    ** ","  ****  "),
			String.join(" ","**     **","**     **","******   ","     ** "),
			String.join(" "," **   ** "," **   ** ","**       ","**    **"),
			String.join(" ","   ***   ","   ***   ","**       ","  ****  ");
		}
		for(String line:lines){
			System.out.println(line);
		}
	}
}