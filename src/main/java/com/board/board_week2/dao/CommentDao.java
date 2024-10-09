package com.board.board_week2.dao;

import com.board.board_week2.dto.CommentDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentDao {

    int count();

    int insert();

    CommentDto


}
