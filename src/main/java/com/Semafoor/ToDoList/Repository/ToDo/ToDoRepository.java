package com.Semafoor.ToDoList.Repository.ToDo;

import com.Semafoor.ToDoList.Model.ToDo.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/*
The TodoRepository is similar to the BoodschapRepository.
 */

@CrossOrigin()
@RepositoryRestResource(path = "ToDo")
public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    List<ToDo> findAllByOrderByCompletedAsc();
}
