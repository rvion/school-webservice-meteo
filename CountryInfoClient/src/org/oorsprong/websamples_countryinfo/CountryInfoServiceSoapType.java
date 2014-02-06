package org.oorsprong.websamples_countryinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2014-02-06T16:55:25.813+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", name = "CountryInfoServiceSoapType")
@XmlSeeAlso({org.oorsprong.websamples.ObjectFactory.class})
public interface CountryInfoServiceSoapType {

    /**
     * Returns a list of all stored counties grouped per continent
     */
    @WebResult(name = "ListOfCountryNamesGroupedByContinentResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfCountryNamesGroupedByContinent", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCountryNamesGroupedByContinent")
    @WebMethod(operationName = "ListOfCountryNamesGroupedByContinent")
    @ResponseWrapper(localName = "ListOfCountryNamesGroupedByContinentResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCountryNamesGroupedByContinentResponse")
    public org.oorsprong.websamples.ArrayOftCountryCodeAndNameGroupedByContinent listOfCountryNamesGroupedByContinent();

    /**
     * Returns a link to a picture of the country flag
     */
    @WebResult(name = "CountryFlagResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CountryFlag", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryFlag")
    @WebMethod(operationName = "CountryFlag")
    @ResponseWrapper(localName = "CountryFlagResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryFlagResponse")
    public java.lang.String countryFlag(
        @WebParam(name = "sCountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryISOCode
    );

    /**
     * Returns a list of all stored counties ordered by country name
     */
    @WebResult(name = "ListOfCountryNamesByNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfCountryNamesByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCountryNamesByName")
    @WebMethod(operationName = "ListOfCountryNamesByName")
    @ResponseWrapper(localName = "ListOfCountryNamesByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCountryNamesByNameResponse")
    public org.oorsprong.websamples.ArrayOftCountryCodeAndName listOfCountryNamesByName();

    /**
     * Searches the database for a country by the passed ISO country code
     */
    @WebResult(name = "CountryNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CountryName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryName")
    @WebMethod(operationName = "CountryName")
    @ResponseWrapper(localName = "CountryNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryNameResponse")
    public java.lang.String countryName(
        @WebParam(name = "sCountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryISOCode
    );

    /**
     * Find a language ISO code based on the passed language name
     */
    @WebResult(name = "LanguageISOCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "LanguageISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.LanguageISOCode")
    @WebMethod(operationName = "LanguageISOCode")
    @ResponseWrapper(localName = "LanguageISOCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.LanguageISOCodeResponse")
    public java.lang.String languageISOCode(
        @WebParam(name = "sLanguageName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sLanguageName
    );

    /**
     * Returns the currency ISO code and name for the passed country ISO code
     */
    @WebResult(name = "CountryCurrencyResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CountryCurrency", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryCurrency")
    @WebMethod(operationName = "CountryCurrency")
    @ResponseWrapper(localName = "CountryCurrencyResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryCurrencyResponse")
    public org.oorsprong.websamples.TCurrency countryCurrency(
        @WebParam(name = "sCountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryISOCode
    );

    /**
     * Returns the name of the currency (if found)
     */
    @WebResult(name = "CurrencyNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CurrencyName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CurrencyName")
    @WebMethod(operationName = "CurrencyName")
    @ResponseWrapper(localName = "CurrencyNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CurrencyNameResponse")
    public java.lang.String currencyName(
        @WebParam(name = "sCurrencyISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCurrencyISOCode
    );

    /**
     * Returns an array of languages ordered by name
     */
    @WebResult(name = "ListOfLanguagesByNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfLanguagesByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfLanguagesByName")
    @WebMethod(operationName = "ListOfLanguagesByName")
    @ResponseWrapper(localName = "ListOfLanguagesByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfLanguagesByNameResponse")
    public org.oorsprong.websamples.ArrayOftLanguage listOfLanguagesByName();

    /**
     * Returns an array with all countries and all the language information stored
     */
    @WebResult(name = "FullCountryInfoAllCountriesResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "FullCountryInfoAllCountries", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.FullCountryInfoAllCountries")
    @WebMethod(operationName = "FullCountryInfoAllCountries")
    @ResponseWrapper(localName = "FullCountryInfoAllCountriesResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.FullCountryInfoAllCountriesResponse")
    public org.oorsprong.websamples.ArrayOftCountryInfo fullCountryInfoAllCountries();

    /**
     * Returns a list of all stored counties ordered by ISO code
     */
    @WebResult(name = "ListOfCountryNamesByCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfCountryNamesByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCountryNamesByCode")
    @WebMethod(operationName = "ListOfCountryNamesByCode")
    @ResponseWrapper(localName = "ListOfCountryNamesByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCountryNamesByCodeResponse")
    public org.oorsprong.websamples.ArrayOftCountryCodeAndName listOfCountryNamesByCode();

    /**
     * Returns a list of currencies ordered by name.
     */
    @WebResult(name = "ListOfCurrenciesByNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfCurrenciesByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCurrenciesByName")
    @WebMethod(operationName = "ListOfCurrenciesByName")
    @ResponseWrapper(localName = "ListOfCurrenciesByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCurrenciesByNameResponse")
    public org.oorsprong.websamples.ArrayOftCurrency listOfCurrenciesByName();

    /**
     * Returns a struct with all the stored country information. Pass the ISO country code
     */
    @WebResult(name = "FullCountryInfoResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "FullCountryInfo", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.FullCountryInfo")
    @WebMethod(operationName = "FullCountryInfo")
    @ResponseWrapper(localName = "FullCountryInfoResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.FullCountryInfoResponse")
    public org.oorsprong.websamples.TCountryInfo fullCountryInfo(
        @WebParam(name = "sCountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryISOCode
    );

    /**
     * Returns a list of continents ordered by code.
     */
    @WebResult(name = "ListOfContinentsByCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfContinentsByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfContinentsByCode")
    @WebMethod(operationName = "ListOfContinentsByCode")
    @ResponseWrapper(localName = "ListOfContinentsByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfContinentsByCodeResponse")
    public org.oorsprong.websamples.ArrayOftContinent listOfContinentsByCode();

    /**
     * Returns a list of currencies ordered by code.
     */
    @WebResult(name = "ListOfCurrenciesByCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfCurrenciesByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCurrenciesByCode")
    @WebMethod(operationName = "ListOfCurrenciesByCode")
    @ResponseWrapper(localName = "ListOfCurrenciesByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfCurrenciesByCodeResponse")
    public org.oorsprong.websamples.ArrayOftCurrency listOfCurrenciesByCode();

    /**
     * Find a language name based on the passed ISO language code
     */
    @WebResult(name = "LanguageNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "LanguageName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.LanguageName")
    @WebMethod(operationName = "LanguageName")
    @ResponseWrapper(localName = "LanguageNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.LanguageNameResponse")
    public java.lang.String languageName(
        @WebParam(name = "sISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sISOCode
    );

    /**
     * This function tries to found a country based on the passed country name.
     */
    @WebResult(name = "CountryISOCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryISOCode")
    @WebMethod(operationName = "CountryISOCode")
    @ResponseWrapper(localName = "CountryISOCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryISOCodeResponse")
    public java.lang.String countryISOCode(
        @WebParam(name = "sCountryName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryName
    );

    /**
     * Returns a list of continents ordered by name.
     */
    @WebResult(name = "ListOfContinentsByNameResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfContinentsByName", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfContinentsByName")
    @WebMethod(operationName = "ListOfContinentsByName")
    @ResponseWrapper(localName = "ListOfContinentsByNameResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfContinentsByNameResponse")
    public org.oorsprong.websamples.ArrayOftContinent listOfContinentsByName();

    /**
     * Returns the internation phone code for the passed ISO country code
     */
    @WebResult(name = "CountryIntPhoneCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CountryIntPhoneCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryIntPhoneCode")
    @WebMethod(operationName = "CountryIntPhoneCode")
    @ResponseWrapper(localName = "CountryIntPhoneCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountryIntPhoneCodeResponse")
    public java.lang.String countryIntPhoneCode(
        @WebParam(name = "sCountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryISOCode
    );

    /**
     * Returns an array of languages ordered by code
     */
    @WebResult(name = "ListOfLanguagesByCodeResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "ListOfLanguagesByCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfLanguagesByCode")
    @WebMethod(operationName = "ListOfLanguagesByCode")
    @ResponseWrapper(localName = "ListOfLanguagesByCodeResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.ListOfLanguagesByCodeResponse")
    public org.oorsprong.websamples.ArrayOftLanguage listOfLanguagesByCode();

    /**
     * Returns a list of all countries that use the same currency code. Pass a ISO currency code
     */
    @WebResult(name = "CountriesUsingCurrencyResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CountriesUsingCurrency", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountriesUsingCurrency")
    @WebMethod(operationName = "CountriesUsingCurrency")
    @ResponseWrapper(localName = "CountriesUsingCurrencyResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CountriesUsingCurrencyResponse")
    public org.oorsprong.websamples.ArrayOftCountryCodeAndName countriesUsingCurrency(
        @WebParam(name = "sISOCurrencyCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sISOCurrencyCode
    );

    /**
     * Returns the  name of the captial city for the passed country code
     */
    @WebResult(name = "CapitalCityResult", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
    @RequestWrapper(localName = "CapitalCity", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CapitalCity")
    @WebMethod(operationName = "CapitalCity")
    @ResponseWrapper(localName = "CapitalCityResponse", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo", className = "org.oorsprong.websamples.CapitalCityResponse")
    public java.lang.String capitalCity(
        @WebParam(name = "sCountryISOCode", targetNamespace = "http://www.oorsprong.org/websamples.countryinfo")
        java.lang.String sCountryISOCode
    );
}
