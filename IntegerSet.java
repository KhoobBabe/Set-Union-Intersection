package com.khubaib;

import java.util.Arrays;
import java.util.Scanner;

//CLASS CONTAINING THE WORKINGS REGARDING THE INTEGER SET
public class IntegerSet {

    boolean[] set;//DECLARING THE SET

    //SET OBJECT
    public IntegerSet() {
        set = new boolean[100 + 1];
    }

    //METHOD FOR ADDING AN ELEMENT IN THE SET
    void InsertElement(int index) {
        set[index] = true;
    }

    //METHOD FOR REMOVING AN ELEMENT IN THE SET
    void DeleteElement(int index) {
        set[index] = false;
    }

    //METHOD FOR THE UNION OF TWO SETS
    static IntegerSet Union(IntegerSet a, IntegerSet b) {

        //DECLARING THE SET FOR UNION
        IntegerSet union = new IntegerSet();

        for (int i = 0; i<101; i++){
            if (a.set[i] || b.set[i]){

                union.set[i] = true;
            }
        }
        return union;//RETURNING THE UNION SET
    }

    //METHOD FOR INTERSECTION BETWEEN THE TWO SETS
    static IntegerSet Intersection(IntegerSet a, IntegerSet b){

        //DECLARING THE SET FOR INTERSECTION
        IntegerSet inter = new IntegerSet();


        for (int i = 0; i<101; i++){
            if (a.set[i] && b.set[i]){
                inter.set[i] = true;
            }
        }
        return inter;//RETURNING THE INTERSECTION SET
    }

    /*METHOD FOR CHECKING IF BOTH THE SETS ARE EQUAL
     *USING THE ARRAYS PACKAGE, THE METHOD RETURN TRUE IF
     *BOTH THE ARRAYS ARE EQUAL, OTHERWISE FALSE
     */
    static boolean Equal(IntegerSet a, IntegerSet b){

        return  Arrays.equals(a.set, b.set);
    }


}

//CLASS FOR TESTING THE INTEGER SET CLASS
class IntegerSetTesting{

    public static void main(String[] args) {

        //DECLARING VARIABLES
        IntegerSet union;
        IntegerSet intersection;


        Scanner input = new Scanner(System.in);

        //DECLARING THE SETS
        IntegerSet set_1 = new IntegerSet();
        IntegerSet set_2 = new IntegerSet();

        set_1.InsertElement(1);
        set_1.InsertElement(3);
        set_1.InsertElement(4);
        set_1.InsertElement(78);
        set_1.InsertElement(14);
        set_1.InsertElement(90);

        set_2.InsertElement(4);
        set_2.InsertElement(78);
        set_2.InsertElement(69);
        set_2.InsertElement(1);
        set_2.InsertElement(100);

        System.out.print("SET 1: ");
        for (int i = 0; i<101; i++){
            if (set_1.set[i]){
                System.out.print(i+"  ");
            }
        }

        System.out.println();
        System.out.print("SET 2: ");
        for (int i = 0; i<101; i++){
            if (set_2.set[i]){
                System.out.print(i+"  ");
            }
        }

        System.out.println("\n");
        //GETTING THE UNION OF THE TWO SETS
        union = IntegerSet.Union(set_1, set_2);

        /*PRINTS THE UNION SET BY CHECKING WHICH OF THE
         *INDEX IS TRUE AND THEN PRINTS THE INDEX
         */
        System.out.print("THE UNION OF THE TWO SETS IS:- ");
        for (int i = 0; i<101; i++){
            if (union.set[i]){
                System.out.print(i+"  ");
            }
        }

        System.out.println("\n");

        //GETTING THE INTERSECTION OF THE SETS
        intersection = IntegerSet.Intersection(set_1, set_2);

        /*PRINTS THE INTERSECTION SET BY CHECKING WHICH OF THE
         *INDEX IS TRUE AND THEN PRINTS THE INDEX
         */
        System.out.print("THE INTERSECTION OF THE TWO SETS IS:- ");
        for (int i = 0; i<101; i++){
            if (intersection.set[i]){
                System.out.print(i+"  ");
            }
        }

        System.out.println("\n");


        if (IntegerSet.Equal(set_1, set_2)){//PRINTS THE STATEMENT IF THE BOTH THE SETS ARE EQUAL

            System.out.println("BOTH SETS ARE EQUAL");
        }
        else{//PRINTS THE STATEMENT IF THE BOTH THE SETS ARE NOT EQUAL
            System.out.println("BOTH SETS ARE NOT EQUAL");
        }

    }
}
