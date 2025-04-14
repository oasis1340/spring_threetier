package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;

import java.util.Optional;

public interface MemberService {
    public void join(MemberVO memberVO);

    public Optional<MemberVO> login(MemberVO memberVO);

    public void delete(Long id);
}
