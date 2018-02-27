package com.git.test.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println(getSoCoolString());
        System.out.println(getThisAwesomeString());
        SpringApplication.run(GitTestApplication.class, args);
    }

    private static String getSoCoolString() {
        return "This is so cool";
    }

    private static String getThisAwesomeString() {
        return "This is awesome";
    }
}
