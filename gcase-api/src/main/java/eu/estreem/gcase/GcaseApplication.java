package eu.estreem.gcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GcaseApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(GcaseApplication.class, args);
    }
}
