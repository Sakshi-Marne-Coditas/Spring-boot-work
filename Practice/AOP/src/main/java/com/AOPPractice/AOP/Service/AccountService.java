    package com.AOPPractice.AOP.Service;

    import com.AOPPractice.AOP.Dao.AccountRepository;
    import com.AOPPractice.AOP.Model.Account;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class AccountService {

        private final AccountRepository accountRepository;

        public AccountService(AccountRepository accountRepository) {
            this.accountRepository = accountRepository;
        }

        public Account addAccount(Account account) {
            return accountRepository.save(account);
        }

        public List<Account> getAccount() {
            return accountRepository.findAll();
        }

        public String deleteAccount(int id) {
            accountRepository.deleteById(id);
            return "Deleted successfully!";
        }

        public Object getAllLoop(int id) {
            return accountRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Account with id " + id + " not found!"));
        }
    }
