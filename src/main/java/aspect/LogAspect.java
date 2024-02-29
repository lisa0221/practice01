package aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Aspect
@Log4j2
@Component
public class LogAspect {

    @Pointcut("execution(* org.tutorial.service..*(..))")
    public void pointcut() {
    }

    @Before("pointcut() && @annotation(org.tutorial.annotation.ModifyEmpData)")
    public void before(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();
        Object[] objArgs = joinPoint.getArgs();
        String[] args = Arrays.stream(objArgs).map(Object::toString).toArray(String[]::new);
        log.info("[AOP] "
            + "===begin=== "
            + className
            + "#"
            + methodName
            + "(" + String.join(", ", args) + ")");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getMethod().getName();
        log.info("[AOP] ===end==="
            + className
            + "#"
            + methodName);
    }

}
