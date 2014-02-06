
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-01-15T15:40:45.957+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class GlobalWeatherSoap_GlobalWeatherSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://www.webserviceX.NET", "GlobalWeather");

    private GlobalWeatherSoap_GlobalWeatherSoap12_Client() {
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
        GlobalWeatherSoap port = ss.getGlobalWeatherSoap12();  
        
        {
        System.out.println("Invoking getCitiesByCountry...");
        java.lang.String _getCitiesByCountry_countryName = "";
        java.lang.String _getCitiesByCountry__return = port.getCitiesByCountry(_getCitiesByCountry_countryName);
        System.out.println("getCitiesByCountry.result=" + _getCitiesByCountry__return);


        }
        {
        System.out.println("Invoking getWeather...");
        java.lang.String _getWeather_cityName = "";
        java.lang.String _getWeather_countryName = "";
        java.lang.String _getWeather__return = port.getWeather(_getWeather_cityName, _getWeather_countryName);
        System.out.println("getWeather.result=" + _getWeather__return);


        }

        System.exit(0);
    }

}
