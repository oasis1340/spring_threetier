package com.app.threetier.service;

import com.app.threetier.domain.TaskDTO;
import com.app.threetier.domain.TaskVO;
import com.app.threetier.repository.TaskDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {

    private final TaskDAO taskDAO;

    @Override
    public void insert(TaskVO taskVO) {
        taskDAO.insert(taskVO);
    }

    @Override
    public List<TaskDTO> total() {
        return taskDAO.total();
    }
}
