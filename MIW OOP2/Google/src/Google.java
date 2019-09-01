import java.io.Serializable;

public class Google implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8390764474148031101L;
	private int date;
	private float open;
	private float high;
	private float low;
	private float close;
	private float adjclose;
	private int volume;
	
	

	public Google(int date, float open, float high, float low, float close, float adjclose, int volume) {
		super();
		this.date = date;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.adjclose = adjclose;
		this.volume = volume;
	}



	@Override
	public String toString() {
		return "Google [date=" + date + ", open=" + open + ", high=" + high + ", low=" + low + ", close=" + close
				+ ", adjclose=" + adjclose + ", volume=" + volume + "]";
	}
	
	

}
