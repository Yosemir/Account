package com.nttdata.account.infrestructure.model.dao;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDate;

@Data
@Document("account")
@NoArgsConstructor
public class AccountDao {

    @Id
    private Long id;
    private Integer balance;        //Cuanto dinero tiene
    private String coin;            // Tipo de moneda
    private String typerAccount;    // Tipo de cuenta (Corriente, ahorro y plazo fijo)
    private Integer customer;       //Cliente
    private LocalDate date;           //Fecha de creacion


}
