package top.cardone.configuration.po;

import java.util.Date;

/**
 * 字典项
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class DictionaryItem implements java.io.Serializable {

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
     * 数据状态代码(数据字典)
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
     * 字典项代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String dictionaryItemCode;

    /**
     * 字典项标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String dictionaryItemId;

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
     * 标记代码(数据字典：工作流、同步、生成、录入、审批)
     */
    @lombok.Getter
    @lombok.Setter
    protected String flagCode;

    /**
     * 标识对象代码(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
     */
    @lombok.Getter
    @lombok.Setter
    protected String flagObjectCode;

    /**
     * JSON数据
     */
    @lombok.Getter
    @lombok.Setter
    protected String jsonData;

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
     * 备注
     */
    @lombok.Getter
    @lombok.Setter
    protected String remark;

    /**
     * 站点代码
     */
    @lombok.Getter
    @lombok.Setter
    protected String siteCode;

    /**
     * 状态代码(数据字典)
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
    protected Integer version;
}