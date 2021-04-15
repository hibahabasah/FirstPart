package pro1;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class searchTest {
	String username;
	 String password ;
	 ArrayList<Users> user=new ArrayList<Users>();
	 UsersTest obj=new UsersTest();
	 String x;
	 String pw;
	 String y;
	public boolean status=false;
	ArrayList<Books> book=new ArrayList<Books>();
	BooksTest obj1=new BooksTest();
	boolean added=false;

	     @Given("login with username {string} and password {string} and {string}")
	     public void loginWithUsernameAndPasswordAnd(String string, String int1, String string2) {
		 boolean bo=Boolean.parseBoolean(string2);
		   Users s = new Users(string,int1);
		   obj.addUsers(s.getusername(),s.getpassward());
		   user.add(s);
		   status=bo;
	    }

	     @When("I login  with username {string} and password {string}")
	     public void iLoginWithUsernameAndPassword(String string, String int1) {
		    x=obj.findAdmin(string);
		    password=int1;
		}
		@Then("the password should be {string}")
		public void thePasswordShouldBe(String int1) {
			String d=int1;
			assertEquals(d,x);
		}
		

		
				@Given("logingin with username {string} and password  {string} and {string}")
				public void loginginWithUsernameAndPasswordAnd(String string, String string2, String string3) {
					boolean b= Boolean.parseBoolean(string3); 
					Users us=new Users(string, string2); 
					obj.addUsers(us.getusername(), us.getpassward());
				}


				@When("logingin  with username {string} and password {string}")
				public void loginginWithUsernameAndPassword(String string, String string2) {
					pw=obj.checkPassowrd(string); 
		            y=string2; 
					}
				
				@Then("password is wrong")
				public void passwordIsWrong() {
					assertEquals(pw,y); 
					}


	


					@Given("already logged in")
					public void alreadyLoggedIn() {
					status=true;
					}


					@When("I press logout from {string}")
					public void iPressLogoutFrom(String string) {
					    status=obj.checkUsername(string);
					    		if (status)
					    			status=false;
					}
					
					@Then("it exits")
					public void itExits() {
						assertEquals(false,status);
					}



					String s1,s2,s3,s4;
					
						@Given("these homes are contained in the system")
						public void theseHomesAreContainedInTheSystem(List<List> d) {
						for(int u =0; u< d.size();u++) { 
						  Books b = new Books(d.get(u).get(0).toString(),d.get(u).get(1).toString(),d.get(u).get(2).toString(),d.get(u).get(3).toString());
						  obj1.addbook(b);
						  book.add(b);
						}
						}



						@When("i add book while admin logged in is {string}")
						public void iAddBookWhileAdminLoggedInIs(String string) {
							 boolean login=Boolean.parseBoolean(string);
							 if (login) {
								 added =true;
								 Books b = new Books(s1,s2,s3,s4);
								   obj1.addbook(b);
								   book.add(b);
							 }
						}
						@Then("the book is added")
						public void theBookIsAdded() {
							assertEquals(true,added);
						}



							@Given("book with title {string} and author {string} and signature {string} and ISBN {string}")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
							public void bookWithTitleAndAuthorAndSignatureAndISBN(String string, String string2, String string3, String string4) {
								 s1=string;
								 s2=string2;
								 s3=string3;
								 s4=string4;
							}


							@When("adding book while admin logged in is {string}")
							public void addingBookWhileAdminLoggedInIs(String string) {
								 boolean logout=Boolean.parseBoolean(string);
								 if(logout) {
									 added=false;
								 }

							}
							
							@Then("the book is not added")
							public void theBookIsNotAdded() {
								assertEquals(false,added);

							}
							
							ArrayList<Books> search=new ArrayList<Books>();

							@Given("these books are added in the system")
							public void theseHomesAreAddedInTheSystem(List<List> d) {
	                                 
								for (int i=0 ; i<d.size();i++) {
									 Books b = new Books(d.get(i).get(0).toString(),d.get(i).get(1).toString(),d.get(i).get(2).toString(),d.get(i).get(3).toString());
									 
									 float f=0;
										float rem=0;
										int sum=0;	
										int mul=0;
										  Books b1 = new Books(d.get(i).get(0).toString(),d.get(i).get(1).toString(),d.get(i).get(2).toString(),d.get(i).get(3).toString());
										  String ss=d.get(i).get(3).toString();
										  int n = Integer.parseInt(ss);
										  for(int t=1;t<=10;t++) { 	
										    int w = n / 10;
										    int k = n - w * 10;
										    n = w;
										    mul=t*k;
										    sum=sum+mul;
										  }
										  f=sum/11;
										  rem=f-(int)f;
										  if (rem==0) 
									       search.add(b);

									}
							
							}

							@When("I search about book by title {string}")
							public void i_search_about_book_by_title(String string) {
								for(int i=0; i< search.size(); i++) {
									  if(search.get(i).gettitle().equalsIgnoreCase(string))
									{
									 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
									}
							    }
							}

							@Then("A list of books that matches the title {string} specification should be returned and printed on the console")
							public void a_list_of_books_that_matches_the_title_specification_should_be_returned_and_printed_on_the_console(String string) {
								for(int i=0; i< search.size(); i++) {
									if(search.get(i).gettitle().equals(string))
									{
										String s=search.get(i).gettitle();
									 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
									 assertEquals(string,s);
									}
							}
					}
				
		

								@When("I search about book by author {string}")
								public void iSearchAboutBookByAuthor(String string) {
									for(int i=0; i< search.size(); i++) {
										  if(search.get(i).getauthor().equalsIgnoreCase(string))
										{
										 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
										}
								    }
								}


								@Then("A list of books that matches the author {string} specification should be returned and printed on the console")
								public void aListOfBooksThatMatchesTheAuthorSpecificationShouldBeReturnedAndPrintedOnTheConsole(String string) {
									for(int i=0; i< search.size(); i++) {
										if(search.get(i).getauthor().equals(string))
										{
											String s=search.get(i).getauthor();
										 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
										 assertEquals(string,s);
										}
								}
								}


									@When("I search about book by ISBN {string}")
									public void iSearchAboutBookByISBN(String string) {
										for(int i=0; i< search.size(); i++) {
											  if(search.get(i).getISBN().equalsIgnoreCase(string))
											{
											 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
											}
									    }
									}


									@Then("A list of books that matches the ISBN {string} specification should be returned and printed on the console")
									public void aListOfBooksThatMatchesTheISBNSpecificationShouldBeReturnedAndPrintedOnTheConsole(String string) {
										for(int i=0; i< search.size(); i++) {
											if(search.get(i).getISBN().equals(string))
											{
												String s=search.get(i).getISBN();
											 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
											 assertEquals(string,s);
											}
									}
									}



										@When("I search about book by signature {string}")
										public void iSearchAboutBookBySignature(String string) {
											for(int i=0; i< search.size(); i++) {
												  if(search.get(i).getsignature().equalsIgnoreCase(string))
												{
												 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
												}
										    }
										}


										@Then("A list of books that matches the signature {string} specification should be returned and printed on the console")
										public void aListOfBooksThatMatchesTheSignatureSpecificationShouldBeReturnedAndPrintedOnTheConsole(String string) {
											for(int i=0; i< search.size(); i++) {
												if(search.get(i).getsignature().equalsIgnoreCase(string))
												{
													String s=search.get(i).getsignature();
												 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
												 assertEquals(string,s);
												}
										     }
										}

	                                     boolean found=true;
											@When("I search about book by any information {string}")
											public void iSearchAboutBookByAnyInformation(String string) {
												for(int i=0; i< search.size(); i++) {
													  if(search.get(i).getauthor().equalsIgnoreCase(string))
													{
													 System.out.println("Yes, the book is included in the library" +search.get(i).gettitle()+" "+search.get(i).getauthor()+" " +search.get(i).getsignature()+ " " +search.get(i).getISBN());
													}
													  else { System.out.println("there is no books matches these information");
													     found=false;
													  }
											    }
											}


											@Then("there is no books matches the information")
											public void thereIsNoBooksMatchesTheInformation() {
												 assertEquals(false,found);
											}

	                                                                                
											@When("I search about book with Admin logging in")
											public void iSearchAboutBookWithAdminLoggingIn() {
													if (!status) 
														System.out.println("the Admin is login , you can search any book");
													    
													}
												
											@Then("A list of books appears")
											public void aListOfBooksAppears() {
												 assertEquals(true,!status);
													}
				
 }



