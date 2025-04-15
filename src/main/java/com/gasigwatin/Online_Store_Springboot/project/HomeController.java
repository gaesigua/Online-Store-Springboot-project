package com.gasigwatin.Online_Store_Springboot.project;

//1. To create our first controller, we first have to create a class
//2. Then we add a Controller annotation to our class
//3. Then we add a RequestMapping to our method
//4. Then since we are returning a string, we have to add a return (index.html)
//5. Now we need to create the index.html file inside resources, by first creating a repository(static)
//6. Now we can run the application, and check in our browser if localhost:8080 is working

//7. Now we can configure our properties; for example here we are going to custom property our application size
//   by adding app.page-size=10 to our application.properties

//8. Now how do we use the customized property in our code?:

     //we first define a private field,
     //and then using the @Value annotation we will initialize it with an argument of the key of the application property.

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/")
public class HomeController {

    //At runtime, spring will get the value associated with the key we added as an argument
    //to see this in action, we will use the System.out.println and see what happens

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index(){
        System.out.println("Application name: " + appName);

        return "index.html";
    }
}


