package top.cardone.configuration.dto;

import top.cardone.configuration.po.ErrorInfo;

/**
 * 错误信息
 *
 * @author yao hai tao
 */
@lombok.ToString(callSuper = true)
public class ErrorInfoDto extends ErrorInfo {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 248712853134910035L;
}