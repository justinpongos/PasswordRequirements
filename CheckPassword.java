
public class CheckPassword {
	static boolean isValid(String password) {
		boolean statement = false;
		
		if (password.length() < 6) {
			return statement;
			}//end if
		
		for (int index = 0; index < password.length(); index++) {
			if (password.substring(index, index +1).equals("+") || password.substring(index, index +1).equals("-") || password.substring(index, index +1).equals("*") || password.substring(index, index +1).equals("/") || password.substring(index, index +1).equals("@") ) {
				statement = true;
			}//end if
		}//end for
		return statement;
	}//end static
}//end class

