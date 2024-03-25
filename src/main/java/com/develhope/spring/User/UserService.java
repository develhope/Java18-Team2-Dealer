package com.develhope.spring.User;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    //Cancellare la propria utenza (Customer)
    //      ------ METODO------

    //Modificare i dati dell’utente (Customer)
    //      ------ METODO------
    //Cancellare un utente (Admin)

    //Visualizza tutti Utenti
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public void deleteACustomers(@PathVariable Long id){
        userRepository.deleteById(id);
    }
    //Create User
    public User createUser( User user){
        return userRepository.save(user);
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
