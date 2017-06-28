package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.Box;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;

import DAO.Dao;
import javax.swing.ImageIcon;

public class main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public main(final String user) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(main.class.getResource("/Image/00.PNG")));
		setTitle(user+"  "+"���!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 475);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 734, 21);
		contentPane.add(menuBar);
		
		JMenu menu_2 = new JMenu("\u5BA2\u6237\u7BA1\u7406");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_4 = new JMenuItem("\u67E5\u8BE2\u5BA2\u6237\u4FE1\u606F");
		menuItem_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-��ѯ�ͻ���Ϣ
				SelectClient selectClient = new SelectClient();  //��ʼ����ѯ�ͻ�����
				selectClient.setLocationRelativeTo(null);  //������ʾ
				selectClient.setVisible(true);  //��ʾ
			}
		});
		menu_2.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u4FEE\u6539\u5BA2\u6237\u4FE1\u606F");
		menuItem_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-�޸Ŀͻ���Ϣ
				UpdateClient upd = new UpdateClient();  //��ʼ���޸Ŀͻ�����
				upd.setLocationRelativeTo(null);  //���þ�����ʾ
				upd.setVisible(true);  //��ʾ
			}
		});
		menu_2.add(menuItem_5);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u589E\u52A0\u5BA2\u6237");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-���ӿͻ�
				AddClient add = new AddClient();  //��ʼ�����ӿͻ�����
				add.setLocationRelativeTo(null);  //������ʾ
				add.setVisible(true);  //��ʾ
			}
		});
		menu_2.add(mntmNewMenuItem);
		
		JMenuItem menuItem_6 = new JMenuItem("\u5220\u9664\u5BA2\u6237");
		menuItem_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-ɾ���ͻ�
				DeleteClient del = new DeleteClient();  //��ʼ��ɾ���ͻ�����
				del.setLocationRelativeTo(null);   //������ʾ
				del.setVisible(true);  //��ʾ
			}
		});
		menu_2.add(menuItem_6);
		
		JMenu menu_3 = new JMenu("\u8BA2\u5355\u7BA1\u7406");
		menuBar.add(menu_3);
		
		JMenuItem menuItem_7 = new JMenuItem("\u67E5\u8BE2\u8BA2\u5355\u4FE1\u606F");
		menuItem_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-��ѯ����
				SelectOrder selectOrder = new SelectOrder(); //��ʼ������
				selectOrder.setLocationRelativeTo(null);  //����
				selectOrder.setVisible(true);  //��ʾ
			}
		});
		menu_3.add(menuItem_7);
		
		JMenuItem menuItem_8 = new JMenuItem("\u4FEE\u6539\u8BA2\u5355\u4FE1\u606F");
		menuItem_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-�޸Ķ���
				UpdateOrder updateOrder = new UpdateOrder();  //��ʼ������
				updateOrder.setLocationRelativeTo(null);  //����
				updateOrder.setVisible(true);  //��ʾ
			}
		});
		menu_3.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("\u589E\u52A0\u8BA2\u5355");
		menuItem_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-���Ӷ���
				AddOrder addOrder = new  AddOrder();  //��ʼ������
				addOrder.setLocationRelativeTo(null);  //����
				addOrder.setVisible(true);  //��ʾ
			}
		});
		menu_3.add(menuItem_9);
		
		JMenuItem menuItem_10 = new JMenuItem("\u5220\u9664\u8BA2\u5355");
		menuItem_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-ɾ������
				DeleteOrder deleteOrder = new DeleteOrder();  //��ʼ��
				deleteOrder.setLocationRelativeTo(null);  //����
				deleteOrder.setVisible(true);  //��ʾ
			}
		});
		menu_3.add(menuItem_10);
		
		JMenu mnNewMenu = new JMenu("\u9152\u5E97\u7BA1\u7406");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_11 = new JMenuItem("\u67E5\u8BE2\u623F\u95F4\u4FE1\u606F");
		menuItem_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-��ѯ����
				SelectRoom selectRoom = new SelectRoom();  //��ʼ��
				selectRoom.setLocationRelativeTo(null);  //����
				selectRoom.setVisible(true);  //��ʾ
			}
		});
		mnNewMenu.add(menuItem_11);
		
		JMenuItem menuItem_12 = new JMenuItem("\u4FEE\u6539\u623F\u95F4\u4FE1\u606F");
		menuItem_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-�޸ķ�����Ϣ
				UpdateRoom updateRoom = new UpdateRoom();  //��ʼ��
				updateRoom.setLocationRelativeTo(null);  //����
				updateRoom.setVisible(true);  //��ʾ
			}
		});
		mnNewMenu.add(menuItem_12);
		
		JMenuItem menuItem_13 = new JMenuItem("\u589E\u52A0\u623F\u95F4");
		menuItem_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu- ��ӷ���
				AddRoom addRoom = new AddRoom();  //��ʼ��
				addRoom.setLocationRelativeTo(null);  //����
				addRoom.setVisible(true);  //��ʾ
			}
		});
		mnNewMenu.add(menuItem_13);
		
		JMenuItem menuItem_14 = new JMenuItem("\u5220\u9664\u623F\u95F4");
		menuItem_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-ɾ������
				DeleteRoom deleteRoom = new DeleteRoom();  //��ʼ��
				deleteRoom.setLocationRelativeTo(null);  //����
				deleteRoom.setVisible(true);  //��ʾ
			}
		});
		mnNewMenu.add(menuItem_14);
		
		JMenu menu = new JMenu("\u7CFB\u7EDF\u7EF4\u62A4");
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("\u7BA1\u7406\u5458\u4FE1\u606F");
		menu.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u4FEE\u6539\u7528\u6237\u540D");
		menuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-�����û���
				dispose();
				updateUser upduser = new updateUser();  //��ʼ�������û�������
				upduser.setLocationRelativeTo(null);  //������ʾ
				upduser.setVisible(true);   //��ʾ
			}
		});
		menu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		menuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-��������
				updatePassword updatePaw = new updatePassword(); //��ʼ���޸��������
				updatePaw.setLocationRelativeTo(null); //������ʾ
				updatePaw.setVisible(true); //��ʾ
			}
		});
		menu_1.add(menuItem_3);
		
		JMenuItem menuItem = new JMenuItem("\u589E\u52A0\u7BA1\u7406\u5458");
		menuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-���ӹ���Ա
				addUser adu = new addUser();  //��ʼ�����ӹ���Ա����
				adu.setLocationRelativeTo(null);  //������ʾ
				adu.setVisible(true);  //��ʾ
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u5220\u9664\u7BA1\u7406\u5458");
		menuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//menu-ɾ������Ա
				deleteUser dlu = new deleteUser();  //��ʼ��ɾ������Ա����
				dlu.setLocationRelativeTo(null);  //������ʾ
				dlu.setVisible(true);  //��ʾ
			}
		});
		menu.add(menuItem_1);
		
		final JButton btn_101 = new JButton("101");
		//////////////////////////
		//��ѯ����״̬��������ɫ
		SelectColor selectColor = new SelectColor();
		/////////////////////////
		final String col_101 = selectColor.SSColor("101");
//		System.out.print(ss);
		if(col_101.equals("��ס")){
			btn_101.setBackground(Color.RED);
		}else if(col_101.equals("�շ�")){
			btn_101.setBackground(Color.GREEN);
		}else if(col_101.equals("ά��")){
			btn_101.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_101.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//101
				if(col_101.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
//						System.out.print("ss");
						String sql="update tb_room set ro_state='�շ�' where ro_id='101'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_101.setBackground(Color.GREEN); //Ӧ��ˢ���������
//						System.exit(0);
//						setVisible(true);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});
		
		btn_101.setBounds(476, 254, 93, 38);
		contentPane.add(btn_101);
		
		final JButton btn_102 = new JButton("102");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_102 = selectColor.SSColor("102");
		if(col_102.equals("��ס")){
			btn_102.setBackground(Color.RED);
		}else if(col_102.equals("�շ�")){
			btn_102.setBackground(Color.GREEN);
		}else if(col_102.equals("ά��")){
			btn_102.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_102.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//102
				if(col_102.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='102'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_102.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});

		btn_102.setBounds(567, 254, 93, 38);
		contentPane.add(btn_102);
		
		final JButton btn_201 = new JButton("201");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_201 = selectColor.SSColor("201");
		if(col_201.equals("��ס")){
			btn_201.setBackground(Color.RED);
		}else if(col_201.equals("�շ�")){
			btn_201.setBackground(Color.GREEN);
		}else if(col_201.equals("ά��")){
			btn_201.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_201.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//201
				if(col_201.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='201'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_201.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
						
					}
				}
			}
		});

		btn_201.setBounds(476, 292, 93, 38);
		contentPane.add(btn_201);
		
		final JButton btn_202 = new JButton("202");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_202 = selectColor.SSColor("202");
		if(col_202.equals("��ס")){
			btn_202.setBackground(Color.RED);
		}else if(col_202.equals("�շ�")){
			btn_202.setBackground(Color.GREEN);
		}else if(col_202.equals("ά��")){
			btn_202.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_202.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//202
				if(col_202.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='202'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_202.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});

		btn_202.setBounds(567, 292, 93, 38);
		contentPane.add(btn_202);
		
		final JButton btn_301 = new JButton("301");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_301 = selectColor.SSColor("301");
		if(col_301.equals("��ס")){
			btn_301.setBackground(Color.RED);
		}else if(col_301.equals("�շ�")){
			btn_301.setBackground(Color.GREEN);
		}else if(col_301.equals("ά��")){
			btn_301.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_301.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//301
				if(col_301.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='301'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_301.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});

		btn_301.setBounds(476, 327, 93, 38);
		contentPane.add(btn_301);
		
		final JButton btn_302 = new JButton("302");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_302 = selectColor.SSColor("302");
		if(col_302.equals("��ס")){
			btn_302.setBackground(Color.RED);
		}else if(col_302.equals("�շ�")){
			btn_302.setBackground(Color.GREEN);
		}else if(col_302.equals("ά��")){
			btn_302.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_302.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//302
				if(col_302.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='302'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_302.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});
		btn_302.setBounds(567, 327, 93, 38);
		contentPane.add(btn_302);
		
		final JButton btn_401 = new JButton("401");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_401 = selectColor.SSColor("401");
		if(col_401.equals("��ס")){
			btn_401.setBackground(Color.RED);
		}else if(col_401.equals("�շ�")){
			btn_401.setBackground(Color.GREEN);
		}else if(col_401.equals("ά��")){
			btn_401.setBackground(Color.CYAN);
		}
		//////////////////////////
		btn_401.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//401
				if(col_401.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='401'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_401.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});

		btn_401.setBounds(476, 364, 93, 38);
		contentPane.add(btn_401);
		
		final JButton btn_402 = new JButton("402");
		/////////////////////////
		//��ѯ����״̬��������ɫ
		final String col_402 = selectColor.SSColor("402");
		if(col_402.equals("��ס")){
			btn_402.setBackground(Color.RED);
		}else if(col_402.equals("�շ�")){
			btn_402.setBackground(Color.GREEN);
		}else if(col_402.equals("ά��")){
			btn_402.setBackground(Color.CYAN);
		}
		/////////////////////////
		btn_402.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//402
				if(col_402.equals("��ס")){
					int n =JOptionPane.showConfirmDialog(null, "ȷ��Ҫ����������Ϊ�շ���", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
					if(n==0){
						String sql="update tb_room set ro_state='�շ�' where ro_id='402'";
						Dao dao = new Dao();
						dao.OpenConnection();
						dao.ExecuteUpdate(sql);
						dao.CloseConnection();
//						btn_402.setBackground(Color.GREEN);
						dispose();
						main mmMain = new main(user);
						mmMain.setLocationRelativeTo(null);
						mmMain.setVisible(true);
					}
				}
			}
		});

		btn_402.setBounds(567, 364, 93, 38);
		contentPane.add(btn_402);
		
		JLabel lblNewLabel = new JLabel("\u5546\u52A1\u5927\u5E8A\u623F");
		lblNewLabel.setBounds(401, 266, 127, 15);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u8C6A\u534E\u5957\u623F");
		label.setBounds(401, 302, 127, 15);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u6807\u51C6\u53CC\u4EBA\u95F4");
		label_1.setBounds(401, 340, 127, 15);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u6807\u51C6\u5927\u5E8A\u623F");
		label_2.setBounds(401, 375, 127, 15);
		contentPane.add(label_2);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setIcon(new ImageIcon(main.class.getResource("/Image/01.PNG")));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���û�
				AddClient addClient = new AddClient();
				addClient.setLocationRelativeTo(null);
				addClient.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(144, 66, 60, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setIcon(new ImageIcon(main.class.getResource("/Image/02.PNG")));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�¶���
				AddOrder addOrder = new AddOrder();
				addOrder.setLocationRelativeTo(null);
				addOrder.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(272, 66, 60, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setIcon(new ImageIcon(main.class.getResource("/Image/03.PNG")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ѯ����
				SelectOrder selectOrder = new SelectOrder();
				selectOrder.setLocationRelativeTo(null);
				selectOrder.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(401, 66, 60, 60);
		contentPane.add(btnNewButton_4);
		
		table = new JTable();
		table.setBackground(Color.RED);
		table.setBounds(437, 412, 19, 15);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBackground(Color.GREEN);
		table_1.setBounds(505, 412, 19, 15);
		contentPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setBackground(Color.CYAN);
		table_2.setBounds(577, 412, 19, 15);
		contentPane.add(table_2);
		
		JLabel lblNewLabel_1 = new JLabel("\u5DF2\u4F4F");
		lblNewLabel_1.setBounds(466, 412, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_3 = new JLabel("\u7A7A\u623F");
		label_3.setBounds(534, 412, 54, 15);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u7EF4\u4FEE");
		label_4.setBounds(606, 412, 54, 15);
		contentPane.add(label_4);
		
		JButton button = new JButton("");
		button.setBackground(Color.WHITE);
		button.setIcon(new ImageIcon(main.class.getResource("/Image/04.PNG")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�˳�
				int n =JOptionPane.showConfirmDialog(null, "ȷ���˳�ϵͳ��", "��ʾ��Ϣ", JOptionPane.YES_NO_OPTION);
				if(n==0){
					System.exit(0);
				}
				
			}
		});
		button.setBounds(526, 66, 60, 60);
		contentPane.add(button);
		
		JLabel label_5 = new JLabel("\u6DFB\u52A0\u7528\u6237");
		label_5.setBounds(144, 152, 54, 15);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u6DFB\u52A0\u8BA2\u5355");
		label_6.setBounds(279, 152, 54, 15);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u67E5\u8BE2\u8BA2\u5355");
		label_7.setBounds(407, 152, 54, 15);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u9000\u51FA\u7CFB\u7EDF");
		label_8.setBounds(534, 152, 54, 15);
		contentPane.add(label_8);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(main.class.getResource("/Image/05.PNG")));
		lblNewLabel_2.setBounds(0, 21, 734, 416);
		contentPane.add(lblNewLabel_2);
	}
}
