package top.cardone.configuration.dto;

import top.cardone.configuration.po.Site;

/**
 * 站点
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class SiteDto extends Site {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 319759800742962050L;
}