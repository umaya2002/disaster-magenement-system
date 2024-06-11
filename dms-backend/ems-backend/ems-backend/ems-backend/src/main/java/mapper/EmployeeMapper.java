package mapper;

import net.javaguides.ems.dto.EmployeeDto;
import net.javaguides.ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
        return new EmployeeDto(
                employee.getId(),
                employee.getDisasterType(),
                employee.getDate(),
                employee.getDayCount(),
                employee.getDeathCount()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getDisasterType(),
                employeeDto.getDate(),
                employeeDto.getDayCount(),
                employeeDto.getDeathCount()
        );

    }
}
