package com.app.threetier.service;

import com.app.threetier.domain.PostVO;

import java.util.List;
import java.util.Optional;

public interface PostService {
    public List<PostVO> getList();

    public void save(PostVO postVO);

    public void deleteAll(Long memberId);

    public void edit(PostVO postVO);

    public void deletePost(Long id);

    public Optional<PostVO> getPostById(Long id);
}
