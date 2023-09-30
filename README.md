# Server Side Pagination Back End <img src="assets/icon.png" alt="drawing" width="27px"/>

This project demonstrates how to handle **server-side pagination using a spring boot backend.** 
Under the **students** resource, an API is exposed to receive paginated students based on the **search query.** 
In order to manage front end pagination, the response includes the **entire number of records** for the requested search query as well.

More information about the API, including sample test cases, can be found in the API documentation linked below,



## Used Technologies

- Java SE 17
- Spring Boot 3.0.5
- Apache Maven 3.8.6
- MySQL Community Server 8.0.33
- Added dependencies to pom.xml
    - spring-boot-starter-web
    - spring-boot-starter-data-jpa
    - spring-boot-starter-validation
    - spring-boot-starter-aop
    - lombok
    - mysql-connector-java 8.0.33
    - springdoc-openapi-starter-webmvc-ui 2.0.4
    - spring-boot-devtools
    - spring-boot-starter-test

#### Used Integrated Development Environment
- IntelliJ IDEA

## How to use ?
This project can be used by cloning the project to your local computer.

Make sure to create a **c** database in the MySQL community server and add the insert query from the **pagination-demo-db.sql** file to it.
If neglect to create the **pagination-demo-db** database, the project will automatically generate it when it is firstly executed.
You can find the **pagination-demo-db.sql** for this project under the **src -> main -> resources** directory.

#### Clone this repository
1. Clone the project using `https://github.com/PubuduJ/server-side-pagination-back-end.git` terminal command.
2. Open the `pom.xml` file from **IntelliJ IDEA**, make sure to open this as a project.
3. Change the `spring.datasource.password` in the `application.properties` to your local machine MySQL server `root` user password.

## Version
v1.0.0

## License
Copyright &copy; 2023 [Pubudu Janith](https://www.linkedin.com/in/pubudujanith94/). All Rights Reserved.<br>
This project is licensed under the [MIT license](LICENSE.txt).