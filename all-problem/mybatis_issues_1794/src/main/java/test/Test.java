package test;

import org.apache.ibatis.reflection.TypeParameterResolver;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Random;

/**
 * Created by gongshunqiang on 2019/12/31
 */
public class Test {

    public static void sleep() {
        try {
            Thread.currentThread().sleep(new Random().nextInt(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sleep();
                Method[] amethods = ADynamicMapper.class.getMethods();
                sleep();
                Type atype = TypeParameterResolver.resolveReturnType(amethods[0], ADynamicMapper.class);

                System.out.println("1-->" + atype + "\t" + amethods[0].getReturnType());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                sleep();
                Method[] bmethods = BDynamicMapper.class.getMethods();
                Type btype = TypeParameterResolver.resolveReturnType(bmethods[0], BDynamicMapper.class);
                sleep();
                System.out.println("2-->" + btype + "\t" + bmethods[0].getReturnType());
            }
        }).start();

        Thread.sleep(1000 * 2);

    }
}
