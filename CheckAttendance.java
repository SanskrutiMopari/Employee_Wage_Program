package EmployeeWage;

//Check Employee is Present or Absent???
//Use-((RANDOM))for Attendance Check

public class CheckAttendance {
    public static final int IS_FULL_TIME = 1;

    public static void main(String[] args) {

        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
