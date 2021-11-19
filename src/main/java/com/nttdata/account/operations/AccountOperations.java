package com.nttdata.account.operations;

import com.nttdata.account.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountOperations {

    Flux<Account> findAll() throws Exception;

    Mono<Account> findById(Long id) throws Exception;

    Mono<Account> save(Account account) throws Exception;

    Mono<Account> update(Long id, Account account) throws Exception;

    Mono<Void> delete(Long id) throws Exception;
}
