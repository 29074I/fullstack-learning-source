package com.smhrd.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.model.MyMember;
import com.smhrd.model.MyMemberDAO;

public class LoginController implements Command {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		
		String url = "";
		
		try {
			request.setCharacterEncoding("UTF-8");
			
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			
			MyMember member = new MyMember(id, pw);
			
			MyMemberDAO dao = new MyMemberDAO();
			MyMember member2 = dao.login(member);
			// System.out.println("닉네임 : "+member2.getNick());
			// 없는 정보 입력 -> null
			if (member2 != null) { // 로그인 성공
				// 세션에 member2를 저장
				// index.jsp로 이동
				HttpSession session = request.getSession();
				session.setAttribute("member", member2);
				url = "index.jsp";
			} else { // 로그인 실패
				// login.html 로 이동
				url = "login.html";
			}
		}catch(UnsupportedEncodingException e) {
			System.out.println("인코딩 방식 잘못 지정함!");
		}catch(IOException e) {
			System.out.println("리다이렉팅 경로 잘못 지정함!");
		}catch(Exception e) {
			e.printStackTrace();
		}

		return url;
	}

}
