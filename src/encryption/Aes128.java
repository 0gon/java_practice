package encryption;


import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
 
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.binary.Base64;

public class Aes128 {
	
    public static void main(String[] args) {
    	 
   
 }
	
	   // 키
    private final static String KEY = "";
    // 128bit (16자리)
    private final static String KEY_128 = KEY.substring(0, 16);
    
    // 256bit (32자리)
    private final static String KEY_256 = KEY.substring(0, 32);

    // AES 128 암호화
    public static String encryptAES128(String string) {
           try {
                   byte[] keyData = KEY_128.getBytes(CharEncoding.UTF_8);
                   // 운용모드 CBC, 패딩은 PKCS5Padding
                   Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                   cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(keyData, "AES"), new IvParameterSpec(keyData));
                   // AES 암호화
                   byte[] encrypted = cipher.doFinal(string.getBytes(CharEncoding.UTF_8));
                   // base64 인코딩
                   byte[] base64Encoded = Base64.encodeBase64(encrypted);
                   String result = new String(base64Encoded, CharEncoding.UTF_8);
                   return result;
           }
           catch (Exception e) {
        	    e.printStackTrace();
        	    return null;
           }
    }

    // AES 128복호화
    public static String decryptAES128(String string) {

           try {
                   byte[] keyData = KEY_128.getBytes(CharEncoding.UTF_8);

                   // 운용모드 CBC, 패딩은 PKCS5Padding
                   Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

                   cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(keyData, "AES"), new IvParameterSpec(keyData));

                   // base64 디코딩
                   byte[] base64Decoded = Base64.decodeBase64(string.getBytes(CharEncoding.UTF_8));

                   // AES 복화화
                   byte[] decrypted = cipher.doFinal(base64Decoded);

                   // 결과
                   String result = new String(decrypted, CharEncoding.UTF_8);

                   return result;
           }
           catch (Exception e) {
                   return null;
           }
    }
}
