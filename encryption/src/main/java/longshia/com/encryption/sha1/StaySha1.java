package longshia.com.encryption.sha1;

import longshia.com.encryption.EncryptionType;
import longshia.com.encryption.StayBase;

/**
 * @Author: liuhuilong
 * @Date: 2018/5/25 17:59
 */
public class StaySha1 {
    /**
     *
     * @param text
     * @return 40个字符
     */
    public static String sha1(String text) {
        return StayBase.encode(EncryptionType.SHA1, text);
    }

    public static void main(String[] args) {
        System.out.println(sha1("dafaf"));
    }
}
