package mainJDBCles1;

import java.sql.SQLException;

public class JDBCwithDAO {

	public static void main(String[] args) {
		Klant k1= new Klant("fredje","limburg");
		Klant k2= new Klant("henkie","penkie");
		
		KlantDAO p= new KlantDAO("jdbc:mysql://127.0.0.1:3306/bestellingen?useSSL=false","root","Strider7?");
		try {
			p.insert(k2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
