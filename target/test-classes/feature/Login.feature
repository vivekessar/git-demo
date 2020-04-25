Feature: Application Checking


Scenario: Home page navigation

Given User is in landing page
When User searches for given keyword "water" and "river"
Then Page is populated with results
And The required page is "absent"


Scenario: Home page navigation

Given User is in landing page
When User searches for given keyword "oxygen" and "air"
Then Page is populated with results
And The required page is "present"