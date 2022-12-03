Feature: Add to cart twice
  User can add to the cart twice and check if there are tow items on th cart

 Scenario Outline: User can add to to cart twice
   Given User in the home page and scroll down then click place order
   When User search "<productName>" and choose the product
   And user add the product to cart
   Then  user check that the item is added
   And user search "<productName2>" and choose the product
   And user add the second product to the cart
   Then user check that the cart contains tow items

   Examples:
   |productName| |productName2|
   |panadol    | |para        |