#author: Nelson David Álvarez Rincón
#language: en

Feature: Add products to the shopping cart

  Scenario: Add 2 products with different quantities to the shopping cart
    Given the "user" is on the products page
    When adds "2" units of the first product to the shopping cart
    And adds "5" units of the second product to the shopping cart
    Then the shopping cart must contain the products with their quantities "2" and "5"