package com.xiaohe.fileDemo.framework;


/**
 * 参数序列化器，成员变量必须为私有，变量名称与输入参数键名一致，Spring会自动将输入参数赋值给对应成员变量，
 * 需要实现每个成员变量的getter和setter。
 * 每个成员变量如果有特殊要求，需要使用@Valid注解对其进行校验，若没有合适的Valid注解，则需自己编写一个类继承自Validator完成参数校验。
 *
 * Usage Example:
 *
 * public class UserAuthSerializer extends Serialzer{
 *     // 与参数名对应
 *     // 可用的注解有：
 *     //
 *     // JSR提供的校验注解：
 *     // @Null 被注释的元素必须为 null
 *     // @NotNull 被注释的元素必须不为 null,不能为 null , 可以为 ""
 *     // @AssertTrue 被注释的元素必须为 true
 *     // @AssertFalse 被注释的元素必须为 false
 *     // @Min(value) 被注释的元素必须是一个数字，其值必须大于等于指定的最小值
 *     // @Max(value) 被注释的元素必须是一个数字，其值必须小于等于指定的最大值
 *     // @DecimalMin(value) 被注释的元素必须是一个数字，其值必须大于等于指定的最小值
 *     // @DecimalMax(value) 被注释的元素必须是一个数字，其值必须小于等于指定的最大值
 *     // @Size(max=, min=)   验证对象（Array,Collection,Map,String）长度是否在给定的范围之内
 *     // @Digits (integer, fraction)     被注释的元素必须是一个数字，其值必须在可接受的范围内
 *     // @Past 被注释的元素必须是一个过去的日期
 *     // @Future 被注释的元素必须是一个将来的日期
 *     // @Pattern(regex=,flag=) 被注释的元素必须符合指定的正则表达式
 *     //
 *     // Hibernate Validator提供的校验注解：
 *     // @NotBlank(message =)   只能作用在String上，不能为null，而且调用trim()后，长度必须大于0
 *     // @Email 被注释的元素必须是电子邮箱地址
 *     // @Length(min=,max=) 被注释的字符串的大小必须在指定的范围内
 *     // @NotEmpty 被注释的字符串的必须非空，不能为 null、"",可以为 " "
 *     // @Range(min=,max=,message=) 被注释的元素必须在合适的范围内
 *     private String userName;
 *
 *     ...  // getters and setters
 * }
 */
public class Serializer {
}
