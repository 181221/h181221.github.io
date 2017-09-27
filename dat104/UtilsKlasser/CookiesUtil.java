package no.hvl.dat104.app;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Peder on 26.09.2017.
 */

public class CookiesUtil {
    /**
     * Finner cookie på navn. Hvis ingen cookie matcher navnet returnerer metoden defaultValue
     * @param request
     * @param cookieName
     * @param defaultValue
     * @return
     */
    public static String getCookieValue(HttpServletRequest request, String cookieName, String defaultValue) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i ++) {
                Cookie cookie = cookies[i];
                if (cookieName.equals(cookie.getName())) {
                    return (cookie.getValue());
                }
            }
        }
        return defaultValue;
    }

    /**
     * Finner cookie på navn og returnerer
     * @param request
     * @param cookieName
     * @return
     */
    public static Cookie getCookie(HttpServletRequest request, String cookieName) {
        Cookie[] cookies = request.getCookies();
        for (int i = 0; i < cookies.length; i ++) {
            Cookie cookie = cookies[i];
            if (cookieName.equals(cookie.getName())){
                return cookie;
            }
        }
        return null;
    }




}
