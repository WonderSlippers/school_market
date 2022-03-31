package com.homework.web.service;

import com.homework.web.pojo.Collection;
import com.homework.web.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {
	@Autowired
	CollectionRepository collectionRepository;

	public Collection insert(Collection collection) {
		return collectionRepository.save(collection);
	}

	public Collection selectByUser_idgoods_id(Integer user_id, Integer goods_id) {
		return collectionRepository.selectByUser_idgoods_id(user_id, goods_id);
	}

	public void deleteById(Integer id) {
		collectionRepository.deleteById(id);
	}

	public List<Collection> selectBygoods_id(Integer goods_id) {
		return collectionRepository.selectBygoods_id(goods_id);
	}

	public List<Collection> selectByUser_id(Integer user_id) {
		return collectionRepository.selectByUser_id(user_id);
	}
}
