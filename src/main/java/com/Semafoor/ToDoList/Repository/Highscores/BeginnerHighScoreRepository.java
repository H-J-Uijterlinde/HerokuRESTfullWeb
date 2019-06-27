package com.Semafoor.ToDoList.Repository.Highscores;

import com.Semafoor.ToDoList.Model.HighScore.BeginnerHighScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "beginnerHighScore")
public interface BeginnerHighScoreRepository extends JpaRepository<BeginnerHighScore, Long> {
}
