package com.zhaobenquan.linkflow.entitys.base;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by wangding on 22/04/2017.
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public abstract class TenantAwareEntity extends BaseEntity {

    private static final long serialVersionUID = -8920174251836633137L;

    @TableField(updateStrategy = FieldStrategy.NEVER)
    private Long tenantId;
}
