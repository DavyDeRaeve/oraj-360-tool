package be.ordina.threesixty.timeline.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

/**
 * Created by stevedezitter on 21/04/15.
 */
@Configuration
@Profile("default")
@EnableMongoRepositories(basePackages={"be.ordina.threesixty.timeline.repository"})
public class MongoConfiguration extends AbstractTimelineServiceMongoConfiguration{

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
