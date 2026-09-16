package KeyWordDriven;

public class SauseDemoExecutor {
	SauceDemoImplementation s=new SauceDemoImplementation();
	
	public void executors(String keyword) {
		if(keyword.equals("LAUNCH_BROWSER")) {
			s.launchBrowser();
		}
		else if(keyword.equals("OPEN_URL")) {
			s.openurl();
		}
		else if(keyword.equals("USERNAME")) {
			s.usernameif();
		}
		else if(keyword.equals("PASSWARD")) {
			s.pwdtf();
		}
		else if(keyword.equals("Login")) {
			s.loginButton();
		}
		else if(keyword.equals("CLOSE_URL")) {
			s.closeurl();
		}
	}

}
