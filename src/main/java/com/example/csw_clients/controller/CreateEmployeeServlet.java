package com.example.csw_clients.controller;

import com.example.csw_clients.entity.Employee;
import com.example.csw_clients.retrofit.RetrofitServiceGenerator;
import com.example.csw_clients.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateEmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name =req.getParameter("name");
        Double price = Double.valueOf(req.getParameter("price"));
        Employee obj = new Employee(name, price);

//        if (!obj.isValid()) {
//            req.setAttribute("errors", obj.getErrors());
//            req.getRequestDispatcher("/create.jsp").forward(req, resp);
//            return;
//        }
        EmployeeService productService = RetrofitServiceGenerator.createService(EmployeeService.class);
        productService.save(obj).execute().body();
        System.out.println("save success.");
        resp.sendRedirect("/employees");
    }
}
