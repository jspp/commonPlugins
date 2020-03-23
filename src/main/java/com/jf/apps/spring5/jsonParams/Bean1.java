package com.jf.apps.spring5.jsonParams;

import lombok.Data;

/**
 * @Data: 自动为所有字段添加@ToString, @EqualsAndHashCode, @Getter方法，
 * 为非final字段添加@Setter,和@RequiredArgsConstructor!
 */
@Data
public class Bean1 {

    private  String name;

    private  String age1;

    private  String sex1;

}
