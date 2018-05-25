package longshia.com.encryption;

/**
 * @Author: liuhuilong
 * @Date: 2018/5/25 18:02
 */
public enum EncryptionType {
    MD5("MD5"), SHA1("SHA-1");

    private String encryptionType;

    EncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public final String getValue() {
        return this.encryptionType;
    }
}
