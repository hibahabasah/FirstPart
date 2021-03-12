package pro1;

public class users {
	private String username;
	private String passward ;
	private String admin;
	
	
   public users(String s ,String p) {
	   this.username = s  ;
	   this.passward = p;
   }
   
   public String getusername(){
	   return username ;
   }
   
   public String getpassward(){
	   return passward ;
   }
   
   public users (String s, String i, boolean b) {
	   this.username = s  ;
	   this.passward = i;
	   if (b==true) {
		   this.admin=s;
	   }
   }

   
}//class
