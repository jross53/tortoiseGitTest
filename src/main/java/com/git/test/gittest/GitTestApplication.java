package com.git.test.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println(getCoolString());
        SpringApplication.run(GitTestApplication.class, args);
    }

    private static String getCoolString() {
        return "This is cool";
    }
}
