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
        Object Object2 = "hvad2";

        malwb.add(Object);
        malwb.add(Object);
        malwb.add(Object);
        malwb.add(Object2);
        malwb.add(Object);
        malwb.add(Object);
        int size = malwb.size();

        System.out.println(size);
        malwb.remove(3);
        malwb.remove(3);
        malwb.remove(3);
        int size2 = malwb.size();
        Object ob2 = malwb.get(3);
        System.out.println(size2);

        System.out.println(ob2.toString());
    }

}
