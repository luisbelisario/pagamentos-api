package br.com.belisario.pagamentos.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ModelMapper modelMapperFactory() {
        return new ModelMapper();
    }
}
