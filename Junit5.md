# JUnit 5

![Junit5](https://github.com/code-with-dilip/springboot-2/blob/master/images/junit5/junit5-intro.png)

## JUnit5 Platform

-   This is the foundation for launching testing frameworks on the JVM.
-   This houses the Launcher APIs and TestEngine Apis and ConsoleLauncher.

-   This is where all the test cases will be run when the test cases are launch.
-   The IDEs just interact with the platform and they dont have any idea about the test engines. This is an advantage for IDE because they just need to know about the Platform.

## JUnit5 Engines

Below listed are the test engines that's part of the JUnit5 

-   Vintage 
    -   TestEngine for running JUnit3/JUnit4/Spock based tests.
    -   Supports JUnit4/JUnit3 based tests
-   Jupiter
    - New Programming Model and Extension Model for JUnit5 
    - Supports the JUnit5 based tests.
## Third Party - https://github.com/junit-team/junit5/wiki/Third-party-Extensions
-   Test Engines:
    -   Cucumber
    -   Spek
    -   KotlinTest 
-   JUnit Jupiter Extensions
    -   SpringExtenstion
    -   Mockito Extensions
