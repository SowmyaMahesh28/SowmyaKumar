package week1.day1;

public class LearnSwitchCondition {
	 public static void main(String[] args) {
		 
		 String browser = "chrome";
		 
		 switch(browser)
		 
		 {
		 case "chrome" : System.err.println("Open the chrome browser"+ browser);break;
		 case "edge" : System.err.println("Open the microsoft edge"+ browser);break;
		 case "ie" : System.err.println("Open the internet explorer"+ browser);break;
		 case "firefox" : System.err.println("Open the firefox"+ browser);break;
		 default:System.err.println("Open the opera browser");break;
		 
		 }
		
	}

}
