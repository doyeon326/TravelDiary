package com.travel.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardLikeDAOImpl implements BoardLikeDAO {
	
	@Autowired
	private SqlSession sqlSession;

}
