package br.com.lambdinha;

import br.com.lambdinha.database.consumer.CountryConsumer;
import br.com.lambdinha.database.model.Countries;
import br.com.lambdinha.database.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class LambdinhaApplication {

    @Autowired
    private CountryRepository countryRepository;

    public static void main(String[] args) {
        SpringApplication.run(LambdinhaApplication.class, args);
    }

    @Bean
    public Supplier<List<Countries>> countriesList() {
        return () -> countryRepository.countriesList();
    }

    @Bean
    public Function<String, List<Countries>> findByName() {
        return (input) -> countryRepository.countriesList().stream()
                .filter(countries -> countries.getName().equals(input))
                .collect(Collectors.toList());
    }

    @Bean
    public CountryConsumer countryConsumerBean() {
        return new CountryConsumer();
    }
}
