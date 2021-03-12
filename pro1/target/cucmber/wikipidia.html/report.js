$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:usecases/addbook.feature");
formatter.feature({
  "name": "add book",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "add these books to our library with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are contained in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreContainedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "add book",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "i add book while admin logged in is \"true\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iAddBookWhileAdminLoggedInIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the book is added",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.theBookIsAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "add these books to our library with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are contained in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreContainedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "do not add book",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "book with title \"Test-Drivenest Driven Development\" and author \"Kent Beck\" and signature \"Beck2002\" and ISBN \"0140449116\"",
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.bookWithTitleAndAuthorAndSignatureAndISBN(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adding book while admin logged in is \"false\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.addingBookWhileAdminLoggedInIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the book is not added",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.theBookIsNotAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/library.feature");
formatter.feature({
  "name": "Admin login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "valid_password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "login with username \"hiba\" and password \"123\" and \"true\"",
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.loginWithUsernameAndPasswordAnd(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login  with username \"hiba\" and password \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iLoginWithUsernameAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the password should be \"123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.thePasswordShouldBe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "logingin with username \"hiba\" and password  \"1234\" and \"false\"",
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.loginginWithUsernameAndPasswordAnd(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logingin  with username \"hiba\" and password \"1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.loginginWithUsernameAndPassword(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password is wrong",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.passwordIsWrong()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/logout.feature");
formatter.feature({
  "name": "Admin logout",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Administrator logs out",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "already logged in",
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.alreadyLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press logout from \"hiba\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iPressLogoutFrom(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it exits",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.itExits()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:usecases/search.feature");
formatter.feature({
  "name": "search books",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "books are already addeed to the system with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are added in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreAddedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The System has a repository of books with their specifications",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about book by title \"physics\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.i_search_about_book_by_title(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A list of books that matches the title \"physics\" specification should be returned and printed on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.a_list_of_books_that_matches_the_title_specification_should_be_returned_and_printed_on_the_console(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "books are already addeed to the system with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are added in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreAddedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The System has a repository of books with their specifications",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about book by author \"Marah\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iSearchAboutBookByAuthor(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A list of books that matches the author \"Marah\" specification should be returned and printed on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.aListOfBooksThatMatchesTheAuthorSpecificationShouldBeReturnedAndPrintedOnTheConsole(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "books are already addeed to the system with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are added in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreAddedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The System has a repository of books with their specifications",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about book by ISBN \"0140449116\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iSearchAboutBookByISBN(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A list of books that matches the ISBN \"0140449116\" specification should be returned and printed on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.aListOfBooksThatMatchesTheISBNSpecificationShouldBeReturnedAndPrintedOnTheConsole(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "books are already addeed to the system with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are added in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreAddedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The System has a repository of books with their specifications",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about book by signature \"Najjar2021\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iSearchAboutBookBySignature(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A list of books that matches the signature \"Najjar2021\" specification should be returned and printed on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.aListOfBooksThatMatchesTheSignatureSpecificationShouldBeReturnedAndPrintedOnTheConsole(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "books are already addeed to the system with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are added in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreAddedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The System has a repository of books with their specifications",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about book by any information \"Tabarak\"",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iSearchAboutBookByAnyInformation(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is no books matches the information",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.thereIsNoBooksMatchesTheInformation()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "books are already addeed to the system with their specifications (title-author-signature-ISBN)",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "these homes are added in the system",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "pro1.searchTest.theseHomesAreAddedInTheSystem(java.util.List\u003cjava.util.List\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The System has a repository of books with their specifications",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I search about book with Admin logging in",
  "keyword": "When "
});
formatter.match({
  "location": "pro1.searchTest.iSearchAboutBookWithAdminLoggingIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A list of books appears",
  "keyword": "Then "
});
formatter.match({
  "location": "pro1.searchTest.aListOfBooksAppears()"
});
formatter.result({
  "status": "passed"
});
});