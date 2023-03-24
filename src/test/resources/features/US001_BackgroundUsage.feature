
@Background    # ==> Hata aldigimizda  bu notasyonu ekleyip
               # Runner clasına da ekler ve Runner dan calistiririz

Feature: US001 Background Use

Background: Common Steps
  Given User goes to Amazon page

  Scenario: TC01 User searches for Nutella on the Amazon
    Then User searches for Nutella
    And User tests whether the resutls contain Nutella

    Scenario: TC02 User searches for Seleniun on the Amazon
      Then User searches for Selenium
      And User tests whether the results contain Selenium

    Scenario: TC03 User searches for Ipone ont the Amazon
      Then User tests whether the resutls contain Iphone
      And User tests whether the resutls contain Iphone
      And Closes the page

      #Background
      # ==> Farklı senaryoların başında ortak adımlarımız varsa:
      # 1. Feature file in basina Background oluşturun.
      # 2. Bu ortak adımları Background altına yazın.
      # 3. Background, Feature file’daki her Scenario’dan önce çalışır
      # 4. Duplication olmadigindan emin olun.
      #Background un altındaki adımı yazdıktan sonra senaryolardan silin