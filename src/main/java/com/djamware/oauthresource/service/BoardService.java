package com.djamware.oauthresource.service;

import com.djamware.oauthresource.entity.Board;
import com.djamware.oauthresource.repository.IBoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final IBoardRepository boardRepository;

    public BoardService(IBoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }

}
