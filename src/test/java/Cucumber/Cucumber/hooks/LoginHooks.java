package Cucumber.Cucumber.hooks;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import org.junit.After;
import org.junit.Before;

public class LoginHooks {

    @Before
    public void initialSetup1()
    {
        System.out.println("@BeforeHook... order   1");
    }
    @Before
    public void Setup2()
    {
        System.out.println("@BeforeHook... order 2");
    }
    @After
    public void tearOut()
    {
        System.out.println("@AfterHook.... order 1");
    }
    @After
    public void tearOut2() {
        System.out.println("@AfterHook.... order 2");

    }
    @BeforeStep
        public void Setup()
        {
            System.out.println("@BeforeStep");
        }
        @AfterStep
        public void tearOut3()
        {
            System.out.println("@AfterStep");
        }

    }

