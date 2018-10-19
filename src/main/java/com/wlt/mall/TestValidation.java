package com.wlt.mall;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Set;

public class TestValidation {



    @Min(10)
    private int age;


    @Size(min=1,max =3,message = "ssssssxxx")
    private String name ;


    public TestValidation(){

    }

    public TestValidation(int age ,String name){

        this.age = age;
        this.name = name ;
    }




    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

        Validator validator = factory.getValidator();
        TestValidation testValidation = new TestValidation(12,"7777777");


        Set<ConstraintViolation<TestValidation>> constraintViolations = validator.validate(testValidation);
        for (ConstraintViolation<TestValidation> constraintViolation : constraintViolations) {
            System.out.println(constraintViolation.getMessage());
        }



    }





}
