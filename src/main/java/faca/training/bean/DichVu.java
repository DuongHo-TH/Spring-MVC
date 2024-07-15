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
@Table(name = "DichVu")
public class DichVu {
	@Id
	@Column(name = "MA_DV")
	private String madv;
	@Column(name = "TEN_DV")
	private String tendv;
	@Column(name = "DON_VI_TINH")
	private String donvi;
	@Column(name = "DON_GIA")
	private float dongia;
	@OneToMany(mappedBy="madv", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<SuDungDichVu> sudungdv;	

	public String getMadv() {
		return madv;
	}
	public void setMadv(String madv) {
		this.madv = madv;
	}
	public List<SuDungDichVu> getSudungdv() {
		return sudungdv;
	}
	public void setSudungdv(List<SuDungDichVu> sudungdv) {
		this.sudungdv = sudungdv;
	}
	public String getTendv() {
		return tendv;
	}
	public void setTendv(String tendv) {
		this.tendv = tendv;
	}
	public String getDonvi() {
		return donvi;
	}
	public void setDonvi(String soluong) {
		this.donvi = soluong;
	}
	public float getDongia() {
		return dongia;
	}
	public void setDongia(float dongia) {
		this.dongia = dongia;
	}
	
	public DichVu(String madv, String tendv, String donvi, float dongia, List<SuDungDichVu> sudungdv) {
		super();
		this.madv = madv;
		this.tendv = tendv;
		this.donvi = donvi;
		this.dongia = dongia;
		this.sudungdv = sudungdv;
	}
	public DichVu() {
		super();
	}

}
