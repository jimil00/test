package com.study.Board.Service;

import com.study.Board.DAO.testDAO;
import com.study.Board.DTO.testDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class testService {

    @Autowired
    private testDAO dao;

    public testDTO selectByName(int id) {
        return dao.selectByName(id);
    }
}
