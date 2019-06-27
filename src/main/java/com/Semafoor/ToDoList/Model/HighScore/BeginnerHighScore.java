package com.Semafoor.ToDoList.Model.HighScore;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "BeginnerHighScore")
public class BeginnerHighScore extends HighScore{
}
