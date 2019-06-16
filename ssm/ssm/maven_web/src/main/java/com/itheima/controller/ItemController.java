package com.itheima.controller;

import com.itheima.Service.ItemService;
import com.itheima.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/findId")
    public String findId(Integer id, Model model){
        Items items = itemService.findById(1);
        model.addAttribute("items",items);
        return "success";
    }
}
