package fib;

public class Fib {

    public int fib(int index){
        if (index<2){
            return index;
        }
        return fib(index-1)+fib(index-2);
    }
}
//0 1 1 2 3 5 8
