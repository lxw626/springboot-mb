package com.example.springbootmb.util.mbg.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class MBG {
    private String driverClass = "com.mysql.jdbc.Driver";
    private String connectionURL = "jdbc:mysql://localhost:3306/scott";
    private String username = "root";
    private String password = "root";
    private String targetRuntime = "MyBatis3Simple";
//    private String targetRuntime = "MyBatis3";
    private String entityPackage = "com.example.springbootmb.entity";
//    private String rootClass = "com.origin.tool.entity.BasicEntity";
    private String rootClass;
    private String mapperPackage = "com.example.springbootmb.mapper";
//    private String rootInterface = "com.origin.tool.mapper.BasicMapper";
    private String rootInterface;
    private String xmlPackage = "com.example.springbootmb.mapper";
    private Boolean serializableSwitch = true;
    private Boolean toStringSwitch = true;
    private Boolean commentSwitch = true;
    private Boolean bigDecimalSwitch = true;
    private Boolean trimStringSwitch = true;
    private String entityPath = "";
    private String mapperPath = "";
    private String mapperType = "";
    private String xmlPath = "";
    private List<TableConfig> tableConfigs = new ArrayList<>();

    public MBG addTableConfig(String tableName,String entityName) {
        TableConfig tableConfig = new TableConfig(tableName,entityName);
        tableConfigs.add(tableConfig);
        return this;
    }


}

