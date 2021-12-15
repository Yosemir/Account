package com.nttdata.account.model;

import com.nttdata.account.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    Flux<Account> findAll();

    Mono<Account> findById(Long id);

    Mono<Account> save(Account account);

    Mono<Account> update(Long id, Account account);

    Mono<Void> delete(Long id);
}
