package top.cardone.configuration.po;

import java.util.Date;

/**
 * 站点
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class Site implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 574466228973601019L;

    /**
     * 开始时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date beginDate;

    /**
     * 正文
     */
    @lombok.Getter
    @lombok.Setter
    protected String content;

    /**
     * 创建人代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdByCode;

    /**
     * 创建时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date createdDate;

    /**
     * 数据状态代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String dataStateCode;

    /**
     * 部门代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String departmentCode;

    /**
     * 结束时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date endDate;

    /**
     * 解释
     */
    @lombok.Getter
    @lombok.Setter
    protected String explain;

    /**
     * 最后修改人代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String lastModifiedByCode;

    /**
     * 最后修改时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date lastModifiedDate;

    /**
     * 名称
     */
    @lombok.Getter
    @lombok.Setter
    protected String name;

    /**
     * 组织代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String orgCode;

    /**
     * 许可代码集合
     */
    @lombok.Getter
    @lombok.Setter
    protected String permissionCodes;

    /**
     * 角色代码集合
     */
    @lombok.Getter
    @lombok.Setter
    protected String roleCodes;

    /**
     * 站点编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String siteCode;

    /**
     * 站点标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String siteId;

    /**
     * 状态代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String stateCode;

    /**
     * 系统信息代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String systemInfoCode;

    /**
     * 版本
     */
    @lombok.Getter
    @lombok.Setter
    protected Long version;

    /**
     * 工作流标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String wfId;
}