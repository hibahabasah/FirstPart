Feature: search books
 Background: books are already addeed to the system with their specifications (title-author-signature-ISBN)
Given  these homes are added in the system
    |Test-Drivenest Driven Development|Kent Beck|Beck2002|0140449116|
    |Math|Marah|Najjar2021|1861972717|
    |physics|Hiba|Habash2021|0198526636|
    |Arabic|Marah|khaleel2020|0764526413|
    |English|Mark|Mark2009|0764526416|
    
Scenario: The System has a repository of books with their specifications 
When I search about book by title "physics"
Then A list of books that matches the title "physics" specification should be returned and printed on the console

Scenario: The System has a repository of books with their specifications 
When I search about book by author "Marah"
Then A list of books that matches the author "Marah" specification should be returned and printed on the console

Scenario: The System has a repository of books with their specifications 
When I search about book by ISBN "0140449116"
Then A list of books that matches the ISBN "0140449116" specification should be returned and printed on the console

Scenario: The System has a repository of books with their specifications 
When I search about book by signature "Najjar2021"
Then A list of books that matches the signature "Najjar2021" specification should be returned and printed on the console

Scenario: The System has a repository of books with their specifications 
When I search about book by any information "Tabarak"
Then there is no books matches the information

Scenario: The System has a repository of books with their specifications 
When I search about book with Admin logging in
Then A list of books appears
