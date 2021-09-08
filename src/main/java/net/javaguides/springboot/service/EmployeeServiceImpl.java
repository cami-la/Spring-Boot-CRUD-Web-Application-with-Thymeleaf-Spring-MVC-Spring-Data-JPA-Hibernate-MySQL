package net.javaguides.springboot.service;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.controller.response.dto.EmployeeDto;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return EmployeeDto.convert(employeeRepository.findAll());
    }
}
