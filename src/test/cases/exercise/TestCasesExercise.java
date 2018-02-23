/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.cases.exercise;

/**
 *
 * @author Kim
 */
public class TestCasesExercise {


    public static void main(String[] args) {
        MyArrayListWithBugs malwb = new MyArrayListWithBugs();
        Object Object = "hvad";
        malwb.add(Object);
        malwb.size();
        malwb.get(0);
   }
    
}
