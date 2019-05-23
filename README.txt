Foi utilizado o banco de dados MySQL. Altere no "application.properties" o usuário e o password, do datasource e do flyway, de acordo com o banco.

Executar a aplicação java "ApiApplication.java"

Endpoints:
GET - http://localhost:8080/api/pois
POST - http://localhost:8080/api/poi
GET - http://localhost:8080/api/pois/{x}/{y}

Ou após executar a aplicação java, acesse:
http://localhost:8080/swagger-ui.html#/poi45controller