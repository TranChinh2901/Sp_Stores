package com.example.store_mobile.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StoreController {
    @RequestMapping("products/home")
    public String home() {
        return "products/home";
    }

    @RequestMapping("products/create")
    public String create() {
        return "products/create";
    }

    @RequestMapping("products/admin")
    public String admin() {
        return "products/admin";
    }

    @RequestMapping("products/cart")
    public String cart() {
        return "products/cart";
    }

    @RequestMapping("products/apple")
    public String apple() {
        return "products/apple";
    }

    @RequestMapping("products/samsung")
    public String samsung() {
        return "products/samsung";
    }

    @RequestMapping("products/oppo")
    public String oppo() {
        return "products/oppo";
    }

}
