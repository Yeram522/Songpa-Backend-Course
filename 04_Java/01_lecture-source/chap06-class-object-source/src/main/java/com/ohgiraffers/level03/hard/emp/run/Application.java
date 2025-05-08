package com.ohgiraffers.level03.hard.emp.run;

import com.ohgiraffers.level03.hard.emp.model.dto.EmployeeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        EmployeeDTO employeeDTO = new EmployeeDTO();

        Scanner sc = new Scanner(System.in);
        employeeDTO.setNumber(sc.nextInt());
        sc.nextLine();
        employeeDTO.setName(sc.nextLine());
        employeeDTO.setDept(sc.nextLine());
        employeeDTO.setJob(sc.nextLine());
        employeeDTO.setAge(sc.nextInt());
        sc.nextLine();
        employeeDTO.setGender(sc.nextLine().charAt(0));
        employeeDTO.setSalary(sc.nextInt());
        sc.nextLine();
        employeeDTO.setBonusPoint(sc.nextDouble());
        sc.nextLine();
        employeeDTO.setPhone(sc.nextLine());
        employeeDTO.setAddress(sc.nextLine());

        System.out.println("모든 필드 값 출력");
        System.out.println(employeeDTO.getNumber());
        System.out.println(employeeDTO.getName());
        System.out.println(employeeDTO.getDept());
        System.out.println(employeeDTO.getJob());
        System.out.println(employeeDTO.getAge());
        System.out.println(employeeDTO.getGender());
        System.out.println(employeeDTO.getSalary());
        System.out.println(employeeDTO.getBonusPoint());
        System.out.println(employeeDTO.getPhone());
        System.out.println(employeeDTO.getAddress());
    }
}
