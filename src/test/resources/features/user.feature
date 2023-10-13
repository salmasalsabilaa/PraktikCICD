Feature: User

  As a user
  I want to see my home page
  So that I can use feature on my home page

  Background: User is Logged In
    Given I am on the login page
    When I enter my username and password correctly
    And I click login button
    Then I am on the home page

  Scenario: As a user i have to able to open my profile page
    Given I am on the home page
    When I click to my profile icon
    And  I click view profile button
    Then I am on the profile page

  Scenario: As a user i have able to open notification page
    Given I am on the home page
    When I click to notification icon
    Then I am on the notification page

  Scenario: As a user i have able to open messaging page
    Given I am on the home page
    When I click to messaging icon
    Then I am on the messaging page

  Scenario: As a user i have able to open jobs page
    Given I am on the home page
    When I click to jobs icon
    Then I am on the jobs page

  Scenario: As a user i have able to open my network page
    Given I am on the home page
    When I click to my network icon
    Then I am on the my network page

  Scenario: As a user i have able to start a post
    Given I am on the home page
    When I click to start a post field
    And I write text on post field
    And I click post button
    Then I have start posting

  Scenario: As a user i have able to open connection page
    Given I am on the home page
    When I click to connection menu
    Then I am on the connection page

  Scenario: As a user i have able to open my item page
    Given I am on the home page
    When I click to my item menu
    Then I am on the my item page

  Scenario: As a user i have able to open group page
    Given I am on the home page
    When I click to group menu
    Then I am on the group page

  Scenario: As a user i have able to add an event
    Given I am on the home page
    When I click to event menu
    And I click on plus icon
    And I fill form on add event form
    And I click Next
    And I click done
    Then I am success to add new event

  Scenario: As a user i have able to short feeds by recent
    Given I am on the home page
    When I click to short by dropdown
    And I choose recent
    Then I am success short feeds by recent

  Scenario: As a user i have able to short feeds by top
    Given I am on the home page
    When I click to short by dropdown
    And I choose top
    Then I am success short feeds by top

  Scenario: As a user i have able to like a post
    Given I am on the home page
    When I choose a post
    And I click like icon
    Then I am success to like a post

  Scenario: As a user i have able to comment on a post
    Given I am on the home page
    When I choose a post
    And I click comment icon
    And I write a comment
    And I press enter
    Then I am success to comment on a post

  Scenario: As a user i have able to repost a post
    Given I am on the home page
    When I choose a post
    And I click repost icon
    Then I am success to repost a post

  Scenario: As a user i have able to open settings & privacy page
    Given I am on the home page
    When I click to profile icon
    And I click settings & privacy menu
    Then I am on the settings & privacy page

  Scenario: As a user i have able to open help
    Given I am on the home page
    When I click to profile icon
    And I click help menu
    Then Help box opened
