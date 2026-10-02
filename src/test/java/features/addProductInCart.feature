Feature: Search and add product in the cart

@Test2
Scenario Outline: Add to cart experience for a product from the landing page
  Given User is on GreenKart landing page
  When user searched the product by shortname <shortProductName> and extracted actual product name
  And the user increases the quantity by 3 and adds the product to the cart
  Then the user navigates to the checkout page and verifies <shortProductName> on the checkout page
  And the product name on the checkout page should match the landing page

  Examples:
    | shortProductName |
    | Tom              |
