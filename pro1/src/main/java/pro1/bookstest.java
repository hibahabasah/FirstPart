package pro1;

import java.util.ArrayList;

public class bookstest {

	ArrayList<books> repo=new ArrayList<books>();
	
public void addbook(books t) {
		
		repo.add(t);

	}
public ArrayList<books> getarray(){
	return this.repo;
}
}
