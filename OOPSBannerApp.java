//OOPS Banner App Use Case 6
//This usecase extends the UC5 by implementing a modular approach to generate each letter's pattern using an individual get pattern method
// This enhances code reusability and maintainability
// @author Developer
// @version 6.0
public class OOPSBannerApp{
	public static void main(String[] args){
		String[] oPattern=getOPattern();
		String[] pPattern=getPPattern();
		String[] sPattern=getSPattern();
		for(int i=0;i<oPattern.length;i++){
			System.out.println(oPattern[i]+" "+oPattern[i]+" "+pPattern[i]+" "+sPattern[i]);
		}
	}
	public static String[] getOPattern(){
		return new String[]{
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		};
	}
	public static String[] getPPattern(){
		return new String[]{
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       "
		};
	}
	public static String[] getSPattern(){
		return new String[]{
			"   ***** ",
			" **      ",
			"**       ",
			"  ****   ",
			"     **  ",
			"**    ** ",
			"  ****   "
		};
	}
}