import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;


/**
 *
 * @author Group 2: Chris Penepent, Katherine Shaw, Fahad Alotaibi, Nazar Al-Wattar
 */
//Class for main program window. Contains main().
public class MainMenuUI extends javax.swing.JFrame {

	private ArrayList<ArrayList<String>> profs;
	private MySQLDatabase MySQLDB;
	
	/**
	 * Creates new form MainMenuUI
	 */
	public MainMenuUI() {		
		//ADAPTED FROM: http://stackoverflow.com/a/8881235
		//prompt for database password, only used during development due to each team member using a different pw
			//for their local copy of the database
		/*
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter database password:");
		JPasswordField pass = new JPasswordField(16);
		panel.add(label);
		panel.add(pass);
		String[] options = new String[]{"OK", "Cancel"};
		//database password prompt
		int option = JOptionPane.showOptionDialog(null, panel, "Enter Password",
								 JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
								 null, options, pass);
		if (option == 0) // pressing OK button
		{
			String pw = new String(pass.getPassword());
			this.connectToDatabase(pw);
		}
		else { //Cancel
			System.exit(0);
		}*/
		
		this.connectToDatabase("student"); //pw for the lab computers
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchByButtonGroup = new javax.swing.ButtonGroup();
        mainMenuPanel = new javax.swing.JPanel();
        userNameField = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        facultyMembersLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        keywordField = new javax.swing.JTextField();
        //prepare to pre-populate combobox with default entry
        String[] defaultItem = new String[1];
        defaultItem[0] = "<click here to select professor name>"; //default option
        facultyNameComboBox = new javax.swing.JComboBox(defaultItem);
        titleLabel = new javax.swing.JLabel();
        facultyNameLabel = new javax.swing.JLabel();
        keywordLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        searchByPanel = new javax.swing.JPanel();
        titleRadioButton = new javax.swing.JRadioButton();
        searchByLabel = new javax.swing.JLabel();
        facultyNameRadioButton = new javax.swing.JRadioButton();
        keywordRadioButton = new javax.swing.JRadioButton();
        adminPanelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faculty Database");

        mainMenuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Menu"));

        userNameLabel.setText("User Name");

        passwordLabel.setText("Password");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        facultyMembersLabel.setText("Faculty Members");

        titleField.setEnabled(false);
        titleField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                titleFieldDocumentUpdated(evt);
            }
            public void removeUpdate(DocumentEvent evt) {
                titleFieldDocumentUpdated(evt);
            }
            public void changedUpdate(DocumentEvent evt) {
                titleFieldDocumentUpdated(evt);
            }
        });

        keywordField.setEnabled(false);
        keywordField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent evt) {
                keywordFieldDocumentUpdated(evt);
            }
            public void removeUpdate(DocumentEvent evt) {
                keywordFieldDocumentUpdated(evt);
            }
            public void changedUpdate(DocumentEvent evt) {
                keywordFieldDocumentUpdated(evt);
            }
        });

        facultyNameComboBox.setEnabled(false);
        facultyNameComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                facultyNameComboBoxSelected(evt);
            }
        });
        this.updateFacultyNameComboBox();

        titleLabel.setText("Title");

        facultyNameLabel.setText("Choose Faculty Name");

        keywordLabel.setText("Keyword");

        searchButton.setText("Search");
        searchButton.setEnabled(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchByPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        searchByButtonGroup.add(titleRadioButton);
        titleRadioButton.setText("Title");
        titleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleRadioButtonActionPerformed(evt);
            }
        });

        searchByLabel.setText("Search By");

        searchByButtonGroup.add(facultyNameRadioButton);
        facultyNameRadioButton.setText("Faculty Name");
        facultyNameRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyNameRadioButtonActionPerformed(evt);
            }
        });

        searchByButtonGroup.add(keywordRadioButton);
        keywordRadioButton.setText("Keyword");
        keywordRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keywordRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchByPanelLayout = new javax.swing.GroupLayout(searchByPanel);
        searchByPanel.setLayout(searchByPanelLayout);
        searchByPanelLayout.setHorizontalGroup(
            searchByPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchByPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchByPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchByLabel)
                    .addGroup(searchByPanelLayout.createSequentialGroup()
                        .addComponent(titleRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(facultyNameRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(keywordRadioButton)))
                .addContainerGap())
        );
        searchByPanelLayout.setVerticalGroup(
            searchByPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchByPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchByLabel)
                .addGap(26, 26, 26)
                .addGroup(searchByPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleRadioButton)
                    .addComponent(facultyNameRadioButton)
                    .addComponent(keywordRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminPanelButton.setText("Admin Panel");
        adminPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPanelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuPanelLayout = new javax.swing.GroupLayout(mainMenuPanel);
        mainMenuPanel.setLayout(mainMenuPanelLayout);
        mainMenuPanelLayout.setHorizontalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addComponent(searchByPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                        .addComponent(adminPanelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userNameLabel)
                                    .addComponent(passwordLabel))
                                .addGap(15, 15, 15)
                                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginButton)
                                    .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                                .addComponent(facultyMembersLabel)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuPanelLayout.createSequentialGroup()
                                        .addComponent(titleLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(mainMenuPanelLayout.createSequentialGroup()
                                        .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(keywordLabel)
                                            .addComponent(facultyNameLabel))
                                        .addGap(18, 18, 18)))
                                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(titleField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(facultyNameComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 239, Short.MAX_VALUE)
                                    .addComponent(keywordField))
                                .addGap(38, 38, 38))))))
        );
        mainMenuPanelLayout.setVerticalGroup(
            mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facultyMembersLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchByPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyNameLabel))
                .addGap(34, 34, 34)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keywordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keywordLabel))
                .addGap(20, 20, 20)
                .addGroup(mainMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(adminPanelButton))
                .addContainerGap())
        );

        passwordLabel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	//When the search button is pressed, perform one of three serches depending on which search field is enabled
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // To Search By Paper's Title
		//only occurs if Title radio button is selected and text entry field is not empty
        if (this.titleField.isEnabled() && !this.titleField.getText().isEmpty()){
			ArrayList<BLPaper> result = new ArrayList<>();
            try{ //execute a query with the user-entered title
				result = BLPaper.searchPapersByTitle(this.titleField.getText().trim());
            }catch(DLException e){
                JOptionPane.showMessageDialog(null, "Could not complete operation. Details written to log file.");
			}
			PaperUI paperUI = new PaperUI();
			if(result != null){
				for(BLPaper paper : result){ //populate list of papers in search results window
					paperUI.getTitleCBX().addItem(paper);
				}
			}
			paperUI.setLocationRelativeTo(null);
			paperUI.setVisible(true); //make search results window visible
		}
		//Search by faculty member
		//only occurs if Faculty Name radio button is selected and the default option in the combobox is not selected
		else if (this.facultyNameComboBox.isEnabled() && this.facultyNameComboBox.getSelectedIndex() > 0) {
            try {
                int index = this.facultyNameComboBox.getSelectedIndex() - 1; //because first "prof" in list is blank
                int id = Integer.parseInt(this.profs.get(index).get(0));
				facultyInforUI facultyInfoWindow = new facultyInforUI(id);
				facultyInfoWindow.setLocationRelativeTo(null);
				facultyInfoWindow.setVisible(true);
            } catch (DLException ex) {
                Logger.getLogger(MainMenuUI.class.getName()).log(Level.SEVERE, null, ex);
            }
		}
        // To Search By Paper's Keyword
		//only occurs if keyword radio button is selected and text entry field is not empty
		else if (this.keywordField.isEnabled() && !this.keywordField.getText().isEmpty()) {
			ArrayList<BLPaper> result = new ArrayList<>();
			try{ //execute a query with the user-entered keyword
				result = BLPaper.searchPapersByKeywords(this.keywordField.getText());
			}catch(DLException e){
				System.out.println(e.toString());
			}
			PaperUI paperUI = new PaperUI();
			if(result != null)
				for(BLPaper paper : result){ //populate list of papers in search results window
					paperUI.getTitleCBX().addItem(paper);
				}
			paperUI.setLocationRelativeTo(null);
			paperUI.setVisible(true); //make search results window visible
		}
		else {
			this.searchButton.setEnabled(false); //if none of the above is true this button should not be enabled to begin with!
		}
    }//GEN-LAST:event_searchButtonActionPerformed

	//RadioButtonActionPerformed methods contain logic to enable/disable search fields as appropriate
    private void keywordRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keywordRadioButtonActionPerformed
		if (this.facultyNameComboBox.isEnabled()){ //if we're switching from the Faculty Name radio button
			this.facultyNameComboBox.setEnabled(false); //then the combobox needs to be disabled
		}
		if (this.titleField.isEnabled()){ //if we're switching from the Title radio button
			this.titleField.setEnabled(false); //then the Title text field needs to be disabled
		}
		this.keywordField.setEnabled(true);
		if (this.keywordField.getDocument().getLength() == 0 && this.searchButton.isEnabled()) {
			this.searchButton.setEnabled(false); //if the keyword search field is empty and the search button is enabled
		}											//then the search button needs to be disabled
    }//GEN-LAST:event_keywordRadioButtonActionPerformed

	//RadioButtonActionPerformed methods contain logic to enable/disable search fields as appropriate
    private void facultyNameRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyNameRadioButtonActionPerformed
		if (this.titleField.isEnabled()){ //if we're switching from the Title radio button
			this.titleField.setEnabled(false); //then the Title text field needs to be disabled
		}
		if (this.keywordField.isEnabled()){ //if we're switching from the Keyword radio button
			this.keywordField.setEnabled(false); //then the Keyword text field needs to be disabled
		}
		this.facultyNameComboBox.setEnabled(true);
		if (this.facultyNameComboBox.getSelectedIndex() == 0 && this.searchButton.isEnabled()) {
			this.searchButton.setEnabled(false); //if the default item is selected and the Search button is enabled
		}											//then the search button needs to be disabled
    }//GEN-LAST:event_facultyNameRadioButtonActionPerformed

	//RadioButtonActionPerformed methods contain logic to enable/disable search fields as appropriate
    private void titleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleRadioButtonActionPerformed
		if (this.facultyNameComboBox.isEnabled()){ //if we're switching from the Faculty Name radio button
			this.facultyNameComboBox.setEnabled(false); //then the combobox needs to be disabled
		}
		if (this.keywordField.isEnabled()){ //if we're switching from the Keyword radio button
			this.keywordField.setEnabled(false); //then the Keyword text field needs to be disabled
		}
		this.titleField.setEnabled(true);
		if (this.titleField.getDocument().getLength() == 0 && this.searchButton.isEnabled()) {
			this.searchButton.setEnabled(false);//if the title search field is empty and the search button is enabled
		}											//then the search button needs to be disabled
    }//GEN-LAST:event_titleRadioButtonActionPerformed

	//Attempt a faculty login if the username and password fields are filled out
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = this.userNameField.getText();
		String password = new String(this.passwordField.getPassword());
		//only attempt login if both a username and password have been entered
		if (username.length() > 0 && password.length() > 0) {
			int facultyId;
			try {
				facultyId = BLFaculty.login(username,password);
				FacultyEdit facultyEditWindow = new FacultyEdit(facultyId);
				facultyEditWindow.setLocationRelativeTo(null);
				facultyEditWindow.setVisible(true);
			}
			catch (DLException e) {
				JOptionPane.showMessageDialog(null, "Invalid login credentials.");
				this.userNameField.setText("");
				this.passwordField.setText("");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter username and password.");
		}
    }//GEN-LAST:event_loginButtonActionPerformed

	//Open JOptionPane to get admin login credentials, attempt admin login, open AdminEdit window if successful
    private void adminPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPanelButtonActionPerformed
        JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		JLabel unameLabel = new JLabel("Enter admin username:");
		JTextField uname = new JTextField(16);
		JLabel pwLabel = new JLabel("Enter admin password:");
		JPasswordField pass = new JPasswordField(16);
		panel.add(unameLabel);
		panel.add(uname);
		panel.add(pwLabel);
		panel.add(pass);
		String[] options = new String[]{"OK", "Cancel"};
		//prompt for admin credentials
		int option = JOptionPane.showOptionDialog(null, panel, "Enter Admin Username and Password",
								 JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
								 null, options, uname);
		String username = uname.getText();
		String pw = new String(pass.getPassword());
		if (option == 0 && !username.isEmpty() && !pw.isEmpty()) // pressing OK button with a password entered
		{
			try {
				BLAdmin.login(username,pw);
				//ActionEvent will permit the AdminEdit window to reference this MainMenuUI frame in order to call
					//the method updateFacultyNameComboBox()
				AdminEdit adminPanelWindow = new AdminEdit(new ActionEvent(this,ActionEvent.ACTION_PERFORMED,""));
				adminPanelWindow.setLocationRelativeTo(null);
				adminPanelWindow.setVisible(true);
			}
			catch (DLException e) {
				JOptionPane.showMessageDialog(null, "Invalid login credentials.");
				this.userNameField.setText("");
				this.passwordField.setText("");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Please enter username and password.");
		}
    }//GEN-LAST:event_adminPanelButtonActionPerformed

	//enable/disable search button based on whether or not title search field currently contains text
	private void titleFieldDocumentUpdated(DocumentEvent evt) {
		Document titleFieldDocument = (Document)evt.getDocument();
		if (titleFieldDocument.getLength() > 0) {
			//enable the search button if the title field currently has stuff in it
			this.searchButton.setEnabled(true);
		}
		else {
			//disable the search button if the title field is now empty
			this.searchButton.setEnabled(false);
		}
	}
	
	//enable/disable search button based on whether or not a faculty member has been selected from the combobox
	private void facultyNameComboBoxSelected(ActionEvent evt) {
		JComboBox cb = (JComboBox)evt.getSource();
		if (cb.getSelectedIndex() > 0) {
			//enable the search button if a faculty name besides the default is now selected
			this.searchButton.setEnabled(true);
		}
		else {
			//disable the search button if the currently selected "faculty" name is the default
			this.searchButton.setEnabled(false);
		}
	}
	
	//enable/disable search button based on whether or not keyword search field currently contains text
	private void keywordFieldDocumentUpdated(DocumentEvent evt) {
		Document keywordFieldDocument = (Document)evt.getDocument();
		if (keywordFieldDocument.getLength() > 0) {
			//enable the search button if the keyword field currently has stuff in it
			this.searchButton.setEnabled(true);
		}
		else {
			//disable the search button if the keyword field is now empty
			this.searchButton.setEnabled(false);
		}
	}
	
	/**
	 * Start of program.
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				MainMenuUI mainMenu = new MainMenuUI();
				mainMenu.setLocationRelativeTo(null);
				mainMenu.setVisible(true);
			}
		});
	}
	
	//utility function for database connection
	private void connectToDatabase(String pw) {
		MySQLDB = MySQLDatabase.getInstance();
		try{
			MySQLDB.setPassword(pw);
			MySQLDB.connect();
		} //attempt connection to database
		catch(DLException e){
			JOptionPane.showMessageDialog(null, "Could not complete operation. Details written to log file.");
			System.exit(1);
		}
	}
	
	//utility function to repopulate the faculty name combobox; this is called from AdminEdit as that window is being closed
	public void updateFacultyNameComboBox() {
		try {
            this.profs = BLFaculty.profList();
        }
        catch(DLException e){
            JOptionPane.showMessageDialog(null, "Could not complete operation. Details written to log file.");
        }
        //prepare to populate combobox
		int firstNewItem = this.facultyNameComboBox.getItemCount() - 1; //this will be used to index prof name list, disclude default item
        for (int i=firstNewItem;i<this.profs.size();i++) {
			this.facultyNameComboBox.addItem(this.profs.get(i).get(1));
        }
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminPanelButton;
    private javax.swing.JLabel facultyMembersLabel;
    private javax.swing.JComboBox facultyNameComboBox;
    private javax.swing.JLabel facultyNameLabel;
    private javax.swing.JRadioButton facultyNameRadioButton;
    private javax.swing.JTextField keywordField;
    private javax.swing.JLabel keywordLabel;
    private javax.swing.JRadioButton keywordRadioButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel mainMenuPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.ButtonGroup searchByButtonGroup;
    private javax.swing.JLabel searchByLabel;
    private javax.swing.JPanel searchByPanel;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JRadioButton titleRadioButton;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}