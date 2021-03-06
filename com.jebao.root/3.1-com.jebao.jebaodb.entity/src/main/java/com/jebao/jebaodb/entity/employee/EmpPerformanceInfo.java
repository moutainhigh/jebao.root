package com.jebao.jebaodb.entity.employee;

import com.jebao.jebaodb.entity.extEntity.PageWhere;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Jack on 2016/12/29.
 * 员工业绩信息
 */
public class EmpPerformanceInfo extends PageWhere {
    private Long orderId;
    private BigDecimal orderMoney;
    private Date orderCreateTime;

    private Long productId;
    private String productName;

    private String trueName;
    private String mobilePhone;

    private Integer empId;
    private String empName;
    private String empMobilePhone;

    private Integer depId;
    private String depName;
    private Integer depParentId;
    private Boolean depIsDepartment;

    private Integer rankId;
    private String rankName;
    private Integer rankParentId;
    private BigDecimal rankBrokeragePercent;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Integer getDepParentId() {
        return depParentId;
    }

    public void setDepParentId(Integer depParentId) {
        this.depParentId = depParentId;
    }

    public Boolean getDepIsDepartment() {
        return depIsDepartment;
    }

    public void setDepIsDepartment(Boolean depIsDepartment) {
        this.depIsDepartment = depIsDepartment;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public Integer getRankParentId() {
        return rankParentId;
    }

    public void setRankParentId(Integer rankParentId) {
        this.rankParentId = rankParentId;
    }

    public BigDecimal getRankBrokeragePercent() {
        return rankBrokeragePercent;
    }

    public void setRankBrokeragePercent(BigDecimal rankBrokeragePercent) {
        this.rankBrokeragePercent = rankBrokeragePercent;
    }

    public String getEmpMobilePhone() {
        return empMobilePhone;
    }

    public void setEmpMobilePhone(String empMobilePhone) {
        this.empMobilePhone = empMobilePhone;
    }
}
