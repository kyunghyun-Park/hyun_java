package com.kb.www.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kb.www.common.Action;
import com.kb.www.common.ActionForward;
import com.kb.www.vo.ArticleVo;

public class ArticleListAction implements Action {
@Override
public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
	ArrayList<ArticleVo> articleList = new ArrayList();
	
	
	for(int i=1;i<10;i++) {
		ArticleVo articleVo = new ArticleVo();
		articleVo.setArticleNum(i);
		articleVo.setArticleTitle("테스트 제목"+i);
		articleVo.setArticleContent("테스트 내용"+i);
		articleVo.setHit(1+i);
		articleVo.setWriteDate("2020-09-1"+i+" 13:10");
		articleVo.setWriteDate("2020-09-1"+i+" 13:13");
		articleVo.setWriteDate("2020-09-1"+i+" 13:16");
		articleList.add(articleVo);
		
	}	
	ActionForward forward = new ActionForward();
	request.setAttribute("list2", articleList);
	forward.setPath("/views/list.jsp");
	return forward;
}
}
