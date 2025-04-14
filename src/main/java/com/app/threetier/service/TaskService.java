package com.app.threetier.service;

import com.app.threetier.domain.TaskDTO;
import com.app.threetier.domain.TaskVO;

import java.util.List;

public interface TaskService {
    public void insert(TaskVO taskVO);

    public List<TaskDTO> total();
}
