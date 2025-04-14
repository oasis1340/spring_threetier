package com.app.threetier.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j

public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    public void insertTest() {
        ProductVO productVO = new ProductVO();
        productVO.setProductName("마우스");
        productVO.setProductPrice(50000);
    }

}
