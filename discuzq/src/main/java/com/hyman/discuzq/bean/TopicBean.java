package com.hyman.discuzq.bean;

import com.arch.demo.network_api.beans.BaseResponse;

import java.util.List;

public class TopicBean extends BaseResponse {

    /**
     * links : {"first":"DummySiteUrl/api/threads?page%5Blimit%5D=10","last":"DummySiteUrl/api/threads?page%5Blimit%5D=10"}
     * data : [{"type":"threads","id":"26","attributes":{"type":0,"title":"","price":"0.00","viewCount":0,"postCount":1,"createdAt":"2020-03-10T16:33:24+08:00","updatedAt":"2020-03-10T16:33:24+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":true,"canApprove":true,"canSticky":true,"canEssence":true,"canDelete":true,"canHide":true,"canFavorite":true},"relationships":{"user":{"data":{"type":"users","id":"3"}},"firstPost":{"data":{"type":"posts","id":"24"}},"lastPostedUser":{"data":{"type":"users","id":"3"}},"category":{"data":{"type":"categories","id":"1"}}}},{"type":"threads","id":"25","attributes":{"type":2,"title":"","price":"0.00","viewCount":1,"postCount":1,"createdAt":"2020-03-10T16:31:54+08:00","updatedAt":"2020-03-10T16:31:54+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":true,"canApprove":true,"canSticky":true,"canEssence":true,"canDelete":true,"canHide":true,"canFavorite":true},"relationships":{"user":{"data":{"type":"users","id":"3"}},"firstPost":{"data":{"type":"posts","id":"23"}},"threadVideo":{"data":{"type":"thread-video","id":"18"}},"lastPostedUser":{"data":{"type":"users","id":"3"}},"category":{"data":{"type":"categories","id":"1"}}}}]
     * included : [{"type":"users","id":"3","attributes":{"id":3,"username":"username","avatarUrl":"","threadCount":19,"followCount":0,"fansCount":0,"follow":null,"status":0,"loginAt":"2020-03-10T11:20:42+08:00","joinedAt":"2020-03-09T16:39:28+08:00","expiredAt":null,"createdAt":"2020-03-09T16:39:28+08:00","updatedAt":"2020-03-10T17:03:44+08:00","canEdit":true,"canDelete":true,"registerReason":"","banReason":"","originalMobile":"","registerIp":"127.0.0.1","lastLoginIp":"127.0.0.1","identity":"","realname":"","mobile":"","canWalletPay":false,"walletBalance":"0.00"}},{"type":"posts","id":"24","attributes":{"replyUserId":null,"content":"abc","contentHtml":"abc","replyCount":0,"likeCount":0,"createdAt":"2020-03-10T16:33:24+08:00","updatedAt":"2020-03-10T16:33:24+08:00","isFirst":true,"isApproved":1,"canEdit":true,"canApprove":true,"canDelete":true,"canHide":true,"ip":"127.0.0.1","canLike":true}},{"type":"posts","id":"23","attributes":{"replyUserId":null,"content":"abc","contentHtml":"abc","replyCount":0,"likeCount":0,"createdAt":"2020-03-10T16:31:54+08:00","updatedAt":"2020-03-10T16:31:54+08:00","isFirst":true,"isApproved":1,"canEdit":true,"canApprove":true,"canDelete":true,"canHide":true,"ip":"127.0.0.1","canLike":true}},{"type":"categories","id":"1","attributes":{"name":"默认分类","description":"默认分类","icon":"","sort":0,"property":0,"thread_count":19,"ip":"127.0.0.1","created_at":"2020-03-05T09:41:41+08:00","updated_at":"2020-03-10T17:03:44+08:00"}},{"type":"thread-video","id":"18","attributes":{"id":18,"user_id":3,"thread_id":25,"status":1,"reason":"source file err: file info lack width, height or color space","file_name":"666","file_id":"666","width":666,"height":666,"media_url":"url","cover_url":"url","updated_at":"2020-03-10T18:26:31+08:00","created_at":"2020-03-10T16:31:54+08:00"}}]
     * meta : {"threadCount":2,"pageCount":1}
     */

    private LinksBean links;
    private MetaBean meta;
    private List<DataRootBean> data;
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

    public List<DataRootBean> getData() {
        return data;
    }

    public void setData(List<DataRootBean> data) {
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
         * first : DummySiteUrl/api/threads?page%5Blimit%5D=10
         * last : DummySiteUrl/api/threads?page%5Blimit%5D=10
         */

        private String first;
        private String last;

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
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
         * threadCount : 2
         * pageCount : 1
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

    public static class DataRootBean {
        /**
         * type : threads
         * id : 26
         * attributes : {"type":0,"title":"","price":"0.00","viewCount":0,"postCount":1,"createdAt":"2020-03-10T16:33:24+08:00","updatedAt":"2020-03-10T16:33:24+08:00","isApproved":1,"isSticky":false,"isEssence":false,"canViewPosts":true,"canReply":true,"canApprove":true,"canSticky":true,"canEssence":true,"canDelete":true,"canHide":true,"canFavorite":true}
         * relationships : {"user":{"data":{"type":"users","id":"3"}},"firstPost":{"data":{"type":"posts","id":"24"}},"lastPostedUser":{"data":{"type":"users","id":"3"}},"category":{"data":{"type":"categories","id":"1"}}}
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
             * type : 0
             * title :
             * price : 0.00
             * viewCount : 0
             * postCount : 1
             * createdAt : 2020-03-10T16:33:24+08:00
             * updatedAt : 2020-03-10T16:33:24+08:00
             * isApproved : 1
             * isSticky : false
             * isEssence : false
             * canViewPosts : true
             * canReply : true
             * canApprove : true
             * canSticky : true
             * canEssence : true
             * canDelete : true
             * canHide : true
             * canFavorite : true
             */

            private int type;
            private String title;
            private String price;
            private int viewCount;
            private int postCount;
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
            private boolean canFavorite;

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

            public boolean isCanFavorite() {
                return canFavorite;
            }

            public void setCanFavorite(boolean canFavorite) {
                this.canFavorite = canFavorite;
            }
        }

        public static class RelationshipsBean {
            /**
             * user : {"data":{"type":"users","id":"3"}}
             * firstPost : {"data":{"type":"posts","id":"24"}}
             * lastPostedUser : {"data":{"type":"users","id":"3"}}
             * category : {"data":{"type":"categories","id":"1"}}
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
                 * data : {"type":"users","id":"3"}
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
                     * id : 3
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
                 * data : {"type":"posts","id":"24"}
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
                     * id : 24
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
                 * data : {"type":"users","id":"3"}
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
                     * id : 3
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
                 * data : {"type":"categories","id":"1"}
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
                     * id : 1
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
         * id : 3
         * attributes : {"id":3,"username":"username","avatarUrl":"","threadCount":19,"followCount":0,"fansCount":0,"follow":null,"status":0,"loginAt":"2020-03-10T11:20:42+08:00","joinedAt":"2020-03-09T16:39:28+08:00","expiredAt":null,"createdAt":"2020-03-09T16:39:28+08:00","updatedAt":"2020-03-10T17:03:44+08:00","canEdit":true,"canDelete":true,"registerReason":"","banReason":"","originalMobile":"","registerIp":"127.0.0.1","lastLoginIp":"127.0.0.1","identity":"","realname":"","mobile":"","canWalletPay":false,"walletBalance":"0.00"}
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
             * id : 3
             * username : username
             * avatarUrl :
             * threadCount : 19
             * followCount : 0
             * fansCount : 0
             * follow : null
             * status : 0
             * loginAt : 2020-03-10T11:20:42+08:00
             * joinedAt : 2020-03-09T16:39:28+08:00
             * expiredAt : null
             * createdAt : 2020-03-09T16:39:28+08:00
             * updatedAt : 2020-03-10T17:03:44+08:00
             * canEdit : true
             * canDelete : true
             * registerReason :
             * banReason :
             * originalMobile :
             * registerIp : 127.0.0.1
             * lastLoginIp : 127.0.0.1
             * identity :
             * realname :
             * mobile :
             * canWalletPay : false
             * walletBalance : 0.00
             */

            private int id;
            private String username;
            private String avatarUrl;
            private int threadCount;
            private int followCount;
            private int fansCount;
            private Object follow;
            private int status;
            private String loginAt;
            private String joinedAt;
            private Object expiredAt;
            private String createdAt;
            private String updatedAt;
            private boolean canEdit;
            private boolean canDelete;
            private String registerReason;
            private String banReason;
            private String originalMobile;
            private String registerIp;
            private String lastLoginIp;
            private String identity;
            private String realname;
            private String mobile;
            private boolean canWalletPay;
            private String walletBalance;

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

            public Object getFollow() {
                return follow;
            }

            public void setFollow(Object follow) {
                this.follow = follow;
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

            public Object getExpiredAt() {
                return expiredAt;
            }

            public void setExpiredAt(Object expiredAt) {
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

            public String getOriginalMobile() {
                return originalMobile;
            }

            public void setOriginalMobile(String originalMobile) {
                this.originalMobile = originalMobile;
            }

            public String getRegisterIp() {
                return registerIp;
            }

            public void setRegisterIp(String registerIp) {
                this.registerIp = registerIp;
            }

            public String getLastLoginIp() {
                return lastLoginIp;
            }

            public void setLastLoginIp(String lastLoginIp) {
                this.lastLoginIp = lastLoginIp;
            }

            public String getIdentity() {
                return identity;
            }

            public void setIdentity(String identity) {
                this.identity = identity;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public boolean isCanWalletPay() {
                return canWalletPay;
            }

            public void setCanWalletPay(boolean canWalletPay) {
                this.canWalletPay = canWalletPay;
            }

            public String getWalletBalance() {
                return walletBalance;
            }

            public void setWalletBalance(String walletBalance) {
                this.walletBalance = walletBalance;
            }
        }
    }
}
