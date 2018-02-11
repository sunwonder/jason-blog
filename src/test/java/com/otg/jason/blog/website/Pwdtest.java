package com.otg.jason.blog.website;

import com.otg.jason.blog.website.modal.Vo.UserVo;
import com.otg.jason.blog.website.utils.TaleUtils;

/**
 * Created by 13 on 2017/4/2.
 */
public class Pwdtest {
    public static void main(String args[]){
        UserVo user = new UserVo();
        user.setUsername("admin");
        user.setPassword("J9lew2irojE23");
        String encodePwd = TaleUtils.MD5encode(user.getUsername() + user.getPassword());
        System.out.println(encodePwd);
    }
}
