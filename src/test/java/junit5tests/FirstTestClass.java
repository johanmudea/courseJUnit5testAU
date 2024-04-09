package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTestClass {

    @BeforeAll
    void beforeAllMethod(){
        System.out.println("This is the BEFORE ALL method");
    }

    @BeforeEach
    void beforeEachMethod(){
        System.out.println("This is the BEFORE EACH method");
    }

    @Test
    void nameOfMethod(){
        System.out.println("This is the first method");
    }


    @Test
    void secondMethod(){
        System.out.println("This is the Second test  method");
    }




    @AfterAll
    void afterAllMethod(){
        System.out.println("This is the AFTER ALL method");
    }

    @AfterEach
    void afterEachMethod(){
        System.out.println("This is the BEFORE EACH method");
    }

}
