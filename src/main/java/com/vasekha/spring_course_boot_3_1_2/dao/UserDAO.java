package com.vasekha.spring_course_boot_3_1_2.dao;



import com.vasekha.spring_course_boot_3_1_2.model.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
