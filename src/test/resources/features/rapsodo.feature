Feature:

  @wip
  Scenario: user should be able to adding product to the cart

    Given user goes to the rapsodo home page and verifies that they went to this address
    When user clicks on the Cart icon at the top right area.
    And  user verifies that shopping cart empty
    And user clicks on the Baseball button and chooses the Pitching.
    When user clicks on the Shop Now button
    And User chooses Pitching
    And User adds to cart
    When user increases quantity
    And user chooses Organization Type
    And user clicks Checkout button.
    When user enter email
    And user enter firstname
    And user enter lastname
    And user enter address
    And user enter city
    When user select state from the state box
    And user enter zipcode
    And user enter phoneNumber
    Then user enter coupon in the discount box
