package com.homework.web.service;

import com.homework.web.pojo.Comment;
import com.homework.web.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
	@Autowired
	CommentRepository commentRepository;

	public Comment insert(Comment comment) {
		return commentRepository.save(comment);
	}

	public List<Comment> selectBygoods_id(Integer goods_id) {
		return commentRepository.selectBygoods_id(goods_id);
	}

	public List<Comment> selectByUser_id(Integer user_id) {
		return commentRepository.selectByUser_id(user_id);
	}

	public List<Comment> selectByUser_idgoods_id(Integer user_id, Integer goods_id) {
		return commentRepository.selectByUser_idgoods_id(user_id, goods_id);
	}
}
