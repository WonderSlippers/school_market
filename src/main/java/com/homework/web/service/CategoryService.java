package com.homework.web.service;

import com.homework.web.pojo.Category;
import com.homework.web.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public Category insert(Category category) {
		return categoryRepository.save(category);
	}

	public Category update(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> selectByRank(Integer rank) {
		return categoryRepository.selectByRank(rank);
	}

	public List<Category> selectByParent_id(Integer parent_id) {
		return categoryRepository.selectByParent_id(parent_id);
	}

	public List<Category> selectByRankParent_id(Integer rank, Integer parent_id) {
		return categoryRepository.selectByRankParent_id(rank, parent_id);
	}

	public Category selectById(Integer id) {
		return categoryRepository.findById(id).get();
	}

	public Category selectByParent_idName(Integer parent_id, String name) {
		return categoryRepository.selectByParent_idName(parent_id, name);
	}

}
