Feature: Search and place order for the product

@Test1
Scenario Outline: Search Experience for product on both home and offer page

Given User is on GreenKart landing page
When user searched the product by shortname <shortProductName> and extracted actual product name
Then user searched <shortProductName> product by shortname in offers page 
And validate name in offers page matches with Landing page

Examples:
|shortProductName|
|Tom|
|Beet|

