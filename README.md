# Quarkus-sandbox project

This is a sandbox project for playing with Quarkus.

##### Running phase
* You can run Quarkus applications in JVM.
* You can run Quarkus applications in a **GraalVM**, so it runs faster than in JVM.
* You can also generate **native executables**, that runs faster than any other way.

##### Developing
* Run in dev mode: `mvn quarkus:dev`
* **LiveReload**: you can change your java code and changes will be visible in your running application in real time.

##### Configuration:
  * It is stored in `application.properties` file.
  
    `greeting.message = Hello world!`
    
    This file can be:
      * inside the executable, in resources folder 
      * or outside, stored inside a `config/` folder next to executable.
  * can be override by **environment variable** (replace `.` by `_`):
  
    `export GREETING_MESSAGE="Ciao"`
    
  * can also be override by **profile**: profile applied at startup will define the configuration to read:
    * ```
      greeting.message = Hello world!
      %dev.greeting.message = Hello dev world!
      ``` 
      Running `mvn quarkus:dev` will get `Hello dev world!`
      
      To activate other profile, use:
      `mvn quarkus:dev -Dquarkus-profile=myprofile`
       
  * can finally be override by execution **argument**, that prevails over others:
  
    `mvn quarkus:dev -Dgreeting.message=Hola`



<hr>



#### Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

#### Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `quarkus-sandbox-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using 

`java -jar target/quarkus-sandbox-1.0.0-SNAPSHOT-runner.jar`

#### Creating a native executable

You can create a native executable using: 

`./mvnw package -Pnative`

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 

`./mvnw package -Pnative -Dquarkus.native.container-build=true`

You can then execute your native executable with: 

`./target/quarkus-sandbox-1.0.0-SNAPSHOT-runner`

You can also run it inside a docker image, to do so:

```
docker build -f src/main/docker/Dockerfile.native -t quarkus-sandbox .

docker run -i --rm -p 8080:8080 quarkus-sandbox
```


If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.