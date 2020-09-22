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
		ArticleVo articleVo = new ArticleVo();
		articleVo.setArticleNum(1);
		articleVo.setArticleTitle("테스트중입니다");
		articleVo.setArticleContent("하하");
		articleVo.setHit(0);
		articleVo.setWriteDate("2020-09-22 13:10");
		articleVo.setUpdateDate("2020-09-22 13:13");
		articleVo.setDeleteDate("2020-09-22 13:16");

		articleList.add(articleVo);
		
		ArticleVo articleVo1 = new ArticleVo();
		articleVo.setArticleNum(2);
		articleVo1.setArticleTitle("테스트중입니다2");
		articleVo1.setArticleContent("하하2");
		articleVo1.setHit(10);
		articleVo1.setWriteDate("2020-09-22 13:10");
		articleVo1.setUpdateDate("2020-09-22 13:13");
		articleVo1.setDeleteDate("2020-09-22 13:16");
		
		articleList.add(articleVo1);
		
		ActionForward forward = new ActionForward();
		request.setAttribute("list", articleList);
		forward.setPath("/views/list.jsp");

		return forward;
	}
}
