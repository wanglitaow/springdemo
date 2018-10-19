//package main.java.springboot.serivce;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class RedisCacheAspect {
//
//    @Autowired
//    private RedisHelper redisHelper;
//
////    @Pointcut("@annotation(RedisCache)")
//    public void setJoinPoint(){}
//
//    //环绕通知:可以获取返回值
//    @Around(value = "setJoinPoint()")
//    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
//        Object result = null;
//        try {
//            //前置通知
//
//            result = proceedingJoinPoint.proceed();
//
//            //返回通知
//
//            //缓存至Redis
//            Object[] args = proceedingJoinPoint.getArgs();
//            //key策略：需要缓存的对象的全类名-id，如：entity.User-1
//            redisHelper.saveCache(result.getClass().getName()+"-"+args[0],result);
//
//        } catch (Throwable e) {
//            //异常通知
//
//        }
//        //后置通知
//
//        return result;
//    }
//
//}
