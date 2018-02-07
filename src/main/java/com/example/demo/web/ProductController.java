package com.example.demo.web;


import com.example.demo.Service.ProductService;
import com.example.demo.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showFormmethod() {
        return new ModelAndView("add_product", "product", new Product());
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView submitmethod(@Valid @ModelAttribute("product")Product product,
                         BindingResult result) {
            ModelAndView modelAndView = new ModelAndView("view_product");
            productService.insertproduct(product);
            return modelAndView;
    }
/**    @RequestMapping(value = "/search" , method = RequestMethod.POST)
    public ModelAndView searchmethod(@RequestParam ("id")Integer id){
        productService.getproductbyid(id);
        ModelAndView modelAndView = new ModelAndView("view_product");
        return  modelAndView;
    }
**/
    @PostMapping (value="/search")
    public ModelAndView searchmethod(@RequestParam ("id") String id){
        ModelAndView modelAndView = new ModelAndView("searchproduct");
        modelAndView.addObject("product_id",""+id+"");
        return modelAndView;
    }
    @GetMapping(value="/allproduct")
    public ModelAndView allproduct(){
        ModelAndView modelAndView = new ModelAndView("allproduct");
        return modelAndView;
    }
    @RequestMapping (value = "/deleteproduct/{id}")
    public ModelAndView deletemethod(@PathVariable(value = "id") Integer id){
        ModelAndView modelAndView = new ModelAndView("deleteproduct");
        productService.deleteproduct(id);
        return modelAndView;
    }
}
