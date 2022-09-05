package org.sid.ebankbackend.dto;


import lombok.Data;
import org.sid.ebankbackend.enums.AccountStatus;

import java.util.Date;


@Data
public class CurrentAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;

}
