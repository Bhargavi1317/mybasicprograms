
package JavaPrograms;


public class AccessSpecifier_sameclass {
	public void username()
	{
		System.out.println(" calls the public access specifier ");
	}
	
	private void password() {
	
		System.out.println(" calls the private access specifier ");
	}
	protected void phone_num()
	{
		
		System.out.println(" calls the protected access specifier ");
	}
	void login() {    //default
		System.out.println(" calls the default access specifier ");
	}
	public static void main(String[] args) {

		AccessSpecifier_sameclass a5 = new AccessSpecifier_sameclass();
		a5.username();
		a5.password();
		a5.phone_num();
		a5.login();
	}

}
