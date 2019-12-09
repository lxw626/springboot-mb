package com.example.springbootmb.util.mbg.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lixiewen
 * @create 2019-11-27 16:34
 */
@Setter
@Getter
@ToString
public class TableConfig {
    private String tableName;
    private String entityName;

    public TableConfig() {
    }

    public TableConfig(String tableName) {
        this.tableName = tableName;
    }

    public TableConfig(String tableName, String entityName) {
        this.tableName = tableName;
        this.entityName = entityName;
    }
}
