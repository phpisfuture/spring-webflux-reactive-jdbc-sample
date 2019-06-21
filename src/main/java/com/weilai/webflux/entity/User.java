package com.weilai.webflux.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "iot_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String userName;

  private String passWord;

  private String companyId;

  private Integer companyType;

  private Date lastLoginTime;

  private String lastLoginIp;

  private Date createTime;

  private Date updateTime;

  private Integer registerStatus;

}
