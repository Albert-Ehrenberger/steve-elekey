package de.rwth.idsg.steve;

import de.rwth.idsg.steve.utils.PropertiesFileLoader;

public class CoresystemConfiguration {

    public final String coresystemURL;


    public CoresystemConfiguration() {
        PropertiesFileLoader p = new PropertiesFileLoader("main.properties");

        coresystemURL = p.getString("coresystem.url");
    }
}
