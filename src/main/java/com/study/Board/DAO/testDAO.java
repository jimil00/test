package com.study.Board.DAO;

import com.study.Board.DTO.testDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class testDAO {

    @Autowired
    private SqlSession db;

    public testDTO selectByName(int id) {
        return db.selectOne("member.selectByName", id);
    }
}
