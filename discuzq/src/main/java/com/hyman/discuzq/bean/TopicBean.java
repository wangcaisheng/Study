package com.hyman.discuzq.bean;

import com.arch.demo.network_api.beans.BaseResponse;

import java.util.List;

/**
 * @author: Hyman
 * time: 2020/7/23 下午3:44
 * des: 首页Tab下数据包装类
 */
public class TopicBean extends BaseResponse {

    /**
     * links : {"first":"https://discuz.chat/api/threads?categoryId=1","next":"https://discuz.chat/api/threads?categoryId=1&page%5Boffset%5D=20","last":"https://discuz.chat/api/threads?categoryId=1&page%5Boffset%5D=4960"}
     * data : [{"type":"threads","id":"5797","attributes":{"type":1,"title":"Discuz! Q RC v1.0.200723","price":"0.00","freeWords":0,"viewCount":424,"postCount":13,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T13:09:06+08:00","updatedAt":"2020-07-23T15:29:01+08:00","isApproved":1,"isSticky":true,"isEssence":true,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"2"}},"firstPost":{"data":{"type":"posts","id":"14680"}},"lastPostedUser":{"data":{"type":"users","id":"5951"}},"category":{"data":{"type":"categories","id":"6"}}}},{"type":"threads","id":"4740","attributes":{"type":1,"title":"Discuz! Q 常见问题 QA","price":"0.00","freeWords":0,"viewCount":2014,"postCount":12,"paidCount":0,"rewardedCount":6,"createdAt":"2020-07-08T20:00:21+08:00","updatedAt":"2020-07-23T14:02:23+08:00","isApproved":1,"isSticky":true,"isEssence":true,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"2"}},"firstPost":{"data":{"type":"posts","id":"12402"}},"lastPostedUser":{"data":{"type":"users","id":"2"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"561","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":17125,"postCount":127,"paidCount":0,"rewardedCount":25,"createdAt":"2020-02-11T13:54:23+08:00","updatedAt":"2020-07-23T14:03:00+08:00","isApproved":1,"isSticky":true,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"19"}},"firstPost":{"data":{"type":"posts","id":"1401"}},"lastPostedUser":{"data":{"type":"users","id":"12942"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5809","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":4,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T15:32:05+08:00","updatedAt":"2020-07-23T15:32:06+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"13424"}},"firstPost":{"data":{"type":"posts","id":"14718"}},"lastPostedUser":{"data":{"type":"users","id":"13424"}},"category":{"data":{"type":"categories","id":"3"}}}},{"type":"threads","id":"5807","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":32,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T15:12:45+08:00","updatedAt":"2020-07-23T15:12:45+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"5665"}},"firstPost":{"data":{"type":"posts","id":"14712"}},"lastPostedUser":{"data":{"type":"users","id":"5665"}},"category":{"data":{"type":"categories","id":"2"}}}},{"type":"threads","id":"5806","attributes":{"type":3,"title":"","price":"2.00","freeWords":0,"viewCount":19,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T15:07:44+08:00","updatedAt":"2020-07-23T15:07:44+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"paid":false,"isPaid":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"8495"}},"firstPost":{"data":{"type":"posts","id":"14708"}},"lastPostedUser":{"data":{"type":"users","id":"8495"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5804","attributes":{"type":2,"title":"","price":"0.00","freeWords":0,"viewCount":5,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T14:58:43+08:00","updatedAt":"2020-07-23T14:58:51+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"5947"}},"firstPost":{"data":{"type":"posts","id":"14704"}},"threadVideo":{"data":{"type":"thread-video","id":"622"}},"lastPostedUser":{"data":{"type":"users","id":"5947"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5803","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":19,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T14:54:25+08:00","updatedAt":"2020-07-23T14:54:25+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"11801"}},"firstPost":{"data":{"type":"posts","id":"14700"}},"lastPostedUser":{"data":{"type":"users","id":"11801"}},"category":{"data":{"type":"categories","id":"3"}}}},{"type":"threads","id":"5802","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":48,"postCount":3,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T14:37:42+08:00","updatedAt":"2020-07-23T14:58:29+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"13019"}},"firstPost":{"data":{"type":"posts","id":"14691"}},"lastPostedUser":{"data":{"type":"users","id":"4470"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5801","attributes":{"type":1,"title":"两个功能需求一个疑似BUG","price":"0.00","freeWords":0,"viewCount":43,"postCount":2,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T14:08:18+08:00","updatedAt":"2020-07-23T14:10:26+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"1989"}},"firstPost":{"data":{"type":"posts","id":"14688"}},"lastPostedUser":{"data":{"type":"users","id":"8599"}},"category":{"data":{"type":"categories","id":"2"}}}},{"type":"threads","id":"5800","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":47,"postCount":3,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T13:55:46+08:00","updatedAt":"2020-07-23T15:34:30+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"5120"}},"firstPost":{"data":{"type":"posts","id":"14687"}},"lastPostedUser":{"data":{"type":"users","id":"1149"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5799","attributes":{"type":1,"title":"title","price":"0.00","freeWords":0,"viewCount":28,"postCount":2,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T13:49:48+08:00","updatedAt":"2020-07-23T13:50:18+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"13373"}},"firstPost":{"data":{"type":"posts","id":"14685"}},"lastPostedUser":{"data":{"type":"users","id":"13373"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5798","attributes":{"type":1,"title":"测试","price":"5.00","freeWords":20,"viewCount":21,"postCount":2,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T13:38:13+08:00","updatedAt":"2020-07-23T13:38:48+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"paid":false,"isPaid":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"13394"}},"firstPost":{"data":{"type":"posts","id":"14683"}},"lastPostedUser":{"data":{"type":"users","id":"13394"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"5796","attributes":{"type":3,"title":"","price":"0.00","freeWords":0,"viewCount":25,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T12:24:57+08:00","updatedAt":"2020-07-23T12:24:57+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"2928"}},"firstPost":{"data":{"type":"posts","id":"14679"}},"lastPostedUser":{"data":{"type":"users","id":"2928"}},"category":{"data":{"type":"categories","id":"2"}}}},{"type":"threads","id":"5795","attributes":{"type":3,"title":"","price":"0.00","freeWords":0,"viewCount":31,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T11:51:40+08:00","updatedAt":"2020-07-23T11:51:40+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"2928"}},"firstPost":{"data":{"type":"posts","id":"14676"}},"lastPostedUser":{"data":{"type":"users","id":"2928"}},"category":{"data":{"type":"categories","id":"2"}}}},{"type":"threads","id":"5794","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":11,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T11:49:54+08:00","updatedAt":"2020-07-23T11:49:54+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"8793"}},"firstPost":{"data":{"type":"posts","id":"14675"}},"lastPostedUser":{"data":{"type":"users","id":"8793"}},"category":{"data":{"type":"categories","id":"3"}}}},{"type":"threads","id":"5793","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":32,"postCount":3,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T11:36:06+08:00","updatedAt":"2020-07-23T14:11:50+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"8330"}},"firstPost":{"data":{"type":"posts","id":"14674"}},"lastPostedUser":{"data":{"type":"users","id":"6375"}},"category":{"data":{"type":"categories","id":"2"}}}},{"type":"threads","id":"5792","attributes":{"type":1,"title":"腾讯","price":"0.00","freeWords":0,"viewCount":34,"postCount":2,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T11:27:10+08:00","updatedAt":"2020-07-23T11:28:14+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"13373"}},"firstPost":{"data":{"type":"posts","id":"14672"}},"lastPostedUser":{"data":{"type":"users","id":"13373"}},"category":{"data":{"type":"categories","id":"2"}}}},{"type":"threads","id":"5791","attributes":{"type":3,"title":"","price":"0.00","freeWords":0,"viewCount":26,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T11:16:44+08:00","updatedAt":"2020-07-23T11:16:44+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"1171"}},"firstPost":{"data":{"type":"posts","id":"14669"}},"lastPostedUser":{"data":{"type":"users","id":"1171"}},"category":{"data":{"type":"categories","id":"3"}}}},{"type":"threads","id":"5790","attributes":{"type":0,"title":"","price":"0.00","freeWords":0,"viewCount":5,"postCount":1,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T10:58:42+08:00","updatedAt":"2020-07-23T10:58:42+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false},"relationships":{"user":{"data":{"type":"users","id":"5555"}},"firstPost":{"data":{"type":"posts","id":"14666"}},"lastPostedUser":{"data":{"type":"users","id":"5555"}},"category":{"data":{"type":"categories","id":"2"}}}}]
     * included : [{"type":"users","id":"2","attributes":{"id":2,"username":"猛子","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/2.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D48b29e7c500dc4d4517868352c131155cf2187f2","isReal":false,"threadCount":19,"followCount":6,"fansCount":58,"likedCount":79,"signature":"个性签名","usernameBout":0,"status":0,"loginAt":"2020-07-23T13:51:12+08:00","joinedAt":"2020-01-20T20:20:35+08:00","expiredAt":"2021-01-25T18:29:38+08:00","createdAt":"2020-01-20T20:20:35+08:00","updatedAt":"2020-07-23T14:53:50+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"5951","attributes":{"id":5951,"username":"网友c1Zo6P","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/5951.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D1add489ddbfbee5f2fb036ecd2bee8de1237d343","isReal":false,"threadCount":2,"followCount":2,"fansCount":0,"likedCount":9,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-20T14:16:22+08:00","joinedAt":"2020-04-30T21:55:13+08:00","expiredAt":null,"createdAt":"2020-04-30T21:55:13+08:00","updatedAt":"2020-07-23T15:29:09+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"19","attributes":{"id":19,"username":"小虫","avatarUrl":"https://discuz.chat/storage/avatars/19.png?1582120410","isReal":false,"threadCount":8,"followCount":5,"fansCount":41,"likedCount":46,"signature":"你问我要去向何方，我指着大海的方向","usernameBout":0,"status":0,"loginAt":"2020-07-22T01:51:15+08:00","joinedAt":"2020-01-24T17:10:37+08:00","expiredAt":null,"createdAt":"2020-01-24T17:10:37+08:00","updatedAt":"2020-07-22T15:08:46+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"12942","attributes":{"id":12942,"username":"孙立彬","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/01/29/42.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Dd09f2298f7beb10b15a6122a0e5ac96092fc71ed","isReal":false,"threadCount":1,"followCount":1,"fansCount":0,"likedCount":0,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-21T12:50:05+08:00","joinedAt":"2020-07-21T09:25:32+08:00","expiredAt":null,"createdAt":"2020-07-21T09:25:32+08:00","updatedAt":"2020-07-21T12:51:02+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"13424","attributes":{"id":13424,"username":"哈ni","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/01/34/24.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Dd51362ef833e14b303df3e0d6a4b2d60e4237fe2","isReal":false,"threadCount":1,"followCount":0,"fansCount":0,"likedCount":0,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T15:30:18+08:00","joinedAt":"2020-07-23T15:30:17+08:00","expiredAt":null,"createdAt":"2020-07-23T15:30:17+08:00","updatedAt":"2020-07-23T15:34:43+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"5665","attributes":{"id":5665,"username":"yf3052","avatarUrl":"","isReal":false,"threadCount":2,"followCount":0,"fansCount":0,"likedCount":1,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-17T09:19:05+08:00","joinedAt":"2020-04-21T23:03:53+08:00","expiredAt":null,"createdAt":"2020-04-21T23:03:54+08:00","updatedAt":"2020-07-23T15:13:00+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"8495","attributes":{"id":8495,"username":"陈选龙","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/8495.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Dd36300913a639a4c6cffa8dd5df3906724ff9bbf","isReal":false,"threadCount":2,"followCount":0,"fansCount":0,"likedCount":0,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-18T17:38:07+08:00","joinedAt":"2020-06-17T22:30:39+08:00","expiredAt":null,"createdAt":"2020-06-17T22:30:39+08:00","updatedAt":"2020-07-23T15:07:45+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"5947","attributes":{"id":5947,"username":"网友OOnHIG","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/5947.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Daac373e72e88fb74189c75dd52b3759174faeb76","isReal":false,"threadCount":8,"followCount":0,"fansCount":2,"likedCount":4,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-17T09:40:22+08:00","joinedAt":"2020-04-30T20:59:41+08:00","expiredAt":null,"createdAt":"2020-04-30T20:59:41+08:00","updatedAt":"2020-07-23T15:01:54+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"11801","attributes":{"id":11801,"username":"longdu","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/01/18/01.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D7c331ced1252e66e6311c7e9bb60b6f377b69150","isReal":false,"threadCount":8,"followCount":0,"fansCount":1,"likedCount":4,"signature":"","usernameBout":1,"status":0,"loginAt":"2020-07-22T10:27:34+08:00","joinedAt":"2020-07-17T06:50:47+08:00","expiredAt":null,"createdAt":"2020-07-17T06:50:47+08:00","updatedAt":"2020-07-23T15:35:26+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":false}},{"type":"users","id":"13019","attributes":{"id":13019,"username":"@Gordo","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/01/30/19.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D0452ab6d42bdc9748bbf37087378b4f8cb99bd16","isReal":false,"threadCount":3,"followCount":0,"fansCount":0,"likedCount":1,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T15:26:56+08:00","joinedAt":"2020-07-21T13:52:10+08:00","expiredAt":null,"createdAt":"2020-07-21T13:52:10+08:00","updatedAt":"2020-07-23T15:32:16+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"4470","attributes":{"id":4470,"username":"Liwei","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/4470.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Dbad15f5b12c4f8472d68791b146e2d8cc258c716","isReal":false,"threadCount":6,"followCount":0,"fansCount":1,"likedCount":9,"signature":"Hello World","usernameBout":1,"status":0,"loginAt":"2020-07-23T14:56:41+08:00","joinedAt":"2020-03-23T23:59:00+08:00","expiredAt":null,"createdAt":"2020-03-23T23:59:00+08:00","updatedAt":"2020-07-23T15:00:10+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":false}},{"type":"users","id":"1989","attributes":{"id":1989,"username":"sixbb","avatarUrl":"","isReal":false,"threadCount":7,"followCount":0,"fansCount":0,"likedCount":0,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T14:03:33+08:00","joinedAt":"2020-02-24T17:29:19+08:00","expiredAt":null,"createdAt":"2020-02-24T17:29:19+08:00","updatedAt":"2020-07-23T14:09:58+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"8599","attributes":{"id":8599,"username":"屹","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/8599.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D9b88a343c634d43816ae4a70ca37ec4caf7b6e43","isReal":false,"threadCount":1,"followCount":1,"fansCount":0,"likedCount":6,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-22T21:05:29+08:00","joinedAt":"2020-06-19T21:23:18+08:00","expiredAt":null,"createdAt":"2020-06-19T21:23:18+08:00","updatedAt":"2020-07-23T15:21:00+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"5120","attributes":{"id":5120,"username":"jlalei","avatarUrl":"","isReal":false,"threadCount":3,"followCount":0,"fansCount":0,"likedCount":0,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T13:40:27+08:00","joinedAt":"2020-04-05T08:00:08+08:00","expiredAt":null,"createdAt":"2020-04-05T08:00:08+08:00","updatedAt":"2020-07-23T14:59:02+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"1149","attributes":{"id":1149,"username":"lihongyu","avatarUrl":"https://discuz.chat/storage/avatars/1149.png?1582189589","isReal":false,"threadCount":11,"followCount":1,"fansCount":1,"likedCount":49,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T14:58:57+08:00","joinedAt":"2020-02-10T21:53:52+08:00","expiredAt":null,"createdAt":"2020-02-10T21:53:52+08:00","updatedAt":"2020-07-23T15:34:30+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"13373","attributes":{"id":13373,"username":"baiachen@126.co","avatarUrl":"","isReal":false,"threadCount":2,"followCount":0,"fansCount":0,"likedCount":0,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T14:13:00+08:00","joinedAt":"2020-07-23T10:18:09+08:00","expiredAt":null,"createdAt":"2020-07-23T10:18:09+08:00","updatedAt":"2020-07-23T14:13:25+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"13394","attributes":{"id":13394,"username":"郑文庭","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/01/33/94.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Daac92e96d642947eb78822b8897b801a57eca2f8","isReal":false,"threadCount":1,"followCount":0,"fansCount":0,"likedCount":1,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T12:21:50+08:00","joinedAt":"2020-07-23T12:21:49+08:00","expiredAt":null,"createdAt":"2020-07-23T12:21:49+08:00","updatedAt":"2020-07-23T13:56:44+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"2928","attributes":{"id":2928,"username":"RoboMentor","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/00/29/28.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D72af8fd13b71f2301a73226790b06933b2ac2646","isReal":false,"threadCount":8,"followCount":0,"fansCount":3,"likedCount":5,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-20T21:44:23+08:00","joinedAt":"2020-03-15T23:39:10+08:00","expiredAt":null,"createdAt":"2020-03-15T23:39:10+08:00","updatedAt":"2020-07-23T13:21:17+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"8793","attributes":{"id":8793,"username":"是我🐋","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/8793.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Df665abc837448a12787dd8166505fba1e16695fa","isReal":false,"threadCount":3,"followCount":0,"fansCount":0,"likedCount":3,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T11:23:11+08:00","joinedAt":"2020-06-21T13:08:12+08:00","expiredAt":null,"createdAt":"2020-06-21T13:08:12+08:00","updatedAt":"2020-07-23T15:25:25+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"8330","attributes":{"id":8330,"username":"姚斌","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/8330.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D43a3495d7b6a04f9a9b4cfde9cf0442e73bf97ed","isReal":false,"threadCount":14,"followCount":1,"fansCount":1,"likedCount":4,"signature":"请留言","usernameBout":0,"status":0,"loginAt":"2020-07-23T15:32:11+08:00","joinedAt":"2020-06-16T00:21:57+08:00","expiredAt":null,"createdAt":"2020-06-16T00:21:57+08:00","updatedAt":"2020-07-23T15:32:11+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"6375","attributes":{"id":6375,"username":"网友q3emf8","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/6375.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D72f31ba66a6b25d691a459cc5537f076144ab5cc","isReal":false,"threadCount":3,"followCount":1,"fansCount":0,"likedCount":11,"signature":"","usernameBout":0,"status":0,"loginAt":"2020-07-23T14:10:10+08:00","joinedAt":"2020-05-09T05:39:30+08:00","expiredAt":null,"createdAt":"2020-05-09T05:39:30+08:00","updatedAt":"2020-07-23T15:22:46+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"1171","attributes":{"id":1171,"username":"5zhetian","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/000/00/11/71.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D06b850497133a6bd577b054cfeb25e2d4eda6795","isReal":false,"threadCount":6,"followCount":2,"fansCount":0,"likedCount":4,"signature":"物华天宝。","usernameBout":0,"status":0,"loginAt":"2020-07-15T21:48:36+08:00","joinedAt":"2020-02-10T23:26:41+08:00","expiredAt":null,"createdAt":"2020-02-10T23:26:42+08:00","updatedAt":"2020-07-23T12:25:07+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"users","id":"5555","attributes":{"id":5555,"username":"fromsly","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/5555.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3Ddb04498eb86662118273b0194a1adfd1d08b1c53","isReal":false,"threadCount":61,"followCount":4,"fansCount":3,"likedCount":4,"signature":"爆废APP创始人CEO","usernameBout":0,"status":0,"loginAt":"2020-07-18T15:11:58+08:00","joinedAt":"2020-04-17T14:57:11+08:00","expiredAt":null,"createdAt":"2020-04-17T14:57:11+08:00","updatedAt":"2020-07-23T14:49:18+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}},{"type":"posts","id":"14680","attributes":{"replyUserId":null,"summary":"本次版本基于上一版v1.0.200715修复与优化了部分问题，感谢各位提供的建议，具体如下：\n\n - 调整页面文字大小，整体增加2rpx\n - 优化H5端头部背...","summaryText":"本次版本基于上一版v1.0.200715修复与优化了部分问题，感谢各位提供的建议，具体如下：\n\n 调整页面文字大小，整体增加2rpx\n 优化H5端头部背景图占比...","content":"本次版本基于上一版v1.0.200715修复与优化了部分问题，感谢各位提供的建议，具体如下：\n\n - 调整页面文字大小，整体增加2rpx\n - 优化H5端头部背景图占比\n - 优化首页置顶帖及帖子列表区域展示效果\n - 优化首页底部功能按钮，缩小区域占比\n - 内容详情页增加作者信息右侧增加关注按钮\n - 内容详情页评论增加正序/倒序排序功能\n - 修复开启注册审核后，H5下没有正确弹出提示的问题\n - 修复钱包明细中帖子没有展示标题的问题\n - 优化H5端头部导航栏展示效果\n - 修复用户组添加了管理-邀请加入权限后，前台无法生成邀请链接的问题\n - 修复评论回复中表情没有正确解析的问题\n - 修复个人主页点赞页删除帖子后，点赞数未改变的问题\n - 优化实名认证及短信关闭逻辑，关闭该服务后同时关闭对应的权限设置项\n - 后台站点设置中，上传图片区域增加图片推荐大小注释\n - 修复通过分享进入详情页并登录成功后，点击评论提示没有权限的问题\n - 修复微信内H5，管理员生成的分享链接无法点击分享的问题\n - H5下备案信息增加工信部网站链接\n - 开启cos后，站点设置中站点logo、头部背景图等也同步上传到cos**（若目前已开启cos，需重新上传一次站点logo、头部背景图等）**\n - 优化未开启微信支付时，不可配置付费模式\n - 审核中的内容，禁止在小程序中生成海报\n - 优化部分样式细节\n\n\n\n**Discuz! Q 新品发布活动开启，参与网址：**\n[https://cloud.tencent.com/act/event/discuzq\n](https://cloud.tencent.com/act/event/discuzq)\n\n\n**历史更新动态：**\n[Discuz! Q RC v1.0.200715](https://discuz.chat/pages/topic/index?id=5028)\n[Discuz! Q Beta v1.0.200710](https://discuz.chat/pages/topic/index?id=4798)\n[Discuz! Q Beta v1.0.200707](https://discuz.chat/pages/topic/index?id=4660)\n[Discuz! Q Beta v1.0.200705](https://discuz.chat/pages/topic/index?id=4531)\n[Discuz! Q Beta v1.0.200703](https://discuz.chat/pages/topic/index?id=4195)\n[Discuz! Q alpha v0.5.200522](https://discuz.chat/pages/topic/index?id=2837)\n[Discuz! Q alpha v0.5.200508](https://discuz.chat/pages/topic/index?id=2646)\n[Discuz! Q alpha v0.5.200424](https://discuz.chat/pages/topic/index?id=2457)\n[Discuz! Q alpha v0.5.200410](https://discuz.chat/pages/topic/index?id=2234)\n[Discuz! Q alpha v0.5.200403](https://discuz.chat/pages/topic/index?id=2122)\n[Discuz! Q alpha v0.4.200331](https://discuz.chat/pages/topic/index?id=2037)\n[Discuz! Q alpha v0.3.200327](https://discuz.chat/pages/topic/index?id=1938)\n[Discuz! Q alpha v0.3.200319](https://discuz.chat/pages/topic/index?id=1693)\n[Discuz! Q alpha v0.3.200318](https://discuz.chat/pages/topic/index?id=1643)\n[Discuz! Q alpha v0.3.200317](https://discuz.chat/pages/topic/index?id=1617)\n[Discuz! Q alpha v0.3.200315](https://discuz.chat/pages/topic/index?id=1309)\n[Discuz! Q alpha v0.2.200305](https://discuz.chat/pages/topic/index?id=1059)\n\n\n**升级与安装文档：**\n[安装方案](https://discuz.com/docs/install.html)\n[升级方案](https://discuz.com/docs/upgrade.html)\n[安装常见问题](https://discuz.com/docs/install_faq.html)\n\n\n**相关文档：**\n[使用手册、API文档、数据库字典](https://discuz.com/docs/docs.html)\n\n\n\n\n","contentHtml":"<p>本次版本基于上一版v1.0.200715修复与优化了部分问题，感谢各位提供的建议，具体如下：<\/p>\n\n <ul><li>调整页面文字大小，整体增加2rpx<\/li>\n <li>优化H5端头部背景图占比<\/li>\n <li>优化首页置顶帖及帖子列表区域展示效果<\/li>\n <li>优化首页底部功能按钮，缩小区域占比<\/li>\n <li>内容详情页增加作者信息右侧增加关注按钮<\/li>\n <li>内容详情页评论增加正序/倒序排序功能<\/li>\n <li>修复开启注册审核后，H5下没有正确弹出提示的问题<\/li>\n <li>修复钱包明细中帖子没有展示标题的问题<\/li>\n <li>优化H5端头部导航栏展示效果<\/li>\n <li>修复用户组添加了管理-邀请加入权限后，前台无法生成邀请链接的问题<\/li>\n <li>修复评论回复中表情没有正确解析的问题<\/li>\n <li>修复个人主页点赞页删除帖子后，点赞数未改变的问题<\/li>\n <li>优化实名认证及短信关闭逻辑，关闭该服务后同时关闭对应的权限设置项<\/li>\n <li>后台站点设置中，上传图片区域增加图片推荐大小注释<\/li>\n <li>修复通过分享进入详情页并登录成功后，点击评论提示没有权限的问题<\/li>\n <li>修复微信内H5，管理员生成的分享链接无法点击分享的问题<\/li>\n <li>H5下备案信息增加工信部网站链接<\/li>\n <li>开启cos后，站点设置中站点logo、头部背景图等也同步上传到cos<strong>（若目前已开启cos，需重新上传一次站点logo、头部背景图等）<\/strong><\/li>\n <li>优化未开启微信支付时，不可配置付费模式<\/li>\n <li>审核中的内容，禁止在小程序中生成海报<\/li>\n <li>优化部分样式细节<\/li><\/ul>\n\n\n\n<p><strong>Discuz! Q 新品发布活动开启，参与网址：<\/strong><br>\n<a href=\"https://cloud.tencent.com/act/event/discuzq\">https://cloud.tencent.com/act/event/discuzq<br>\n<\/a><\/p>\n\n\n<p><strong>历史更新动态：<\/strong><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=5028\">Discuz! Q RC v1.0.200715<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=4798\">Discuz! Q Beta v1.0.200710<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=4660\">Discuz! Q Beta v1.0.200707<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=4531\">Discuz! Q Beta v1.0.200705<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=4195\">Discuz! Q Beta v1.0.200703<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=2837\">Discuz! Q alpha v0.5.200522<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=2646\">Discuz! Q alpha v0.5.200508<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=2457\">Discuz! Q alpha v0.5.200424<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=2234\">Discuz! Q alpha v0.5.200410<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=2122\">Discuz! Q alpha v0.5.200403<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=2037\">Discuz! Q alpha v0.4.200331<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=1938\">Discuz! Q alpha v0.3.200327<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=1693\">Discuz! Q alpha v0.3.200319<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=1643\">Discuz! Q alpha v0.3.200318<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=1617\">Discuz! Q alpha v0.3.200317<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=1309\">Discuz! Q alpha v0.3.200315<\/a><br>\n<a href=\"https://discuz.chat/pages/topic/index?id=1059\">Discuz! Q alpha v0.2.200305<\/a><\/p>\n\n\n<p><strong>升级与安装文档：<\/strong><br>\n<a href=\"https://discuz.com/docs/install.html\">安装方案<\/a><br>\n<a href=\"https://discuz.com/docs/upgrade.html\">升级方案<\/a><br>\n<a href=\"https://discuz.com/docs/install_faq.html\">安装常见问题<\/a><\/p>\n\n\n<p><strong>相关文档：<\/strong><br>\n<a href=\"https://discuz.com/docs/docs.html\">使用手册、API文档、数据库字典<\/a><\/p>\n\n\n\n\n","replyCount":0,"likeCount":11,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T13:09:06+08:00","updatedAt":"2020-07-23T14:43:36+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"12402","attributes":{"replyUserId":null,"summary":"\n&gt;**[Q]** 小程序支付时提示：appid和mch_id不匹配\n**[A]** 小程序和微信支付没有进行关联，访问\u201c小程序管理后台-微信支付\u201d，进行关联即...","summaryText":"\n[Q] 小程序支付时提示：appid和mch_id不匹配\n[A] 小程序和微信支付没有进行关联，访问\u201c小程序管理后台-微信支付\u201d，进行关联即可\n\n\n[Q] 小...","content":"\n>**[Q]** 小程序支付时提示：appid和mch_id不匹配\n**[A]** 小程序和微信支付没有进行关联，访问\u201c小程序管理后台-微信支付\u201d，进行关联即可\n\n\n>**[Q]** 小程序编译后请求的是discuz.chat的数据\n**[A]** 编辑小程序源码包根目录的 .env.development 和 .env.production 文件，将其中的域名replace\n\n\n>**[Q]** 微信内访问提示：core.Request access_token fail:{\"errcide\":40164,\"errmsg\":\"invalid ip ** ipv6 ::ffff:**, not in whitelist hint:[nKddDkn-IngeLA]\"}\n**[A]** 访问\u201c公众号管理后台-开发-基本配置\u201d，在\u201c公众号开发信息\u201d下面的\u201cIP白名单\u201d中增加当前网站服务器的IP\n\n\n>**[Q]** 小程序访问提示：core.Request access_token fail:{\"errcide\":41002,\"errmsg\":\"appid missing hints:[rKddtyPce-tB3G5a!]\"}\n**[A]** 访问Discuz! Q后台，在\u201c全局-微信设置-小程序配置\u201d中配置下\u201cAPPID\u201d和\u201cApp secret\u201d，然后开启即可\n\n\n>**[Q]** H5访问提示：core.Request access_token fail: {\"errcode\":40125,\"errmsg\":\"invalid appsecret, view more at http:\\/\\/t.cn\\/RAEkdVq hint: [4jGdm37FE-HrdXXa]\"}\n**[A]** 访问Discuz! Q后台，在\u201c全局-微信设置-公众号接口配置\u201d中配置下\u201cAPPID\u201d和\u201cApp secret\u201d，然后开启即可，如果开启有依然有问题，尝试去公众号后台重置下\u201cApp secret\u201d\n\n\n>**[Q]** 小程序访问提示：request：fail\n**[A]** 访问\u201c小程序管理后台-开发-开发设置\u201d，在\u201c服务器域名\u201d下面的\u201crequest合法域名\u201d中填写当前网站URL\n\n\n>**[Q]** 更改域名后，图片表情等文件依然是旧域名地址时，或话题无法解析时，怎么处理？\n**[A]** 删除storage/cache/data目录下以及storage/formatter目录下的缓存文件\n\n\n>**[Q]** 在微信内进行支付时提示：当前页面的URL未注册:URL地址\n**[A]** 登录微信商户平台，在\u201c产品中心-开发配置\u201d中配置下JSAPI支付和H5支付的域名\n\n\n>**[Q]** 在微信内进行支付时提示：签名错误\n**[A]** 登录微信商户平台，使用\u201c账户中心-API安全-API密钥\u201d，配置\u201c后台-支付设置-微信支付\u201d里的APIKEY\n\n\n>**[Q]** 发帖时提示\u201c未开通权限\u201d\n**[A]** 检查下是否开启了\u201c腾讯云-文本内容安全\u201d、\u201c腾讯云-图片内容安全\u201d，但是并没有实际开通此服务，关闭即可\n\n\n>**[Q]** 微信内访问提示：redirect_uri域名与后台配置不一致，错误码:10003\n**[A]** 访问\u201c公众号管理后台-开发-接口权限\n-网页授权\u201d，修改网页授权，增加当前网站的域名\n\n`**注：所有填域名的地方一定要小写**`\n\n---\n\n未完待续\n\n","contentHtml":"\n<blockquote><p><strong>[Q]<\/strong> 小程序支付时提示：appid和mch_id不匹配<br>\n<strong>[A]<\/strong> 小程序和微信支付没有进行关联，访问\u201c小程序管理后台-微信支付\u201d，进行关联即可<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 小程序编译后请求的是discuz.chat的数据<br>\n<strong>[A]<\/strong> 编辑小程序源码包根目录的 .env.development 和 .env.production 文件，将其中的域名replace<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 微信内访问提示：core.Request access_token fail:{\"errcide\":40164,\"errmsg\":\"invalid ip ** ipv6 ::ffff:**, not in whitelist hint:[nKddDkn-IngeLA]\"}<br>\n<strong>[A]<\/strong> 访问\u201c公众号管理后台-开发-基本配置\u201d，在\u201c公众号开发信息\u201d下面的\u201cIP白名单\u201d中增加当前网站服务器的IP<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 小程序访问提示：core.Request access_token fail:{\"errcide\":41002,\"errmsg\":\"appid missing hints:[rKddtyPce-tB3G5a!]\"}<br>\n<strong>[A]<\/strong> 访问Discuz! Q后台，在\u201c全局-微信设置-小程序配置\u201d中配置下\u201cAPPID\u201d和\u201cApp secret\u201d，然后开启即可<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> H5访问提示：core.Request access_token fail: {\"errcode\":40125,\"errmsg\":\"invalid appsecret, view more at http:\\/\\/t.cn\\/RAEkdVq hint: [4jGdm37FE-HrdXXa]\"}<br>\n<strong>[A]<\/strong> 访问Discuz! Q后台，在\u201c全局-微信设置-公众号接口配置\u201d中配置下\u201cAPPID\u201d和\u201cApp secret\u201d，然后开启即可，如果开启有依然有问题，尝试去公众号后台重置下\u201cApp secret\u201d<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 小程序访问提示：request：fail<br>\n<strong>[A]<\/strong> 访问\u201c小程序管理后台-开发-开发设置\u201d，在\u201c服务器域名\u201d下面的\u201crequest合法域名\u201d中填写当前网站URL<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 更改域名后，图片表情等文件依然是旧域名地址时，或话题无法解析时，怎么处理？<br>\n<strong>[A]<\/strong> 删除storage/cache/data目录下以及storage/formatter目录下的缓存文件<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 在微信内进行支付时提示：当前页面的URL未注册:URL地址<br>\n<strong>[A]<\/strong> 登录微信商户平台，在\u201c产品中心-开发配置\u201d中配置下JSAPI支付和H5支付的域名<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 在微信内进行支付时提示：签名错误<br>\n<strong>[A]<\/strong> 登录微信商户平台，使用\u201c账户中心-API安全-API密钥\u201d，配置\u201c后台-支付设置-微信支付\u201d里的APIKEY<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 发帖时提示\u201c未开通权限\u201d<br>\n<strong>[A]<\/strong> 检查下是否开启了\u201c腾讯云-文本内容安全\u201d、\u201c腾讯云-图片内容安全\u201d，但是并没有实际开通此服务，关闭即可<\/p><\/blockquote>\n\n\n<blockquote><p><strong>[Q]<\/strong> 微信内访问提示：redirect_uri域名与后台配置不一致，错误码:10003<br>\n<strong>[A]<\/strong> 访问\u201c公众号管理后台-开发-接口权限<br>\n-网页授权\u201d，修改网页授权，增加当前网站的域名<\/p><\/blockquote>\n\n<p><code>**注：所有填域名的地方一定要小写**<\/code><\/p>\n\n<hr>\n\n<p>未完待续<\/p>\n\n","replyCount":0,"likeCount":36,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-08T20:00:21+08:00","updatedAt":"2020-07-21T16:45:37+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"1401","attributes":{"replyUserId":null,"summary":"1，官方微信群：扫码图1，加微信好友，拉入官方微信群(每隔1-2天不定时登录此微信号处理)\n\n2，官方公众号：扫码图2，或搜索公众号\" Discuz! \" 关注...","summaryText":"1，官方微信群：扫码图1，加微信好友，拉入官方微信群(每隔1-2天不定时登录此微信号处理)\n\n2，官方公众号：扫码图2，或搜索公众号\" Discuz! \" 关注...","content":"1，官方微信群：扫码图1，加微信好友，拉入官方微信群(每隔1-2天不定时登录此微信号处理)\n\n2，官方公众号：扫码图2，或搜索公众号\" Discuz! \" 关注，官方信息随时掌握(未来一些爆料，公众号独家放出)","contentHtml":"1，官方微信群：扫码图1，加微信好友，拉入官方微信群(每隔1-2天不定时登录此微信号处理)<br>\n<br>\n2，官方公众号：扫码图2，或搜索公众号\" Discuz! \" 关注，官方信息随时掌握(未来一些爆料，公众号独家放出)","replyCount":1,"likeCount":144,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-02-11T13:54:23+08:00","updatedAt":"2020-04-17T00:23:57+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14718","attributes":{"replyUserId":null,"summary":"嗯嗯","summaryText":"嗯嗯...","content":"嗯嗯","contentHtml":"嗯嗯","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T15:32:06+08:00","updatedAt":"2020-07-23T15:32:06+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14712","attributes":{"replyUserId":null,"summary":"发布\u201c帖子\u201d时，图片不能插入帖子内容中，只能作为附件显示在最后。","summaryText":"发布\u201c帖子\u201d时，图片不能插入帖子内容中，只能作为附件显示在最后。...","content":"发布\u201c帖子\u201d时，图片不能插入帖子内容中，只能作为附件显示在最后。","contentHtml":"发布\u201c帖子\u201d时，图片不能插入帖子内容中，只能作为附件显示在最后。","replyCount":0,"likeCount":2,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T15:12:45+08:00","updatedAt":"2020-07-23T15:12:45+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14708","attributes":{"replyUserId":null,"summary":"来试试！","summaryText":"来试试！...","content":"来试试！","contentHtml":"来试试！","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T15:07:44+08:00","updatedAt":"2020-07-23T15:07:44+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14704","attributes":{"replyUserId":null,"summary":"<span id=\"topic\" value=\"10\">#测试#<\/span>  图片","summaryText":"#测试#  图片...","content":"#测试#  图片","contentHtml":"<span id=\"topic\" value=\"10\">#测试#<\/span>  图片","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T14:58:43+08:00","updatedAt":"2020-07-23T14:58:51+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14700","attributes":{"replyUserId":null,"summary":"后台支付设置中的appid可以设置为小程序的appid吗，如果设置为小程序appid那么h5页面是不是就不能支付？h5和小程序能同时使用支付功能吗？ <span id=\"member\" value=\"19\">@小虫<\/span> @...","summaryText":"后台支付设置中的appid可以设置为小程序的appid吗，如果设置为小程序appid那么h5页面是不是就不能支付？h5和小程序能同时使用支付功能吗？ @小虫 @...","content":"后台支付设置中的appid可以设置为小程序的appid吗，如果设置为小程序appid那么h5页面是不是就不能支付？h5和小程序能同时使用支付功能吗？ @小虫 @猛子","contentHtml":"后台支付设置中的appid可以设置为小程序的appid吗，如果设置为小程序appid那么h5页面是不是就不能支付？h5和小程序能同时使用支付功能吗？ <span id=\"member\" value=\"19\">@小虫<\/span> <span id=\"member\" value=\"2\">@猛子<\/span>","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T14:54:25+08:00","updatedAt":"2020-07-23T14:54:25+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14691","attributes":{"replyUserId":null,"summary":"谁知道前端uniappp的源码在哪下载？install里面随PHP下载的前端是打包后的。","summaryText":"谁知道前端uniappp的源码在哪下载？install里面随PHP下载的前端是打包后的。...","content":"谁知道前端uniappp的源码在哪下载？install里面随PHP下载的前端是打包后的。","contentHtml":"谁知道前端uniappp的源码在哪下载？install里面随PHP下载的前端是打包后的。","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T14:37:42+08:00","updatedAt":"2020-07-23T14:37:42+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14688","attributes":{"replyUserId":null,"summary":"<p>疑似BUG\n敏感词导入后，出现重复情况，且不好覆盖：每一条都出现两个；<\/p>\n\n<p>两个功能需求：\n1.敏感词批量删除\n2.用户批量修改用户组<\/p>","summaryText":"疑似BUG\n敏感词导入后，出现重复情况，且不好覆盖：每一条都出现两个；\n\n两个功能需求：\n1.敏感词批量删除\n2.用户批量修改用户组...","content":"疑似BUG\n敏感词导入后，出现重复情况，且不好覆盖：每一条都出现两个；\n\n两个功能需求：\n1.敏感词批量删除\n2.用户批量修改用户组","contentHtml":"<p>疑似BUG<br>\n敏感词导入后，出现重复情况，且不好覆盖：每一条都出现两个；<\/p>\n\n<p>两个功能需求：<br>\n1.敏感词批量删除<br>\n2.用户批量修改用户组<\/p>","replyCount":0,"likeCount":1,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T14:08:18+08:00","updatedAt":"2020-07-23T14:08:18+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14687","attributes":{"replyUserId":null,"summary":"有人需要dzq做的仿微信，仿今日头条的app吗","summaryText":"有人需要dzq做的仿微信，仿今日头条的app吗...","content":"有人需要dzq做的仿微信，仿今日头条的app吗","contentHtml":"有人需要dzq做的仿微信，仿今日头条的app吗","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T13:55:46+08:00","updatedAt":"2020-07-23T13:55:46+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14685","attributes":{"replyUserId":null,"summary":"<p><code>PHP<\/code> 是世界上最好的演员<\/p>","summaryText":"PHP 是世界上最好的演员...","content":"`PHP` 是世界上最好的演员","contentHtml":"<p><code>PHP<\/code> 是世界上最好的演员<\/p>","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T13:49:48+08:00","updatedAt":"2020-07-23T13:49:48+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14683","attributes":{"replyUserId":null,"summary":"<p>啊啊啊啊啊啊咯破坏之王咯公共营养师姐们有...<\/p>","summaryText":"啊啊啊啊啊啊咯破坏之王咯公共营养师姐们有...","content":"啊啊啊啊啊啊咯破坏之王咯公共营养师姐们有...","contentHtml":"<p>啊啊啊啊啊啊咯破坏之王咯公共营养师姐们有...<\/p>","replyCount":0,"likeCount":1,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T13:38:13+08:00","updatedAt":"2020-07-23T13:38:13+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14679","attributes":{"replyUserId":null,"summary":"这又是个什么错呢？小程序登录接口。","summaryText":"这又是个什么错呢？小程序登录接口。...","content":"这又是个什么错呢？小程序登录接口。","contentHtml":"这又是个什么错呢？小程序登录接口。","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T12:24:57+08:00","updatedAt":"2020-07-23T12:24:57+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14676","attributes":{"replyUserId":null,"summary":"这个文档也错了，少了Api，另外请求一直报参数为空，表单提交、json提交都试了不行。","summaryText":"这个文档也错了，少了Api，另外请求一直报参数为空，表单提交、json提交都试了不行。...","content":"这个文档也错了，少了Api，另外请求一直报参数为空，表单提交、json提交都试了不行。","contentHtml":"这个文档也错了，少了Api，另外请求一直报参数为空，表单提交、json提交都试了不行。","replyCount":0,"likeCount":1,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T11:51:40+08:00","updatedAt":"2020-07-23T11:51:40+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14675","attributes":{"replyUserId":null,"summary":"什么时候才可以uniapp build APP-plus呢","summaryText":"什么时候才可以uniapp build APP-plus呢...","content":"什么时候才可以uniapp build APP-plus呢","contentHtml":"什么时候才可以uniapp build APP-plus呢","replyCount":0,"likeCount":1,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T11:49:54+08:00","updatedAt":"2020-07-23T11:49:54+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14674","attributes":{"replyUserId":null,"summary":"上传附件3M一下可以，大一点就一直转，也没反应。\n我后台设置500M\nPHP上传文件设置500M\nNginx 上传也设置500M","summaryText":"上传附件3M一下可以，大一点就一直转，也没反应。\n我后台设置500M\nPHP上传文件设置500M\nNginx 上传也设置500M...","content":"上传附件3M一下可以，大一点就一直转，也没反应。\n我后台设置500M\nPHP上传文件设置500M\nNginx 上传也设置500M","contentHtml":"上传附件3M一下可以，大一点就一直转，也没反应。<br>\n我后台设置500M<br>\nPHP上传文件设置500M<br>\nNginx 上传也设置500M","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T11:36:06+08:00","updatedAt":"2020-07-23T11:36:06+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14672","attributes":{"replyUserId":null,"summary":"<p><span id=\"topic\" value=\"63\">#腾讯#<\/span>  \n📎  如何上传<\/p>","summaryText":"#腾讯#  \n📎  如何上传...","content":"#腾讯#  \n📎  如何上传","contentHtml":"<p><span id=\"topic\" value=\"63\">#腾讯#<\/span>  <br>\n📎  如何上传<\/p>","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T11:27:10+08:00","updatedAt":"2020-07-23T11:27:10+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14669","attributes":{"replyUserId":null,"summary":"<span id=\"topic\" value=\"62\">#admindzq#<\/span>  欢迎各位dzq的admin到此交流互助。","summaryText":"#admindzq#  欢迎各位dzq的admin到此交流互助。...","content":"#admindzq#  欢迎各位dzq的admin到此交流互助。","contentHtml":"<span id=\"topic\" value=\"62\">#admindzq#<\/span>  欢迎各位dzq的admin到此交流互助。","replyCount":0,"likeCount":2,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T11:16:44+08:00","updatedAt":"2020-07-23T11:16:44+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"posts","id":"14666","attributes":{"replyUserId":null,"summary":"一个社交产品如果没有圈子功能，很难想象能在缤纷发达的移动互联网时代立足。<span id=\"member\" value=\"2\">@猛子<\/span> <span id=\"member\" value=\"19\">@小虫<\/span>","summaryText":"一个社交产品如果没有圈子功能，很难想象能在缤纷发达的移动互联网时代立足。@猛子 @小虫...","content":"一个社交产品如果没有圈子功能，很难想象能在缤纷发达的移动互联网时代立足。@猛子 @小虫","contentHtml":"一个社交产品如果没有圈子功能，很难想象能在缤纷发达的移动互联网时代立足。<span id=\"member\" value=\"2\">@猛子<\/span> <span id=\"member\" value=\"19\">@小虫<\/span>","replyCount":0,"likeCount":0,"longitude":"0.0000000","latitude":"0.0000000","createdAt":"2020-07-23T10:58:42+08:00","updatedAt":"2020-07-23T10:58:42+08:00","isApproved":1,"canEdit":false,"canApprove":false,"canDelete":false,"canHide":false,"isDeleted":false,"isFirst":true,"isComment":false,"canLike":true,"isLiked":false}},{"type":"categories","id":"6","attributes":{"name":"产品动态","description":"","icon":"","sort":5,"property":0,"thread_count":20,"ip":"111.198.224.157","created_at":"2020-03-05T22:06:24+08:00","updated_at":"2020-07-23T14:43:36+08:00","canViewThreads":true,"canCreateThread":false,"canReplyThread":false}},{"type":"categories","id":"1","attributes":{"name":"聊天","description":"默认分类","icon":"","sort":1,"property":0,"thread_count":3218,"ip":"127.0.0.1","created_at":"2020-01-20T15:03:44+08:00","updated_at":"2020-07-23T15:07:44+08:00","canViewThreads":true,"canCreateThread":false,"canReplyThread":false}},{"type":"categories","id":"3","attributes":{"name":"开发者","description":"","icon":"","sort":3,"property":0,"thread_count":320,"ip":"223.72.85.143","created_at":"2020-01-20T20:26:57+08:00","updated_at":"2020-07-23T15:32:06+08:00","canViewThreads":true,"canCreateThread":false,"canReplyThread":false}},{"type":"categories","id":"2","attributes":{"name":"Bug&建议","description":"","icon":"","sort":2,"property":0,"thread_count":1277,"ip":"223.72.85.143","created_at":"2020-01-20T20:26:47+08:00","updated_at":"2020-07-23T15:12:45+08:00","canViewThreads":true,"canCreateThread":false,"canReplyThread":false}},{"type":"thread-video","id":"622","attributes":{"user_id":5947,"thread_id":5804,"status":1,"reason":"","file_name":"c224d1cb6c24838d2ff436b41eebc7bd.mp4","file_id":"5285890805510217761","width":360,"height":640,"duration":"44.36","media_url":"https://v.discuz.chat/d63b57cavodtranscq1400331686/8cd351a55285890805510217761/v.f100010.mp4","cover_url":"https://v.discuz.chat/d63b57cavodtranscq1400331686/8cd351a55285890805510217761/v.f20000.gif","updated_at":"2020-07-23T14:58:51+08:00","created_at":"2020-07-23T14:58:27+08:00"}}]
     * meta : {"threadCount":4976,"pageCount":249}
     */

    private LinksBean links;
    private MetaBean meta;
    private List<DataRoot> data;
    private List<IncludedBean> included;

    public LinksBean getLinks() {
        return links;
    }

    public void setLinks(LinksBean links) {
        this.links = links;
    }

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<DataRoot> getData() {
        return data;
    }

    public void setData(List<DataRoot> data) {
        this.data = data;
    }

    public List<IncludedBean> getIncluded() {
        return included;
    }

    public void setIncluded(List<IncludedBean> included) {
        this.included = included;
    }

    public static class LinksBean {
        /**
         * first : https://discuz.chat/api/threads?categoryId=1
         * next : https://discuz.chat/api/threads?categoryId=1&page%5Boffset%5D=20
         * last : https://discuz.chat/api/threads?categoryId=1&page%5Boffset%5D=4960
         */

        private String first;
        private String next;
        private String last;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }

    public static class MetaBean {
        /**
         * threadCount : 4976
         * pageCount : 249
         */

        private int threadCount;
        private int pageCount;

        public int getThreadCount() {
            return threadCount;
        }

        public void setThreadCount(int threadCount) {
            this.threadCount = threadCount;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }
    }

    public static class DataRoot {
        /**
         * type : threads
         * id : 5797
         * attributes : {"type":1,"title":"Discuz! Q RC v1.0.200723","price":"0.00","freeWords":0,"viewCount":424,"postCount":13,"paidCount":0,"rewardedCount":0,"createdAt":"2020-07-23T13:09:06+08:00","updatedAt":"2020-07-23T15:29:01+08:00","isApproved":1,"isSticky":true,"isEssence":true,"canViewPosts":true,"canReply":false,"canApprove":false,"canSticky":false,"canEssence":false,"canDelete":false,"canHide":false,"canEdit":false,"isDeleted":false,"canFavorite":true,"isFavorite":false}
         * relationships : {"user":{"data":{"type":"users","id":"2"}},"firstPost":{"data":{"type":"posts","id":"14680"}},"lastPostedUser":{"data":{"type":"users","id":"5951"}},"category":{"data":{"type":"categories","id":"6"}}}
         */

        private String type;
        private String id;
        private AttributesBean attributes;
        private RelationshipsBean relationships;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AttributesBean getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBean attributes) {
            this.attributes = attributes;
        }

        public RelationshipsBean getRelationships() {
            return relationships;
        }

        public void setRelationships(RelationshipsBean relationships) {
            this.relationships = relationships;
        }

        public static class AttributesBean {
            /**
             * type : 1
             * title : Discuz! Q RC v1.0.200723
             * price : 0.00
             * freeWords : 0
             * viewCount : 424
             * postCount : 13
             * paidCount : 0
             * rewardedCount : 0
             * createdAt : 2020-07-23T13:09:06+08:00
             * updatedAt : 2020-07-23T15:29:01+08:00
             * isApproved : 1
             * isSticky : true
             * isEssence : true
             * canViewPosts : true
             * canReply : false
             * canApprove : false
             * canSticky : false
             * canEssence : false
             * canDelete : false
             * canHide : false
             * canEdit : false
             * isDeleted : false
             * canFavorite : true
             * isFavorite : false
             */

            private int type;
            private String title;
            private String price;
            private int freeWords;
            private int viewCount;
            private int postCount;
            private int paidCount;
            private int rewardedCount;
            private String createdAt;
            private String updatedAt;
            private int isApproved;
            private boolean isSticky;
            private boolean isEssence;
            private boolean canViewPosts;
            private boolean canReply;
            private boolean canApprove;
            private boolean canSticky;
            private boolean canEssence;
            private boolean canDelete;
            private boolean canHide;
            private boolean canEdit;
            private boolean isDeleted;
            private boolean canFavorite;
            private boolean isFavorite;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getFreeWords() {
                return freeWords;
            }

            public void setFreeWords(int freeWords) {
                this.freeWords = freeWords;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }

            public int getPostCount() {
                return postCount;
            }

            public void setPostCount(int postCount) {
                this.postCount = postCount;
            }

            public int getPaidCount() {
                return paidCount;
            }

            public void setPaidCount(int paidCount) {
                this.paidCount = paidCount;
            }

            public int getRewardedCount() {
                return rewardedCount;
            }

            public void setRewardedCount(int rewardedCount) {
                this.rewardedCount = rewardedCount;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public int getIsApproved() {
                return isApproved;
            }

            public void setIsApproved(int isApproved) {
                this.isApproved = isApproved;
            }

            public boolean isIsSticky() {
                return isSticky;
            }

            public void setIsSticky(boolean isSticky) {
                this.isSticky = isSticky;
            }

            public boolean isIsEssence() {
                return isEssence;
            }

            public void setIsEssence(boolean isEssence) {
                this.isEssence = isEssence;
            }

            public boolean isCanViewPosts() {
                return canViewPosts;
            }

            public void setCanViewPosts(boolean canViewPosts) {
                this.canViewPosts = canViewPosts;
            }

            public boolean isCanReply() {
                return canReply;
            }

            public void setCanReply(boolean canReply) {
                this.canReply = canReply;
            }

            public boolean isCanApprove() {
                return canApprove;
            }

            public void setCanApprove(boolean canApprove) {
                this.canApprove = canApprove;
            }

            public boolean isCanSticky() {
                return canSticky;
            }

            public void setCanSticky(boolean canSticky) {
                this.canSticky = canSticky;
            }

            public boolean isCanEssence() {
                return canEssence;
            }

            public void setCanEssence(boolean canEssence) {
                this.canEssence = canEssence;
            }

            public boolean isCanDelete() {
                return canDelete;
            }

            public void setCanDelete(boolean canDelete) {
                this.canDelete = canDelete;
            }

            public boolean isCanHide() {
                return canHide;
            }

            public void setCanHide(boolean canHide) {
                this.canHide = canHide;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public boolean isIsDeleted() {
                return isDeleted;
            }

            public void setIsDeleted(boolean isDeleted) {
                this.isDeleted = isDeleted;
            }

            public boolean isCanFavorite() {
                return canFavorite;
            }

            public void setCanFavorite(boolean canFavorite) {
                this.canFavorite = canFavorite;
            }

            public boolean isIsFavorite() {
                return isFavorite;
            }

            public void setIsFavorite(boolean isFavorite) {
                this.isFavorite = isFavorite;
            }
        }

        public static class RelationshipsBean {
            /**
             * user : {"data":{"type":"users","id":"2"}}
             * firstPost : {"data":{"type":"posts","id":"14680"}}
             * lastPostedUser : {"data":{"type":"users","id":"5951"}}
             * category : {"data":{"type":"categories","id":"6"}}
             */

            private UserBean user;
            private FirstPostBean firstPost;
            private LastPostedUserBean lastPostedUser;
            private CategoryBean category;

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public FirstPostBean getFirstPost() {
                return firstPost;
            }

            public void setFirstPost(FirstPostBean firstPost) {
                this.firstPost = firstPost;
            }

            public LastPostedUserBean getLastPostedUser() {
                return lastPostedUser;
            }

            public void setLastPostedUser(LastPostedUserBean lastPostedUser) {
                this.lastPostedUser = lastPostedUser;
            }

            public CategoryBean getCategory() {
                return category;
            }

            public void setCategory(CategoryBean category) {
                this.category = category;
            }

            public static class UserBean {
                /**
                 * data : {"type":"users","id":"2"}
                 */

                private DataBean data;

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public static class DataBean {
                    /**
                     * type : users
                     * id : 2
                     */

                    private String type;
                    private String id;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }

            public static class FirstPostBean {
                /**
                 * data : {"type":"posts","id":"14680"}
                 */

                private DataBeanX data;

                public DataBeanX getData() {
                    return data;
                }

                public void setData(DataBeanX data) {
                    this.data = data;
                }

                public static class DataBeanX {
                    /**
                     * type : posts
                     * id : 14680
                     */

                    private String type;
                    private String id;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }

            public static class LastPostedUserBean {
                /**
                 * data : {"type":"users","id":"5951"}
                 */

                private DataBeanXX data;

                public DataBeanXX getData() {
                    return data;
                }

                public void setData(DataBeanXX data) {
                    this.data = data;
                }

                public static class DataBeanXX {
                    /**
                     * type : users
                     * id : 5951
                     */

                    private String type;
                    private String id;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }

            public static class CategoryBean {
                /**
                 * data : {"type":"categories","id":"6"}
                 */

                private DataBeanXXX data;

                public DataBeanXXX getData() {
                    return data;
                }

                public void setData(DataBeanXXX data) {
                    this.data = data;
                }

                public static class DataBeanXXX {
                    /**
                     * type : categories
                     * id : 6
                     */

                    private String type;
                    private String id;

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }
                }
            }
        }
    }

    public static class IncludedBean {
        /**
         * type : users
         * id : 2
         * attributes : {"id":2,"username":"猛子","avatarUrl":"https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/2.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D48b29e7c500dc4d4517868352c131155cf2187f2","isReal":false,"threadCount":19,"followCount":6,"fansCount":58,"likedCount":79,"signature":"个性签名","usernameBout":0,"status":0,"loginAt":"2020-07-23T13:51:12+08:00","joinedAt":"2020-01-20T20:20:35+08:00","expiredAt":"2021-01-25T18:29:38+08:00","createdAt":"2020-01-20T20:20:35+08:00","updatedAt":"2020-07-23T14:53:50+08:00","canEdit":false,"canDelete":false,"showGroups":false,"registerReason":"","banReason":"","denyStatus":false,"canEditUsername":true}
         */

        private String type;
        private String id;
        private AttributesBeanX attributes;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public AttributesBeanX getAttributes() {
            return attributes;
        }

        public void setAttributes(AttributesBeanX attributes) {
            this.attributes = attributes;
        }

        public static class AttributesBeanX {
            /**
             * id : 2
             * username : 猛子
             * avatarUrl : https://discuzq-img-1258344699.cos.ap-guangzhou.myqcloud.com/public/avatar/2.png?sign=q-sign-algorithm%3Dsha1%26q-ak%3DAKIDqX2OVNEPUKvHQKHXt1uZyA7oLirkMq55%26q-sign-time%3D1595489772%3B1595493432%26q-key-time%3D1595489772%3B1595493432%26q-header-list%3Dhost%26q-url-param-list%3D%26q-signature%3D48b29e7c500dc4d4517868352c131155cf2187f2
             * isReal : false
             * threadCount : 19
             * followCount : 6
             * fansCount : 58
             * likedCount : 79
             * signature : 个性签名
             * usernameBout : 0
             * status : 0
             * loginAt : 2020-07-23T13:51:12+08:00
             * joinedAt : 2020-01-20T20:20:35+08:00
             * expiredAt : 2021-01-25T18:29:38+08:00
             * createdAt : 2020-01-20T20:20:35+08:00
             * updatedAt : 2020-07-23T14:53:50+08:00
             * canEdit : false
             * canDelete : false
             * showGroups : false
             * registerReason :
             * banReason :
             * denyStatus : false
             * canEditUsername : true
             */

            private int id;
            private String username;
            private String avatarUrl;
            private boolean isReal;
            private int threadCount;
            private int followCount;
            private int fansCount;
            private int likedCount;
            private String signature;
            private int usernameBout;
            private int status;
            private String loginAt;
            private String joinedAt;
            private String expiredAt;
            private String createdAt;
            private String updatedAt;
            private boolean canEdit;
            private boolean canDelete;
            private boolean showGroups;
            private String registerReason;
            private String banReason;
            private boolean denyStatus;
            private boolean canEditUsername;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getAvatarUrl() {
                return avatarUrl;
            }

            public void setAvatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
            }

            public boolean isIsReal() {
                return isReal;
            }

            public void setIsReal(boolean isReal) {
                this.isReal = isReal;
            }

            public int getThreadCount() {
                return threadCount;
            }

            public void setThreadCount(int threadCount) {
                this.threadCount = threadCount;
            }

            public int getFollowCount() {
                return followCount;
            }

            public void setFollowCount(int followCount) {
                this.followCount = followCount;
            }

            public int getFansCount() {
                return fansCount;
            }

            public void setFansCount(int fansCount) {
                this.fansCount = fansCount;
            }

            public int getLikedCount() {
                return likedCount;
            }

            public void setLikedCount(int likedCount) {
                this.likedCount = likedCount;
            }

            public String getSignature() {
                return signature;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public int getUsernameBout() {
                return usernameBout;
            }

            public void setUsernameBout(int usernameBout) {
                this.usernameBout = usernameBout;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getLoginAt() {
                return loginAt;
            }

            public void setLoginAt(String loginAt) {
                this.loginAt = loginAt;
            }

            public String getJoinedAt() {
                return joinedAt;
            }

            public void setJoinedAt(String joinedAt) {
                this.joinedAt = joinedAt;
            }

            public String getExpiredAt() {
                return expiredAt;
            }

            public void setExpiredAt(String expiredAt) {
                this.expiredAt = expiredAt;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public boolean isCanDelete() {
                return canDelete;
            }

            public void setCanDelete(boolean canDelete) {
                this.canDelete = canDelete;
            }

            public boolean isShowGroups() {
                return showGroups;
            }

            public void setShowGroups(boolean showGroups) {
                this.showGroups = showGroups;
            }

            public String getRegisterReason() {
                return registerReason;
            }

            public void setRegisterReason(String registerReason) {
                this.registerReason = registerReason;
            }

            public String getBanReason() {
                return banReason;
            }

            public void setBanReason(String banReason) {
                this.banReason = banReason;
            }

            public boolean isDenyStatus() {
                return denyStatus;
            }

            public void setDenyStatus(boolean denyStatus) {
                this.denyStatus = denyStatus;
            }

            public boolean isCanEditUsername() {
                return canEditUsername;
            }

            public void setCanEditUsername(boolean canEditUsername) {
                this.canEditUsername = canEditUsername;
            }
        }
    }
}
