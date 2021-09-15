package net.javaguides.springboot.controller;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.controller.response.dto.EmployeeDto;
import net.javaguides.springboot.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {

    private EmployeeServiceImpl employeeService;

    //display list of employees
    @RequestMapping("/")
    public ModelAndView viewHomePage(){
        ModelAndView modelAndView = new ModelAndView("index");

        List<EmployeeDto> listEmployees = employeeService.getAllEmployees();

        modelAndView.addObject("listEmployees", listEmployees);

        return modelAndView;
    }
}
