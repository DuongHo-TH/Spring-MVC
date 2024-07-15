package faca.training.bean;

import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "SuDungMay")
public class SuDungMay  {

 @EmbeddedId
 private SuDungMayId id;
 
 @ManyToOne(fetch = FetchType.LAZY)
 @MapsId("mamay")
 @JoinColumn(name = "mamay")
 private May mamay;
 @ManyToOne(fetch = FetchType.LAZY)
 @MapsId("makh")
 @JoinColumn(name = "makh")
 private Khach makh;
 
 private LocalTime thoigiansudung;

public SuDungMayId getId() {
	return id;
}

public void setId(SuDungMayId id) {
	this.id = id;
}

public May getMamay() {
	return mamay;
}

public void setMamay(May mamay) {
	this.mamay = mamay;
}

public Khach getMakh() {
	return makh;
}

public void setMakh(Khach makh) {
	this.makh = makh;
}

public LocalTime getThoigiansudung() {
	return thoigiansudung;
}

public void setThoigiansudung(LocalTime thoigiansudung) {
	this.thoigiansudung = thoigiansudung;
}

public SuDungMay(SuDungMayId id, May mamay, Khach makh, LocalTime thoigiansudung) {
	super();
	this.id = id;
	this.mamay = mamay;
	this.makh = makh;
	this.thoigiansudung = thoigiansudung;
}

public SuDungMay() {
	super();
}

@Override
public String toString() {
	return "SuDungMay [getId()=" + getId() + ", getMamay()=" + getMamay() + ", getMakh()=" + getMakh()
			+ ", getThoigiansudung()=" + getThoigiansudung() + "]";
}



}
