package com.resturant.backendmain.Services;

import java.security.SecureRandom;

public class VerficationCode {
    private static StringBuilder verficationCode=new StringBuilder();
    private static int CODE_LENTH=4;
    private static final SecureRandom random = new SecureRandom();

    public static String generateCode()
    {
        for (int i=0;i<CODE_LENTH;i++)
        {
            verficationCode.append(random.nextInt(10));
        }
        return verficationCode.toString();
    }
}
