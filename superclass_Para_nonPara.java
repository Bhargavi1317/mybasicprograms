package JavaPrograms;
class set_url
{
	set_url()
	{
		System.out.println("set_url");
	}
}
class launch_browser extends set_url
{
	launch_browser()
	{
		
		System.out.println("launch_browser");
	}
}
public class superclass_Para_nonPara extends launch_browser{
	
	superclass_Para_nonPara()
	{
		System.out.println("superclass_Para_nonPara"); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superclass_Para_nonPara s3= new superclass_Para_nonPara();		
		System.out.println("Testcase");
	}

}
