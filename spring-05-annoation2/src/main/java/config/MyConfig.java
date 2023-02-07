package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pojo.User;

//@Configuration也会被Spring容器托管，注册到容器中，因为这个本来就是一个Component
//@Configuration代表这是一个配置类，等价于beans.xml
@Configuration
@ComponentScan("pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean，就相当于之前的bean标签
    //这个方法的名字，就相当于bean标签的id属性
    //这个方法的返回值，就相当于bean标签的class属性
    //即等价于bean id="user" class="pojo.User"/>
    @Bean
    public User user(){
        return new User();  //就是返回要注入到bean的对象
    }

}
