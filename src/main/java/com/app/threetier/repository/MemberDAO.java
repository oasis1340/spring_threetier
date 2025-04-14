package com.app.threetier.repository;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

//    회원가입
    public void join(MemberVO memberVO) {
        memberMapper.insert(memberVO);
    }
//    로그인
    public Optional<MemberVO> login(MemberVO memberVO) {
        return memberMapper.select(memberVO);
    }

    public void delete(Long id) {
        memberMapper.delete(id);
    }
}
