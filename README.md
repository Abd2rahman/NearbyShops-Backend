# NearbyShops-Backend 

REST APIs implemented using Java, Maven and Spring Boot.
Github repository for frontend project: <a href="https://github.com/Abd2rahman/NearbyShops-Frontend-">here</a>

## Application Data

To import the data, you need to extract the zip file then execute the command below :
```mongorestore --db shops shops/```

→ → A shop database will be created with a shops collection.
→ → Dump File : <a href="https://github.com/hiddenfounders/web-coding-challenge/blob/master/dump-shops.zip">here</a>

## How to run

* Clone the "develop" branch of this repo: ```git clone -b develop https://github.com/Abd2rahman/NearbyShops-Backend.git``` 
* Make sure you are running the MongoDB service.
* You can build the project and run the tests by running ```mvnw.cmd clean package```
* Once successfully built, you can run the service by running: ```mvnw.cmd spring-boot:run```
* The API is available on **port 8091**