package com.example.demo.service.impl;

import com.example.demo.entity.Dog;
import com.example.demo.mapper.DogMapper;
import com.example.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FirstServiceImpl implements FirstService {

    @Autowired
    private DogMapper dogMapper;

    @Override
    public Map use(String name, Integer weight) {
        int i = dogMapper.insert(new Dog(name, weight + 1000));
        Map map = new HashMap(2);
        map.put("i", i);
        map.put("euceess", Boolean.valueOf(i + ""));
        return map;
    }
}
