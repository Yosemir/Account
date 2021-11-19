package com.nttdata.account.infrestructure.spring.config;

import com.nttdata.account.infrestructure.service.AccountCrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class SpringConfiguration {


    @Bean
    public AccountCrudService accountRepository(){
        return new AccountCrudService();
    }
}
