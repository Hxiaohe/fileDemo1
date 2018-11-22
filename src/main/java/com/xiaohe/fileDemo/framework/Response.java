package com.xiaohe.fileDemo.framework;


/**
 * 与之前的VO对应。
 *
 * Example Usage:
 *
 * @ApiModel  // 用于生成前端文档，注明此类用做生成返回值
 * class TokenResponse extends Response{
 *
 *     @ApiModelProperty("口令")  // 用于生成前端文档，对单个返回值成员进行说明
 *     private String Token;
 *
 *     ...  // getters and setters
 * }
 */
public class Response {
    /**
     * 响应信息，用于错误响应提示
     */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
