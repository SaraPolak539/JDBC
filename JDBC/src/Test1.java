import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test1 {
	    public static void main(String args[])
	    {
			try{  
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/demo","root","1234");  
			//here demo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from tb1");  
			while(rs.next())  {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
				//secont option using getObject
				//  for(int i=1; i<=2; i++) {
			//	System.out.print(rs.getObject(i)+ " ");}
		//	System.out.println();
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
	}


