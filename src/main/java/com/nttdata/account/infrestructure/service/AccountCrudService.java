package com.nttdata.account.infrestructure.service;

import com.nttdata.account.domain.Account;
import com.nttdata.account.infrestructure.model.dao.AccountDao;
import com.nttdata.account.infrestructure.repository.AccountCrudRepository;
import com.nttdata.account.model.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

@Component
public class AccountCrudService implements AccountRepository {


    @Autowired
    private AccountCrudRepository accountCrudRepository;



    @Override
    public Flux<Account> findAll() {
        return accountCrudRepository.findAll().map(accountDao -> getAccount(accountDao));
    }

    @Override
    public Mono<Account> findById(Long id) {
        return accountCrudRepository.findById(id).map(accountDao -> getAccount(accountDao));
    }

    @Override
    public Mono<Account> save(Account account) {
        return accountCrudRepository.save(getAccountDao(account)).map(this::getAccount);
    }

    @Override
    public Mono<Account> update(Long id, Account account) {
        return accountCrudRepository.save(getAccountDao(account)).map(this::getAccount);
    }

    @Override
    public Mono<Void> delete(Long id) {
        return accountCrudRepository.deleteById(id);
    }



    public Account getAccount(AccountDao accountDao){
        Account account = new Account();
        account.setId(accountDao.getId());
        account.setBalance(accountDao.getBalance());
        account.setCoin(accountDao.getCoin());
        account.setTypeAccount(accountDao.getTypeAccount());
        account.setIdcustomer(accountDao.getIdcustomer());
        account.setDate(LocalDateTime.now().toLocalDate());
        account.setTypeCard(accountDao.getTypeCard());
        account.setNumberCard(accountDao.getNumberCard());
        account.setCcv(accountDao.getCcv());
        account.setExpirationCard(accountDao.getExpirationCard());
        account.setMinAmount(accountDao.getMinAmount());
        account.setTransferLimit(accountDao.getTransferLimit());
        account.setTransferCommission(accountDao.getTransferCommission());
        account.setMaintenanceCommission(accountDao.getMaintenanceCommission());
        account.setAccountNumber(accountDao.getAccountNumber());
        account.setCci(accountDao.getCci());
        return account;
    }


    public AccountDao getAccountDao(Account account){
        AccountDao accountDao = new AccountDao();
        accountDao.setId(account.getId());
        accountDao.setBalance(account.getBalance());
        accountDao.setCoin(account.getCoin());
        accountDao.setTypeAccount(account.getTypeAccount());
        accountDao.setIdcustomer(account.getIdcustomer());
        accountDao.setDate(LocalDateTime.now().toLocalDate());
        accountDao.setTypeCard(account.getTypeCard());
        accountDao.setNumberCard(account.getNumberCard());
        accountDao.setCcv(account.getCcv());
        accountDao.setExpirationCard(account.getExpirationCard());
        accountDao.setMinAmount(account.getMinAmount());
        accountDao.setTransferLimit(account.getTransferLimit());
        accountDao.setTransferCommission(account.getTransferCommission());
        accountDao.setMaintenanceCommission(account.getMaintenanceCommission());
        accountDao.setAccountNumber(account.getAccountNumber());
        accountDao.setCci(account.getCci());
        return accountDao;
    }

}
