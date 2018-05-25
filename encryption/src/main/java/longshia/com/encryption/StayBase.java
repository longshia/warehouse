package longshia.com.encryption;

import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author: liuhuilong
 * @Date: 2018/5/25 18:01
 */
public class StayBase {
    public static String encode(EncryptionType encryptionType, String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(encryptionType.getValue());
            messageDigest.update(str.getBytes(), 0, str.length());
            byte[] hash = messageDigest.digest();

            return convertToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String convertToHex(byte[] data) {
        if (data == null) {
            return "";
        }
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            // >>> 4 ------> data[i]/16
            // & 0x0F ------> 取后4位，即16进制数值
            int halfByte = (data[i] >>> 4) & 0x0F;
            int twoHalfs = 0;
            do {
                if ((0 <= halfByte) && (halfByte <= 9)) {
                    // number
                    buf.append((char) ('0' + halfByte));
                } else {
                    // letter
                    buf.append((char) ('a' + (halfByte - 10)));
                }
                // 除以16之后的余数，取16进制
                halfByte = data[i] & 0x0F;
            } while (twoHalfs++ < 1);
        }

        return buf.toString();
    }
}
