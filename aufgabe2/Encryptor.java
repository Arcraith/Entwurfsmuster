package aufgabe2;

public class Encryptor {

	private EncryptionStrategy encryptionStrategy;
	
	public String encrypt(String original){
		return encryptionStrategy.encrypt(original);
	}
	
	public void setEncryptionStrategy(EncryptionStrategy strategy){
		this.encryptionStrategy = strategy;
	}
	
	public String decrypt(String encrypted){
		return encryptionStrategy.decrypt(encrypted);
	}
}
