Feature: Search/Add/Delete MacBook from BestBuy.com

  # Paul Cha
  Scenario: Search for MacBook
    Given I am on the Best Buy home page
      # https://www.bestbuy.com/
    When I close the add modal and search for 'macbook pro'
    Then One of the laptops listed should be 13.3 8GB Memory and 256GB SSD

  # Rinay Kumar
  Scenario: Add MacBook to Cart
    Given I am on the Best Buy home page
    And I close the add modal and search for 'macbook pro'
    When I click the 'Add to Cart' button next to the laptop
    Then I should see a modal window with the cart subtotal

  # Kwabena Bamfo
  Scenario: See Cart with MacBook
    Given I am on the Best Buy home page
    And I close the add modal and search for 'macbook pro'
    And I click the 'Add to Cart' button next to the laptop
    When I click on the 'Go to Cart' button
    Then I should see the laptop and the order summary with Total price

  # Sheena Mathew
  Scenario: Remove MacBook from Cart
    Given I am on the Best Buy home page
    And I close the add modal and search for 'macbook pro'
    And I click the 'Add to Cart' button next to the laptop
    And I click on the 'Go to Cart' button
    When I click the 'Remove' link under the item number drop down
    Then My anonymous cart should be empty
