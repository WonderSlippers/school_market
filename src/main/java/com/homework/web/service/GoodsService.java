package com.homework.web.service;

import com.homework.web.pojo.Goods;


import com.homework.web.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GoodsService {

    @Autowired
    GoodsRepository goodsRepository;


    public Goods insert(Goods goods) {
        return goodsRepository.save(goods);
    }

    public Goods update(Goods goods) {
        return goodsRepository.save(goods);
    }



    public Goods selectById(Integer id) {
        return goodsRepository.findById(id).get();
    }

    public List<Goods> selectByRank(String day, Integer limit_count) {
        return goodsRepository.selectByRank(day, limit_count);
    }

    public List<Goods> selectByUser_id(Integer user_id) {
        return goodsRepository.selectByUser_id(user_id);
    }

    public List<Goods> selectByLikeName(String name) {
        return goodsRepository.selectByLikeName(name);
    }

    public List<Goods> selectByUser_idOfCollection(Integer user_id) {
        return goodsRepository.selectByUser_idOfCollection(user_id);
    }



    public List<Goods> selectByApproved() {
        return goodsRepository.selectByApproved(false);
    }

    public void deleteById(Integer id) {
        goodsRepository.deleteById(id);

    }
}
