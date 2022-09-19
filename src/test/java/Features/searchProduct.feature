Feature: Search and Place the order for Products

  @test1
  Scenario: Search Experience for product search in both home and offer page
    Given User is on GreenCart Landing Page
    When User searched with shortname "Tom"  and extracted actual name of the product
    Then User searched for shortname in offers page to check produuct exist

    @test2
  Scenario: Validate the subscription packages for stctv
    Given User is on stctv Landing Page
    When User verify the plan heading on the page
    Then User validate all the subscription packages



