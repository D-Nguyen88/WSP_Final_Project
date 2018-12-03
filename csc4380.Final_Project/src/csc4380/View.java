/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author aaron
 */
public class View extends javax.swing.JFrame {

    Controller controller;
    
    int lastScore;
    
    String currentVehicle;
    
    
    
    ImageIcon redCar, blueCar, greenCar, purpleCar, yellowCar, redTruck, blueTruck,
            greenTruck, purpleTruck, yellowTruck;
    JButton btnRedCar, btnBlueCar, btnGreenCar, btnPurpleCar, btnYellowCar, btnRedTruck,
            btnBlueTruck, btnGreenTruck, btnPurpleTruck, btnYellowTruck;
    
    Boolean[] carsOwned;
    
//    HighScorePanel highPanel;
//    
//    Score[] scores;
//    
    GamePanel gamePanel;
    
    /**
     * Creates new form View
     */
    public View(Controller c) {
        
        controller = c;
        lastScore = 0;
        
        initComponents();
        
        createLoginDialog();
        
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screen.getWidth() - getWidth()) /2);
        int y = (int) ((screen.getHeight() -getHeight()) /2);
        setLocation(x, y); 
        
        gamePanel = new GamePanel();
//        InGamePanel.add(gamePanel);
        getContentPane().add(gamePanel, "gamePanel");
        
        carsOwned = new Boolean[9];
        for(int i = 0; i < carsOwned.length; i++)
        {
            carsOwned[i] = false;
        }
        
         String localDir = System.getProperty("user.dir");
         
        redCar = new ImageIcon(localDir + "/src/resources/red_car.png");
        btnRedCar = new JButton(redCar);
        
        btnRedCar.setSize(55,60);
        btnRedCar.setLocation(60, 100);
        //button.setEditable(false);
        shopPanel.add(btnRedCar);
        btnRedCar.addActionListener(e -> c.btnRedCarAction(this));
        
        
        blueCar = new ImageIcon(localDir + "/src/resources/blue_car.png");
        btnBlueCar = new JButton(blueCar);
        
        btnBlueCar.setSize(55,60);
        btnBlueCar.setLocation(190, 100);
        //button.setEditable(false);
        shopPanel.add(btnBlueCar);
        btnBlueCar.addActionListener(e -> c.btnBlueCarAction(this));
        
        
        
        greenCar = new ImageIcon(localDir + "/src/resources/green_car.png");
        btnGreenCar = new JButton(greenCar);
        
        btnGreenCar.setSize(55,60);
        btnGreenCar.setLocation(320, 100);
        //button.setEditable(false);
        shopPanel.add(btnGreenCar);
        btnGreenCar.addActionListener(e -> c.btnGreenCarAction(this));
        
        
        
        purpleCar = new ImageIcon(localDir + "/src/resources/purple_car.png");
        btnPurpleCar = new JButton(purpleCar);
        
        btnPurpleCar.setSize(55,60);
        btnPurpleCar.setLocation(450, 100);
        //button.setEditable(false);
        shopPanel.add(btnPurpleCar);
        btnPurpleCar.addActionListener(e -> c.btnPurpleCarAction(this));
        
        
        
        yellowCar = new ImageIcon(localDir + "/src/resources/yellow_car.png");
        btnYellowCar = new JButton(yellowCar);
        
        btnYellowCar.setSize(55,60);
        btnYellowCar.setLocation(580, 100);
        //button.setEditable(false);
        shopPanel.add(btnYellowCar);
        btnYellowCar.addActionListener(e -> c.btnYellowCarAction(this));
        
        
        
        redTruck = new ImageIcon(localDir + "/src/resources/red_truck.png");
        btnRedTruck = new JButton(redTruck);
        
        btnRedTruck.setSize(55,60);
        btnRedTruck.setLocation(60, 220);
        //button.setEditable(false);
        shopPanel.add(btnRedTruck);
        btnRedTruck.addActionListener(e -> c.btnRedTruckAction(this));
        
        
        
        blueTruck = new ImageIcon(localDir + "/src/resources/blue_truck.png");
        btnBlueTruck = new JButton(blueTruck);
        
        btnBlueTruck.setSize(55,60);
        btnBlueTruck.setLocation(190, 220);
        //button.setEditable(false);
        shopPanel.add(btnBlueTruck);
        btnBlueTruck.addActionListener(e -> c.btnBlueTruckAction(this));
        
        
        
        greenTruck = new ImageIcon(localDir + "/src/resources/green_truck.png");
        btnGreenTruck = new JButton(greenTruck);
        
        btnGreenTruck.setSize(55,60);
        btnGreenTruck.setLocation(320, 220);
        //button.setEditable(false);
        shopPanel.add(btnGreenTruck);
        btnGreenTruck.addActionListener(e -> c.btnGreenTruckAction(this));
        
        
        
        purpleTruck = new ImageIcon(localDir + "/src/resources/purple_truck.png");
        btnPurpleTruck = new JButton(purpleTruck);
        
        btnPurpleTruck.setSize(55,60);
        btnPurpleTruck.setLocation(450, 220);
        //button.setEditable(false);
        shopPanel.add(btnPurpleTruck);
        btnPurpleTruck.addActionListener(e -> c.btnPurpleTruckAction(this));
        
        
        
        yellowTruck = new ImageIcon(localDir + "/src/resources/yellow_truck.png");
        btnYellowTruck = new JButton(yellowTruck);
        
        btnYellowTruck.setSize(55,60);
        btnYellowTruck.setLocation(580, 220);
        //button.setEditable(false);
        shopPanel.add(btnYellowTruck);
        btnYellowTruck.addActionListener(e -> c.btnYellowTruckAction(this));
        
        
        
//        scores = new Score[5];
//        try {
//            highPanel = new HighScorePanel(scores);
//        } catch(FileNotFoundException e) {
//            System.err.println(e);
//        }
//        gamePanel = new GamePanel();
//        OutOfGamePanel.add(highPanel);
//        InGamePanel.add(gamePanel);
        
        setVisible(true);
        
        // Here we need to set the default value of currentVehicle. currentVehicle = "";
        currentVehicle = "/src/resources/red_car.png";
        
        
        lblMoneyAmt.setText("$" + controller.getMoney());
        userLabelBVal.setText("$" + controller.getMoney());
        
        userLabelUVal.setText(c.getCurrentUser());

    }
    
    public void updateMoney()
    {
        lblMoneyAmt.setText("$" + controller.getMoney());
        userLabelBVal.setText("$" + controller.getMoney());
    }
    
    public void setCurrentVehicleText(String s)
    {
        lblCurrVehicleVar.setText(s);
    }

    public void setLastScore(int s)
    {
        controller.setLastScore(s);
    }
    public void changeContext(String con)
    {
        //This code will change the card displayed from the game panel to 
        //panel represented by the passed in string
        
        CardLayout cards = (CardLayout)OutOfGamePanel.getParent().getLayout();
        cards.show(getContentPane(), con);
    }
    
    //This method returns the string that represents the current color of the selected
    //vehicle
    public String getCurrentVehicle() {
      return currentVehicle;  
    }
    
    public void setCurrentVehicle(String c)
    {
        currentVehicle = c;
    }
    public int getMoney()
    {
        return controller.getMoney();
    }
    public void setMoney(int m)
    {
        controller.setMoney(m);
    }
    
    public void addMoney(int m)
    {
        controller.setMoney(controller.getMoney()+m);
    }
    
    public void resetGame()
    {
        getContentPane().remove(gamePanel);
        gamePanel = new GamePanel();
        getContentPane().add(gamePanel, "gamePanel");
    }
    
    public String getLoginUser()
    {
        return login_userTextField.getText();
    }
    public String getLoginPass()
    {
        return login_passTextField.getText();
    }
    public String getRegisterUser()
    {
        return register_userTextField.getText();
    }
    public String getRegisterPass()
    {
        return register_passTextField.getText();
    }
    
    
    JTextField login_userTextField;
    JTextField login_passTextField; 
    JTextField register_userTextField; 
    JTextField register_passTextField; 
    
    public void createLoginDialog()
    {
        JDialog dialog; 
	JPanel dialogPanel; 
	
	// Dialog Components

        JTextField register_countryTextField; 
        
	JButton loginBtn; 
	JButton signupBtn; 
        
        dialogPanel = new JPanel(); 
		
		dialogPanel.setLayout(new GridLayout(0, 2, 40, 10));
		dialogPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		
		JLabel loginLabel = new JLabel("Login");
		JLabel registerLabel = new JLabel("Register"); 
		loginBtn = new JButton("Login"); 
		signupBtn = new JButton("Sign Up"); 
		
                // Initialize TextFields 
                login_userTextField = new JTextField("user Login"); 
                login_passTextField = new JTextField("pass Login"); 
                register_userTextField = new JTextField("user register"); 
                register_passTextField = new JTextField("pass register"); 
                register_countryTextField = new JTextField("country register");                
		
		loginLabel.setFont(new Font("Sans-Serif", Font.PLAIN, 25)); 
		registerLabel.setFont(new Font("Sans-Serif", Font.PLAIN, 25));
		
		dialogPanel.add(loginLabel);
		dialogPanel.add(registerLabel);
		
		dialogPanel.add(new JLabel("Existing Username")); 
		dialogPanel.add(new JLabel("New Username"));
		
		dialogPanel.add(login_userTextField);
		dialogPanel.add(register_userTextField);

		dialogPanel.add(new JLabel("Existing Password"));
		dialogPanel.add(new JLabel("New Password"));
		
		dialogPanel.add(login_passTextField); 
		dialogPanel.add(register_passTextField);
		
		dialogPanel.add(new JLabel("")); 
		dialogPanel.add(new JLabel("Native Country"));
		dialogPanel.add(new JLabel("")); 
		dialogPanel.add(register_countryTextField);
			
		dialogPanel.add(loginBtn);
		dialogPanel.add(signupBtn);
		dialogPanel.add(new JLabel("")); 
		dialogPanel.add(new JLabel(""));

		// Set Action Listeners for Login/Register 
		loginBtn.addActionListener(e -> controller.btnLogin(this));
		signupBtn.addActionListener(e -> controller.btnSignup(this));
						
		dialog = new JDialog();
		dialog.add(dialogPanel);
		dialog.setSize(500, 400);
		dialog.setLocationRelativeTo(null);
	    dialog.setVisible(true);
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pauseDialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        OutOfGamePanel = new javax.swing.JPanel();
        shopPanel = new javax.swing.JPanel();
        lblRedCar = new javax.swing.JLabel();
        lblBlueCar = new javax.swing.JLabel();
        lblGreenCar = new javax.swing.JLabel();
        lblPurpleCar = new javax.swing.JLabel();
        lblGoldCar = new javax.swing.JLabel();
        lblRedTruck = new javax.swing.JLabel();
        lblBlueTruck = new javax.swing.JLabel();
        lblGreenTruck = new javax.swing.JLabel();
        lblPurpleTruck = new javax.swing.JLabel();
        lblGoldTruck = new javax.swing.JLabel();
        lblCurrVehicle = new javax.swing.JLabel();
        lblCurrVehicleVar = new javax.swing.JLabel();
        lblMoney = new javax.swing.JLabel();
        lblMoneyAmt = new javax.swing.JLabel();
        lblStoreTitle = new javax.swing.JLabel();
        scorePanel = new javax.swing.JPanel();
        lblScore0 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblScore3 = new javax.swing.JLabel();
        lblScore4 = new javax.swing.JLabel();
        lblScoreTitle = new javax.swing.JLabel();
        userLabelBalance = new javax.swing.JPanel();
        userLabelUsername = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userLabelUVal = new javax.swing.JLabel();
        userLabelBVal = new javax.swing.JLabel();
        userLabelTitle = new javax.swing.JLabel();
        userLabelPB = new javax.swing.JLabel();
        userLabelLast = new javax.swing.JLabel();
        userLabelPBVal = new javax.swing.JLabel();
        userLabelLVal = new javax.swing.JLabel();
        menuPanel = new javax.swing.JPanel();
        btnNewGame = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        menuTitle = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        InGamePanel = new javax.swing.JPanel();
        GamePanel = new javax.swing.JPanel();

        jLabel2.setText("PAUSED");

        jButton1.setText("Return");

        javax.swing.GroupLayout pauseDialogLayout = new javax.swing.GroupLayout(pauseDialog.getContentPane());
        pauseDialog.getContentPane().setLayout(pauseDialogLayout);
        pauseDialogLayout.setHorizontalGroup(
            pauseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pauseDialogLayout.createSequentialGroup()
                .addGroup(pauseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pauseDialogLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2))
                    .addGroup(pauseDialogLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton1)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        pauseDialogLayout.setVerticalGroup(
            pauseDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pauseDialogLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        shopPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRedCar.setText("$0");

        lblBlueCar.setText("$2,000");

        lblGreenCar.setText("$3,000");

        lblPurpleCar.setText("$4,000");

        lblGoldCar.setText("$5,000");

        lblRedTruck.setText("$6,000");

        lblBlueTruck.setText("$7,000");

        lblGreenTruck.setText("$8,000");

        lblPurpleTruck.setText("$9,000");

        lblGoldTruck.setText("$10,000");

        lblCurrVehicle.setText("Current Vehicle:");

        lblCurrVehicleVar.setText("Red Car");

        lblMoney.setText("Money:");

        lblMoneyAmt.setText("$");

        lblStoreTitle.setText("Store");

        javax.swing.GroupLayout shopPanelLayout = new javax.swing.GroupLayout(shopPanel);
        shopPanel.setLayout(shopPanelLayout);
        shopPanelLayout.setHorizontalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCurrVehicle)
                .addGap(10, 10, 10)
                .addComponent(lblCurrVehicleVar)
                .addGap(150, 150, 150)
                .addComponent(lblMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMoneyAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shopPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblStoreTitle)
                .addGap(320, 320, 320))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shopPanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRedTruck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRedCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBlueCar)
                    .addComponent(lblBlueTruck))
                .addGap(64, 64, 64)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGreenCar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGreenTruck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(88, 88, 88)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPurpleCar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPurpleTruck, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(93, 93, 93)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGoldCar)
                    .addComponent(lblGoldTruck))
                .addGap(0, 89, Short.MAX_VALUE))
        );
        shopPanelLayout.setVerticalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblStoreTitle)
                .addGap(18, 18, 18)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrVehicle)
                    .addComponent(lblCurrVehicleVar)
                    .addComponent(lblMoney)
                    .addComponent(lblMoneyAmt))
                .addGap(18, 18, 18)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRedCar)
                    .addComponent(lblBlueCar)
                    .addComponent(lblGreenCar)
                    .addComponent(lblPurpleCar)
                    .addComponent(lblGoldCar))
                .addGap(106, 106, 106)
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRedTruck)
                    .addComponent(lblBlueTruck)
                    .addComponent(lblGreenTruck)
                    .addComponent(lblPurpleTruck)
                    .addComponent(lblGoldTruck))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        scorePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblScore0.setText("jLabel1");

        lblScore1.setText("jLabel2");

        lblScore2.setText("jLabel3");

        lblScore3.setText("jLabel4");

        lblScore4.setText("jLabel5");

        lblScoreTitle.setText("High Scores");

        javax.swing.GroupLayout scorePanelLayout = new javax.swing.GroupLayout(scorePanel);
        scorePanel.setLayout(scorePanelLayout);
        scorePanelLayout.setHorizontalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorePanelLayout.createSequentialGroup()
                .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(scorePanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblScore1)
                            .addComponent(lblScore0)
                            .addComponent(lblScore2)
                            .addComponent(lblScore3)
                            .addComponent(lblScore4)))
                    .addGroup(scorePanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblScoreTitle)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        scorePanelLayout.setVerticalGroup(
            scorePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scorePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblScoreTitle)
                .addGap(18, 18, 18)
                .addComponent(lblScore0)
                .addGap(18, 18, 18)
                .addComponent(lblScore1)
                .addGap(18, 18, 18)
                .addComponent(lblScore2)
                .addGap(18, 18, 18)
                .addComponent(lblScore3)
                .addGap(18, 18, 18)
                .addComponent(lblScore4)
                .addGap(17, 17, 17))
        );

        userLabelBalance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        userLabelUsername.setText("Username:");

        jLabel1.setText("Balance:");

        userLabelUVal.setText("jLabel2");

        userLabelBVal.setText("jLabel3");

        userLabelTitle.setText("User Info");

        userLabelPB.setText("PB Score:");

        userLabelLast.setText("Last Score:");

        userLabelPBVal.setText("2000");

        userLabelLVal.setText("1000");

        javax.swing.GroupLayout userLabelBalanceLayout = new javax.swing.GroupLayout(userLabelBalance);
        userLabelBalance.setLayout(userLabelBalanceLayout);
        userLabelBalanceLayout.setHorizontalGroup(
            userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLabelBalanceLayout.createSequentialGroup()
                .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLabelBalanceLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabelUsername)
                            .addComponent(jLabel1)
                            .addComponent(userLabelPB)
                            .addComponent(userLabelLast))
                        .addGap(38, 38, 38)
                        .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLabelBVal)
                            .addComponent(userLabelUVal)
                            .addComponent(userLabelPBVal)
                            .addComponent(userLabelLVal)))
                    .addGroup(userLabelBalanceLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(userLabelTitle)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        userLabelBalanceLayout.setVerticalGroup(
            userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLabelBalanceLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(userLabelTitle)
                .addGap(18, 18, 18)
                .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabelUsername)
                    .addComponent(userLabelUVal))
                .addGap(18, 18, 18)
                .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userLabelBVal))
                .addGap(18, 18, 18)
                .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabelPB)
                    .addComponent(userLabelPBVal))
                .addGap(18, 18, 18)
                .addGroup(userLabelBalanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabelLast)
                    .addComponent(userLabelLVal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        menuTitle.setText("Main Menu");

        btnDelete.setText("Delete User");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(menuTitle))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(menuTitle)
                .addGap(18, 18, 18)
                .addComponent(btnNewGame)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnQuit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout OutOfGamePanelLayout = new javax.swing.GroupLayout(OutOfGamePanel);
        OutOfGamePanel.setLayout(OutOfGamePanelLayout);
        OutOfGamePanelLayout.setHorizontalGroup(
            OutOfGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutOfGamePanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(shopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        OutOfGamePanelLayout.setVerticalGroup(
            OutOfGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutOfGamePanelLayout.createSequentialGroup()
                .addGroup(OutOfGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userLabelBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(OutOfGamePanel, "OutOfGame");

        javax.swing.GroupLayout GamePanelLayout = new javax.swing.GroupLayout(GamePanel);
        GamePanel.setLayout(GamePanelLayout);
        GamePanelLayout.setHorizontalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 693, Short.MAX_VALUE)
        );
        GamePanelLayout.setVerticalGroup(
            GamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout InGamePanelLayout = new javax.swing.GroupLayout(InGamePanel);
        InGamePanel.setLayout(InGamePanelLayout);
        InGamePanelLayout.setHorizontalGroup(
            InGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InGamePanelLayout.setVerticalGroup(
            InGamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(InGamePanel, "Game");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        // TODO add your handling code here:
        this.changeContext("gamePanel");
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GamePanel;
    private javax.swing.JPanel InGamePanel;
    private javax.swing.JPanel OutOfGamePanel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblBlueCar;
    private javax.swing.JLabel lblBlueTruck;
    private javax.swing.JLabel lblCurrVehicle;
    private javax.swing.JLabel lblCurrVehicleVar;
    private javax.swing.JLabel lblGoldCar;
    private javax.swing.JLabel lblGoldTruck;
    private javax.swing.JLabel lblGreenCar;
    private javax.swing.JLabel lblGreenTruck;
    private javax.swing.JLabel lblMoney;
    private javax.swing.JLabel lblMoneyAmt;
    private javax.swing.JLabel lblPurpleCar;
    private javax.swing.JLabel lblPurpleTruck;
    private javax.swing.JLabel lblRedCar;
    private javax.swing.JLabel lblRedTruck;
    private javax.swing.JLabel lblScore0;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    private javax.swing.JLabel lblScore3;
    private javax.swing.JLabel lblScore4;
    private javax.swing.JLabel lblScoreTitle;
    private javax.swing.JLabel lblStoreTitle;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JDialog pauseDialog;
    private javax.swing.JPanel scorePanel;
    private javax.swing.JPanel shopPanel;
    private javax.swing.JLabel userLabelBVal;
    private javax.swing.JPanel userLabelBalance;
    private javax.swing.JLabel userLabelLVal;
    private javax.swing.JLabel userLabelLast;
    private javax.swing.JLabel userLabelPB;
    private javax.swing.JLabel userLabelPBVal;
    private javax.swing.JLabel userLabelTitle;
    private javax.swing.JLabel userLabelUVal;
    private javax.swing.JLabel userLabelUsername;
    // End of variables declaration//GEN-END:variables
}
