package faca.training.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;
@Embeddable
public class SuDungDichVuId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String makh;
	private String madv;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate ngaysudung;
	@DateTimeFormat(pattern = "HH:mm")
	private LocalTime giosudung;
	
	public SuDungDichVuId() {
		super();
		
	}

	public SuDungDichVuId(String makh, String madv, LocalDate ngaysudung, LocalTime giosudung) {
		super();
		this.makh = makh;
		this.madv = madv;
		this.ngaysudung = ngaysudung;
		this.giosudung = giosudung;
	}

	public String getMakh() {
		return makh;
	}

	public void setMakh(String makh) {
		this.makh = makh;
	}

	public String getMadv() {
		return madv;
	}

	public void setMadv(String madv) {
		this.madv = madv;
	}

	public LocalDate getNgaysudung() {
		return ngaysudung;
	}
	public void setNgaysudung(LocalDate ngaysudung) {
		this.ngaysudung = ngaysudung;
	}
	public LocalTime getGiosudung() {
		return giosudung;
	}
	public void setGiosudung(LocalTime giosudung) {
		this.giosudung = giosudung;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(giosudung, madv, makh, ngaysudung);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuDungDichVuId other = (SuDungDichVuId) obj;
		return Objects.equals(giosudung, other.giosudung) && madv == other.madv && makh == other.makh
				&& Objects.equals(ngaysudung, other.ngaysudung);
	}

	@Override
	public String toString() {
		return "SuDungDichVuId [getMakh()=" + getMakh() + ", getMadv()=" + getMadv() + ", getNgaysudung()="
				+ getNgaysudung() + ", getGiosudung()=" + getGiosudung() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
