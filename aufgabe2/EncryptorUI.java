package aufgabe2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class EncryptorUI extends JFrame{

	private Encryptor encryptor;
	private JTextArea original;
	private JTextArea encrypted;
	private JButton encrypt;
	private JButton decrypt;
	private HashMap<String, EncryptionStrategy> encryptionMap;
	private JComboBox comboBox;
	
	public EncryptorUI() {
		encryptor = new Encryptor();
		encryptionMap = new HashMap<String, EncryptionStrategy>();
		encryptionMap.put("Copy", new Copy());
		encryptionMap.put("Reverse", new Reverse());
		
		Box box = Box.createVerticalBox();
		add(box);
		
		original = new JTextArea();
		original.setBorder(new TitledBorder("Original"));
		encrypted = new JTextArea();
		encrypted.setBorder(new TitledBorder("Encrypted"));
		box.add(original);
		box.add(encrypted);
		
		Box buttonBox = Box.createHorizontalBox();
		box.add(buttonBox);
		
		encrypt = new JButton("Encrypt");
		encrypt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				encrypted.setText(encryptor.encrypt(original.getText()));
			}
		});
		decrypt = new JButton("Decrypt");
		decrypt.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				original.setText(encryptor.decrypt(encrypted.getText()));
			}
		});
		comboBox = new JComboBox(encryptionMap.keySet().toArray());
		comboBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Object selectedStrategy = comboBox.getSelectedItem();
				EncryptionStrategy strategy = encryptionMap.get(selectedStrategy);
				encryptor.setEncryptionStrategy(strategy);
			}
		});
		comboBox.setSelectedIndex(0);
		buttonBox.add(encrypt);
		buttonBox.add(decrypt);
		buttonBox.add(comboBox);
				
	}
	
	public static void main(String[] args) {
		EncryptorUI frame = new EncryptorUI();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
