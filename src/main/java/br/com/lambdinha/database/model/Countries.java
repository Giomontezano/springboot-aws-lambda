package br.com.lambdinha.database.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Countries {

    private Integer id;

    private String name;

}
