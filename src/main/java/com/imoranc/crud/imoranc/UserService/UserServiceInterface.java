package com.imoranc.crud.imoranc.UserService;

import com.imoranc.crud.imoranc.UserModel.UserModel;

import java.util.List;

public interface UserServiceInterface
{
    public UserModel saveUser (UserModel user);
    public UserModel upgradeUser(UserModel user, Long id);
    public UserModel getById(Long id);
    public List<UserModel> getAllUsers();
    public List<UserModel> getByName(String name);
    public List<UserModel> getBySurname(String surname);
    public List<UserModel> getByOcupation(String ocupation);
    public List<UserModel> getByProfesional(String profesional );
    public List<UserModel> getByAge(Integer age);

    public boolean deleteUserById(Long id);




}
