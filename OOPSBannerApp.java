// OOPS Banner App-Use Case 8
// This extends UC7 by using collections framework to manage character patterns in a more flexible and efficient way
// This application retrieves and displays OOPS banner using hashmap
// This enhances code modularity and code organization
// @author Developer
// @version 8.0
import java.util.*;
public class OOPSBannerApp{
	public static HashMap<Character,String[]> createHashMap(){
		// This method returns a hashmap which consists of character and it's corresponding pattern
		HashMap<Character,String[]> map=new HashMap<>();
		// O and O's asterisk pattern 
		map.put('O',new String[]{
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		});
		// P and P's asterisk pattern 
		map.put('P',new String[]{
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       "
		});
		// S and S's asterisk pattern 
		map.put('S',new String[]{
			"   ***** ",
			" **      ",
			"**       ",
			"  ****   ",
			"     **  ",
			"**    ** ",
			"  ****   "
		});
		return map;
	}
	public static void printMessage(String message,HashMap<Character,String[]> map){
		//This method iterates through the message and uses hashmap to print the corresponding pattern
		int height=map.get('O').length;
		for(int i=0;i<height;i++){
			for(int j=0;j<message.length();j++){
				Character c=message.charAt(j);
				String[] s=map.get(c);
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		HashMap<Character,String[]> map=createHashMap();
		String message="OOPS";
		printMessage(message,map);
	}
}