package com.example.csw_clients.service;

import com.example.csw_clients.entity.Employee;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface EmployeeService {
    @GET("/api/v1/employees")
    public Call<List<Employee>> getEmployees();

    @GET("/api/v1/employees/{id}")
    public Call<Employee> getEmployeeDetail(@Path("id") int id);

    @POST("/api/v1/employees")
    public Call<Employee> save(@Body Employee obj);

    @PUT("/api/v1/employees/{id}")
    public Call<Employee> update(@Body Employee obj, @Path("id") int id);

    @DELETE("/api/v1/employees/{id}")
    public Call<Employee> delete(@Path("id") int id);
}
