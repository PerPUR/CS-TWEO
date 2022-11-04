package com.example.cstweo.Client;

import java.util.List;

public interface InterFaceService {

    public List<phoneUser> getAllUsers();

    public phoneUser getUserByPhone(String phone);

    public List<phoneUser> getUserByName(String name);

    public void deleteByPhone(String phone);

    public void deleteByName(String name);

    public void alterPhone(String phone,phoneUser user);

    public void alterName(String phone,phoneUser user);

    public void addUser(phoneUser user);

}
