package com.example.store_mobile.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreController {
    @RequestMapping("/home")
    public String home() {
        return "products/home";
    }

    @RequestMapping("create")
    public String create() {
        return "products/create";
    }

    @RequestMapping("admin")
    public String admin() {
        return "products/admin";
    }

    @RequestMapping("cart")
    public String cart() {
        return "products/cart";
    }

    @RequestMapping("apple")
    public String apple() {
        return "products/apple";
    }

    @RequestMapping("samsung")
    public String samsung() {
        return "products/samsung";
    }

    @RequestMapping("oppo")
    public String oppo() {
        return "products/oppo";
    }

}
