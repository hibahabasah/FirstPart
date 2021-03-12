package pro1;

import java.util.ArrayList;

public class userstest {
	ArrayList<users> user=new ArrayList<users>();
	String found,pass=null;
	boolean check;
	
	public String find_admin(String string) {

		for (int i=0;i<user.size();i++) {
			if (user.get(i).getusername().equalsIgnoreCase(string)) {
				found= user.get(i).getpassward();
			}
		}
		
		return found;
	}
	
	
	public void add_users(String name, String pw) {
		
		users a=new users(name,pw);
		user.add(a);

	}
	

	public String check_passowrd(String s) {

		for (int j=0;j<user.size();j++) {
			if (user.get(j).getusername().equalsIgnoreCase(s)) {
				pass= user.get(j).getpassward();
				return pass;
				}
			}
		return pass;
				
	}
	
	public boolean check_username(String string){

		for(int m=0; m<user.size(); m++) {
				if(user.get(m).getusername().equalsIgnoreCase(string))
				{
					check=true;
					return check;

				} 
				else {
					check=false;
					return check;
				}
		}//for
		return check;
	}
	
}//class
