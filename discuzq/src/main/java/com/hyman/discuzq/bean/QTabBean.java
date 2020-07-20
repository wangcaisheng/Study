package com.hyman.discuzq.bean;

import java.util.List;

/**
 * @author: Hyman
 * time: 2020/7/20 下午7:22
 * des:
 */
public class QTabBean {

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * type : categories
         * id : 1
         * attributes : {"name":"聊天","description":"默认分类","icon":"","sort":1,"property":0,"thread_count":3113,"ip":"127.0.0.1","created_at":"2020-01-20T15:03:44+08:00","updated_at":"2020-07-20T18:44:23+08:00","canViewThreads":true,"canCreateThread":false,"canReplyThread":false}
         */

        private String type;
        private String id;
        private AttributesBean attributes;

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

        public static class AttributesBean {
            /**
             * name : 聊天
             * description : 默认分类
             * icon :
             * sort : 1
             * property : 0
             * thread_count : 3113
             * ip : 127.0.0.1
             * created_at : 2020-01-20T15:03:44+08:00
             * updated_at : 2020-07-20T18:44:23+08:00
             * canViewThreads : true
             * canCreateThread : false
             * canReplyThread : false
             */

            private String name;
            private String description;
            private String icon;
            private int sort;
            private int property;
            private int thread_count;
            private String ip;
            private String created_at;
            private String updated_at;
            private boolean canViewThreads;
            private boolean canCreateThread;
            private boolean canReplyThread;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public int getSort() {
                return sort;
            }

            public void setSort(int sort) {
                this.sort = sort;
            }

            public int getProperty() {
                return property;
            }

            public void setProperty(int property) {
                this.property = property;
            }

            public int getThread_count() {
                return thread_count;
            }

            public void setThread_count(int thread_count) {
                this.thread_count = thread_count;
            }

            public String getIp() {
                return ip;
            }

            public void setIp(String ip) {
                this.ip = ip;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public boolean isCanViewThreads() {
                return canViewThreads;
            }

            public void setCanViewThreads(boolean canViewThreads) {
                this.canViewThreads = canViewThreads;
            }

            public boolean isCanCreateThread() {
                return canCreateThread;
            }

            public void setCanCreateThread(boolean canCreateThread) {
                this.canCreateThread = canCreateThread;
            }

            public boolean isCanReplyThread() {
                return canReplyThread;
            }

            public void setCanReplyThread(boolean canReplyThread) {
                this.canReplyThread = canReplyThread;
            }
        }
    }
}
