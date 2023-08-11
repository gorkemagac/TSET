Feature: As a user I should be able to get in touch

  Scenario:Verify that user can get in touch
    When user clicks Get in touch button
    And enters First Name, Last Name, Email Address, Phone Number, Job Title, Company and Country
    And clicks Send button
    Then request is sent