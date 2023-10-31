package br.com.ifba;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Jonas Dias
 */
@SpringBootApplication
@ComponentScan(basePackages = "br.com.ifba")
public class SapApplication {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(SapApplication.class).headless(false).run(args);
        
        TelaDeTestes telaDeTestes1 =  context.getBean(TelaDeTestes.class);
        telaDeTestes1.setVisible(true);       
    }
}

