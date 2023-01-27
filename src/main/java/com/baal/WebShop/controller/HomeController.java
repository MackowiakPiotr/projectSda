package com.baal.WebShop.controller;

import com.baal.WebShop.DTO.ProductDTO;
import com.baal.WebShop.model.OrderLine;
import com.baal.WebShop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
private final ProductService productService;
private final OrderLine orderLine;
    @GetMapping("/")
    public String getHome(Model model){

        List<ProductDTO> productList = productService.getProducts();
        model.addAttribute("products", productList);

        return "index";
    }
@GetMapping("/cart")
    public String getCart(Model model){

        return "cart";
}


}