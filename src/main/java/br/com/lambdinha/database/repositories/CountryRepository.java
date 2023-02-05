package br.com.lambdinha.database.repositories;

import br.com.lambdinha.database.model.Countries;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CountryRepository {

    public List<Countries> countriesList() {
        return Arrays.asList(
                Countries.builder().id(1).name("Brasil").build(),
                Countries.builder().id(2).name("Argentina").build(),
                Countries.builder().id(3).name("Paraguai").build()
        );
    }
}
