package com.nttdata.account.infrestructure.rest;


import com.nttdata.account.domain.Account;
import com.nttdata.account.operations.AccountOperations;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping(path = "api/v1/account")
@RequiredArgsConstructor
public class AccountController {


    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
    private final AccountOperations accountOperations;


    @GetMapping("list")
    public Flux<Account> getall() throws Exception{
        try {
            return accountOperations.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Mono<Account> getOne(@PathVariable Long id) throws Exception {
        try {
            return accountOperations.findById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @PostMapping("add")
    public Mono<Account> save(@RequestBody Account account) throws Exception {
        try {
            return accountOperations.save(account);
        }catch (Exception e){
            throw e;
        }
    }

    @PutMapping("/{id}")
    public Mono<Account> update(@PathVariable Long id, @RequestBody Account account) throws Exception {
        try {
            return accountOperations.update(id , account);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) throws Exception {
        try {
            return accountOperations.delete(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
