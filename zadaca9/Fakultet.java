package fikt.oop.inki895.zadaca9;

public class Fakultet {
	private String imeNaFakultet;
	private int brNaSmerovi;
	private int vkupnoStudenti;
	
	public Fakultet(String imeNaFakultet,int brNaSmerovi,int vkupnoStudenti) {
		this.imeNaFakultet=imeNaFakultet;
		this.brNaSmerovi=brNaSmerovi;
		this.vkupnoStudenti=vkupnoStudenti;
	}
	public String getImeNaFakultet() {
		return imeNaFakultet;
	}
	public int getBrNaSmerovi() {
		return brNaSmerovi;
	}
	public int getVkupnoStudenti() {
		return vkupnoStudenti;
	}
}
