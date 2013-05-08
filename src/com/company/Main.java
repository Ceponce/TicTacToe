package com.company;

public class Main {

    public static void main(String[] args) {

    /*
    tic tac toe sudo code and thoughts...

    Here we go...

    First:

        We will need recursion... Yes. But what will be the layout?
        Probably continue the use of a string... it will be the key and
        the solution will be the definition.


        key as... String str = "012345678"

        Rule 1.
            win
        Rule 2.
            cant win, don't lose.
        Rule 3.
            Do Everything else now


    Second:

        -The values in the string are going to be ... {0, 1, 2}  but 2 has the value -1 for mathematical interpretation.

            -this way we know the value of our game.
            -we need to develop checking methods.
            -set up our red alert method
            -set up opponents red alert system. (this needs to be optimized)

            -Ultimately we will want to put the other player in multiple red alerts at the same time.
            -we need to be careful on maximizing our red alerts. they can be dependent on one node and
             that is unacceptable. It needs to be like the evil hangman where, we have lots of red alerts,
             we play the spot that will lead to more secure multiple red alerts.

    Third:

        - We will probably start at "-10000000000"

            -To get the hang of a game...
            -Computer start
            -Client will do smart moves "attempt to avoid red alert scenario's"

        - Order of priorities

            -If winning opportunity... take win
            -If red alert... block it
            -Else optimize victory (optimize opponents red alerts)

     */


        String irrelavent = "102102000";




    }

    // Recursive function that tracks who's turn it is.
    //also stores opponents red alerts.

    //Value of the game... Perhaps the opponents red alert level.
    //lets call this method...
    //Method green alert... Paybe just determines a winning situation...     Rule 1.   :D
    public static int green(String w){
        // First Row
        if (sum(w, 0, 1, 2) == 2){
            //look here for  red alert
            if(value(w, 0) ==0)
                return 0;
            else if(value(w, 1) == 0)
                return 1;
            else
                return 2;
        }
        //Second Row
        else if (sum(w, 3, 4, 5) == 2){
            //look here for  red alert
            if(value(w, 3) ==0)
                return 3;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 5;
        }
        //Final Row
        else if (sum(w, 6, 7, 8) == 2){
            //look here for  red alert
            if(value(w, 6) ==0)
                return 6;
            else if(value(w, 7) == 0)
                return 7;
            else
                return 8;
        }
        //First Column
        if (sum(w, 0, 3, 6) == 2){
            //look here for  red alert
            if(value(w, 0) ==0)
                return 0;
            else if(value(w, 3) == 0)
                return 3;
            else
                return 6;
        }
        //Second Column
        if (sum(w, 1, 4, 7) == 2){
            //look here for  red alert
            if(value(w, 1) ==0)
                return 1;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 7;
        }
        //Final Column
        if (sum(w, 2, 5, 8) == 2){
            //look here for  red alert
            if(value(w, 2) ==0)
                return 2;
            else if(value(w, 5) == 0)
                return 5;
            else
                return 8;
        }
        //Top left Diagnol
        if (sum(w, 0, 4, 8) == 2){
            //look here for  red alert
            if(value(w, 0) ==0)
                return 0;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 8;
        }
        //Top Right Diagnol
        if (sum(w, 2, 4, 6) == 2){
            //look here for  red alert
            if(value(w, 2) == 0)
                return 2;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 6;
        }

            return 46;
    }

    //Method red alert.   -------------very important to stop at a red alert and call it out.        Rule 2. :D
    public static int red(String w){
       // First Row
        if (sum(w, 0, 1, 2) == -2){
            //look here for  red alert
            if(value(w, 0) ==0)
                return 0;
            else if(value(w, 1) == 0)
                return 1;
            else
                return 2;
        }
        //Second Row
        else if (sum(w, 3, 4, 5) == -2){
            //look here for  red alert
            if(value(w, 3) ==0)
                return 3;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 5;
        }
        //Final Row
        else if (sum(w, 6, 7, 8) == -2){
            //look here for  red alert
            if(value(w, 6) ==0)
                return 6;
            else if(value(w, 7) == 0)
                return 7;
            else
                return 8;
        }
        //First Column
        if (sum(w, 0, 3, 6) == -2){
            //look here for  red alert
            if(value(w, 0) ==0)
                return 0;
            else if(value(w, 3) == 0)
                return 3;
            else
                return 6;
        }
        //Second Column
        if (sum(w, 1, 4, 7) == -2){
            //look here for  red alert
            if(value(w, 1) ==0)
                return 1;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 7;
        }
        //Final Column
        if (sum(w, 2, 5, 8) == -2){
            //look here for  red alert
            if(value(w, 2) ==0)
                return 2;
            else if(value(w, 5) == 0)
                return 5;
            else
                return 8;
        }
        //Top left Diagnol
        if (sum(w, 0, 4, 8) == -2){
            //look here for  red alert
            if(value(w, 0) ==0)
                return 0;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 8;
        }
        //Top Right Diagnol
        if (sum(w, 2, 4, 6) == -2){
            //look here for  red alert
            if(value(w, 2) == 0)
                return 2;
            else if(value(w, 4) == 0)
                return 4;
            else
                return 6;
        }

            return 45;

    }


    public static int white(String w){
        // First Row
        if (sum(w, 0, 1, 2) == 3){
                return 3;
        }
        //Second Row
        else if (sum(w, 3, 4, 5) == 3){
                return 3;
        }
        //Final Row
        else if (sum(w, 6, 7, 8) == 3){
                return 3;
        }
        //First Column
        if (sum(w, 0, 3, 6) == 3){
                return 3;
        }
        //Second Column
        if (sum(w, 1, 4, 7) == 3){
                return 3;
        }
        //Final Column
        if (sum(w, 2, 5, 8) == 3){
                return 3;
        }
        //Top left Diagnol
        if (sum(w, 0, 4, 8) == 3){
                return 3;
        }
        //Top Right Diagnol
        if (sum(w, 2, 4, 6) == 3){
                return 3;
        }

            return 0;
    }

    //Method black alert
    public static int black(String w){
        // First Row
        if (sum(w, 0, 1, 2) == -3){
                return -3;
        }
        //Second Row
        else if (sum(w, 3, 4, 5) == -3){
                return -3;
        }
        //Final Row
        else if (sum(w, 6, 7, 8) == -3){
                return -3;
        }
        //First Column
        if (sum(w, 0, 3, 6) == -3){
                return -3;
        }
        //Second Column
        if (sum(w, 1, 4, 7) == -3){
                return -3;
        }
        //Final Column
        if (sum(w, 2, 5, 8) == -3){
                return -3;
        }
        //Top left Diagnol
        if (sum(w, 0, 4, 8) == -3){
                return -3;
        }
        //Top Right Diagnol
        if (sum(w, 2, 4, 6) == -3){
                return -3;
        }

            return 0;

    }


    //Method to sum 3 values in string
    public static int sum(String a, int x, int y, int z){
        return value(a, x) + value(a, y) + value(a, z);
    }

    //Method to return value of a particular char at i :D
    public static int value(String a, int i){
        String b =  a.substring(i, i+1);

        if(b.equals("0"))
            return 0;
        else if(b.equals("1"))
            return 1;
        else
            return -1;
    }
}
