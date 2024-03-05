package com.lbhf.util;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 * AES对称加密工具类
 */
public class IdNumberEncryptionUtil {

    private static final String ENCRYPTION_KEY = "6e2d4ed2-c0d7-4a"; // 加密密钥
    private static final String INIT_VECTOR = "jzsa1754a4213541"; // 初始向量


    /**
     * 加密方法
     * @param idNumber
     * @return
     */
    public static String encryptIdNumber(String idNumber) {
        try {
            IvParameterSpec iv = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
            SecretKeySpec secretKey = new SecretKeySpec(ENCRYPTION_KEY.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);

            byte[] encrypted = cipher.doFinal(idNumber.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 解密方法
     * @param encryptedIdNumber
     * @return
     */
    public static String decryptIdNumber(String encryptedIdNumber) {
        try {
            IvParameterSpec iv = new IvParameterSpec(INIT_VECTOR.getBytes("UTF-8"));
            SecretKeySpec secretKey = new SecretKeySpec(ENCRYPTION_KEY.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);

            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedIdNumber));
            return new String(decrypted);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String idNumber = "220284200110116565";

        // 加密
        String encryptedIdNumber = encryptIdNumber(idNumber);
        System.out.println("Encrypted ID Number: " + encryptedIdNumber);

        // 解密
        String decryptedIdNumber = decryptIdNumber(encryptedIdNumber);
        System.out.println("Decrypted ID Number: " + decryptedIdNumber);
    }
}
