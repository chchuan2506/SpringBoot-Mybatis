package com.chc.SpringBootMybatis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQuery(name = "Person.withNameAndAddressNamedQuery",
        query = "select p from Person p where p.name=?1 and p.address=?2")
public class Person {
	 //@Id//此为MYSQL对应配置
    //@GeneratedValue(strategy=GenerationType.AUTO)
   // @GeneratedValue(strategy = GenerationType.IDENTITY)// MYSQL时可以这样使用自增
    /*
     * @Entity和@Table(name="csq_test")来标记这是一个实体，和对应的表名称。在GET方法上使用注解@Id标记这是一个主键，并使用@GeneratedValue和@SequenceGenerator来实现使用Oracle序列来生成主键。
主键自增为1，并且在MySQL时，不用序列，直接指定GenerationType.IDENTITY即可。orcale配置
     */
	 @Id
  //@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TestSequence")
    //@SequenceGenerator(name = "TestSequence", sequenceName = "SEQ_Test", allocationSize=1)
    private Long id;
    private String name;
    private Integer age;
    private String address;

    public Person() {
    }

    public Person(Long id, String name, Integer age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
