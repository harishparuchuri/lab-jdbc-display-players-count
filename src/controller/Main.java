package controller;

import java.sql.SQLException;
import java.util.Map.Entry;

import dao.SkillDAO;

public class Main{
	public static void main(String []args) throws SQLException, Exception
	{
		SkillDAO skilldao=new SkillDAO();
		
		System.out.println("skill\t player");
		for (Entry<String, Integer> entry : skilldao.skillCount().entrySet()) 
			System.out.println( entry.getKey() + "	     " + entry.getValue()); 
	}
}
