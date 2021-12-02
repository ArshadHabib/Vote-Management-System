package application;


public class Candidate {
	int cand_cnic;
	String c_f_name;
	String c_l_name;
	int c_p_no;
	int c_mobile;
	int c_dob;
	String c_h_no;
	String c_town;
	String c_city;
	int c_zip;
	PersistenceHandler persHandler;
	public Candidate() {
		super();
		this.cand_cnic = 1;
		this.c_f_name = "Asad";
		this.c_l_name = "Umar";
		this.c_p_no = 1;
		this.c_mobile = 1;
		this.c_dob = 1;
		this.c_h_no = "38/E";
		this.c_town = "Farid Town";
		this.c_city = "Sahiwal";
		this.c_zip = 1122;
	}	
	public Candidate(int cand_cnic, String c_f_name, String c_l_name, int c_p_no, int c_mobile, int c_dob,
			String c_h_no, String c_town, String c_city, int c_zip) {
		super();
		this.cand_cnic = cand_cnic;
		this.c_f_name = c_f_name;
		this.c_l_name = c_l_name;
		this.c_p_no = c_p_no;
		this.c_mobile = c_mobile;
		this.c_dob = c_dob;
		this.c_h_no = c_h_no;
		this.c_town = c_town;
		this.c_city = c_city;
		this.c_zip = c_zip;
	}
	public int getCand_cnic() {
		return cand_cnic;
	}
	public void setCand_cnic(int cand_cnic) {
		this.cand_cnic = cand_cnic;
	}
	public String getC_f_name() {
		return c_f_name;
	}
	public void setC_f_name(String c_f_name) {
		this.c_f_name = c_f_name;
	}
	public String getC_l_name() {
		return c_l_name;
	}
	public void setC_l_name(String c_l_name) {
		this.c_l_name = c_l_name;
	}
	public int getC_p_no() {
		return c_p_no;
	}
	public void setC_p_no(int c_p_no) {
		this.c_p_no = c_p_no;
	}
	public int getC_mobile() {
		return c_mobile;
	}
	public void setC_mobile(int c_mobile) {
		this.c_mobile = c_mobile;
	}
	public int getC_dob() {
		return c_dob;
	}
	public void setC_dob(int c_dob) {
		this.c_dob = c_dob;
	}
	public String getC_h_no() {
		return c_h_no;
	}
	public void setC_h_no(String c_h_no) {
		this.c_h_no = c_h_no;
	}
	public String getC_town() {
		return c_town;
	}
	public void setC_town(String c_town) {
		this.c_town = c_town;
	}
	public String getC_city() {
		return c_city;
	}
	public void setC_city(String c_city) {
		this.c_city = c_city;
	}
	public int getC_zip() {
		return c_zip;
	}
	public void setC_zip(int c_zip) {
		this.c_zip = c_zip;
	}
	public PersistenceHandler getPersHandler() {
		return persHandler;
	}
	public void setPersHandler(PersistenceHandler persHandler) {
		this.persHandler = persHandler;
	}
	void save()
	{
		persHandler.saveCandidate(this);
	}
}
