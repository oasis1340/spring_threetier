package com.app.threetier.repository;

import com.app.threetier.domain.ProductVO;
import com.app.threetier.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
    private final ProductMapper productMapper;

//    상품 추가
    public void insert(ProductVO product) {
        productMapper.insert(product);
    }
//    상품 전체 조회
    public List<ProductVO> selectAll() {
        return productMapper.selectAll();
    }
}
