package bootjwstomcat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJWSTomcatController {


    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on JBoss Webserver 3.0 Tomcat 8");
    }
}