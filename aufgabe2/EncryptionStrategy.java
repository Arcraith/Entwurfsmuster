package aufgabe2;

public interface EncryptionStrategy {

	public String encrypt(String original);
	
	public String decrypt(String encrypted);
}
