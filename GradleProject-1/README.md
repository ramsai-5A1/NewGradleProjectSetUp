# Setup of Gradle project using CLI 

```agsl 
gradle init --type java-application  --dsl groovy
```

The above command will setup a basic gradle project 

```agsl
./gradlew build
```

The above command can build your project 

To prepare a jar which is executable, you need to setup a manifest property in build.gradle, to identify what is the main class to execute 

```agsl
jar {
    manifest {
        attributes (
            'Main-Class': 'org.example.Main'
        )
    }
}
```

```agsl
./gradlew jar
```

The above command creates a new jar file in `builds/libs` folder 


```agsl
java -jar build/libs/fileName.jar
```

The above command will execute your code 

