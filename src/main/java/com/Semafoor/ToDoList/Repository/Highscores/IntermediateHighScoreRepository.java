package com.Semafoor.ToDoList.Repository.Highscores;

import com.Semafoor.ToDoList.Model.HighScore.IntermediateHighScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "intermediateHighScore")
public interface IntermediateHighScoreRepository extends JpaRepository<IntermediateHighScore, Long> {
}