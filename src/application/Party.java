package application;

public class Party {

	int pserial_no;
	String party_name;
	String pleader_name;
	String pleader_desig;
	int p_mobile;
	int p_zip;
	String p_houseno;
	String p_town;
	String p_city;
	PersistenceHandler persHandler;
	
	public Party()
	{
		this.pserial_no = 1;
		this.party_name = "PMLN";
		this.pleader_name = "Nawaz Sharif";
		this.pleader_desig = "Chairman";
		this.p_mobile = 300875;
		this.p_zip = 5700;
		this.p_houseno = "109/w";
		this.p_town = "Farid Town";
		this.p_city = "Sahiwal";
		//this.persHandler = persHandler;		
	}
	public Party(int pserial_no, String party_name, String pleader_name, String pleader_desig, int p_mobile, int p_zip,
			String p_houseno, String p_town, String p_city) {
		super();
		this.pserial_no = pserial_no;
		this.party_name = party_name;
		this.pleader_name = pleader_name;
		this.pleader_desig = pleader_desig;
		this.p_mobile = p_mobile;
		this.p_zip = p_zip;
		this.p_houseno = p_houseno;
		this.p_town = p_town;
		this.p_city = p_city;
		//this.persHandler = persHandler;
	}
	public int getPserial_no() {
		return pserial_no;
	}
	public void setPserial_no(int pserial_no) {
		this.pserial_no = pserial_no;
	}
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public String getPleader_name() {
		return pleader_name;
	}
	public void setPleader_name(String pleader_name) {
		this.pleader_name = pleader_name;
	}
	public String getPleader_desig() {
		return pleader_desig;
	}
	public void setPleader_desig(String pleader_desig) {
		this.pleader_desig = pleader_desig;
	}
	public int getP_mobile() {
		return p_mobile;
	}
	public void setP_mobile(int p_mobile) {
		this.p_mobile = p_mobile;
	}
	public int getP_zip() {
		return p_zip;
	}
	public void setP_zip(int p_zip) {
		this.p_zip = p_zip;
	}
	public String getP_houseno() {
		return p_houseno;
	}
	public void setP_houseno(String p_houseno) {
		this.p_houseno = p_houseno;
	}
	public String getP_town() {
		return p_town;
	}
	public void setP_town(String p_town) {
		this.p_town = p_town;
	}
	public String getP_city() {
		return p_city;
	}
	public void setP_city(String p_city) {
		this.p_city = p_city;
	}
//	public PersistenceHandler getPersHandler() {
//		return persHandler;
//	}
//	public void setPersHandler(PersistenceHandler persHandler) {
//		this.persHandler = persHandler;
//	}

	void save()
	{
		persHandler.saveParty(this);
	}
	void setPersitenceHandler (PersistenceHandler ph)
	{
		this.persHandler=ph;
	}

}
