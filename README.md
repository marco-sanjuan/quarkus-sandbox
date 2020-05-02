# Quarkus-sandbox project

This is a sandbox project for playing with Quarkus.

##### Running phase
* You can run Quarkus applications in JVM.
* You can run Quarkus applications in a **GraalVM**, so it runs faster than in JVM.
* You can also generate **native executables**, that runs faster than any other way.

##### Develop phase
* Run in dev mode:
  * `mvn compile quarkus:dev`
* **LiveReload**: you can change your java code and changes will be visible in your running application in real time.
* Configuration is stored in `application.properties` file




<hr>
<hr>
<hr>
<hr>


## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `quarkus-sandbox-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using 

`java -jar target/quarkus-sandbox-1.0.0-SNAPSHOT-runner.jar`

## Creating a native executable

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