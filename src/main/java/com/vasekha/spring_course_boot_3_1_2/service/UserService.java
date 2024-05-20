package com.vasekha.spring_course_boot_3_1_2.service;



import com.vasekha.spring_course_boot_3_1_2.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
