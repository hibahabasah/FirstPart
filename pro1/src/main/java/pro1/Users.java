package pro1;

public class Users {
	private String username;
	private String passward ;
	public String admin;
	
	
   public Users(String s ,String p) {
	   this.username = s  ;
	   this.passward = p;
   }
   
   public String getusername(){
	   return username ;
   }
   
   public String getpassward(){
	   return passward ;
   }
   
}//class
