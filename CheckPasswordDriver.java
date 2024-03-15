import javax.swing.JOptionPane;
public class CheckPasswordDriver {
	public static void main(String[]args) {

	String pass = JOptionPane.showInputDialog("enter password");
	Boolean p;
	p = (CheckPassword.isValid(pass));
	
	while (p == false) {
		String pass2 = JOptionPane.showInputDialog("enter password");
			p = (CheckPassword.isValid(pass2));	
	}//while loop
	
	if (p == true) {
		String e = "Password Created";
		System.out.println(e);
	}//end if
	}//end main
}//end class
