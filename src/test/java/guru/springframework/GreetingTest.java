package guru.springframework;

import org.junit.jupiter.api.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each....");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Kristina"));
    }

    @Test
    void helloWorld2() {
        System.out.println(greeting.helloWorld("Kika"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each ..........");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After - I am only called once!!!");
    }
}