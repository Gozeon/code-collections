package Action;

public class CreateSql {
	public CreateSql () {
		
	}
////////////////////////////////////////////////////////////////////////////////////////
	//���ӹ���Ա
	public String addSql(String user,String paw) {
		String sql = "";
		sql = "insert into tb_admin values('"+user+"','"+paw+"')";
		return sql;
	}
	//ɾ������Ա
	public String deleteSql(String user) {
		String sql = "";
		sql = "delete from tb_admin where user='"+user+"'";
		return sql;
	}
	//�޸��û���
	public String updateUser(String onam,String nnam) {
		String sql = "";
		sql = "update tb_admin set user = '"+nnam+"' where user = '"+onam+"'";
		return sql;
	}
	//�޸�����
	public String updatePassword(String nam,String paw) {
		String sql = "";
		sql = "update tb_admin set password = '"+paw+"' where user = '"+nam+"'";
		return sql;
	}
////////////////////////////////////////////////////////////////////////////////////////
	//���ӿͻ�
	public String addClient(String name, String paw,String adr) {
		String sql = "";
		sql = "insert into tb_client values('"+name+"','"+paw+"','"+adr+"',' ')";
		return sql;
	}
	//ɾ���ͻ�
	public String deleteClient(String name){
		String sql = "";
		sql = "delete from tb_client where cl_name = '"+name+"'";
		return sql;
	}
	//��ѯ�û�
	public String selectClient(String name) {
		String sql = "";
		sql = "select cl_address,or_id from tb_client where cl_name = '"+name+"'";
		return sql;
	}
	//�޸��û�
	public String updateCient(String name,String paw,String adr,String or_id) {
		String sql = "";
		sql = "update tb_client set cl_password='"+paw+"',cl_address='"+adr+"',or_id='"+or_id+"' where cl_name='"+name+"'";
		return sql;
	}
////////////////////////////////////////////////////////////////////////////////////////
	//��ѯ����
	public String selectOrder(String id) {
		String sql = "";
		sql = "select ro_id,or_intime,or_outtime from tb_order where or_id = '"+id+"'";
		return sql;
	}
	//�޸Ķ���
	public String updateOrder(String or_id,String ro_id,String intime,String outtime) {
		String sql = "";
		sql = "update tb_order set ro_id='"+ro_id+"',or_inTime='"+intime+"',or_outTime='"+outtime+"' where or_id='"+or_id+"'";
		return sql;
	}
	//ɾ������
	public String deleteOrder(String id) {
		String sql = "";
		sql = "delete from tb_order where or_id = '"+id+"'";
		return sql;
	}
	//��Ӷ���
	public String addOrder(String or_id, String ro_id,String intime,String outtime) {
		String sql = "";
		sql = "insert into tb_order values('"+or_id+"','"+ro_id+"','"+intime+"','"+outtime+"')";
		return sql;
	}
////////////////////////////////////////////////////////////////////////////////////////
	//���ӷ���
	public String addRoom(String id,String style,String price,String state) {
		String sql = "";
		sql = "insert into tb_room values('"+id+"','"+style+"','"+price+"','"+state+"')";
		return sql;
	}
	//ɾ������
	public String deleteRoom(String id) {
		String sql = "";
		sql = "delete from tb_room where ro_id = '"+id+"'";
		return sql;
	}
	//�޸ķ�����Ϣ
	public String updateRoom(String id,String style,String price,String state) {
		String sql = "";
		sql = "update tb_room set ro_style='"+style+"',ro_price='"+price+"',ro_state='"+state+"' where ro_id='"+id+"'";
		return sql;
	}
	//��ѯ������Ϣ
	public String selectRoom(String id) {
		String sql = "";
		sql = "select ro_style,ro_price,ro_state from tb_room where ro_id = '"+id+"'";
		return sql;
	}
////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String[] args) {
		
	}

}
