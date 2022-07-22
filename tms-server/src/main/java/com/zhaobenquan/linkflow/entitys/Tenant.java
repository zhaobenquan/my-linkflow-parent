package com.zhaobenquan.linkflow.entitys;


import com.zhaobenquan.linkflow.entitys.base.TenantAwareEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhaobenquan
 * @date 2022/7/22 11:16 上午
 */

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Tenant extends TenantAwareEntity implements Serializable {
    private Long id;

    private String contactName;

    private String email;

    private Boolean isActive;

    private String mobilePhone;

    private String name;

    private String company;

    private String status;

    private Date lastEnabledDate;

    private Date expiredDate;

    private Boolean advancedUserEnabled;

    private Boolean marketEnabled;

    private Boolean permissionEnabled;

    private Boolean dataAccessEnabled;

    private String bookCode;

    private String comment;

    private String phaseType;

    private Long editionId;

    private Boolean journeyTemplateDevEnabled;

    private String locale;

    private String privateKey;

    private String publicKey;

    private Date keyCreateDate;

    private Integer scale;

    /**
     * 是否需要帮助
     */
    private Boolean showhelp;

    /**
     * 是否显示在线客服
     */
    private Boolean showUdesk;

    /**
     * 是否显示工单
     */
    private Boolean showTicket;

    private String industry;

    /**
     * 是否创建HUE用户
     */
    private Boolean hasHue;
}