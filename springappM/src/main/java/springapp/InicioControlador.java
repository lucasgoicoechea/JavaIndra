package springapp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class InicioControlador {

	@RequestMapping(value = "/inicio.htm")
	public ModelAndView hanleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		return new ModelAndView("inicio.jsp");
	}
}