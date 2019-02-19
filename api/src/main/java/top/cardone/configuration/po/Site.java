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
     * 批次编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String batchNo;

    /**
     * 开始日期
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
     * 创建人编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdByCode;

    /**
     * 创建人标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String createdById;

    /**
     * 创建日期
     */
    @lombok.Getter
    @lombok.Setter
    protected Date createdDate;

    /**
     * 数据状态编号(数据字典)
     */
    @lombok.Getter
    @lombok.Setter
    protected String dataStateCode;

    /**
     * 部门编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String departmentCode;

    /**
     * 结束日期
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
     * 标记编号(数据字典：工作流、同步、生成、录入、审批)
     */
    @lombok.Getter
    @lombok.Setter
    protected String flagCode;

    /**
     * 标识对象编号(工作流：工作流标识、同步：批次号、生成：操作者编号、录入：操作者编号、审批：操作者编号)
     */
    @lombok.Getter
    @lombok.Setter
    protected String flagObjectCode;

    /**
     * ftp ip
     */
    @lombok.Getter
    @lombok.Setter
    protected String ftpIp;

    /**
     * ftp 密码
     */
    @lombok.Getter
    @lombok.Setter
    protected String ftpPassword;

    /**
     * ftp端口
     */
    @lombok.Getter
    @lombok.Setter
    protected String ftpPort;

    /**
     * ftp 用户名
     */
    @lombok.Getter
    @lombok.Setter
    protected String ftpUsername;

    /**
     * json数据
     */
    @lombok.Getter
    @lombok.Setter
    protected Object jsonData;

    /**
     * 最后修改人编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String lastModifiedByCode;

    /**
     * 最后修改人标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String lastModifiedById;

    /**
     * 最后修改日期
     */
    @lombok.Getter
    @lombok.Setter
    protected Date lastModifiedDate;

    /**
     * 纬度
     */
    @lombok.Getter
    @lombok.Setter
    protected String latitude;

    /**
     * 经度
     */
    @lombok.Getter
    @lombok.Setter
    protected String longitude;

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
    protected Long orderBy;

    /**
     * 组织编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String orgCode;

    /**
     * 父级编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentCode;

    /**
     * 父级标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentId;

    /**
     * 父级树编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeCode;

    /**
     * 父级树标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeId;

    /**
     * 父级树名称
     */
    @lombok.Getter
    @lombok.Setter
    protected String parentTreeName;

    /**
     * 个人编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String personalCode;

    /**
     * 个人标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String personalId;

    /**
     * 行政编码
     */
    @lombok.Getter
    @lombok.Setter
    protected String postalCode;

    /**
     * 备注
     */
    @lombok.Getter
    @lombok.Setter
    protected String remark;

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
     * 状态编号(数据字典)
     */
    @lombok.Getter
    @lombok.Setter
    protected String stateCode;

    /**
     * 系统信息编号
     */
    @lombok.Getter
    @lombok.Setter
    protected String systemInfoCode;

    /**
     * 系统信息标识
     */
    @lombok.Getter
    @lombok.Setter
    protected String systemInfoId;

    /**
     * url
     */
    @lombok.Getter
    @lombok.Setter
    protected String url;

    /**
     * 版本
     */
    @lombok.Getter
    @lombok.Setter
    protected Integer version;
}