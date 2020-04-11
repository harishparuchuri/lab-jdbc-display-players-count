package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager{
	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException
	{
		Properties p=LoadPropertiesFile();
		{
			String driver=p.getProperty("driver");
			String url=p.getProperty("url");
			String user=p.getProperty("username");
			String password=p.getProperty("password");
			Class.forName(driver);
			
			Connection con;
			con=DriverManager.getConnection(url,user,password);
			return con;
			
		}
	}
	public static Properties LoadPropertiesFile() throws IOException
	{
		Properties prop=new Properties();
		InputStream in=ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		
		return prop;
		
	}
}

