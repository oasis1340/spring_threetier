package com.app.threetier.controller;

import com.app.threetier.domain.TaskVO;
import com.app.threetier.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequestMapping("/task/*")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("register")
    public void goToInsert(TaskVO taskVO) {;}

    @PostMapping("register")
    public RedirectView insert(TaskVO taskVO) {
        taskService.insert(taskVO);
        return new RedirectView("/task/result");
    }

    @GetMapping("result")
    public void goToResult(Model model) {
        model.addAttribute("tasks", taskService.total());
    }

}
