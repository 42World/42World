package com.world.domain.main.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.world.domain.main.vo.MemberVO;

@Repository
public class MemberDAO {
	
	@Inject
	SqlSession sqlSession;
	
	public List<MemberVO> getMemberList(){
		System.out.println("=== MemberDAO  getMemberList()  ");
		return sqlSession.selectList("MemberDAO.getMemberList");
	}

	public MemberVO getMember() {
		System.out.println("===MemberDAO  getMember()  ");
		return sqlSession.selectOne("MemberDAO.getMember");
	}

	public void insertMember(MemberVO vo) {
		System.out.println("===MemberDAO  insertMember()  ");
		sqlSession.update("MemberDAO.insertMember", vo); 
			}
	public void deleteMember() {
		System.out.println("===MemberDAO  deleteMember()  ");
		sqlSession.update("MemberDAO.deleteMember");
	}
	public void updateMember() {
		System.out.println("===MemberDAO  updateMember()  ");
		sqlSession.update("MemberDAO.updateMember");
	}
	
	public MemberVO confirmID(String email) {
		System.out.println("===MemberDAO confirmID() email :" + email);
		return sqlSession.selectOne("MemberDAO.confirmID", email);
	}
	
}
