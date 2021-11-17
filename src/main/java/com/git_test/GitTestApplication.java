package com.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args)
    {
        System.out.println("hello git");
        System.out.println("hello git-2");
        System.out.println("hello git by hot-fix");
        SpringApplication.run(GitTestApplication.class, args);
    }

}
