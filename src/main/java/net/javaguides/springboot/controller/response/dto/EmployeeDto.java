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
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDto(Employee employee) {
        this.id = employee.getId();
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLasName();
        this.email = employee.getEmail();
    }

    public static List<EmployeeDto> convert(List<Employee> employees) {
        return employees.stream().map(EmployeeDto::new).collect(Collectors.toList());
    }

}
