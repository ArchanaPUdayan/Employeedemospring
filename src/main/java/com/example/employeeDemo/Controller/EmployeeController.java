package com.example.employeeDemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Homepage(){
        return "Welcome to my welcome page";
    }

    @GetMapping("/add")
    public String Addpage(){
        return "Welcome to my Add page";
    }

    @GetMapping("/search")
    public String Searchpage(){
        return "Welcome to my Search page";
    }
    @GetMapping("/edit")
    public String Editpage(){
        return "Welcome to my Edit page";
    }


}
