package DAO;

import java.sql.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;
public class Dao {
	Connection con;
	Statement sql;
	ResultSet rs;
	 //������
	  public boolean OpenConnection()
	  {
	   boolean mResult=true;
	   try
	   {
		    String url = "sun.jdbc.odbc.JdbcOdbcDriver";
			Class.forName(url);
			con = DriverManager.getConnection("jdbc:odbc:dao", "", "");
	
	    sql=con.createStatement();
	     mResult=true;
	   }
	   catch(Exception e)
	   {
	     System.out.println(e.toString());
	     mResult=false;
	   }
	   return (mResult);
	  }

	  //�ر����ݿ�����
	  public void CloseConnection()
	  {
	   try
	   {
	     sql.close();
	     con.close();
	   }
	   catch(Exception e)
	   {
	     System.out.println(e.toString());
	   }
	  }
	  //��ѯ
	  public ResultSet ExecuteQuery(String SqlString)
	  {
	    ResultSet result=null;
	    try
	    {
	      result=sql.executeQuery(SqlString);
	    }
	    catch(Exception e)
	    {
	      System.out.println(e.toString());
	    }
	    return (result);
	  }

	//���ݸ���(����ɾ����)
	  public int ExecuteUpdate(String SqlString)
	  {
	    int result=0;
	    try
	    {
	      result=sql.executeUpdate(SqlString);
	    }
	    catch(Exception e)
	    {
	      System.out.println(e.toString());
	    }
	    return (result);
	  }

		//public String getStr(String stzd,String tablezd,String tjzd,String tj) 
	  /*public String getStr(String stzd,String tablezd,String tj) 
		{
              String name="";
			String condition="SELECT "+stzd+" FROM "+tablezd+" WHERE "+tj;
			OpenConnection();
			rs = ExecuteQuery(condition);	
			try{
				while (rs.next()) 
			{
				name =(String)rs.getString(1);
					//name=(String)rs.get
				 return name;
				//list.add(name);
			}

			 CloseConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}

			
			//return name;
		}
*/
	  public LinkedList getList(String listzd,String tablezd) {
			LinkedList list = new LinkedList();
			String condition = "SELECT "+listzd+" FROM "+tablezd;
			OpenConnection();
			rs = ExecuteQuery(condition);	
			try{
				while (rs.next()) 
			{
				String name = rs.getString(1);
				list.add(name);
			}

			 CloseConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}

			
			return list;
		}
	/*public LinkedList getList(String listzd,String tablezd) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = "SELECT qlyid FROM Guanliyuan where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			String name = rs.getString(1);
			list.add(name);
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}*/
	  public LinkedList slygetList1(String a) {
			LinkedList list = new LinkedList();
			//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
			String condition = a;
			OpenConnection();
			rs = ExecuteQuery(condition);
			try{
				while (rs.next()) 
			{
				String id = rs.getString(1);
			    String name = rs.getString(2);
				String xb = rs.getString(3);
				String birth = rs.getString(4);
				String adress = rs.getString(5);
				String tel = rs.getString(6);
				String mm = rs.getString(7);
				String free=rs.getString(8);
				list.add(id);
				list.add("/");
				list.add(mm);
				list.add("/");
				list.add(name);
				list.add("/");
				list.add(xb);
				list.add("/");
				list.add(birth);
				list.add("/");
				
				list.add(tel);
				list.add("/");
				list.add(adress);
				list.add("/");
				list.add(free);
				
				list.add("\n");
				
			}

			 CloseConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}

			
			return list;
		}
	////////////////////����Ա//////////////////////////////////////////
	public LinkedList ylfgetList1(String a) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			String id = rs.getString(1);
			String mm = rs.getString(2);
			String xb = rs.getString(3);
			String name = rs.getString(4);
			String adress = rs.getString(5);
			String tel = rs.getString(6);
			//list.add("\n");
			list.add(id);
			list.add("/");
			list.add(mm);
			list.add("/");
			list.add(xb);
			list.add("/");
			list.add(name);
			list.add("/");
			list.add(adress);
			list.add("/");
			list.add(tel);
			list.add("\n");
			
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}
	/////////////��ѯ���һ�����///////////////
	public  String ylfgetList2(String a) {
		//LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		String id = null;
		OpenConnection();
		rs = ExecuteQuery(condition);
		int ss = 0,kk=0;
		try{
	        while (rs.next()) {
	        	ss++;
	        }
		}
	        catch (SQLException e) {
	    		System.out.println(e);
	        }
	    		CloseConnection();
	    		OpenConnection();
	    		rs = ExecuteQuery(condition);
	        try{
	        while (rs.next()) {
	        	kk++;
	          
            if(kk==ss){
            	
			 id = rs.getString(1); 
		
			//list.add("\n");
			
            }}
	       // System.out.print(kk);
        	//System.out.print(ss);
		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return id;
	}
	//
	public LinkedList ylfgetList3(String condition) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		//String condition = "SELECT qlyid FROM Guanliyuan where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		OpenConnection();
		rs = ExecuteQuery(condition);
		
		try{
			while (rs.next()) 
		{
			String id = rs.getString(1);
			list.add(id);
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}
	//����ĳһ����ֵ�γɵ������б�
	public JComboBox getCombox(LinkedList list)
	{
		JComboBox  combox=new JComboBox();
		for(int i=0;i<list.size();i++)
		{combox.addItem(list.get(i));}
		return combox;
		
	}
	
	//�õ���Ӧĳ��SQL������к�������������
	public int getRowSum(String sql)
	
	{
		int rownum=0;
		OpenConnection();
		rs = ExecuteQuery(sql);
		
		
		try{
			while (rs.next()) 
		{
			//String name = rs.getString(1);
			//list.add(name);
				rownum++;
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}
		return rownum;
	}
	
//ͨ������SQL�������ý����ת���ɶ�ά���鷵��
	public Object[][] getErArray(int rownum,String sql)
	{
	
		Object[][] str = null;
	OpenConnection();
	rs = ExecuteQuery(sql);
	try{
		str=new Object[rownum][rs.getMetaData().getColumnCount()];
		
		for(int i=1;rs.next();i++)
		{
			
			for(int j=0;j<rs.getMetaData().getColumnCount();j++)
			{
		
				str[i-1][j]=(Object)rs.getString(j+1);
	
			}
		
        }
     CloseConnection();
    
       } 
	catch (SQLException e) 
	{
	System.out.println(e);
     }
	return str;		
	}
	//���ݲ��������õ���Ӧ������������
	public Object[] getItemName(String biaoname)
	{
	
		Object[] item = null;
	if(biaoname.equals("CanguanBiao"))
	{
		//Object[] name={"�͹ݱ��","�͹�����","�͹ݵ绰","�͹ݵ�ַ","�͹ݸ�����","�͹�����"};
		Object[] name={"�͹ݱ��","�͹�����","�͹ݵ绰","�͹ݵ�ַ","�͹ݸ�����","�͹�����"};
		item=name;
		//return name;
	}
	else if(biaoname.equals("DemoBiao"))
	{
		Object[] name={"�͹ݱ��","�˵����","�˵�����","�˵�����"};
		item=name;
		//return name;
	}
	else if(biaoname.equals("KehuBiao"))
	{
		Object[] name={"�ͻ����","�ͻ�����","�ͻ��Ա�","�ͻ��绰"};
		item=name;
		//return name;
	}
	else if(biaoname.equals("DingdanBiao"))
	{
		Object[] name={"�������","�ͻ����","˾�����","�˵����","��������"};
		item=name;
		//return name;
	}
	else if(biaoname.equals("DdzhifuBiao"))
	{
		Object[] name={"�˵����","�˵�����","֧����ʽ","֧�����"};
		item=name;
		//return name;
	}
	else if(biaoname.equals("DriverBiao"))
	{
		Object[] name={"˾�����","˾������","˾���Ա�","��������","˾���绰","˾����ַ"};
		item=name;
		//return name;
	}
	return item;
	}

	//��ȡ�±�� 
	public String ylfgetNewID(LinkedList list)
	{
		String id=(String)list.getLast();
		//String temp=id.substring(2);	
		int oldindex=Integer.parseInt(id);
		int newindex=oldindex+1;
		//String newid=id.substring(0,2)+String.valueOf(newindex);
		String newid=String.valueOf(newindex);
		return newid;	
	}
	//�ж�ĳһ����ڲ������ݿ��� 
	public boolean equalID(String str,LinkedList list)
	{
		boolean flag=false;
		for(int i=0;i<list.size();i++)
		{
			String temp=(String)list.get(i);
			if(str.equals(temp))
			{
				flag=true;
				}
			else
			{
				flag=false;
				
				}
			
		}
		
		return flag;	

	}
//�ж�ĳһ�ֶ�ֵ��û�������ݿ��趨��Χ
	public boolean dbEqual(String str,int index)
	{
		boolean flag=false;
		if(str.length()<=index)
		{flag=true;}
		else
		{flag=false;}
		return flag;
		
	}
//�����
	//�����ݿ��е�ĳһ�ֶ�ֵ���������ֶ�ֵ��������
	  public LinkedList mjmgetList(String listzd,String tablezd) {
			LinkedList list = new LinkedList();
			String condition = "SELECT "+listzd+" FROM "+tablezd;
			OpenConnection();
			rs = ExecuteQuery(condition);	
			try{
				while (rs.next()) 
			{
				String name = rs.getString(1);
				list.add(name);
			}

			 CloseConnection();
		} catch (SQLException e) {
			System.out.println(e);
		}

			
			return list;
		}
			  
	  ////////////////////����//////////////////////////////////////////
	public LinkedList mjmgetList1(String a) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			String id = rs.getString(1);
			String mm = rs.getString(2);
			String xb = rs.getString(3);
			String name = rs.getString(4);
			String adress = rs.getString(5);
			//String tel = rs.getString(6);
			//list.add("\n");
			list.add(id);
			list.add("/");
			list.add(mm);
			list.add("/");
			list.add(xb);
			list.add("/");
			list.add(name);
			list.add("/");
			list.add(adress);
			list.add("/");
//			list.add(tel);
		list.add("\n");
			
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}
	 ////////////////////����2//////////////////////////////////////////
	public LinkedList mjmgetList2(String a) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			String id = rs.getString(1);
			String mm = rs.getString(2);
			String xb = rs.getString(3);
			String name = rs.getString(4);
			String adress = rs.getString(5);
			String tel = rs.getString(6);
			//list.add("\n");
			list.add(id);
			list.add("/");
			list.add(mm);
			list.add("/");
			list.add(xb);
			list.add("/");
			list.add(name);
			list.add("/");
			list.add(adress);
			list.add("/");
			list.add(tel);
		list.add("\n");
			
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}
//
	//����ĳ����ĳһ�ֶε�ֵ
	public void mjmgetUpdate(String biaoname,String zdname,String zdvalue,String idname,String idvalue)
	{
		String sql="update "+biaoname+" set "+zdname+"='"+zdvalue+"' where "+idname+"='"+idvalue+"';";
		OpenConnection();
		ExecuteUpdate(sql);	
	    CloseConnection();
	}
	
public double mjmDzqty(double a,int b)
{
	double dzqty=0.0;
	dzqty=a*b;
	return dzqty;
}
	/////////////////////////////////////////
	public LinkedList cmlList1(String a) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			String id = rs.getString(1);
			String mm = rs.getString(2);
			String xb = rs.getString(3);
			String name = rs.getString(4);
			String name1 = rs.getString(5);
			String name2 = rs.getString(6);
			list.add(id);
			list.add("\u0008");
			//list.add("/");
			list.add(mm);
			list.add("\u0008");
			//list.add("/");
			list.add(xb);
			
			list.add("\u0008");
			//list.add("/");
			list.add(name);
			list.add("\u0008");
			list.add(name1);
			list.add("\u0008");
			list.add(name2);
			list.add("\u0008");
			//list.add("/");
		    list.add("\n");
			
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}
	///////////////������////////////////////////
	public LinkedList wysyhList1(String a) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String id=null;
		String condition = a;
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			 id = rs.getString(1);						
			list.add(id);
		  //list.add("\n");
			
		}

		CloseConnection();
		} catch (SQLException e) {
		System.out.println(e);
		}

		//return id;
		return list;
		}

	public Object[][] wysgetErArray(int rownum,String sql)
	{

	Object[][] str = null;
	OpenConnection();
	rs = ExecuteQuery(sql);
	try{
	str=new Object[rownum][rs.getMetaData().getColumnCount()+1];

	for(int i=1;rs.next();i++)
	{
		
		for(int j=0;j<rs.getMetaData().getColumnCount();j++)
		{

			str[i-1][j]=(Object)rs.getString(j+1);

		}
		str[i-1][rs.getMetaData().getColumnCount()]="";
	}
	CloseConnection();

	} 
	catch (SQLException e) 
	{
	System.out.println(e);
	}
	return str;		
	}
	public LinkedList wysList1(String a) {
		LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		OpenConnection();
		rs = ExecuteQuery(condition);
		try{
			while (rs.next()) 
		{
			String id = rs.getString(1);
			String mm = rs.getString(2);
			String xb = rs.getString(3);
			String name = rs.getString(4);						
			list.add(id);
			list.add("\u0008");
			//list.add("/");
			list.add(mm);
			list.add("\u0008");
			//list.add("/");
			list.add(xb);
			list.add("Ԫ");
			list.add("\u0008");
			//list.add("/");
			list.add(name);
			list.add("\u0008");
			//list.add("/");
		    list.add("\n");
			
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return list;
	}
	public  String wysgetList2(String a) {
		//LinkedList list = new LinkedList();
		//String condition = "SELECT "+a+" FROM "+b+" where qlyname='"+listzd+"'and glymm='"+tablezd+"'";
		String condition = a;
		String id = null;
		OpenConnection();
		rs = ExecuteQuery(condition);
		int ss = 0,kk=0;
		try{
	        while (rs.next()) {
	        	ss++;
	        }
		}
	        catch (SQLException e) {
	    		System.out.println(e);
	        }
	    		CloseConnection();
	    		OpenConnection();
	    		rs = ExecuteQuery(condition);
	        try{
	        while (rs.next()) {
	        	kk++;
	          
            if(kk==ss){
            	
			 id = rs.getString(1); 
		
			//list.add("\n");
			
            }}
	       // System.out.print(kk);
        	//System.out.print(ss);
		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}

		
		return id;
	}
	//////////////////////////////////////
	//
	//��ȡ�±�� 
	public String mjmgetNewID(LinkedList list)
	{
		String id=(String)list.getLast();
		//String temp=id.substring(2);	
		int oldindex=Integer.parseInt(id);
		int newindex=oldindex+1;
		//String newid=id.substring(0,2)+String.valueOf(newindex);
		String newid=String.valueOf(newindex);
		return newid;	
	}
	//����ĳһ�ֶ�ֵ��ȡ���ֶε�idֵ��id�����������ֶ������ֶ�ֵ��
	public String mjmgetID (String idname,String biaoname,String zdname,String zdvalue){
		String id=null;
		OpenConnection();
		rs = ExecuteQuery("select "+idname+" from "+biaoname+" where "+zdname+"='"+zdvalue+"'");
		
		
		
		try{
			while (rs.next()) 
		{
			 id = rs.getString(1);
			//list.add(name);
				
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}
		return id;
	}
		

//����sql����ѯidֵ
	public String slygetID (String sql){
		String id=null;
		OpenConnection();
		rs = ExecuteQuery(sql);
		
		
		
		try{
			while (rs.next()) 
		{
			 id = rs.getString(1);
			//list.add(name);
				
		}

		 CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
	}
		return id;
	}
	
	
	
}

	/*public Object link(String string) {
		// TODO Auto-generated method stub
		OpenConnection();
		//rs = ExecuteQuery(condition);
		rs =sql.executeQuery("select * from Guanliyuan");
		rs.last();
		int rows=rs.getRow();
		System.out.println("Guanliyuan����"+rows+"����¼");
		rs.afterLast();
		System.out.println("�������Guanliyuan���еļ�¼");
		try{
			while (rs.previous()) 
		{
			String id = rs.getString(1);
			String mm = rs.getString(2);
			String xb = rs.getString(3);
			String name = rs.getString(4);
			String adress = rs.getString(5);
			String tel = rs.getString(6);
			System.out.printf("%-4s",id);
			System.out.printf("%-4s",mm);
			System.out.printf("%-4s",name);
			System.out.printf("%-4s",xb);
			System.out.printf("%-4s",adress);
			System.out.printf("%-4s",tel);
		}

		 CloseConnection();
	} 
	catch (SQLException e) {
		System.out.println(e);
	}
		//return list;

	
	//	return null;
	}
}
*/
