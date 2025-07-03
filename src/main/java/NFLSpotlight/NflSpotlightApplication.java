package NFLSpotlight;

import NFLSpotlight.player.PlayerRepository;
import NFLSpotlight.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NflSpotlightApplication {

    public static void main(String[] args) {
        SpringApplication.run(NflSpotlightApplication.class, args);

}

    @Bean
    CommandLineRunner run(PlayerService playerService){
        return args -> {
            
            playerService.getPlayerByName("Joe Burrow")
                    .ifPresent(System.out::println);

        };

    }
}
