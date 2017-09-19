package by.it.group573602.badey.lesson01;

/*
 * Даны целые числа 1<=n<=1E18 и 2<=m<=1E5,
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * время расчета должно быть не более 2 секунд
 */

import java.util.ArrayList;

public class FiboC {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboC fibo = new FiboC();
        int n = 10;
        int m = 2;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n, m), fibo.time());
    }

    long fasterC(long n, int m) {
        //решение практически невозможно найти интуитивно
        //вам потребуется дополнительный поиск информации
        //см. период Пизано
        //return 0L;
        ArrayList<Long> fibolist=new ArrayList<>();
        fibolist.add(0L);
        fibolist.add(1L);
        long t=fibolist.size()-2;
        for(int j=2;j<6*m;++j){
            fibolist.add((fibolist.get(j-1)+fibolist.get(j-2))%m);
            t++;
            if(fibolist.get(j)==1L && fibolist.get(j-1)==0L)
                break;
        }
        int res;
        res=(int)(n%t);
        return fibolist.get(res);
    }


}

