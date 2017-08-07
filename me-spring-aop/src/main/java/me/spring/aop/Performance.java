package me.spring.aop;

/**
 * Created on 2017/8/6.
 * 编写切点，定义一个接口
 * exexution (* me.spring.aop.Performance.perform(..))
 * *  代表任意返回类型
 * .. 代表任意参数
 * 设置当perform方法执行时触发通知
 */
public interface Performance {
    void perform();
}
