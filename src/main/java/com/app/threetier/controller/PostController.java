package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.domain.PostVO;
import com.app.threetier.service.MemberService;
import com.app.threetier.service.PostService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequestMapping("/post/*")
@Slf4j
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final HttpSession session;

    @GetMapping("list")
    public void goToList(Model model) {
        model.addAttribute("posts", postService.postList());
    }

    @GetMapping("write")
    public void goToWrite(Model model) {
        model.addAttribute("postVO", new PostVO());
        model.addAttribute("memberId", ((MemberVO)session.getAttribute("member")).getId());
    }

    @PostMapping("write")
    public RedirectView write (PostVO postVO) {
        postService.insert(postVO);
        return new RedirectView("/post/list");
    }

    @GetMapping("read")
    public void goToRead(Model model, @RequestParam("id") Long id) {
        model.addAttribute("post", postService.select(id).orElseThrow(() -> {
            throw new RuntimeException("Post Not Found");
        }));
    }

    @GetMapping("edit")
    public void goToEdit(Model model, @RequestParam("id") Long id) {
        PostVO postVO = postService.select(id).orElseThrow(()->{
            throw new RuntimeException("Post Not Found");
        });

        Long memberId = ((MemberVO)session.getAttribute("member")).getId();

        model.addAttribute("memberId", memberId);
        model.addAttribute("postVO", postVO);
    }

    @PostMapping("edit")
    public RedirectView edit (PostVO postVO) {
        postService.edit(postVO);
        return new RedirectView("/post/list");
    }

    @GetMapping("remove")
    public RedirectView remove(Long id) {
        postService.remove(id);
        return new RedirectView("/post/list");
    }

}
