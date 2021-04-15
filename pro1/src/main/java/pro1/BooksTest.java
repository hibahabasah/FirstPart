package pro1;
import java.util.HashSet;
import java.util.Set;

public class BooksTest {


	private Set<Books> repo=new HashSet<Books>();
	
public void addbook(Books t) {
		repo.add(t);
	}

 public Set<Books> getarray(){
	return this.repo;
 }
}
