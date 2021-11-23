/*package com.telecom;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import com.telecom.domain.Developper;
import com.telecom.repository.DevelopperRepository;

import jdk.internal.org.jline.utils.Log;


@Component
public class LoadDatabase implements CommandLineRunner {

    @Autowired
    private DevelopperRepository devrepository;
    
    Date startingdate = new Date(2020,04,11);
    
    @Override
    public void run(String... args) throws Exception {
    	devrepository.deleteAll();
    	Developper d1 = new Developper("Aurelien", "arbaretaz","aurelien.arbaretaz@orange.fr","monpass",startingdate);

    	devrepository.save(d1);
    	System.out.println("lo");
    	Log.info(d1+" saved to database");
    	devrepository.findAll().forEach((Developper) -> {
            System.out.println(Developper);
        });
    }
}*/
