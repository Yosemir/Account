package com.nttdata.account.infrestructure.repository;


import com.nttdata.account.infrestructure.model.dao.AccountDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountCrudRepository extends ReactiveCrudRepository<AccountDao, Long> {

}
