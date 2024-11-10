package com.sbs.jsp.board.article;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {
  private long id;
  private String subject;
  private String content;
}
