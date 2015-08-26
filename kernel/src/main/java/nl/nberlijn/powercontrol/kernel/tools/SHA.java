package nl.nberlijn.powercontrol.kernel.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class SHA {

    public static String hash(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(password.getBytes());

        byte byteData[] = messageDigest.digest();
        StringBuilder stringBuffer = new StringBuilder();

        for (byte aByteData : byteData) {
            stringBuffer.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
        }

        return stringBuffer.toString();
    }

    public static String unhash(String password) throws NoSuchAlgorithmException {
        // TODO: Add tools

        return null;
    }

}
