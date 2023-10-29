package beans;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

    @Bean
    public Person myperson(){
        Person p2 = new Person();
        p2.setName("Peely");
        return p2;
    }

    @Bean
    public Car mycar(){
        Car c2 = new Car();
        c2.setPerson(myperson());
        c2.setCarColour("Red");
        return c2;
    }
}


