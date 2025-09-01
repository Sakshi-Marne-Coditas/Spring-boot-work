package com.InmemorySecurity.InmemorySecurity;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public User getUser(Long id) {
//        // Just fetching user, not touching orders
//        return userRepo.findById(id).orElse(null);
        User user = userRepo.findById(id).orElse(null);
        // force load orders outside transaction
        user.getOrders().size();
        return user;
    }
}

