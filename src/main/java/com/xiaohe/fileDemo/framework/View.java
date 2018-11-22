package com.xiaohe.fileDemo.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类似之前的Service，处理主要业务逻辑，每个public方法（供Controller调用的）输入参数必须至少包含一个继承自Serializer的对象，
 * 若业务逻辑中需要发起请求的用户对象，则必须在Controller中调用Controller.getUser()获取发起请求的User对象。返回值继承自Response。
 * 若返回值只可能最多有一个对象，则返回值为单个继承自Response的对象，若返回值有可能为多个，则继承自List<Response>。
 *
 * Usage Example:
 *
 * @Service  // spring 提供的注解，必须注明
 * public class UserTokenView extends View {
 *
 *     @Autowired  // 使用数据库连接上下文
 *     private DSLContext dsl;
 *
 *     @Override
 *     public UserTokenResponse findTokenBy(User user) {
 *         ... // 业务逻辑
 *         return userTokenResponse
 *     }
 * }
 */

@Service
public class View {
}
