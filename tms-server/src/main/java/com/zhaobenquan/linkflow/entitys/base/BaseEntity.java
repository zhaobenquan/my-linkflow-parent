package com.zhaobenquan.linkflow.entitys.base;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.io.Serializable;


/**
 * @author zbq
 */
@Data
@NoArgsConstructor
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(update = "%s+1", fill = FieldFill.INSERT)
    @Version
    private Long version;


    //把注解注释 并在xml 把resultMap中的指定类型删除也不会报错
    @TableField(updateStrategy = FieldStrategy.NEVER, fill = FieldFill.INSERT)
    private DateTime dateCreated;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private DateTime lastUpdated;
}
