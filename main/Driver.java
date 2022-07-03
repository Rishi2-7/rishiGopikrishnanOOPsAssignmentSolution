package com.greatlearning.main;

import com.greatlearning.subclass.AdminDepartment;
import com.greatlearning.subclass.HrDepartment;
import com.greatlearning.subclass.TechDepartment;


public class Driver
{
	public static void main(String[] args)
	{
		AdminDepartment obj_A = new AdminDepartment();
		System.out.println("Welcome to "+obj_A.departmentName());
		System.out.println(obj_A.getTodaysWork());
		System.out.println(obj_A.getWorkDeadline());
		System.out.println(obj_A.isTodayAHoliday());
		System.out.println();
		
		HrDepartment obj_H = new HrDepartment();
		System.out.println("Welcome to "+obj_H.departmentName());
		System.out.println(obj_H.doActivity());
		System.out.println(obj_H.getTodaysWork());
		System.out.println(obj_H.getWorkDeadline());
		System.out.println(obj_H.isTodayAHoliday());
		System.out.println();
		
		TechDepartment obj_T = new TechDepartment();
		System.out.println("Welcome to "+obj_T.departmentName());
		System.out.println(obj_T.getTodaysWork());
		System.out.println(obj_T.getWorkDeadline());
		System.out.println(obj_T.getTechStackInformation());
		System.out.println(obj_T.isTodayAHoliday());
	}

}




