package com.org;

import com.org.config.Config;
import com.org.entity.User;
import com.org.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        UserRepository userRepository = context.getBean(UserRepository.class);
//        userRepository.save(new User("John","Doe",45));

        userRepository.deleteUser(2L);
    }
}
