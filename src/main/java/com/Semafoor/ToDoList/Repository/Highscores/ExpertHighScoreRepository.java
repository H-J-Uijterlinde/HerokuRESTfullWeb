package com.Semafoor.ToDoList.Repository.Highscores;

import com.Semafoor.ToDoList.Model.HighScore.ExpertHighScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "expertHighScore")
public interface ExpertHighScoreRepository extends JpaRepository<ExpertHighScore, Long> {
}