package beer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Properties;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@Import(CouchbaseConfig.class)
public class BeerApiApp {

    public static void main(String[] args) {
        SpringApplication.run(BeerApiApp.class, args);
    }

}
