package br.com.ifba;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 
 * @author Jonas Dias
 */
@SpringBootApplication
public class SapApplication {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = 
                new SpringApplicationBuilder(SapApplication.class).headless(false).run(args);
        
        TelaDeTestes telaDeTestes =  context.getBean(TelaDeTestes.class);
        telaDeTestes.setVisible(true);
        
    }

}

