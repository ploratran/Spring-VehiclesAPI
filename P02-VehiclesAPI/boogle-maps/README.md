# Boogle Maps

This is a Mock that simulates a Maps WebService where, given a latitude
longitude, will return a random address.

## Instructions

Via shell it can be started using

```$ mvn clean package```

```$ java -jar target/boogle-maps-0.0.1-SNAPSHOT.jar```

The service is available by default on port `9191`. You can check it on the 
command line by using:

```$ curl http://localhost:9191/maps\?lat\=20.0\&lon\=30.0``` 

or on the browser by navigating to: 
```http://localhost:9191/maps?lat20.0&lon=30.0```

You can also import it as a Maven project on your preferred IDE and 
run the class `BoogleMapsApplication`

## Classes Explanations: 

### ```boogle.maps```

### Address
This declares the Address class, primarily just made of the private variables address, city, state and zip. Note that the latitude and longitude are not stored here - they come from the Vehicles API.

### BoogleMapsApplication
This launches Boogle Maps as a Spring Boot application.

### MapsController
This is our actual REST controller for the application. This implements what a GET request will respond with - in our case, since it is a Mock of a WebService, we are just responding with a random address from the repository.

### MockAddressRepository
Repositories normally provide some type of data persistence while the web service runs. In this case, this Mock is simply choosing a random address from the ADDRESSES array defined in the file.