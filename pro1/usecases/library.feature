Feature: Admin login
  Scenario: valid_password
  Given  login with username "hiba" and password "123" and "true"
  When I login  with username "hiba" and password "123"
  Then the password should be "123"
  
  Scenario: Invalid
  Given  logingin with username "hiba" and password  "1234" and "false"
  When  logingin  with username "hiba" and password "1234"
  Then password is wrong
  

 
