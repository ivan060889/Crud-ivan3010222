package com.imoranc.crud.imoranc.UserRepository;

import com.imoranc.crud.imoranc.UserModel.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>
    {
        //metodos creados por el usuario para el reposotiry
        public List<UserModel> findByName(String name);
        public List<UserModel> findBySurname(String surname);
        public List<UserModel> findByCountry(String country);
        public List<UserModel> findByProfession(String profesional);
        public List<UserModel> findBYOccupation(String ocupation);
        public List<UserModel> findByAge(Integer age);
    }
