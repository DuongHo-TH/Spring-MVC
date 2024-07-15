package faca.training.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")
public class Khach {
	@Id
	private String makh;
	@Column(name = "TEN_KH")
	private String tenKH;
	@Column(name = "DIA_CHI")
	private String diachi;
	@Column(name = "PHONE")
	private String phone;
	@Column(name = "Email")
	private String email;
	@OneToMany(mappedBy="makh", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<SuDungMay> sudungmay;
	@OneToMany(mappedBy="makh", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<SuDungDichVu> sudungdv;
	
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public List<SuDungMay> getSudungmay() {
		return sudungmay;
	}
	public void setSudungmay(List<SuDungMay> sudungmay) {
		this.sudungmay = sudungmay;
	}
	public List<SuDungDichVu> getSudungdv() {
		return sudungdv;
	}
	public void setSudungdv(List<SuDungDichVu> sudungdv) {
		this.sudungdv = sudungdv;
	}
	
	public Khach(String makh, String tenKH, String diachi, String phone, String email) {
		super();
		this.makh = makh;
		this.tenKH = tenKH;
		this.diachi = diachi;
		this.phone = phone;
		this.email = email;
		
	}
	public Khach() {
		super();
	}
	@Override
	public String toString() {
		return "Khach [" + getTenKH() + "]";
	}

}