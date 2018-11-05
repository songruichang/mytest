package cn.itcast.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
//    public  void printLog(){
//        System.out.println("Logger类中的printLog方法记录日志了。。。");
//    }
    @Pointcut("execution(* cn.itcast.service.impl.*.*(..))")
    private void pt1(){}

@Around("pt1()")
    public Object aroundprintLog(ProceedingJoinPoint pjp){
        Object proceed=null;
        try {
        System.out.println("前置通知");

        Object[] args = pjp.getArgs();

         proceed = pjp.proceed(args);
         System.out.println("后置通知");
            return proceed;

        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throw new RuntimeException(throwable);
        }finally {
            System.out.println("最终通知");
        }

    }

}
