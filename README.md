# JoseZambranoE2E Serenity-Cucumber-Junit-Maven-Java
* Serenity BDD es una biblioteca que facilita la redacción de pruebas de aceptación automatizadas de alta calidad, con potentes funciones de generación de informes y documentación viva. Tiene un fuerte soporte tanto para pruebas web con Selenium como para pruebas de API con RestAssured.
* Las pruebas están escritas en formato BDD Gherkin y se representan como documentación viva en el informe de la prueba.
## La estructura del directorio del proyecto.
src
  + main
    +java
      + models
      + questions
          + FinQuestions
          + FromQuestions
      + tasks
          + AñadirCarritoTask
          + SelecionarArticuloTask
          + VerCarritoTask
      + userinterfaces
          + AñadirCarritoInterfaces
          + FinalPage
          + HomePage
          + QuestionsPage
          + SeleccionarArticuloInterface
          + VerCarritoInterace
  + test
    + java                          
      + glues                  
         + glueStep
      + runners
          +globalRunner 
    + resources
      + features                    
        + Shop.feature
      Serenity.conf
### Ejecutando las pruebas
Ejecutar mvn clean verifydesde la línea de comando.
Los resultados de la prueba se registrarán aquí target/site/serenity/index.html. Ejecute el siguiente comando desde el directorio raíz para abrir el resultado después de la ejecución
open target/site/serenity/index.html 
