package org.rrumang.api01.service;

import org.rrumang.api01.dto.PageRequestDTO;
import org.rrumang.api01.dto.PageResponseDTO;
import org.rrumang.api01.dto.TodoDTO;

import javax.transaction.Transactional;

@Transactional
public interface TodoService {

    Long register(TodoDTO todoDTO);

    TodoDTO read(long tno);

    PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);

    void remove(long tno);

    void modify(TodoDTO todoDTO);
}
