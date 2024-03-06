package com.develhope.spring.User;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;
    //Cancellare la propria utenza (Customer)
    //      ------ METODO------

    //Modificare i dati dell’utente (Customer)
    //      ------ METODO------
    //Cancellare un utente (Admin)
    public void deleteACustomers(@PathVariable Long id){
        userRepository.deleteById(id);
    }

    //Modificare un utente (Admin)
    private User updateUserCustomer(@PathVariable Long id, @RequestBody User user){
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()){
            user.setName(user.getName());
            user.setSurname(user.getSurname());
            user.setPhoneNumber(user.getPhoneNumber());
            user.setEmail(user.getEmail());
            user.setPassword(user.getPassword());
            return userRepository.save(user);
        }else return new User();
    }

    //Cancellare un venditore (Admin)
    public void deleteASeller(@PathVariable Long id){
        userRepository.deleteById(id);
    }

    //Modificare un venditore (Admin)
    private User updateUserSeller(@PathVariable Long id, @RequestBody User user){
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent()){
            user.setName(user.getName());
            user.setSurname(user.getSurname());
            user.setPhoneNumber(user.getPhoneNumber());
            user.setEmail(user.getEmail());
            user.setPassword(user.getPassword());
            return userRepository.save(user);
        }else return new User();
    }

}
