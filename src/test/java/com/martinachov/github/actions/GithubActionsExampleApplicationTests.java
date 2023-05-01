package com.martinachov.github.actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GithubActionsExampleApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    public void testApp() {
        GithubActionsExampleApplication myApp = new GithubActionsExampleApplication();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}
