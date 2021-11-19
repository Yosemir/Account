package com.nttdata.account.impl;

import com.nttdata.account.domain.Account;
import com.nttdata.account.model.AccountRepository;
import com.nttdata.account.operations.AccountOperations;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountImpl implements AccountOperations {



    private final AccountRepository accountRepository;

    @Override
    public Flux<Account> findAll() throws Exception {
        try {
            return accountRepository.findAll();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Account> findById(Long id) throws Exception {
        try {
            return accountRepository.findById(id);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Account> save(Account account) throws Exception {
        try {
            return accountRepository.save(account);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Account> update(Long id, Account account) throws Exception {
        try {
            return accountRepository.update(id, account);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mono<Void> delete(Long id) throws Exception {
        return accountRepository.delete(id);
    }
}
