package com.zhaobenquan.linkflow.entitys;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zhaobenquan.linkflow.entitys.base.BaseEntity;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaobenquan
 * @date 2022/7/22 10:13 上午
 */
@TableName("mybatis_plus_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AccountBook extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8245377763034132392L;
    private Long id;

    private String code;

    private String editions;

    private Date expired;

}