package mainEnviro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextPane;

public class MainMenuScreen {

	private JFrame frmMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuScreen window = new MainMenuScreen();
					window.frmMainMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenuScreen() {
		initialize();
	}
	
	public void MainMenu() {
		MainMenuScreen window = new MainMenuScreen();
		window.frmMainMenu.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainMenu = new JFrame();
		frmMainMenu.setTitle("Monster Fighter");
		frmMainMenu.setBounds(100, 100, 500, 500);
		frmMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainMenu.getContentPane().setLayout(null);
		
		JButton btnMainMenuInformation = new JButton("View Game Information");
		btnMainMenuInformation.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMainMenuInformation.setBounds(76, 76, 315, 49);
		frmMainMenu.getContentPane().add(btnMainMenuInformation);
		
		JButton btnMainMenuMonsters = new JButton("View Your Monsters");
		btnMainMenuMonsters.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMainMenuMonsters.setBounds(76, 136, 315, 49);
		frmMainMenu.getContentPane().add(btnMainMenuMonsters);
		
		JButton btnMainMenuInventory = new JButton("View Your Inventory");
		btnMainMenuInventory.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMainMenuInventory.setBounds(76, 196, 315, 49);
		frmMainMenu.getContentPane().add(btnMainMenuInventory);
		
		JButton btnMainMenuBattles = new JButton("View Daily Battles");
		btnMainMenuBattles.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMainMenuBattles.setBounds(76, 256, 315, 49);
		frmMainMenu.getContentPane().add(btnMainMenuBattles);
		
		JButton btnMainMenuShop = new JButton("Visit The Shop");
		btnMainMenuShop.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMainMenuShop.setBounds(76, 316, 315, 49);
		frmMainMenu.getContentPane().add(btnMainMenuShop);
		
		JButton btnMainMenuSleep = new JButton("Go To Sleep");
		btnMainMenuSleep.setFont(new Font("Verdana", Font.BOLD, 15));
		btnMainMenuSleep.setBounds(76, 376, 315, 49);
		frmMainMenu.getContentPane().add(btnMainMenuSleep);
	}
}