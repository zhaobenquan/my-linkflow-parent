-- DROP TABLE IF EXISTS tenant;
CREATE TABLE IF NOT EXISTS  tenant(
    id BIGINT(20) NOT NULL AUTO_INCREMENT  COMMENT '主键;' ,
    tenant_id BIGINT(20) NOT NULL   COMMENT '租户ID;' ,
    name VARCHAR(255) NOT NULL   COMMENT '租户名;' ,
    email VARCHAR(255)  DEFAULT NULL  COMMENT '联系人邮箱;' ,
    company VARCHAR(255)  DEFAULT NULL  COMMENT '公司名;' ,
    contact_name VARCHAR(255)  DEFAULT NULL  COMMENT '联系人;' ,
    mobile_phone VARCHAR(255)  DEFAULT NULL  COMMENT '联系人手机;' ,
    status VARCHAR(50)  NOT NULL   COMMENT '状态;ENABLED,DISABLED' ,
    `last_enabled_date` timestamp(3) NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '上次启用时间;' ,
    `expired_date`  timestamp(3) NULL DEFAULT CURRENT_TIMESTAMP(3)  COMMENT '过期时间;' ,
    permission_enabled BIT(1)    COMMENT '是否启用权限;' ,
    remark VARCHAR(1000)    COMMENT '备注;' ,
    phase_type VARCHAR(64)    COMMENT '类型;FORMAL,INTERNAL, TRIAL,DEMO' ,
    scale TINYINT(4) NOT NULL  DEFAULT '0' COMMENT '渠道数量' ,
    version BIGINT(20) NOT NULL   COMMENT '乐观锁;' ,
    `date_created` timestamp(3) NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    `last_updated` timestamp(3) NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '最后一次修改时间',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '租户';
