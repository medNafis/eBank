package org.sid.ebankbackend.services;

import org.sid.ebankbackend.dto.*;
import org.sid.ebankbackend.entities.BankAccount;
import org.sid.ebankbackend.entities.CurrentAccount;
import org.sid.ebankbackend.entities.Customer;
import org.sid.ebankbackend.entities.SavingAccount;
import org.sid.ebankbackend.exceptions.BalanceNotSufficientException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId);
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId);
    List<CustomerDTO> listCustomer();
    BankAccountDTO getBankAccount(String accountId);
    void debit(String accountId, double amount, String description) throws BalanceNotSufficientException;
    void credit(String accountId, double amount, String description);
    void transfert(String accountIdSource, String accountIdDestination, double amount) throws BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId);

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);


}
