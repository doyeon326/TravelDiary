package com.travel.service;

import java.util.List;

import com.travel.vo.AttendeesVO;

public interface AttendeesService {
	public List<AttendeesVO> attendeesList(int meetupBoard_idx);
	public int attendStatus(int user_idx , int meetupBoard_idx);
	public void attendlistdelete(int user_idx , int meetupBoard_idx);
	public void attendlistinsert(int user_idx , int meetupBoard_idx);
}
