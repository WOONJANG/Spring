package com.adamsoft.item.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.adamsoft.item.domain.ItemDTO;

// 클래스에 @Coponent 를 설정하면 sevlet-context.xml 파일의 component-scan에 설정된 패키지에 속한 경우 bean을 자동 생성
// @Repository, @Service, @Controller, @RestController를 기재하면 역할까지 부여함


//@Repository
public class ItemRepository {
	
//	@Autowired
	private SqlSession sqlSession;
	
	// 테이블의 전체 데이터를 가져오는 메서드
	/*
	 * public 리턴터입 이름(매개변수) {
	 * 	return sqlSession.selectList("",매개변수) 
	 * }
	 */
	
	  public List<ItemDTO> getAll () {
		  
		  
		  return sqlSession.selectList("itemmapper.getall"); 
	  }
	  
	  public ItemDTO getItem (Integer itemid) {
		  
		  
		  return sqlSession.selectOne("itemmapper.getitem", itemid); 
	  }
	  
}
