package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    @Value("秦疆")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
