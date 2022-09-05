package org.sid.ebankbackend.dto;

import lombok.Data;

import org.sid.ebankbackend.entities.AccountOperation;

import org.sid.ebankbackend.enums.AccountStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
public  class SavingBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
