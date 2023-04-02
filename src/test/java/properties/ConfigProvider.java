package properties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;


public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
                : ConfigFactory.load("properties.conf");
    }
    String URL_BANK = readConfig().getString("urlBank");
    String URL = readConfig().getString("url");

    String ACCUWEATHER = readConfig().getString("accuweatherUrl");
    String GISMETEO_URL = readConfig().getString("gismeteoUrl");
    String BSPB_BANK_URL = readConfig().getString("urlbspbBank");

}