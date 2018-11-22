package com.xiaohe.fileDemo.framework;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * 与之前的Controller类似，使用注解完成URL路由任务，API文档的输入参数生成。每个方法的输入参数必须继承自Serializer。
 * 每个方法的返回值必须继承自Response。
 * 若返回值只可能最多有一个对象，则返回值为单个继承自Response的对象，若返回值有可能为多个，则继承自List<Response>。
 *
 * Usage Example:
 *
 * @RequiredPermissions("buyer, seller")  // 可以用在类上
 * @RestController  // 注明是 Rest API
 * @RequestMapping("/user")  // 一级路由 URL
 * @Api("用户注册登录信息")  // 当前 APP 接口梗概
 * public class UserController extends BaseController{
 *
 *     @Autowired  // 注册 View，spring 自动注入 bean
 *     private UserView userView;
 *
 *     @RequiredPermission("buyer, seller")  // 也可以用在方法上
 *     @RequestMapping(value = "/token", method = RequestMethod.PUT)  // 二级路由 URL，指定请求方法
 *     @ApiImplicitParams({  // 参数列表
 *             // 单个参数说明，用于生成前端文档，实际上不会做参数校验的操作
 *             @ApiImplicitParam(paramType = "form", name = "userName", required = true, value = "用户名", dataType = "String"),
 *             // paramType：参数位置，可选值有 form（body中），header（请求头中），query（URL 中）
 *             // name：参数名称，用做键名
 *             // required：是否必须
 *             // value：参数描述
 *             // dataType：参数对应的 java 类型
 *             @ApiImplicitParam(paramType = "form", name = "password", required = true, value = "密码", dataType = "String"),
 *     })
 *     TokenResponse findTokenByUser(@RequestBody UserAuthSerializer userAuthSerializer){
 *     // 参数的注解 @@RequestBody 说明参数位置在请求 body 中；其值还可以为 @PathVariable，代表参数存在于 URL 中
 *         return userView.findTokenByUser(userAuthSerializer);
 *     }
 * }
 */
@RestController  // 继承自此类的 Controller 都是 Rest 的
@CrossOrigin  // 方便跨域请求
public class Controller {
}
