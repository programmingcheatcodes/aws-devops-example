package com.devops.aws.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class AwsElasticbeanstalkExampleApplication {

    @GetMapping("/status")
    public String deploy() {
        return "Application deployed to AWS beanstalk....";
    }
    @Autowired
    private BookDao bookDao;

    @GetMapping("/goodreads")
    public List<Book> fetchBookss() {
        return bookDao.getBookss();
    	/*return bookDao.getOrders().stream().
    	        sorted(Comparator.comparing(Book::getName)).collect(Collectors.toList());*/
    }
    public static void main(String[] args) {
        SpringApplication.run(AwsElasticbeanstalkExampleApplication.class, args);
    }

}
