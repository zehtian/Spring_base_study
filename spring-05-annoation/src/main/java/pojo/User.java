package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="pojo.User"/>
//@Component 组件
@Component
public class User {
    //相当于<property name="name" value="秦疆"/>
    //@Value 属性值，也可以作用于set方法上
    @Value("秦疆")
    public String name;
}
