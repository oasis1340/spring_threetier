package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member/*")
@Slf4j
public class MemberController {

    private final MemberService memberService;
    private final HttpSession session;

    @GetMapping("join")
    public void goToJoin(MemberVO memberVO) {;}

    @PostMapping("join")
    public RedirectView join(MemberVO memberVO) {
        memberService.join(memberVO);
        return new RedirectView("/member/login");
    }

    @GetMapping("login")
    public void goToLogin(MemberVO memberVO) {;}

    @PostMapping("login")
    public RedirectView login(MemberVO memberVO) {
        Optional<MemberVO> foundMember = memberService.login(memberVO);

        if(foundMember.isPresent()) {
            session.setAttribute("member", foundMember.get());
            return new RedirectView("/post/list");
        }

        return new RedirectView ("/member/login");
    }

    @GetMapping("logout")
    public RedirectView logout() {
        session.invalidate();
        return new RedirectView("/member/login");
    }

    @GetMapping("withdraw")
    public RedirectView withdraw() {
        memberService.delete(((MemberVO)session.getAttribute("member")).getId());
        return new RedirectView("/member/login");
    }
}
