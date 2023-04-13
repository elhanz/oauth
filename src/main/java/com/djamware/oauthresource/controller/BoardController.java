package com.djamware.oauthresource.controller;

import com.djamware.oauthresource.entity.Board;
import com.djamware.oauthresource.repository.IBoardRepository;
import com.djamware.oauthresource.service.BoardService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
public class BoardController {


    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    IBoardRepository boardRepository;
    @GetMapping("/api/boards")

    public ResponseEntity<List<Board>> getUser() {
        return ResponseEntity.ok(boardRepository.findAll());
    }


}