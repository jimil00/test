package com.study.Board.controller;

import com.study.Board.DTO.testDTO;
import com.study.Board.Service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class testController {

    @Autowired
    testService service;

    @RequestMapping("/")
    public String hello(Model model) {

        int id = 1;
        testDTO dto = service.selectByName(id);
        model.addAttribute("dto", dto);
        System.out.println(dto.getName());
        return "/hello.html";
    }


}
