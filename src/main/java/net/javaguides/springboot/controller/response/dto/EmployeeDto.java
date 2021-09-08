package net.javaguides.springboot.controller.response.dto;

import lombok.*;
import net.javaguides.springboot.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class EmployeeDto {

    private Long id;
    private String first_nome;
    private String last_name;
    private String email;

    public EmployeeDto(Employee employee) {
        this.id = employee.getId();
        this.first_nome = employee.getFirstName();
        this.last_name = employee.getLasName();
        this.email = employee.getEmail();
    }

    public static List<EmployeeDto> convert(List<Employee> employees) {
        return employees.stream().map(EmployeeDto::new).collect(Collectors.toList());
    }

}
