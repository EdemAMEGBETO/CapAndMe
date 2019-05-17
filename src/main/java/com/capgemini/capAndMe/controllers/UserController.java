package com.capgemini.capAndMe.controllers;

import com.capgemini.capAndMe.entities.User;
import com.capgemini.capAndMe.repositories.UserRepository;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/CapAndMe/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository){ this.userRepository = userRepository;}

    //Liste de tous les utilisateurs de CapAndMe
    @GetMapping
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

     //Trouver un utilisateur à partir de son ID
    /*@GetMapping("/{id}")
     public Optional<User> findById(@PathVariable Long id){
        return this.userRepository.findById(id).orElseThrow(()-> new  NotFound());
     } */

     //Supprimer un utilisateur
    @DeleteMapping("/{id}")
    public Boolean deletedById(@PathVariable Long id){
        try {
            this.userRepository.findById(id).orElseThrow(()-> new NotFound());
            this.userRepository.deleteById(id);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    //Creer un utilisateur
    @PostMapping("/new")
    public User create(@RequestBody User user) {
         user = this.userRepository.save(user);
         return user;
    }

    //Modifier les donnees d'un utiliasateurs
     /*public updateUser(@RequestBody User newUser, @PathVariable Long id){

        return userRepository.findById(id)
                .map(user -> {
                    user.setFirstName(newUser.getFirstName());
                    user.setLastName(newUser.getLastName());
                    user.setCompany(newUser.getCompany());
                    user.setLocation(newUser.getLocation());
                    user.setLatitude(newUser.getLatitude());
                    user.setLongitude(newUser.getLongitude());
                    user.setEmail(newUser.getEmail());
                    user.setPassword(newUser.getPassword());
                    user.setValidate(newUser.getValidate());
                    user.setAvatar_link(newUser.getAvatar_link());
                    user.setCreated_at(newUser.getCreated_at());
                    user.setUpdated_at(newUser.getUpdated_at());
                })
                .orElseThrow(()->{
                    newUser.setId(id);
                    return  userRepository.save(newUser);
                });

         }
   }*/



}
