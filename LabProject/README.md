# Design Patterns Used in this Project
This project utilizes various design patterns to enhance its functionality and maintainability. The following 
design patterns have been used in this project:

### Creational Design Patterns
#### Singleton
The `Logger` class has been implemented using the Singleton design pattern to ensure that only one instance of the 
Logger class is created throughout the lifetime of the application.

#### Builder
The process of creating a `Cake` is implemented using the Builder design pattern to allow the creation of complex cake 
objects in a step-by-step manner byu the `CakeBuilder` class. This also makes it easy to modify and extend the cake 
creation process in the future.

### Structural Design Patterns
 #### Proxy
The `ServiceProxy` class has been implemented using the Proxy design pattern. It acts as a wrapper around the actual 
Service object and adds additional logging functionality to it without modifying the original Service class.

### Behavioral Design Patterns
 #### Strategy
Different repository implementations for different strategies have been implemented using the Strategy design pattern. 
This makes it easy to switch between different repository implementations based on the requirements of the application.
For now, there is `FileCakeRepository` for having basic saving in a *.txt* file and also `JSONCakeRepository` in case
the Cake instances would be needed to be serialized in *JSON* format for, perhaps, sending to another service that
handles data persistent and replication in other DBs

### Architectural Design Patterns
#### Model-View-Presenter (MVP)
The View is represented by the `Console` class, which interacts with the user. The Service mediates the interactions of 
the user with the model and sends data to the View, acting as the Presenter. The Model is implemented at the 
`Repository` layer.

By utilizing these design patterns, this project has been able to achieve improved modularity, maintainability 
and scalability.