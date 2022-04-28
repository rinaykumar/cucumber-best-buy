# Cucumber Best Buy
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Jenkins](https://img.shields.io/badge/jenkins-%232C5263.svg?style=for-the-badge&logo=jenkins&logoColor=white)

A QEA project that utilizes Selenium and Cucumber to test retail giant Best Buy's web application  
in a Behavior-Driven Development (BDD) testing framework with four scenarios modeled after user stories  
and run a CI/CD Jenkins automation server

![Demo](https://i.ibb.co/1fd9r1c/demo.gif)

### Scenario 1
```gherkin
  Scenario: Search for MacBook
    Given I am on the Best Buy home page
    When I close the add modal and search for 'macbook pro'
    Then One of the laptops listed should be 13.3 8GB Memory and 256GB SSD
```

### Scenario 2
```gherkin
  Scenario: Add MacBook to Cart
    Given I perform the above search
    When I click the “Add to Cart” button next to the laptop
    Then I should see a modal window with the cart subtotal
```

### Scenario 3
```gherkin
  Scenario: See Cart with MacBook
    Given I am on the above modal page
    When I click on the “Go to Cart” button
    Then I should see the laptop and the order summary with Total price
```

### Scenario 4
```gherkin
  Scenario: Remove MacBook from Cart
    Given I am on the above page
    When I click the “Remove” link under the item number drop down
    Then My anonymous cart should be empty
```

## Team
Kwabena Bamfo  
Paul Cha  
Rinay Kumar  
Sheena Mathew

<sub><sup>Cognizant | QEA | August 2021</sup></sub>
