package longshia.com.encryption.md5;

import longshia.com.encryption.EncryptionType;
import longshia.com.encryption.StayBase;

/**
 * @Author: liuhuilong
 * @Date: 2018/5/25 11:39
 */
public class StayMd5 {
    /**
     *
     * @param text
     * @return 32个字符
     */
    public static String md5(String text) {
        return StayBase.encode(EncryptionType.MD5, text);
    }

    public static void main(String[] args) {
        System.out.println(md5("dafaf"));
    }
}
