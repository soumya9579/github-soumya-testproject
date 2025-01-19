Feature: Login Application

@test1

Scenario Outline: lined: User able to launch the application - Registration Journey

  Given user Launched the APP
  Then User able to register the "<application>" with new "<mobile_number>"
  And User launch the home page using "<customer_role>" and "<PIN>"

  Examples:
  |application| mobile_number | customer_role | PIN |
  |User1      | 8330950961   | QA_test3 | 7687      |
#  |User2      | 8335554342   | QA_test5 | 6767      |

@test2
Scenario: User able to Login to the Application - Login Journey

  Given user Registered in the application
  Then User able to give pin number
  And User Logged into the Home page