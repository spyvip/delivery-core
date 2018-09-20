package com.corporate.delivery.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MENU_SECTION")
public class MenuSection {
	
	private Integer id;
	private Integer menuId;
	private String name;
	private String description;
	private String type;
	
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String option5;
	private String option6;
	
	private Double price1;
	private Double price2;
	private Double price3;
	private Double price4;
	private Double price5;
	private Double price6;
	
	//private Menu menu;
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "menuId", unique=true, nullable = false)
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	
	@Column(name = "name", unique=true, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "type",  unique=true, nullable = false)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Column(name = "description",  unique=true, nullable = false)
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name ="option1", unique=true, nullable = false)
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	
	@Column(name ="option2", unique=true, nullable = false)
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	
	@Column(name ="option3", unique=true, nullable = false)
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	
	@Column(name ="option4", unique=true, nullable = false)
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	@Column(name ="option5", unique=true, nullable = false)
	public String getOption5() {
		return option5;
	}
	public void setOption5(String option5) {
		this.option5 = option5;
	}
	
	@Column(name ="option6", unique=true, nullable = false)
	public String getOption6() {
		return option6;
	}
	public void setOption6(String option6) {
		this.option6 = option6;
	}
	
	
	@Column(name = "price1", unique=true, nullable = false)
	public Double getPrice1() {
		return price1;
	}
	public void setPrice1(Double price1) {
		this.price1 = price1;
	}
	
	@Column(name = "price2", unique=true, nullable = false)
	public Double getPrice2() {
		return price2;
	}
	public void setPrice2(Double price2) {
		this.price2 = price2;
	}
	
	@Column(name = "price3", unique=true, nullable = false)
	public Double getPrice3() {
		return price3;
	}
	public void setPrice3(Double price3) {
		this.price3 = price3;
	}
	
	@Column(name = "price4", unique=true, nullable = false)
	public Double getPrice4() {
		return price4;
	}
	public void setPrice4(Double price4) {
		this.price4 = price4;
	}
	
	@Column(name = "price5", unique=true, nullable = false)
	public Double getPrice5() {
		return price5;
	}
	public void setPrice5(Double price5) {
		this.price5 = price5;
	}
	
	@Column(name = "price6", unique=true, nullable = false)
	public Double getPrice6() {
		return price6;
	}
	public void setPrice6(Double price6) {
		this.price6 = price6;
	}
	
	
	/*@ManyToOne
    @JoinColumn(name = "menuId")
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}*/
	
}
