/**
 * Copyright 2019 ForgeRock AS. All Rights Reserved
 *
 * Use of this code requires a commercial software license with ForgeRock AS.
 * or with one of its affiliates. All use shall be exclusively subject
 * to such license between the licensee and ForgeRock AS.
 */
package com.forgerock.openbanking.authentication.utils;

import javax.servlet.http.HttpServletRequest;
import java.security.cert.X509Certificate;

public class RequestUtils {
    public static X509Certificate extractCertificate(HttpServletRequest req) {
        X509Certificate[] certs = (X509Certificate[]) req.getAttribute("javax.servlet.request.X509Certificate");
        if (null != certs && certs.length > 0) {
            return certs[0];
        }
        return null;
    }

    public static X509Certificate[] extractCertificatesChain(HttpServletRequest req) {
        return (X509Certificate[]) req.getAttribute("javax.servlet.request.X509Certificate");
    }

}
