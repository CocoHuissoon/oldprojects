package mainJDBCles1;
import java.sql.*;
public class JDBCles1launcher {

	public static void main(String[] args) throws SQLException  {
		final String URL="jdbc:mysql://127.0.0.1:3306/bestellingen?useSSL=false";
		
		final String username="root";
		final String password="Strider7?";
		
		Connection connection= DriverManager.getConnection(URL,username,password);
		Statement statement=connection.createStatement();
		
		ResultSet resultSet=statement.executeQuery("SELECT * FROM klant");
		
		while (resultSet.next()) {
			System.out.printf("klantnummer: %d | klantnaam: %s | plaats: %s\n" ,
					resultSet.getInt("klantnr"),
					resultSet.getString("klantnaam"),
					resultSet.getString("plaats"));
		}
		Klant nieuweKlant= new Klant("Coco","almere");
		nieuweKlant.insert();
		
//		public Persoon insert (Persoon persoon)throws SQLException{
//		PreparedStatement prepst = connection.prepareStatement("insert into klant (klantnaam, plaats) values (?,?)",
//				Statement.RETURN_GENERATED_KEYS);
//		prepst.setString(1, nieuweKlant.getNaam());
//		prepst.setString(2, nieuweKlant.getPlaats());
//		
//		prepst.executeUpdate();
//		ResultSet rs = prepst.getGeneratedKeys();
//		int klantnummer=0; 
//		while(rs.next()) {
//			klantnummer=rs.getInt(1);
//		}
//		nieuweKlant.setKlantnummer(klantnummer);
//		System.out.println(nieuweKlant);
//		
//
//	}
	

}
