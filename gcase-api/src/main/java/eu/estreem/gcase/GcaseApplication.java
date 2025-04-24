package eu.estreem.gcase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableRetry
@EnableScheduling
public class GcaseApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(GcaseApplication.class, args);
    }
}
