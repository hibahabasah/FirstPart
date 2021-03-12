package pro1;

public class books {
	private String title;
	private String author;
	private String signature;
	private String ISBN;
	
	public books(String t, String a, String s, String i) {
		this.title = t  ;
		this.author=a;
		this.signature=s;
		this.ISBN=i;
		
	}//constructor
	
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
		return ISBN;
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

	public void setISBN(String isbn) {
		ISBN=isbn; 
	}
}
