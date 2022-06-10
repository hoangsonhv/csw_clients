package com.example.csw_clients.controller;

import com.example.csw_clients.entity.Employee;
import com.example.csw_clients.retrofit.RetrofitServiceGenerator;
import com.example.csw_clients.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetListEmployeeServlet extends HttpServlet {

    EmployeeService employeeService;

    public GetListEmployeeServlet(){
        employeeService = RetrofitServiceGenerator.createService(EmployeeService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> employees = employeeService.getProducts().execute().body();
        req.setAttribute("employees", employees);
        req.getRequestDispatcher("/employee.jsp").forward(req, resp);

    }
}
