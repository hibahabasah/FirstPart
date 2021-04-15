package pro1;

import java.util.ArrayList;

public class UsersTest {
	ArrayList<Users> user=new ArrayList<Users>();
	String found=null;
	String pass=null; 
	boolean check;
	
	public String findAdmin(String string) {

		for (int i=0;i<user.size();i++) {
			if (user.get(i).getusername().equalsIgnoreCase(string)) {
				found= user.get(i).getpassward();
			}
		}
		
		return found;
	}
	
	
	public void addUsers(String name, String pw) {
		
		Users a=new Users(name,pw);
		user.add(a);

	}
	

	public String checkPassowrd(String s) {

		for (int j=0;j<user.size();j++) {
			if (user.get(j).getusername().equalsIgnoreCase(s)) {
				pass= user.get(j).getpassward();
				return pass;
				}
			}
		return pass;
				
	}
	
	
	public boolean checkUsername(String string){

		int usersize = user.size();
		
		for(int m=0; m<usersize; m++) {
				if(user.get(m).getusername().equalsIgnoreCase(string))
				{
					check=true;
					return check;

				} 
				else {
					check=false;
					return check;
				}
		}
		return check;
	}
	
	
}
