package com.example.demo.controller;

import com.example.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/first",produces = { "application/json;charset=UTF-8" })
public class FirstController{

    @Autowired
    private FirstService firstService;

    @RequestMapping(value = "/one", method = RequestMethod.GET)
    @ResponseBody
    public Map one(@RequestParam String name, @RequestParam Integer weight) {
        return firstService.use(name, weight);
    }
}
