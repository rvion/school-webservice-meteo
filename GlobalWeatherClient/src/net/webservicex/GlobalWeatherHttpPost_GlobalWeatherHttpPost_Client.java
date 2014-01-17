
package net.webservicex;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-01-17T14:22:59.552+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class GlobalWeatherHttpPost_GlobalWeatherHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://www.webserviceX.NET", "GlobalWeather");

    private GlobalWeatherHttpPost_GlobalWeatherHttpPost_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GlobalWeather.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        GlobalWeather ss = new GlobalWeather(wsdlURL, SERVICE_NAME);
        GlobalWeatherHttpPost port = ss.getGlobalWeatherHttpPost();  
        
        {
        System.out.println("Invoking getWeather...");
        java.lang.String _getWeather_cityName = "";
        java.lang.String _getWeather_countryName = "";
        java.lang.String _getWeather__return = port.getWeather(_getWeather_cityName, _getWeather_countryName);
        System.out.println("getWeather.result=" + _getWeather__return);


        }
        {
        System.out.println("Invoking getCitiesByCountry...");
        java.lang.String _getCitiesByCountry_countryName = "";
        java.lang.String _getCitiesByCountry__return = port.getCitiesByCountry(_getCitiesByCountry_countryName);
        System.out.println("getCitiesByCountry.result=" + _getCitiesByCountry__return);


        }

        System.exit(0);
    }

}
