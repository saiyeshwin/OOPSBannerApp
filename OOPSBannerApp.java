// OOPS Banner App-Use Case 7
// This use case extends UC6 by implementing a CharacterPatternMap
// The application retrieves and displays "OOPS" using these mappings
//This approach enchances modularity and code organization
// @author Developer
// @version 7.0
public class OOPSBannerApp{
	static class CharacterPatternMap{
		Character character;
		String[] pattern;
		public CharacterPatternMap(Character character,String[] pattern){
			this.character=character;
			this.pattern=pattern;
		}
	}
	public static CharacterPatternMap[] createCharacterPatternMaps(){
		CharacterPatternMap[] characterPatternMap=new CharacterPatternMap[3];
		String[] oPattern=new String[]{
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		};
		String[] pPattern=new String[]{
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       "
		};
		String[] sPattern=new String[]{
			"   ***** ",
			" **      ",
			"**       ",
			"  ****   ",
			"     **  ",
			"**    ** ",
			"  ****   "
		};
		return new CharacterPatternMap[]{
			new CharacterPatternMap('O',oPattern),
			new CharacterPatternMap('P',pPattern),
			new CharacterPatternMap('S',sPattern),
		};
	}
	public static String[] getCharacterPattern(char c,CharacterPatternMap[] charMap){
		for(CharacterPatternMap i:charMap){
			if(c==i.character) return i.pattern;
		}
		return new String[]{ " ", " ", " ", " ", " ", " ", " " };
	}
	public static void printMessage(String message,CharacterPatternMap[] charMap){
		for(int i=0;i<7;i++){
			for(char c:message.toCharArray()){
				String[] pattern=getCharacterPattern(c,charMap);
				System.out.print(pattern[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		CharacterPatternMap[] charMap=createCharacterPatternMaps();
		String message="OOPS";
		printMessage(message,charMap);
	}
}