package com.djamware.oauthresource.repository;

import com.djamware.oauthresource.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBoardRepository extends JpaRepository<Board, Integer> {
}
