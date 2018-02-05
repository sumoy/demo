package com.example.demo.web;


import com.example.demo.dto.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showForm() {
        return new ModelAndView("add_product", "product", new Product());
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("product")Product product,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", product.getName());
        model.addAttribute("description", product.getDescription());
        return "view_product";
    }
}
