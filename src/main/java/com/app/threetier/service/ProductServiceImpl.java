package com.app.threetier.service;

import com.app.threetier.domain.ProductVO;
import com.app.threetier.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Override
    public void insert(ProductVO product) {
        productDAO.insert(product);
    }

    @Override
    public List<ProductVO> selectAll() {
        return productDAO.selectAll();
    }
}
