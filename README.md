# AircraftManager

A software subsystem of an air-traffic control system is defined to manage a queue of aircraft (AC) in an airport.  

### Installing

1. Import this proj as DynamicWeb Proj to Eclipse 
    1. set up Tomcat as Run time target
2. Convert the proj to Maven Project in Eclipse

## Deployment

1. Right click proj in Eclipse 
2. Run As.. -> Maven Build
  1. Goal as: `spring-boot:run`
            
## Test

#### Boot ####
http://localhost:8080/aircraft

#### Enqueue ####
http://localhost:8080/aircraft/enqueue
`
{ "id": 1,
  "type": "PASSENGER",
  "size": "LARGE"
}
`
#### Dequeue ####
http://localhost:8080/aircraft/dequeue

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
