package aufgabe2;

public class Reverse implements EncryptionStrategy{

	@Override
	public String encrypt(String original) {
		
		return new StringBuilder(original).reverse().toString();
	}
	
	public String decrypt(String encrypted){
		return new StringBuilder(encrypted).reverse().toString();
	}

}
