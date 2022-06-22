/*package com.example.choi.service;

import com.example.choi.entity.Users;
import com.example.choi.domain.entity.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(Users users){

        boardRepository.save(users);

    }
    public List<Users> boardList(){
        return boardRepository.findAll();
    }
}
*/