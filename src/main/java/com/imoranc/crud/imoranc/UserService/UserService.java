package com.imoranc.crud.imoranc.UserService;

import com.imoranc.crud.imoranc.UserModel.UserModel;
import com.imoranc.crud.imoranc.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService implements UserServiceInterface{
    @Autowired
    UserRepository userRepository;
    @Override
    public UserModel saveUser(UserModel user) {
        if(user.getId()==0)
        {
            return  userRepository.save(user);
        }
        else
        {
            return  null;
        }
    }

    @Override
    public UserModel upgradeUser(UserModel user, Long id) {
        try {
            UserModel upgrade= userRepository.findById(id).get();
            //objects es tipo de dato proviene de java util
            //compata los get y setter con campos vacios
            if (Objects.nonNull(user.getName())&&!"".equalsIgnoreCase(user.getName()))
            {
                upgrade.setName(user.getName());
            }
            if (Objects.nonNull(user.getSurname())&&!"".equalsIgnoreCase(user.getSurname()))
            {
                upgrade.setSurname(user.getSurname());
            }
            if (Objects.nonNull(user.getCountry())&&!"".equalsIgnoreCase(user.getCountry()))
            {
                upgrade.setCountry(user.getCountry());
            }
            if (Objects.nonNull(user.getOcupation())&&!"".equalsIgnoreCase(user.getOcupation()))
            {
                upgrade.setOcupation(user.getOcupation());
            }
            if (Objects.nonNull(user.getAge())&&!"".equals(user.getAge()))
            {
                upgrade.setAge(user.getAge());
            }
            //retornamos la información actualizada
            return userRepository.save(upgrade);
            }catch (Exception error)
            {
                error.getMessage();
            }
            return  null;

    }

    @Override
    public UserModel getById(Long id) {
        return  userRepository.findById(id).orElse(null);
    }

    @Override
    public List<UserModel> getAllUsers() {
            return userRepository.findAll();
    }

    @Override
    public List<UserModel> getByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<UserModel> getBySurname(String surname) {
        return userRepository.findBySurname(surname);
    }

    @Override
    public List<UserModel> getByOcupation(String ocupation) {
        return userRepository.findBYOccupation(ocupation);
    }

    @Override
    public List<UserModel> getByProfesional(String profesional) {
        return userRepository.findByProfession(profesional);
    }

    @Override
    public List<UserModel> getByAge(Integer age) {
        return userRepository.findByAge(age);
    }

    @Override
    public boolean deleteUserById(Long id) {

        // si se ejecuta correcto valor verdad
        try {
            userRepository.deleteById(id);
            return true;

        }catch (Exception error)
        {
            error.getMessage();
        }
        return  false;
    }
}
