import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



class MainScreen implements KeyListener
{
	int c=0;
	JFrame f;
	JMenuItem help, about;
	JButton btnLogin, btnExit;
	JTextField txtUsername;
	JPasswordField txtPassword;
	String username,password;
	MainScreen()
	{
		f = new JFrame();
		f.setSize(1500,1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar mb = new JMenuBar();
			JMenu menuAbout = new JMenu("About");
			JMenu menuHelp = new JMenu("Help");

			try
			{
				f.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("bg.png")))));
			}
			catch(Exception e)
			{

			}
			f.setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
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

			JPanel MainPanel = new JPanel();
			MainPanel.setLayout(new BoxLayout(MainPanel,BoxLayout.Y_AXIS));

			JPanel panelLogin = new JPanel();
			Font ft = new Font("Arial",Font.PLAIN,35);
			JLabel log = new JLabel("L O G I N :  ");
			log.setFont(new Font("Ostrich sans",Font.BOLD,45));

			txtUsername = new JTextField(10);
			txtUsername.setFont(ft);

			txtPassword = new JPasswordField(10);
			txtPassword.setFont(ft);

			panelLogin.add(log);
			panelLogin.add(txtUsername);
			panelLogin.add(txtPassword);

			btnLogin = new JButton("Login");
			btnLogin.setFont(ft);
			btnLogin.setBackground(Color.decode("#abb7ff"));
			btnLogin.setOpaque(true);
			btnLogin.addMouseListener(new MouseAdapter(){

								public void mouseClicked(MouseEvent e)
								{
									username = txtUsername.getText();
									password = txtPassword.getText();

									if(username.equals("abc") && password.equals("xyz"))
									{
										JOptionPane.showMessageDialog(null,"Login Success");
										MainMenu m = new MainMenu();
									}
									else
									{
										JOptionPane.showMessageDialog(null,"Incorrect username or password");

									}

								}

				});

			btnExit = new JButton(new ImageIcon("ps.png"));
			btnExit.setFont(ft);
			btnExit.setBackground(Color.decode("#abb7ff"));
			btnExit.setOpaque(true);
			btnExit.addMouseListener(new MouseAdapter(){

							public void mouseClicked(MouseEvent e)
							{
								System.exit(0);
							}


				});

			panelLogin.add(btnLogin);
			panelLogin.add(btnExit);

			MainPanel.add(panelLogin);

			f.add(MainPanel);
			f.setJMenuBar(mb);

		f.setVisible(true);
	}


	public void keyPressed(KeyEvent e)
	{

	}

	public void keyReleased(KeyEvent e)
	{


	}

	public void keyTyped(KeyEvent e)
	{

	}
	public static void main(String[] args)
	{
		MainScreen mf = new MainScreen();
	}
}




