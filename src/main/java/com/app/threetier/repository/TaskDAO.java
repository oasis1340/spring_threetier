package com.app.threetier.repository;

import com.app.threetier.domain.TaskDTO;
import com.app.threetier.domain.TaskVO;
import com.app.threetier.mapper.TaskMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TaskDAO {
    private final TaskMapper taskMapper;

    public void insert(TaskVO taskVO) {
        taskMapper.insert(taskVO);
    }

    public List<TaskDTO> total() {
        return taskMapper.total();
    }
}
