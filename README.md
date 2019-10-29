# Spring Boot 2

## Spring Boot Plugins

-   The below plugin dependencies are the ones responsible for treating this project as a spring boot project. 

```youtrack
plugins {
	id 'org.springframework.boot' version '2.2.0.RELEASE'
	id 'io.spring.dependency-management' version '1.0.8.RELEASE'
	id 'java'
}
```

## Junit 5

-  Junit5 information is available in this [link](https://github.com/code-with-dilip/springboot-2/blob/master/Junit5.md) 

## Slice Testing

-   This is the kind of testing where you slice the application context and use that for your test

```youtrack
@WebMvcTest // This just tests the controller later

```

- More info about slice based annotations are available in the below link.


https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-test-auto-configuration.html#test-auto-configuration

## Actuator

- Add the below dependency for the actuator.
```youtrack
implementation 'org.springframework.boot:spring-boot-starter-actuator'
```

-   More info about actuator is available in the below link.

https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-features.html#production-ready-enabling

-Customizing the default actuator behavior

```youtrack
management:
  endpoints:
    enabled-by-default: true
    web:
      exposure:
        include: "*" # This exposes all the endpoints to the actuator
      base-path: "/manage" #This is the base endpoint for the actuator.

```