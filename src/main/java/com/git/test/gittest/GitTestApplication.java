package com.git.test.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println(getVeryCoolString());
        System.out.println(getThisSuperString());
        SpringApplication.run(GitTestApplication.class, args);
    }

    private static String getVeryCoolString() {
        return "This is very cool";
    }

    private static String getThisSuperString() {
        return "This is super";
    }
}
