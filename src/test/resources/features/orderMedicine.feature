@medicine @android
Feature: User orders medicine

  @test @positive
  Scenario : User orders medicine
    Given User is on tokopedia homepage
    And User clicks lihat semua menu
    And User selects tokopedia sehat
    And User selects batuk, flu, demam menu
    And User selects first product
    When User clicks beli button
    Then User is redirected to login page

