package pro1;

public class Books {
	private String title;
	private String author;
	private String signature;
	private String isbn;
	
	public Books(String t, String a, String s, String i) {
		this.title = t  ;
		this.author=a;
		this.signature=s;
		this.isbn=i;
		
	}
	
	public String gettitle() {
		return title;
	}
	
	public String getauthor() {
		return author;
	}
	
	public String getsignature() {
		return signature;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public void setTitle(String t) {
		title=t; 
	}

	public void setAuthor(String a) {
		author=a; 
	}

	public void setSignature(String s) {
		signature=s; 
	}	

	
}
