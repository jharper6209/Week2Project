package com.techelevator;

import jdk.jshell.SourceCodeAnalysis;

import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Application {
    
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
    private static void createDepartments() {
   // Department Marketing = new Department(001);
   // Department Sales = new Department(002);
   // Department Engineering = new Department(003);


    }

    /**
     * Print out each department in the collection.
     */
    private static void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
       // System.out.println(Marketing);
        //System.out.println(Sales);
        //System.out.println(Engineering);  // pretty sure  a for loop will pull them in


    }

    /**
     * Create employees and add them to the collection of employees
     */
    private static void createEmployees() {
    List<Employee> employees = new ArrayList();

 /*   **Tip: use the Departments from the departments list to assign each employee's department. Retrieve
            the two departments you need by using the get() method.**

       *use no-argument constructor and call setter methods to set each instance variable
    employeeId = 001;
    firstName = Dean;
    lastName = Johnson;
    email = djohnson@teams.com;            Think we need to add parameters to our no arg const
    salary = 60000;
    department = Engineering;
    hireDate = 08/21/2020

        *use all-argument constructor
    employeeId = 002;
    firstName = Angie;
    lastName = Smith;
    email = asmith@teams.com;
    salary = 60000; -> 10% increase
    department = Engineering;
    hireDate = 08/21/2020

        *use all-argument constructor
    employeeId = 003;
    firstName = Margaret;
    lastName = Thompson;
    email = mthompson@teams.com;
    salary = 60000;
    department = Marketing;
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
