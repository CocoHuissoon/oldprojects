//package mainJDBCles1;
//
//import java.sql.*;
//
//public class KlantDAO {
//	private String url;
//	private String username;
//	private String password;
//	private Connection connection;
//
//	public KlantDAO(String url, String username, String password) {
//		super();
//		this.url = url;
//		this.username = username;
//		this.password = password;
//
//		try {
//			connection = DriverManager.getConnection(url, username, password);
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//	}
//	public Klant insert (Klant klant)throws SQLException{
//		PreparedStatement prepst = connection.prepareStatement("insert into klant (klantnaam, plaats) values (?,?)",
//				Statement.RETURN_GENERATED_KEYS);
//		prepst.setString(1, klant.getNaam());
//		prepst.setString(2, klant.getPlaats());
//		
//		prepst.executeUpdate();
//		ResultSet rs = prepst.getGeneratedKeys();
//		int klantnummer=0; 
//		while(rs.next()) {
//			klantnummer=rs.getInt(1);
//		}
//		klant.setKlantnummer(klantnummer);
//	    return klant;
//		
//
//	}
//	
//
//}
