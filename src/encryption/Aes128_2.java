package encryption;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class Aes128_2 {

    static private final String ENCODING = "UTF-8";
    static private final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    static private final String KEY = "";
    static private final String AES = "AES";
    
    public static String Encrypt128(String input) {
    	return Encrypt128(input, KEY);
    }
    
    public static String Decrypt128(String input) {
    	return Decrypt128(input, KEY);
    }
    
    private static String Encrypt128(String input, String key) {
        String output = "error_encrypted";
        byte[] encryptedByte = null;
        byte[] keyByte = null;
        Cipher cp;
        SecretKeySpec sks = null;
        IvParameterSpec ips = null;
        try {
        	encryptedByte = input.getBytes(ENCODING);
            keyByte = getKeyBytes(key);
        } catch (NullPointerException | UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            return output;
        }
        
        sks = new SecretKeySpec(keyByte, AES);
        ips = new IvParameterSpec(new byte[16]);

        try {
            cp = Cipher.getInstance(TRANSFORMATION);
            cp.init(Cipher.ENCRYPT_MODE, sks, ips);
            encryptedByte = cp.doFinal(encryptedByte);
            output = new String(Base64.encodeBase64(encryptedByte));
            return output;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException e) {
            System.out.println(e.getMessage());
            return output;
        }
    }

    private static String Decrypt128(String input, String key) {
        String output = "error_decrypted";
        byte[] encryptedByte;
        byte[] keyByte;
        try {
        	encryptedByte = Base64.decodeBase64(input.getBytes("UTF8"));
            keyByte = getKeyBytes(key);
        } catch (NullPointerException | UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
            return output;
        }
        SecretKeySpec sks = new SecretKeySpec(keyByte, AES);
        IvParameterSpec ips = new IvParameterSpec(new byte[16]);
        try {
            Cipher cp = Cipher.getInstance(TRANSFORMATION);
            cp.init(Cipher.DECRYPT_MODE, sks, ips);
            encryptedByte = cp.doFinal(encryptedByte);
            output = new String(encryptedByte, ENCODING);
            return output;
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            System.out.println(e.getMessage());
            return output;
        }
    }
    
    private static byte[] getKeyBytes(String key) {
        byte[] keyBytes = new byte[32];
        try {
            byte[] parameterKeyBytes = key.getBytes(ENCODING);
            System.arraycopy(parameterKeyBytes, 0, keyBytes, 0, Math.min(parameterKeyBytes.length, keyBytes.length));
        } catch (UnsupportedEncodingException e) {
            System.out.println("[Error][AES][getKeyBytes][0]: " + e.getMessage());
        }
        return keyBytes;
    }
}