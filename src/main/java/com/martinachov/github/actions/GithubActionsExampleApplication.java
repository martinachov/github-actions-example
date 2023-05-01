package com.martinachov.github.actions;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsExampleApplication.class, args);
	}

	@PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(GithubActionsExampleApplication.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}
