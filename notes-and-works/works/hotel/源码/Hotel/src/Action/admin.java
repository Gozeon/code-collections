package Action;

import java.sql.ResultSet;

import DAO.Dao;

public class admin {

	/**
	 * @param args
	 */
	public String adminUser;
	public String adminPassword;
///////////////////////////////////////////////////////////////////	
	//��ӹ���Ա
	public void addUser(String sql){
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//ɾ������Ա
	public void deleteUser(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//�޸��û���-����Ա
	public void updateUser(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//�޸�����-����Ա
	public void updatePassword(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
///////////////////////////////////////////////////////////////////	
	//���ӿͻ�
	public void addClient(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//ɾ���ͻ�
	public void deleteClient(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//��ѯ�û�
	public ResultSet selectClient(String sql) {
		ResultSet rs=null;
		Dao dao = new Dao();
		dao.OpenConnection();
		rs=dao.ExecuteQuery(sql);
		return rs; 
	}
	//�޸��û�
	public void updateClient(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
///////////////////////////////////////////////////////////////////
	//��ѯ����
	public ResultSet selectOrder(String sql) {
		ResultSet rs=null;
		Dao dao = new Dao();
		dao.OpenConnection();
		rs=dao.ExecuteQuery(sql);
		return rs; 
	}
	//�޸Ķ���
	public void updateOrder(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//ɾ������
	public void deleteOrder(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//��Ӷ���
	public void addOrder(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
	}
///////////////////////////////////////////////////////////////////	
	//��ӷ���
	public void addRoom(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//ɾ������
	public void deleteRoom(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//�޸ķ�����Ϣ
	public void updateRoom(String sql) {
		Dao dao = new Dao();
		dao.OpenConnection();
		dao.ExecuteUpdate(sql);
		dao.CloseConnection();
	}
	//��ѯ������Ϣ
	public ResultSet selectRoom(String sql) {
		ResultSet rs=null;
		Dao dao = new Dao();
		dao.OpenConnection();
		rs=dao.ExecuteQuery(sql);
		return rs; 
	}
}
