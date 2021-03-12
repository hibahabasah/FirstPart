 Feature: add book
 Background: add these books to our library with their specifications (title-author-signature-ISBN)
Given  these homes are contained in the system
 
    |"Test-Drivenest Driven Development"|"Kent Beck"| "Beck2002"|"0140449116"|
    |"Math"|"Marah"|"Najjar2021"|"1861972717"|
    |"physics"|"Hiba"|"Hiba2021"|"0198526636"|
    |"Arabic"|"Marah"|"khaleel2020"|"0764526413"|
    |"English"|"Mark"|"Mark2009"|"0764526416"|
    
 Scenario: add book 
 When i add book while admin logged in is "true"
 Then  the book is added
 
    
 
Scenario: do not add book
 Given book with title "Test-Drivenest Driven Development" and author "Kent Beck" and signature "Beck2002" and ISBN "0140449116"
 When adding book while admin logged in is "false"
 Then the book is not added
 

 
 
 