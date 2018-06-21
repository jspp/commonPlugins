package com.jf.apps.lambok;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Data: 自动为所有字段添加@ToString, @EqualsAndHashCode, @Getter方法，
 * 为非final字段添加@Setter,和@RequiredArgsConstructor!
 */
@Data
public class Userbean {

    private  String name;

    private  String age;

    private  String sex;

    public Userbean(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Userbean() {}


}
