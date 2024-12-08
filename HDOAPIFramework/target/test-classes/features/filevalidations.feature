Feature: Validating Registration page

Scenario: Verify user is able to register successfully
  Given User Registration details
  When user calls "API" with Post http request
  Then API call got success with status code 200
 
  
  