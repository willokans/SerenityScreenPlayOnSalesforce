package com.salesforce.root.actors;

import java.util.HashMap;
import java.util.Map;

public enum SalesforceUsers {
    DEVORG1("Will Vincent", "dev1_system_admin"),
    DEVORG2("Mary Ann", "dev2_system_admin");

    private String name;
    private String key;

    private static Map<String, SalesforceUsers> salesforceUsersKeyMap;

    SalesforceUsers(String name, String key){
        this.name = name;
        this.key = key;
    }

    public String getName(){
        return name;
    }

    public String getKey(){
        return key;
    }

    public static String getUserBasedOnProfile(String profile){
        if(salesforceUsersKeyMap == null){
            createSalesforceKeyMap();
        }
        return salesforceUsersKeyMap.get(profile).getName();
    }

    private static void createSalesforceKeyMap(){
        salesforceUsersKeyMap = new HashMap<>();
        for(SalesforceUsers user : values()) {
            salesforceUsersKeyMap.put(user.name, user);
        }
    }

}
