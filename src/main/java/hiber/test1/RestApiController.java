 package hiber.test1;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApiController {

    public static void main(String[] args) {
        SpringApplication.run(RestApiController.class, args);
        System.out.println("yahya");
    }
    @GetMapping(value = "/")
    public String  cont() {
        return Crud.readData().toString();
    }

    @RequestMapping(value = "/yahya",method = RequestMethod.POST)
    public String  contt(@RequestBody String name) {
        return "hi yahya "+ name ;
    }

}
