package com.caladojm.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Author: joaqu
 * Date:   2021-03-09
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage() {
        return "index";
    }
}
