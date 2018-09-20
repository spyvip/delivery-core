package com.corporate.delivery.model.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ORDER_STATUS")
public class OrderStatus {

	
	private Integer id;
	private Integer orderId;
	private String newStatus;
	private Date newDate;
	private Date newTime;
	private String openStatus;
	private Date openDate;
	private Date openTime;
	private String ackStatus;
	private Date ackDate;
	private Date ackTime;
	private String ready;
	private Date readyDate;
	private Date readyTime;
	private String handover;
	private Date handoverDate;
	private Date handoverTime;
	private String delivered;
	private Date deliveredDate;
	private Date deliveredTime;

	@Id
	@GeneratedValue   
	@Column(name = "id", nullable = false)  
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	 @Column(name = "orderId", unique=true, nullable = false)
	public Integer getOrderId() {
		return orderId;
	}
	 
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	
	@Column(name = "new", unique=true, nullable = false)
	public String getNewStatus() {
		return newStatus;
	}
	
	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}
	
	 @Column(name = "new_date", unique=true, nullable = true)
	public Date getNewDate() {
		return newDate;
	}
	 
	public void setNewDate(Date newDate) {
		this.newDate = newDate;
	}
	
	@Temporal(TemporalType.TIME)
	@Column(name = "new_time", nullable = true)
	public Date getNewTime() {
		return newTime;
	}
	
	public void setNewTime(Date newTime) {
		this.newTime = newTime;
	}
	
	@Column(name = "open", nullable = true)
	public String getOpenStatus() {
		return openStatus;
	}
	 
	public void setOpenStatus(String openStatus) {
		this.openStatus = openStatus;
	}
	
	 @Column(name = "open_date", nullable = true)
	public Date getOpenDate() {
		return openDate;
	}
	 
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	
	@Temporal(TemporalType.TIME)
	 @Column(name = "open_time",  nullable = true)
	public Date getOpenTime() {
		return openTime;
	}
	 
	
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	
	 @Column(name = "ack", nullable = false)
	public String getAckStatus() {
		return ackStatus;
	}
	 
	 
	public void setAckStatus(String ackStatus) {
		this.ackStatus = ackStatus;
	}
	
	 @Column(name = "ack_date",  nullable = true)
	public Date getAckDate() {
		return ackDate;
	}
	public void setAckDate(Date ackDate) {
		this.ackDate = ackDate;
	}
	
	@Temporal(TemporalType.TIME)
	 @Column(name = "ack_time",  nullable = true)
	public Date getAckTime() {
		return ackTime;
	}
	public void setAckTime(Date ackTime) {
		this.ackTime = ackTime;
	}
	
	 @Column(name = "ready", nullable = true)
	public String getReady() {
		return ready;
	}
	 
	public void setReady(String ready) {
		this.ready = ready;
	}
	
	 @Column(name = "ready_date", nullable = true)
	public Date getReadyDate() {
		return readyDate;
	}
	 
	public void setReadyDate(Date readyDate) {
		this.readyDate = readyDate;
	}
	
	@Temporal(TemporalType.TIME)
	@Column(name = "ready_time", nullable = true)
	public Date getReadyTime() {
		return readyTime;
	}
	
	public void setReadyTime(Date readyTime) {
		this.readyTime = readyTime;
	}
	
	@Column(name = "handover", nullable = true)
	public String getHandover() {
		return handover;
	}
	
	public void setHandover(String handover) {
		this.handover = handover;
	}
	
	 @Column(name = "handover_date",  nullable = true)
	public Date getHandoverDate() {
		return handoverDate;
	}
	 
	public void setHandoverDate(Date handoverDate) {
		this.handoverDate = handoverDate;
	}
	
	@Temporal(TemporalType.TIME)
	@Column(name = "handover_time", nullable = true)
	public Date getHandoverTime() {
		return handoverTime;
	}
	
	public void setHandoverTime(Date handoverTime) {
		this.handoverTime = handoverTime;
	}
	
	@Column(name = "delivered",  nullable = true)
	public String getDelivered() {
		return delivered;
	}
	
	public void setDelivered(String delivered) {
		this.delivered = delivered;
	}
	
	@Column(name = "delivered_date", nullable = true)
	public Date getDeliveredDate() {
		return deliveredDate;
	}
	
	public void setDeliveredDate(Date deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
	
	@Temporal(TemporalType.TIME)
	@Column(name = "delivered_time", unique=true, nullable = false)
	public Date getDeliveredTime() {
		return deliveredTime;
	}
	
	public void setDeliveredTime(Date deliveredTime) {
		this.deliveredTime = deliveredTime;
	}


}
