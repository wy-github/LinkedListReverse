
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestVim {
    public static void main(String[] args) {
      System.out.println("vim学习!");
      String str = "wangjun,tianye!";
        System.out.println("he");
        String temp = "jjj";
        String h="hello world";
        //say(h);
        List List = new ArrayList<>();

        Thread thread = new Thread();
        thread.run();
    }

    @Test
    public  void say(){
        ExecutorService threadPool = Executors.newCachedThreadPool();//线程池里面的线程数会动态变化，并可在线程线被移除前重用
        for (int i = 1; i <= 3; i ++) {
            final  int task = i;   //10个任务
            //TimeUnit.SECONDS.sleep(1);
            threadPool.execute(new Runnable() {    //接受一个Runnable实例
                public void run() {
                    System.out.println("线程名字： " + Thread.currentThread().getName() +  "  任务名为： "+task);
                }
            });
        }


    }
}
