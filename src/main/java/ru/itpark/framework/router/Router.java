package ru.itpark.framework.router;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Router {
  Router route(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
