package com.riri.fibonacci4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Fibonacci4 {

    @RequestMapping("/")
    public String fibonacciFour(@RequestParam("last") int last){
        Integer f0 = 1, f1 = 1, f2 = 1, f3 = 1, sum = 0;
        ArrayList<String> fibSer = new ArrayList<String>();


        if(last < 1)
        {
            return "<b>Please enter a positive number to print the enhanced Fibonacci sequence until that number(excluding the number)</b>";
        }
        else {

            //add the first 4 numbers of the sequence to the ArrayList
            fibSer.add(f0.toString());
            fibSer.add(f1.toString());
            fibSer.add(f2.toString());
            fibSer.add(f3.toString());


            while (sum < last) {

                sum = f0 + f1 + f2 + f3;
                f0 = f1;
                f1 = f2;
                f2 = f3;
                f3 = sum;
                fibSer.add(sum.toString());


            }

            fibSer.remove(fibSer.size() - 1);



            return "<b>Enhanced Fibonacci sequence:</b> </br>The initial 4 sequence numbers are set to 1." +
                    " </br>Then here is an enhanced fibonacci sequence(where the sum of the previous 4 numbers," +
                    " where all 4 numbers are positive) until the given number(excluding the number): \n"+"</br>"+
                    "<b>"+fibSer.toString()+"<b>";
        }

    }
}
