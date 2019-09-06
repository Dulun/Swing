/**
 * Name  : Demo7
 * Author: Tony
 * Email : dulunix@gmail.com
 * Date  : 2019-09-04 18:57
 * Function:
 */
class A{
    int a;
    int b;
}

public class Demo7 {


    public Demo7(){
        A[] a = new A[20];
        System.out.println("before: " + a.length);

        for(int i = 0; i < 20; i++){
            a[i] = new A();
        }

        a[19] = null;

        System.out.println("after: " + a.length);


    }
}
