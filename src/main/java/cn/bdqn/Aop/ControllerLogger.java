package cn.bdqn.Aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.logging.Logger;

public class ControllerLogger {
    private static final Logger logger=Logger.getLogger("ControllerLogger");
    public void before(JoinPoint jp){
        logger.info("调用了: "+jp.getTarget()+"的"+jp.getSignature().getName()+"方法，入参"+ Arrays.toString(jp.getArgs()));
    }
    public void after(JoinPoint jp,Object result){

        logger.info("after 调用："+jp.getTarget()+"的"+jp.getSignature().getName()+"方法。返回值："+result);
    }
}
