package com.wlt.mall;

import java.lang.reflect.Method;

public class TestTool {

    public static void main(String[] args) {

     Nobug testobj = new Nobug();

     Class clas = testobj.getClass();

        Method[] mes = clas.getDeclaredMethods();


        StringBuilder  log = new StringBuilder();


        int errnum =0 ;


        for ( Method m : mes){

            if(m.isAnnotationPresent(TestAnnotation.class)){

                try {

                    m.setAccessible(true);
                    m.invoke(testobj,null);

                }catch (Exception e){

                     errnum ++ ;
                     log.append(m.getName());
                     log.append("hase err:");
                     log.append("\n\r cause by");
                     log.append(e.getCause().getClass().getSimpleName());
                     log.append("\n\r");
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");

                }


            }


        }


        log.append(clas.getSimpleName());
        log.append(" has  ");
        log.append(errnum);
        log.append(" error.");

        // 生成测试报告
        System.out.println(log.toString());



    }
}
