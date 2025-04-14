package com.app.threetier.mapper;

import com.app.threetier.domain.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    상품 추가
    public void insert(ProductVO product);
//    상품 전체 조회
    public List<ProductVO> selectAll();
}
