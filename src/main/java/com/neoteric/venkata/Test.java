package com.neoteric.venkata;

public class Test {
    public static void main (String[]args){
        Addres addres=new Addres();
        Employee employee=new Employee();
        addres.area=" kphb";
        addres.city="  hyd  " ;
        addres.pinCode=  15255  ;
        addres.state="  Ts ";
        addres.streatNo=   143;

        employee.companyName=" TCS";
        employee.deportment="   testing";
        employee.email=" venkata24@gmail.com   ";
        employee.phone= 12345678;
        employee.sName="  venkat     ";
        System.out.println(  addres.area  +  addres.state  +  addres.city   +   addres.pinCode+  addres.streatNo);
        System.out.println(employee.companyName+ employee.sName+employee.email+employee.phone+employee.deportment);

    }
}
