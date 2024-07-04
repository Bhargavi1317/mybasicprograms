package JavaPrograms;

public class AcessSpecifier_Samepackage_class2 {

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
	
}
