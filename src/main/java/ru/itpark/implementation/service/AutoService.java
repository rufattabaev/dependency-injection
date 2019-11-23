package ru.itpark.implementation.service;

import ru.itpark.framework.annotation.Component;
import ru.itpark.implementation.domain.Auto;
import ru.itpark.implementation.repository.AutoRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

@Component
public class AutoService {
  private AutoRepositoryImpl repository;

  public AutoService(AutoRepositoryImpl repository) {

  }

    public List<Auto> doSearch(String name) {
        return repository.getByName(name);
    }
}
