package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeTest {

    @Test
    public void testEmployeeName() {

        Employee emp = new Employee();

        assertEquals("Vaishnavi", emp.getEmployeeName());
    }

    @Test
    public void testEmployeeSalary() {

        Employee emp = new Employee();

        assertEquals(30000, emp.getEmployeeSalary());
    }
}
