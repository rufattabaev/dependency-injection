package ru.itpark.framework.container;

import ru.itpark.implementation.repository.AutoRepositoryImpl;
import ru.itpark.implementation.service.AutoService;

import javax.naming.NamingException;
import java.util.HashMap;
import java.util.Map;

public class ContainerStatImpl implements Container {
  @Override
  public Map<Class, Object> init() throws NamingException {
    Map<Class, Object> components = new HashMap<>();
    components.put(AutoRepositoryImpl.class, new AutoRepositoryImpl());
    components.put(AutoService.class, new AutoService((AutoRepositoryImpl) components.get(AutoRepositoryImpl.class)));
    return components;
  }
}
