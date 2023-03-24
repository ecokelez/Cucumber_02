Feature: US006 User searches for the desired words on amazon

  Scenario Outline: TC01 User searches for the desired words

    Given User goes to Amazon page
    Then User searches for "<requestedWorld>"
    And User tests whether the resutls contain "<requestedWorldCheck>"
    And Closes the page
    Examples:
      | requestedWorld | requestedWorldCheck |
      | Nutella | Nutella |
      | Güllaç  | Güllaç |
      | Baklava | Baklava |
















    #TestNG deki dataProvider kullanimindaki gibi Cucumber'da da  Scenario Outline kullaniriz
    #Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz
  #Feature dosyasinda yazdigimiz komutta eger "" (Tirnak) kullanirsak stepDefinition da parametreli
  #bir method olusturur.Ve artik stepDefiniton'i kullanmadan Feature dosyasinda ""(Tirnak)
  #icindeki string'idegistirerek istedigim kelimeyi aratabilirim .
  #Scenario Outline da ise yine ""(Tirnak) icinde birden fazla kelime aratacaksam  "<>" seklindeki kullanim
  # ile "<>" icine yazdigim  herhangi bir kelimeyi  Scenario Outline'in asagida olusturdugu Examples
  #altinda aratmak istedigim kelimeleri yazar ve sirasiyla aratabiliriz