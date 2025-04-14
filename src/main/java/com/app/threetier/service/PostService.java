package com.app.threetier.service;

import com.app.threetier.domain.PostVO;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<PostVO> postList();

    public void insert(PostVO postVO);

    public Optional<PostVO> select(Long id);

    public void edit(PostVO postVO);

    public void remove(Long id);
}
