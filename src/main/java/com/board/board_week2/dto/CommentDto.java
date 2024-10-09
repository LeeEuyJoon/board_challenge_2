package com.board.board_week2.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class CommentDto {

    private String userId;
    private int postId;
    String content;
    Date regDate;
    Date upDate;

}
