package config; // Utilisez le package principal correct pour le fichier.


import entities.Video;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DatabaseSeeder {

    @Bean
    <CreatorRepository>
    CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            List<Creator> creators = List.of(
                    Creator.builder().name("John Doe").email("john@example.com").build(),
                    getObject().builder().name("Jane Smith").email("jane@example.com").build()
            );
            creatorRepository.equals(creators);

            List<Video> videos = List.of(
                    Video.builder().name("Spring Boot Tutorial").url("http://example.com/video1")
                            .description("Introduction to Spring Boot")
                            .datePublication(LocalDate.now())
                            .creator(creators.get(0)).build(),
                    Video.builder().name("GraphQL Basics").url("http://example.com/video2")
                            .description("Learn GraphQL with Spring")
                            .datePublication(LocalDate.now())
                            .creator(creators.get(1)).build()
            );
            videoRepository.equals(videos);
        };
    }

    private static Object getObject() {
        return Creator;
    }
}
