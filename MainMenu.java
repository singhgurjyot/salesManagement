import java.awt.*;
import java.io.*;
import java.sql.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

class MainMenu
{
	JMenuItem help, about;
	MainMenu()
	{
		JFrame f = new JFrame();
		f.setSize(1500,1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);


		JMenuBar mb = new JMenuBar();
		JMenu menuAbout = new JMenu("About");
		JMenu menuHelp = new JMenu("Help");
		mb.add(menuHelp);
		mb.add(menuAbout);

		help = new JMenuItem("Help");
		help.addMouseListener(new MouseAdapter(){

						public void mouseClicked()
						{

						}

			});

		about = new JMenuItem("About Us");
		about.addMouseListener(new MouseAdapter(){

						public void mouseClicked()
						{

						}

			});

		menuHelp.add(help);
		menuAbout.add(about);
		f.setJMenuBar(mb);

		try
				{
					JLabel img = new JLabel(new ImageIcon(ImageIO.read(new File("bg.png"))));
					f.setContentPane(img);
					img.setHorizontalAlignment(SwingConstants.CENTER);
				}
				catch(Exception e)
				{

				}
			f.setLayout(null);

		Font ft = new Font("ostrich sans",Font.BOLD,50);

		JButton btnLogout = new JButton(new ImageIcon("ps.png"));
		btnLogout.setBounds(1400,20,55,55);
		btnLogout.setFont(ft);
		btnLogout.setBackground(Color.decode("#8f8f8f"));
		btnLogout.addMouseListener(new MouseAdapter(){

							public void mousePressed(MouseEvent e)
							{
								MainScreen m = new MainScreen();
							}

			});

		JButton btnBillList = new JButton("L i s t  B i l l");
		btnBillList.setBounds(890,250,500,200);
		btnBillList.setFont(ft);
		btnBillList.setBackground(Color.decode("#01897b"));
		btnBillList.setForeground(Color.white);
		btnBillList.addMouseListener(new MouseAdapter(){

							public void mousePressed(MouseEvent e)
							{
								ListBill lb = new ListBill();
							}
			});

		JButton btnNewOrder = new JButton("N e w  O r d e r");
		btnNewOrder.setBounds(80,250,500,200);
		btnNewOrder.setFont(ft);
		btnNewOrder.setBackground(Color.decode("#01897b"));
		btnNewOrder.setForeground(Color.white);
		btnNewOrder.addMouseListener(new MouseAdapter(){

						public void mousePressed(MouseEvent e)
						{
							Order o = new Order();
						}

			});

		JButton btnStockInfo = new JButton("S t o c k  I n f o");
		btnStockInfo.setBounds(80,550,500,200);
		btnStockInfo.setFont(ft);
		btnStockInfo.setBackground(Color.decode("#01897b"));
		btnStockInfo.setForeground(Color.white);
		btnStockInfo.addMouseListener(new MouseAdapter(){

						public void mousePressed(MouseEvent e)
						{
							StockList sl = new StockList();
						}

			});

		JButton btnAddEditStock = new JButton("A d d / E d i t  S t o c k");
		btnAddEditStock.setBounds(890,550,500,200);
		btnAddEditStock.setFont(ft);
		btnAddEditStock.setBackground(Color.decode("#01897b"));
		btnAddEditStock.setForeground(Color.white);
		btnAddEditStock.addMouseListener(new MouseAdapter(){

						public void mousePressed(MouseEvent e)
						{
							AddEdit ae = new AddEdit();
						}

			});


		f.add(btnLogout);
		f.add(btnNewOrder);
		f.add(btnBillList);
		f.add(btnStockInfo);
		f.add(btnAddEditStock);
		f.setVisible(true);

	}

	public static void main(String[] args)
	{
		MainMenu m = new MainMenu();
	}
}