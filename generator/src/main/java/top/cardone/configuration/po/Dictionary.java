package top.cardone.configuration.po;

import java.util.Date;

/**
 * 字典
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class Dictionary implements java.io.Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 285130730412440188L;

    /**
     * 开始时间
     */
    @lombok.Getter
    @lombok.Setter
    protected Date beginDate;

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
     * 字典代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String dictionaryCode;

    /**
     * 字典标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String dictionaryId;

    /**
     * 字典类别代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String dictionaryTypeCode;

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
     * 排序
     */
    @lombok.Getter
    @lombok.Setter
    protected Long order;

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
     * 说明
     */
    @lombok.Getter
    @lombok.Setter
    protected String remark;

    /**
     * 角色代码集合
     */
    @lombok.Getter
    @lombok.Setter
    protected String roleCodes;

    /**
     * 状态代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String stateCode;

    /**
     * 值
     */
    @lombok.Getter
    @lombok.Setter
    protected String value;

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