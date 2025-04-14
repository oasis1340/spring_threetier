package com.app.threetier.repository;

import com.app.threetier.domain.PostVO;
import com.app.threetier.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostDAO {

    private final PostMapper postMapper;

    public Optional<PostVO> select(Long id){
        return postMapper.select(id);
    }

    public List<PostVO> postList(){
        return postMapper.selectAll();
    }

    public void insert(PostVO postVO){
        postMapper.insert(postVO);
    }

    public void edit(PostVO postVO){
        postMapper.update(postVO);
    }

    public void delete(Long id){
        postMapper.delete(id);
    }
}
