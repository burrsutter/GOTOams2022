package com.burrsutter.myapplicationspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {
    @Autowired
    private Environment env;

    private String from = "Java with Spring";
    
    private String HOSTNAME =
       System.getenv().getOrDefault("HOSTNAME", "unknown");

       private int count = 0; // simple counter to see lifecycle

    String greeting;


    
   @RequestMapping("/")
   public String myroot() {
       greeting = env.getProperty("GREETING","Jambo");
       count++;
       String result = greeting + " from " + from + " on " + HOSTNAME + ":" + count + "\n";
       System.out.println(result);
       return result;
   }

   @RequestMapping("/alive")
   public String iamalive() {
       return "OK";
   }

   @RequestMapping("/health")
   public String ready() {
       return "OK";
   }


}
