package com.company;

import java.util.*;

//5
//33 Rumpa 3.68
//85 Ashis 3.85
//56 Samiha 3.75
//19 Samara 3.75
//22 Fahim 3.76

//Ashis
//Fahim
//Samara
//Samiha
//Rumpa

class _Student{
    private int id;
    private String fname;
    private double cgpa;
    public _Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class testcomp implements Comparator<_Student>{

    @Override
    public int compare(_Student o1, _Student o2) {

        if(o1.getCgpa()>o2.getCgpa()) return -1;
        else if(o1.getCgpa()==o2.getCgpa()){
            return o1.getFname().compareTo(o2.getFname());
        }else if(o1.getFname().equals(o2.getFname())){
            if(o1.getId()<o2.getId())return -1;
        }
        return 1;
    }

}
//Complete the code
public class sorts
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<_Student> studentList = new ArrayList<_Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            _Student st = new _Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<_Student> testcomp = new testcomp();
        studentList.sort(testcomp);
        
        for(_Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}


