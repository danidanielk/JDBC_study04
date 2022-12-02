import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.kim.db.manager.DaniDBManager;
//3 ¹ø
public class DAO {

	public ArrayList<Reservation> getAllReserve() {
		

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = DaniDBManager.connect();
			String sql ="select * from resevation ";
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			
			
			ArrayList<Reservation> rsvs = new ArrayList<>();
			
			Reservation r= null;
			while(rs.next()) {
				r=new Reservation();
				r.setNo(rs.getInt("rr_no"));
				r.setName(rs.getString("rr_name"));
				r.setWhen(rs.getDate("rr_date"));
				r.setPhone(rs.getString("rr_phone"));
				r.setLocation(rs.getString("rr_location"));
				rsvs.add(r);
			}
			return rsvs;
			
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			// TODO: handle exception
		}finally {
			DaniDBManager.close(con, pstmt, rs);
		}
		
	}
		
		
	

}
