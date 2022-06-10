package com.example.csw_clients.controller;

import com.example.csw_clients.entity.Employee;
import com.example.csw_clients.retrofit.RetrofitServiceGenerator;
import com.example.csw_clients.service.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UpdateEmployeeServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = 0;
        try {
            id = Integer.parseInt(req.getParameter("id"));
        } catch (Exception e) {
            resp.getWriter().println(e);
        }
        if (id <= 0) {
            resp.getWriter().println("Is valid information");
            return;
        }
        EmployeeService productService = RetrofitServiceGenerator.createService(EmployeeService.class);
        Employee obj = (Employee) productService.getEmployeeDetail(id);
        if (obj == null) {
            resp.setStatus(404);
            resp.getWriter().println("Not found");
            return;
        }
        req.setAttribute("employee", obj);
        req.getRequestDispatcher("detail.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("utf-8");
        String cateName = req.getParameter("categoryName");
        HttpSession session = req.getSession();
        int id = 0;
        try {
            id = Integer.parseInt(req.getParameter("id"));
        } catch (Exception e) {
            resp.getWriter().println(e);
        }
        if (id <= 0) {
            resp.getWriter().println("Is valid information");
            return;
        }
        if (cateName == null || cateName.length() <= 4) {
            session.setAttribute("errors", "Category name is invalid");
            req.getRequestDispatcher("/Admin/Categories/_id.jsp").forward(req, resp);
            return;
        }
        //check
        Category cate = new Category();
        cate.setCategoryName(cateName);

        model.update(id, cate);
//        session.setAttribute("success", "Update success");
        resp.sendRedirect("/categories");
//        req.getRequestDispatcher("/Admin/Categories/_id.jsp").forward(req, resp);

    }
}
