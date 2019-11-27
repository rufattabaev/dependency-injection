package ru.itpark.implementation.router;

import lombok.AllArgsConstructor;
import ru.itpark.framework.annotation.Component;
import ru.itpark.implementation.controller.AutoController;
import ru.itpark.framework.router.Router;
import ru.itpark.implementation.domain.Auto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Component
@AllArgsConstructor
public class RouterImpl implements Router {
  private final AutoController autoController;

  @Override
  public Router route(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    switch (request.getRequestURI()) {
      case "/":
        request.setAttribute("items", autoController.getAll());
        request.getRequestDispatcher("/WEB-INF/catalog.jsp").forward(request, response);
      case "/search":
        final String name = request.getParameter("name");
        request.setAttribute("result", autoController.doSearch(name));
        request.getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
      default:
        response.sendRedirect("/WEB-INF/catalog.jsp");
        return null;
    }
  }
}
