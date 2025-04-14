package com.app.threetier.service;


import com.app.threetier.domain.ProductVO;

import java.util.List;

public interface ProductService {
    public void insert(ProductVO product);

    public List<ProductVO> selectAll();
}
