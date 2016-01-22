package top.cardone.configuration.dto;

import top.cardone.configuration.po.SystemInfo;

/**
 * 系统信息
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class SystemInfoDto extends SystemInfo {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 100182329648405647L;
}