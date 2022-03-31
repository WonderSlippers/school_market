package com.homework.web.service;

import com.homework.web.pojo.Collection;
import com.homework.web.pojo.History;
import com.homework.web.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
	@Autowired
	HistoryRepository historyRepository;

	public History insert(History history) {
		return historyRepository.save(history);
	}

	public Collection selectByUser_idgoods_id(Integer user_id, Integer goods_id) {
		return historyRepository.selectByUser_idgoods_id(user_id, goods_id);
	}



	public List<Collection> selectBygoods_id(Integer goods_id) {
		return historyRepository.selectBygoods_id(goods_id);
	}

	public List<Collection> selectByUser_id(Integer user_id) {
		return historyRepository.selectByUser_id(user_id);
	}
}
