# Santander Backend Bootcamp 2023

Ferramentas Utilizadas:
IDE [IntelliJ]()
[Spring Initializr](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.1.5&packaging=jar&jvmVersion=17&groupId=me.Dio&artifactId=Santander.Bootcamp&name=Santander.Bootcamp&description=Java%20RESTFul%20API%20criada%20para%20o%20Bootcamp%20Santande%20Backend%20Java%202023%2C%20na%20DIO&packageName=me.Dio.Santander.Bootcamp&dependencies=web,data-jpa,h2,postgresql)
[Chat GPT] (https://chat.openai.com)
[]()
[]()
[]()
[]()
[]()
[]()
[]()



## Diagrama de Classes:
'''mermaid
classDiagram
  class User {
    +name: string
    +account: Account
    +features: Feature[]
    +card: Card
    +news: News[]
  }
  class Account {
    +number: string
    +agency: string
    +balance: float
    +limit: float
  }
  class Feature {
    +icon: string
    +description: string
  }
  class Card {
    +number: string
    +limit: float
  }
  class News {
    +icon: string
    +description: string
  }

  User "1" -- "1" Account : has
  User "1" -- "n" Feature : has
  User "1" -- "1" Card : has
  User "1" -- "n" News : has
'''