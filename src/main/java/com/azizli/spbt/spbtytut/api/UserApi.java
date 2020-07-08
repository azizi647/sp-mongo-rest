package com.azizli.spbt.spbtytut.api;

import com.azizli.spbt.spbtytut.entity.User;
import com.azizli.spbt.spbtytut.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserApi {
    @Autowired
    private UserRepository userRepository;

    /*
    ilk olara bosh olmamasi ucun object initialize olduqdan sonra test bir user yaziriq
    */
    @PostConstruct
    public void init(){
        User testUser = new User();
        testUser.setFirstname("Makara");
        testUser.setLastname("Az");
        userRepository.save(testUser);
    }

    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user ){
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> listAll(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
