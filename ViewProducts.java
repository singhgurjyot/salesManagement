import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

class ViewProducts// implements ActionListener
{
	ViewProducts()
	{
		JFrame f = new JFrame();
		f.setSize(800,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout(FlowLayout.CENTER,0,20));





		Font heading = new Font("Arial Black",Font.PLAIN,25);
		JLabel head = new JLabel("List Of Products");
		head.setFont(heading);
		head.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));

		JPanel Pline = new JPanel();


		JLabel line = new JLabel("-------");
		Pline.add(line);
		String qry,code,name,mrp,stock;

		qry = "select * from Products;";
try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmanagement","root","");
			Statement Ps = Con.createStatement();
			ResultSet Rs = Ps.executeQuery(qry);

			while(Rs.next())
			{

			}
}
catch(Exception e)
{

	}

		main.add(head);
		main.add(Pline);
		f.add(main);
		f.setVisible(true);
	}

	public static void main(String[] args)
	{
		ViewProducts vp = new ViewProducts();
	}
}