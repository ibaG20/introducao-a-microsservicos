package br.com.hr.userapi.services;

import br.com.hr.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
