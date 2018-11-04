package com.starocto.rpctest.testmain;

import com.starocto.dao.api.service.WeiboQueryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author : zjx@.com
 * Date   : 2018/11/4
 * Time   : 10:20
 * ---------------------------------------
 * Desc   :
 */
public class TestRpc {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dao-api.xml");
        WeiboQueryService weiboQueryServiceImpl = (WeiboQueryService) context.getBean("weiboQueryServiceImpl");
        System.out.println(weiboQueryServiceImpl.queryUserRegisterInfo("fuermoxun"));
        System.out.println(weiboQueryServiceImpl.queryUserInfo(1));
        System.out.println(weiboQueryServiceImpl.queryUserOthers(1));
        System.out.println(weiboQueryServiceImpl.queryUserFollow(1));
        System.out.println(weiboQueryServiceImpl.queryFans(2));
        System.out.println(weiboQueryServiceImpl.queryBlogInfo(1));
        System.out.println(weiboQueryServiceImpl.queryBlogCount(1));
        System.out.println(weiboQueryServiceImpl.queryCommentToBlog(1));
    }
}
