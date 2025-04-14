package com.app.threetier.mapper;

import com.app.threetier.domain.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

//    글 단일 조회
    public Optional<PostVO> select(Long id);
//    글 전체 조회
    public List<PostVO> selectAll();
//    글 작성
    public void insert(PostVO postVO);
//    글 수정
    public void update(PostVO postVO);
//    글 삭제
    public void delete(Long id);

}
