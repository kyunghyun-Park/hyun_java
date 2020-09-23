package com.kb.www.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.service.BoardService;
import com.kb.www.vo.ArticleVo;

public class ArticleListAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		BoardService svc = new BoardService();
		
		//service의 getArticleList로 리스트 불러오기 떠넘김
		ArrayList<ArticleVo> articleList = svc.getArticleList();
		
		ActionForward forward = new ActionForward();
		request.setAttribute("list", articleList);
		forward.setPath("/views/list.jsp");

		return forward;
	}
}
