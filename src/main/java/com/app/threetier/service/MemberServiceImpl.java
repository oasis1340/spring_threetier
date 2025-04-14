package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.repository.MemberDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;
    private final HttpSession session;

    @Override
    public void join(MemberVO memberVO) {
        memberDAO.join(memberVO);
    }

    @Override
    public Optional<MemberVO> login(MemberVO memberVO) {
         return memberDAO.login(memberVO);
    }

    @Override
    public void delete(Long id) {
        memberDAO.delete(id);
    }
}
