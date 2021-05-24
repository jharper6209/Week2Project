package com.techelevator;

import jdk.jshell.SourceCodeAnalysis;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Application {
    // defining these outside any method make them available to every method in this class, no need to worry
    // about how to get them
    //  Global Objects
    public static List<Department> departments = new ArrayList<>();
    public static List<Employee> employees = new ArrayList<>();
    public static List<Employee> deptMarketing = new ArrayList<>();
    public static List<Employee> deptSales = new ArrayList<>();
    public static Map<String, Project> projects = new HashMap();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {

        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();

        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();

    }

    /**
     * Create departments and add them to the collection of departments
     */
    public static void createDepartments() {

     //   Department Marketing = new Department();
     //   Department Sales = new Department();
     //   Department Engineering = new Department();
        Department marketing = new Department(001, "Marketing");
        Department sales = new Department(002, "Sales");
        Department engineering = new Department(003, "Engineering");

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);
    //    System.out.println(departments) ;
    //    System.out.println(departments.size());


    }

    /**
     * Print out each department in the collection.
     */
    public static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getName());
        }
    }
    //    System.out.println(Marketing);
    //    System.out.println(Sales);
    //    System.out.println(Engineering);  // pretty sure  a for loop will pull them in




    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
/*
 //  **Tip: use the Departments from the departments list to assign each employee's department. Retrieve
 //           the two departments you need by using the get() method.**

 //      *use no-argument constructor and call setter methods to set each instance variable
 //   employeeId = 001;
    this.employeeId = 001;
 //   firstName = Dean;
    this.firstName = "Dean";
//    lastName = Johnson;
    this.lastName = "Johnson";
//    email = djohnson@teams.com;
    this.email = "djohnson@teams.com";
 //   salary = 60000;
//    department = Engineering;
    this.department = "Engineering"; //department.get(2);
 //   hireDate = 08/21/2020
    this.hireDate = "08/21/2020";

//        *use all-argument constructor
        Employee angie = new Employee(002, "Angie", "Smith", "asmith@teams.com", 60000,
            Department.get(2), "08/21/2020");
 //   employeeId = 002;
 //   firstName = Angie;
 //   lastName = Smith;
//    email = asmith@teams.com;
 //   salary = 60000; -> 10% increase
 //   department = Engineering;       //department.get(2);
  //  hireDate = 08/21/2020

/*        *use all-argument constructor
    employeeId = 003;
    firstName = Margaret;
    lastName = Thompson;
    email = mthompson@teams.com;
    salary = 60000;
    department = Marketing;         //department.get(0);
    hireDate = 08/21/2020
 */

    }

    /**
     * Print out each employee in the collection.
     */
    private static void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
/*  (fullName + " (" + salary + ") " + department)
    (fullName + " (" + salary + ") " + department)
    (fullName + " (" + salary + ") " + department)

 */
    }

    /**
     * Create the 'Teams' project.
     */
    private static void createTeamsProject() {
/*  Map<String, Project> Teams= new HashMap();
        name: Teams
        description: Project Management Software
        startDate: 10/10/2020
        dueDate: 11/10/2020

        Teams.put(Dean Johnson);
        Teams.put(Angie Smith);

 */
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private static void createLandingPageProject() {
/*  Map<String, Project> MarketingLandingPage= new HashMap();
        name: Marketing Landing Page
        description: Lead Capture Landing Page for Marketing
        startDate: 10/10/2020
        dueDate: 10/17/2020

        MarketingLandingPage.put(Margaret Thompson)
 */
    }

    /**
     * Print out each project in the collection.
     */
    private static void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
/*  print number of employees on the project
        Teams: 2
        Marketing Landing Page: 1

 */
    }

}
