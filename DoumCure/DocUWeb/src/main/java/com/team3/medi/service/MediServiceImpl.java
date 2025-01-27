package com.team3.medi.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team3.command.BoardVO;
import com.team3.command.MediVO;
import com.team3.command.UserVO;
import com.team3.common.util.Criteria;
import com.team3.medi.mapper.MediMapper;

@Service("mediService")
public class MediServiceImpl implements MediService {

	@Autowired
	MediMapper mediMapper;
	
	@Override
	public ArrayList<MediVO> getList(Criteria cri, String mediSearchData) {
		return mediMapper.getList(cri, mediSearchData);
	}

	@Override
	public int getTotal(String mediSearchData) {
		return mediMapper.getTotal(mediSearchData);
	}

	@Override
	public MediVO getInfo(String proNo) {
		return mediMapper.getInfo(proNo);
	}

	@Override
	public String getImg(String proNo) {
		return mediMapper.getImg(proNo);
	}

	

	

	
	
}
