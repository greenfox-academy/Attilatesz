package com.greenfoxacademy.dbexample.services;


public interface ToDoService {
  void deleteToDo(Long id);
  void changeIsDone(Long id);
}
