@ersoy
  Feature: US002 Parameter Usage

    Background: Common Steps
      Given User goes to Amazon page

Scenario:  TC01 User searches with parameters on  Amazon

  Then User searches for "Nutella"
  And User tests whether the resutls contain "Nutella"
  And Closes the page

    Scenario:  TC02 User searches with parameters on  Amazon

      Then User searches for "Selenium"
      And User tests whether the resutls contain "Selenium"
      And Closes the page

    Scenario:  TC01 User searches with parameters on  Amazon

      Then User searches for "Java"
      And User tests whether the resutls contain "Java"
      And Closes the page


    Scenario:  TC01 User searches with parameters on  Amazon

      Then User searches for "SQL"
      And User tests whether the resutls contain "SQL"
      And Closes the page


    # Feature dosyasinda parametreli arama yaptigimizda ""(tirnak) icine aldigimiz degeri
    #==> StepDefinition'da 1 kere parametreli bir method olusturur ve yeni bir arama yapmak istedigimizde
    #==> yeni bir method olusturmadan feature dosyasindan ""(tirnak) icindeki ifadeyi degistirmemiz
    #==> yeterli olacaktir, boylece kodlarimiz dinamik olacaktir

  # ==> Kodlarimizi parametreli ve dinamik hale getirmek için
  #feature file da degisken olarak kullanacagimiz kelimeyi çift tırnak " " icine aliriz.
  #➢ Kodlarimizi parametreli olarak yazdiktan sonra sadece " " içindeki
  # değeri değiştirerek test datalarini feature file dan kontrol edebiliriz.
  #➢Kodlarimizi parametreli olarak yazmak framework’u daha dinamik
  # hale getirir(kodumuz artik hard coded degildir diyebiliriz)