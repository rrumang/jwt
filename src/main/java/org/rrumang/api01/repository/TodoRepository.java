package org.rrumang.api01.repository;

import org.rrumang.api01.domain.Todo;
import org.rrumang.api01.repository.search.TodoSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
}
