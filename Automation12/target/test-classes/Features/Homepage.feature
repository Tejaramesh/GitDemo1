Feature: Login

Scenario: Home page default Login
Given: user is on Netbanking Landing page
when: user login into application with username and password
Then Home page is populated
And cards are displayed
