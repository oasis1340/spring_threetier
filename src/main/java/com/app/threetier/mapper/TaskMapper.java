package com.app.threetier.mapper;

import com.app.threetier.domain.TaskDTO;
import com.app.threetier.domain.TaskVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Mapper
public interface TaskMapper {
    public void insert(TaskVO taskVO);

    public List<TaskDTO> total();
}
