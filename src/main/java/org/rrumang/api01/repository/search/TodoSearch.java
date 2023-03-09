package org.rrumang.api01.repository.search;

import org.rrumang.api01.dto.PageRequestDTO;
import org.rrumang.api01.dto.TodoDTO;
import org.springframework.data.domain.Page;

public interface TodoSearch {

    Page<TodoDTO> list(PageRequestDTO pageRequestDTO);
}
