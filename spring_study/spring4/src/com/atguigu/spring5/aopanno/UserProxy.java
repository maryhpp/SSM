package com.atguigu.spring5.aopanno;

        import org.aspectj.lang.ProceedingJoinPoint;
        import org.aspectj.lang.annotation.*;
        import org.springframework.core.annotation.Order;
        import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象
@Order(3)
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void pointdemo(){

    }

    //前置通知
    //@Before注解表示作为前置通知
    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before............");
    }

    //后置通知，返回通知
    @AfterReturning(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void AfterReturning(){
        System.out.println("AfterReturning............");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void AfterThrowing(){
        System.out.println("AfterThrowing............");
    }

    //最终通知，不管有没有异常都通知
    @After(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("After............");
    }

    //环绕通知，在方法之前和之后都执行
    @Around(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前............");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后............");
    }

}
