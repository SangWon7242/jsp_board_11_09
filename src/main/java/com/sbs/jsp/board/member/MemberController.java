package com.sbs.jsp.board.member;

import com.sbs.jsp.board.Rq;

public class MemberController {
  public void showJoin(Rq rq) {
    rq.appendBody("회원가입");
  }
}
