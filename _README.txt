
Software Installation

- Java 6
- Eclipse IDE for JEE Developers (3.5/Galileo/eclipse-jee-galileo-SR2)
  - Maven Integeration for Eclipse (m2eclipse) 0.10.0
  - Scala Eclipse Plugin (2.8.0.RC1)
  - Google App Engine Java SDK 1.3.2
  - Google Plugin for Eclipse 3.5
   
Eclipse Project Setup

- Check out project
- File -> Import -> Existing Maven Project. Select project pom file
- Right click project. Configure -> Add Scala Nature
- Open project Properties. Google -> App Engine -> Use Google App Engine

Running project locally

- Maven:
  mvn gae:run

- Google Eclipse Plugin:
  Run As -> Web Application. Select PROJECT_DIR/target/scalajerseygae-1.0-SNAPSHOT as war directory