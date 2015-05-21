package be.ordina.threesixty.person.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * Created by stevedezitter on 14/04/15.
 */
@Configuration
//@ComponentScan("be.ordina.threesixty.person.repository")
@Profile("local")
public class MongoConfiguration extends AbstractPersonServiceMongoConfiguration{

    @Bean
    public Mongo mongo() throws Exception {
        MongoCredential credential = MongoCredential.createCredential("threeSixtyAdmin",
                "threeSixty",
                "password".toCharArray());

        MongoClient client = new MongoClient(Collections.singletonList(new ServerAddress("localhost", 27017)),
                Collections.singletonList(credential));

        return client;
    }
}
