package com.rongyi.easy.smart.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/11/8.
 */

public class Commodity implements Serializable {
	    
        private Integer id;
        private String name;//商品名称
        private String introduce;//介绍
        private String commodityId;//商品实际id
        private Integer index;//顺序
        private Integer caseId;
        private Integer caseLayerId;
        private Integer sourceId;
        private Integer from;//来源
        private Integer pageId;
        private Integer isUpdateName;

        public Integer getIsUpdateName() {
                return isUpdateName;
        }

        public void setIsUpdateName(Integer isUpdateName) {
                this.isUpdateName = isUpdateName;
        }

        public Integer getPageId() {
                return pageId;
        }

        public void setPageId(Integer pageId) {
                this.pageId = pageId;
        }

        public Integer getFrom() {
                return from;
        }

        public void setFrom(Integer from) {
                this.from = from;
        }

        public String getCommodityId() {
                return commodityId;
        }

        public void setCommodityId(String commodityId) {
                this.commodityId = commodityId;
        }

        public Integer getCaseLayerId() {
                return caseLayerId;
        }

        public void setCaseLayerId(Integer caseLayerId) {
                this.caseLayerId = caseLayerId;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getIntroduce() {
                return introduce;
        }

        public void setIntroduce(String introduce) {
                this.introduce = introduce;
        }

        public Integer getIndex() {
                return index;
        }

        public void setIndex(Integer index) {
                this.index = index;
        }

        public Integer getCaseId() {
                return caseId;
        }

        public void setCaseId(Integer caseId) {
                this.caseId = caseId;
        }


        public Integer getSourceId() {
                return sourceId;
        }

        public void setSourceId(Integer sourceId) {
                this.sourceId = sourceId;
        }

        @Override
        public String toString() {
                return "Commodity{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", introduce='" + introduce + '\'' +
                        ", commodityId='" + commodityId + '\'' +
                        ", index=" + index +
                        ", caseId=" + caseId +
                        ", caseLayerId=" + caseLayerId +
                        ", sourceId=" + sourceId +
                        ", from=" + from +
                        '}';
        }
}
