package KeywordFramework;

import KeyWordDriven.SauseDemoExecutor;

public class SauceDemo {
	public static void main(String[] args) {
		
		SauseDemoExecutor e=new SauseDemoExecutor();
		e.executors("LAUNCH_BROWSER");
		e.executors("OPEN_URL");
		e.executors("USERNAME");
		e.executors("PASSSWARD");
		e.executors("LOGIN");
		e.executors("CLOSE_URL");
	}

}
