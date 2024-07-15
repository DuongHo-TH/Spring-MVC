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
@Table(name = "May")
public class May {
	@Id
	@Column(name = "MaMay")
	private String mamay;
	@Column(name = "ViTri")
	private int vitri;
	@Column(name = "TrangThai")
	private String trangthai;
	@OneToMany(mappedBy = "mamay", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<SuDungMay> sudungmay;

	public List<SuDungMay> getSudungmay() {
		return sudungmay;
	}

	public void setSudungmay(List<SuDungMay> sudungmay) {
		this.sudungmay = sudungmay;
	}

	public String getMamay() {
		return mamay;
	}

	public void setMamay(String mamay) {
		this.mamay = mamay;
	}

	public int getVitri() {
		return vitri;
	}

	public void setVitri(int vitri) {
		this.vitri = vitri;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public May(int vitri, String trangthai) {
		super();
		this.vitri = vitri;
		this.trangthai = trangthai;
	}

	public May() {
		super();
	}

	public May(String mamay, int vitri, String trangthai, List<SuDungMay> sudungmay) {
		super();
		this.mamay = mamay;
		this.vitri = vitri;
		this.trangthai = trangthai;
		this.sudungmay = sudungmay;
	}

	@Override
	public String toString() {
		return "May [" + getVitri() + "]";
	}

}
