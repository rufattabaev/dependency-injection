package ru.itpark.implementation.controller;

import lombok.RequiredArgsConstructor;
import ru.itpark.framework.annotation.Component;
import ru.itpark.implementation.domain.Auto;
import ru.itpark.implementation.service.AutoService;

import java.util.Collections;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AutoController {
  private final AutoService service;

  public List<Auto> doSearch(String name) {
    return service.doSearch(name);
  }

  public List<Auto> getAll(){
    return service.getAll();
  }
}
