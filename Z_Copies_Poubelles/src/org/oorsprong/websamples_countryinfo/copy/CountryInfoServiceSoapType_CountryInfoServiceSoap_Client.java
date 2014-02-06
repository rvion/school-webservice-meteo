
package org.oorsprong.websamples_countryinfo.copy;

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
 * 2014-01-17T15:42:20.445+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class CountryInfoServiceSoapType_CountryInfoServiceSoap_Client {

    private static final QName SERVICE_NAME = new QName("http://www.oorsprong.org/websamples.countryinfo", "CountryInfoService");

    private CountryInfoServiceSoapType_CountryInfoServiceSoap_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CountryInfoService.WSDL_LOCATION;
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
      
        CountryInfoService ss = new CountryInfoService(wsdlURL, SERVICE_NAME);
        CountryInfoServiceSoapType port = ss.getCountryInfoServiceSoap();  
        
        {
        System.out.println("Invoking listOfCountryNamesGroupedByContinent...");
        org.oorsprong.websamples.ArrayOftCountryCodeAndNameGroupedByContinent _listOfCountryNamesGroupedByContinent__return = port.listOfCountryNamesGroupedByContinent();
        System.out.println("listOfCountryNamesGroupedByContinent.result=" + _listOfCountryNamesGroupedByContinent__return);


        }
        {
        System.out.println("Invoking countryFlag...");
        java.lang.String _countryFlag_sCountryISOCode = "";
        java.lang.String _countryFlag__return = port.countryFlag(_countryFlag_sCountryISOCode);
        System.out.println("countryFlag.result=" + _countryFlag__return);


        }
        {
        System.out.println("Invoking listOfCountryNamesByName...");
        org.oorsprong.websamples.ArrayOftCountryCodeAndName _listOfCountryNamesByName__return = port.listOfCountryNamesByName();
        System.out.println("listOfCountryNamesByName.result=" + _listOfCountryNamesByName__return);


        }
        {
        System.out.println("Invoking countryName...");
        java.lang.String _countryName_sCountryISOCode = "";
        java.lang.String _countryName__return = port.countryName(_countryName_sCountryISOCode);
        System.out.println("countryName.result=" + _countryName__return);


        }
        {
        System.out.println("Invoking languageISOCode...");
        java.lang.String _languageISOCode_sLanguageName = "";
        java.lang.String _languageISOCode__return = port.languageISOCode(_languageISOCode_sLanguageName);
        System.out.println("languageISOCode.result=" + _languageISOCode__return);


        }
        {
        System.out.println("Invoking countryCurrency...");
        java.lang.String _countryCurrency_sCountryISOCode = "";
        org.oorsprong.websamples.TCurrency _countryCurrency__return = port.countryCurrency(_countryCurrency_sCountryISOCode);
        System.out.println("countryCurrency.result=" + _countryCurrency__return);


        }
        {
        System.out.println("Invoking currencyName...");
        java.lang.String _currencyName_sCurrencyISOCode = "";
        java.lang.String _currencyName__return = port.currencyName(_currencyName_sCurrencyISOCode);
        System.out.println("currencyName.result=" + _currencyName__return);


        }
        {
        System.out.println("Invoking listOfLanguagesByName...");
        org.oorsprong.websamples.ArrayOftLanguage _listOfLanguagesByName__return = port.listOfLanguagesByName();
        System.out.println("listOfLanguagesByName.result=" + _listOfLanguagesByName__return);


        }
        {
        System.out.println("Invoking fullCountryInfoAllCountries...");
        org.oorsprong.websamples.ArrayOftCountryInfo _fullCountryInfoAllCountries__return = port.fullCountryInfoAllCountries();
        System.out.println("fullCountryInfoAllCountries.result=" + _fullCountryInfoAllCountries__return);


        }
        {
        System.out.println("Invoking listOfCountryNamesByCode...");
        org.oorsprong.websamples.ArrayOftCountryCodeAndName _listOfCountryNamesByCode__return = port.listOfCountryNamesByCode();
        System.out.println("listOfCountryNamesByCode.result=" + _listOfCountryNamesByCode__return);


        }
        {
        System.out.println("Invoking listOfCurrenciesByName...");
        org.oorsprong.websamples.ArrayOftCurrency _listOfCurrenciesByName__return = port.listOfCurrenciesByName();
        System.out.println("listOfCurrenciesByName.result=" + _listOfCurrenciesByName__return);


        }
        {
        System.out.println("Invoking fullCountryInfo...");
        java.lang.String _fullCountryInfo_sCountryISOCode = "";
        org.oorsprong.websamples.TCountryInfo _fullCountryInfo__return = port.fullCountryInfo(_fullCountryInfo_sCountryISOCode);
        System.out.println("fullCountryInfo.result=" + _fullCountryInfo__return);


        }
        {
        System.out.println("Invoking listOfContinentsByCode...");
        org.oorsprong.websamples.ArrayOftContinent _listOfContinentsByCode__return = port.listOfContinentsByCode();
        System.out.println("listOfContinentsByCode.result=" + _listOfContinentsByCode__return);


        }
        {
        System.out.println("Invoking listOfCurrenciesByCode...");
        org.oorsprong.websamples.ArrayOftCurrency _listOfCurrenciesByCode__return = port.listOfCurrenciesByCode();
        System.out.println("listOfCurrenciesByCode.result=" + _listOfCurrenciesByCode__return);


        }
        {
        System.out.println("Invoking languageName...");
        java.lang.String _languageName_sISOCode = "";
        java.lang.String _languageName__return = port.languageName(_languageName_sISOCode);
        System.out.println("languageName.result=" + _languageName__return);


        }
        {
        System.out.println("Invoking countryISOCode...");
        java.lang.String _countryISOCode_sCountryName = "";
        java.lang.String _countryISOCode__return = port.countryISOCode(_countryISOCode_sCountryName);
        System.out.println("countryISOCode.result=" + _countryISOCode__return);


        }
        {
        System.out.println("Invoking listOfContinentsByName...");
        org.oorsprong.websamples.ArrayOftContinent _listOfContinentsByName__return = port.listOfContinentsByName();
        System.out.println("listOfContinentsByName.result=" + _listOfContinentsByName__return);


        }
        {
        System.out.println("Invoking countryIntPhoneCode...");
        java.lang.String _countryIntPhoneCode_sCountryISOCode = "";
        java.lang.String _countryIntPhoneCode__return = port.countryIntPhoneCode(_countryIntPhoneCode_sCountryISOCode);
        System.out.println("countryIntPhoneCode.result=" + _countryIntPhoneCode__return);


        }
        {
        System.out.println("Invoking listOfLanguagesByCode...");
        org.oorsprong.websamples.ArrayOftLanguage _listOfLanguagesByCode__return = port.listOfLanguagesByCode();
        System.out.println("listOfLanguagesByCode.result=" + _listOfLanguagesByCode__return);


        }
        {
        System.out.println("Invoking countriesUsingCurrency...");
        java.lang.String _countriesUsingCurrency_sISOCurrencyCode = "";
        org.oorsprong.websamples.ArrayOftCountryCodeAndName _countriesUsingCurrency__return = port.countriesUsingCurrency(_countriesUsingCurrency_sISOCurrencyCode);
        System.out.println("countriesUsingCurrency.result=" + _countriesUsingCurrency__return);


        }
        {
        System.out.println("Invoking capitalCity...");
        java.lang.String _capitalCity_sCountryISOCode = "";
        java.lang.String _capitalCity__return = port.capitalCity(_capitalCity_sCountryISOCode);
        System.out.println("capitalCity.result=" + _capitalCity__return);


        }

        System.exit(0);
    }

}
