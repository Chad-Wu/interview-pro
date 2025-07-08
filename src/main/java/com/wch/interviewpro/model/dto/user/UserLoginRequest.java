package com.wch.interviewpro.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户登录请求
 *
 * @author <a href="https://github.com/Chad-Wu">chonghe</a>
 * @from <a href="https://github.com/Chad-Wu">chonghe</a>
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userAccount;

    private String userPassword;
}
