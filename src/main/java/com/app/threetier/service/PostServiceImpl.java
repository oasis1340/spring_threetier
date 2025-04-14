package com.app.threetier.service;

import com.app.threetier.domain.PostVO;
import com.app.threetier.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostDAO postDAO;

    @Override
    public List<PostVO> postList() {
        return postDAO.postList();
    }

    @Override
    public void insert(PostVO postVO) {
        postDAO.insert(postVO);
    }

    @Override
    public Optional<PostVO> select(Long id) {
        return postDAO.select(id);
    }

    @Override
    public void edit(PostVO postVO) {
        postDAO.edit(postVO);
    }

    @Override
    public void remove(Long id) {
        postDAO.delete(id);
    }
}
