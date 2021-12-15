package com.nttdata.account.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Account {


    private Long id;
    private Integer balance;                // Cuanto dinero tiene
    private String coin;                    // Tipo de moneda
    private String typeAccount;             // Tipo de cuenta (Corriente, ahorro y plazo fijo)
    private Long idcustomer;                // Codigo del cliente
    private LocalDate date;                 // Fecha de creacion
    private String typeCard;                // Tipo de tarjeta
    private Integer numberCard;             // Numero de tarjeta
    private Integer ccv;                    // Codigo de verificacion
    private String expirationCard;          // Fecha de expiracion
    private Integer minAmount;              // Minimo monto
    private Integer transferLimit;          // Limite de trasferecia
    private Integer transferCommission;     // Comision por transferencia
    private Integer maintenanceCommission;  // Costo de mantenimiento
    private String accountNumber;           // Numero de cuenta
    private String cci;                     // Codigo de cuenta interbancaria
}
