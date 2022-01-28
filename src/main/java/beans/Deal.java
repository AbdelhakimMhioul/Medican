package beans;

public class Deal {
	private int id_deal;
	private String desc_deal;
	private String type_deal;
	
	public Deal() {
		
	}
	public Deal(String type) {
		this.type_deal = type;
	}
	public Deal(int id, String type, String desc) {
        super();
        this.id_deal = id;
        this.type_deal = type;
        this.desc_deal = desc;
    }
	
	public int getId_deal() {
		return id_deal;
	}
	public void setId_deal(int id_deal) {
		this.id_deal = id_deal;
	}
	public String getDesc_deal() {
		return desc_deal;
	}
	public void setDesc_deal(String desc_deal) {
		this.desc_deal = desc_deal;
	}
	public String getType_deal() {
		return type_deal;
	}
	public void setType_deal(String type_deal) {
		this.type_deal = type_deal;
	}
	
}
