package com.app.threetier.controller;

import com.app.threetier.domain.ProductVO;
import com.app.threetier.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequestMapping("/task/*")
@RequiredArgsConstructor
public class TaskController {

    private final ProductService productService;

    @GetMapping("write")
    public void goToWrite(ProductVO productVO) {;}

    @PostMapping("write")
    public RedirectView write(ProductVO productVO) {
        productService.insert(productVO);
        return new RedirectView("/task/list");
    }
}
