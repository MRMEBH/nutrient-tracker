package com.nutrienttracker.nutrienttrackerbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;



@Entity
@Table(name = "foods")
public class Food {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    private int foodId;
    
    @Column(name = "food_name")
    private String foodName;
    
    @Column(name = "fat_g")
    private float fatG;
    
    @Column(name = "carbohydrate_g")
    private float carbohydrateG;
    
    @Column(name = "sugar_g")
    private Float sugarG;
    
    @Column(name = "fiber_g")
    private Float fiberG;
    
    @Column(name = "protein_g")
    private Float proteinG;
    
    @Column(name = "vitamin_b1_mg")
    private Float vitaminB1Mg;
    
    @Column(name = "vitamin_b2_mg")
    private Float vitaminB2Mg;
    
    @Column(name = "vitamin_b3_mg")
    private Float vitaminB3Mg;
    
    @Column(name = "vitamin_b5_mg")
    private Float vitaminB5Mg;
    
    @Column(name = "vitamin_b6_mg")
    private Float vitaminB6Mg;
    
    @Column(name = "vitamin_b7_mcg")
    private Float vitaminB7Mcg;
    
    @Column(name = "vitamin_b9_mcg")
    private Float vitaminB9Mcg;
    
    @Column(name = "vitamin_b12_mcg")
    private Float vitaminB12Mcg;
    
    @Column(name = "vitamin_c_mg")
    private Float vitaminCMg;
    
    @Column(name = "vitamin_d_mcg")
    private Float vitaminDMcg;
    
    @Column(name = "vitamin_e_mg")
    private Float vitaminEMg;
    
    @Column(name = "vitamin_k_mcg")
    private Float vitaminKMcg;
    
    @Column(name = "calcium_mg")
    private Float calciumMg;
    
    @Column(name = "iron_mg")
    private Float ironMg;
    
    @Column(name = "magnesium_mg")
    private Float magnesiumMg;
    
    @Column(name = "phosphorus_mg")
    private Float phosphorusMg;
    
    @Column(name = "potassium_mg")
    private Float potassiumMg;
    
    @Column(name = "sodium_mg")
    private Float sodiumMg;
    
    @Column(name = "zinc_mg")
    private Float zincMg;
    
    @Column(name = "copper_mg")
    private Float copperMg;
    
    @Column(name = "manganese_mg")
    private Float manganeseMg;
    
    @Column(name = "selenium_mcg")
    private Float seleniumMcg;
    
    @Column(name = "created_at")
    private Date createdAt;
    

    // getters and setters

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public float getFatG() {
        return fatG;
    }

    public void setFatG(float fatG) {
        this.fatG = fatG;
    }

    public float getCarbohydrateG() {
        return carbohydrateG;
    }

    public void setCarbohydrateG(float carbohydrateG) {
        this.carbohydrateG = carbohydrateG;
    }

    public Float getSugarG() {
        return sugarG;
    }

    public void setSugarG(Float sugarG) {
        this.sugarG = sugarG;
    }

    public Float getFiberG() {
        return fiberG;
    }

    public void setFiberG(Float fiberG) {
        this.fiberG = fiberG;
    }

    public Float getProteinG() {
        return proteinG;
    }

    public void setProteinG(Float proteinG) {
        this.proteinG = proteinG;
    }

    public Float getVitaminB1Mg() {
        return vitaminB1Mg;
    }

    public void setVitaminB1Mg(Float vitaminB1Mg) {
        this.vitaminB1Mg = vitaminB1Mg;
    }

    public Float getVitaminB2Mg() {
        return vitaminB2Mg;
    }

    public void setVitaminB2Mg(Float vitaminB2Mg) {
        this.vitaminB2Mg = vitaminB2Mg;
    }

    public Float getVitaminB3Mg() {
        return vitaminB3Mg;
    }

    public void setVitaminB3Mg(Float vitaminB3Mg) {
        this.vitaminB3Mg = vitaminB3Mg;
    }

    public Float getVitaminB5Mg() {
        return vitaminB5Mg;
    }

    public void setVitaminB5Mg(Float vitaminB5Mg) {
        this.vitaminB5Mg = vitaminB5Mg;
    }

    public Float getVitaminB6Mg() {
        return vitaminB6Mg;
    }

    public void setVitaminB6Mg(Float vitaminB6Mg) {
        this.vitaminB6Mg = vitaminB6Mg;
    }

    public Float getVitaminB7Mcg() {
        return vitaminB7Mcg;
    }

    public void setVitaminB7Mcg(Float vitaminB7Mcg) {
        this.vitaminB7Mcg = vitaminB7Mcg;
    }

    public Float getVitaminB9Mcg() {
        return vitaminB9Mcg;
    }

    public void setVitaminB9Mcg(Float vitaminB9Mcg) {
        this.vitaminB9Mcg = vitaminB9Mcg;
    }

    public Float getVitaminB12Mcg() {
        return vitaminB12Mcg;
    }

    public void setVitaminB12Mcg(Float vitaminB12Mcg) {
        this.vitaminB12Mcg = vitaminB12Mcg;
    }

    public Float getVitaminCMg() {
        return vitaminCMg;
    }

    public void setVitaminCMg(Float vitaminCMg) {
        this.vitaminCMg = vitaminCMg;
    }

    public Float getVitaminDMcg() {
        return vitaminDMcg;
    }

    public void setVitaminDMcg(Float vitaminDMcg) {
        this.vitaminDMcg = vitaminDMcg;
    }

    public Float getVitaminEMg() {
        return vitaminEMg;
    }

    public void setVitaminEMg(Float vitaminEMg) {
        this.vitaminEMg = vitaminEMg;
    }

    public Float getVitaminKMcg() {
        return vitaminKMcg;
    }

    public void setVitaminKMcg(Float vitaminKMcg) {
        this.vitaminKMcg = vitaminKMcg;
    }

    public Float getCalciumMg() {
        return calciumMg;
    }

    public void setCalciumMg(Float calciumMg) {
        this.calciumMg = calciumMg;
    }

    public Float getIronMg() {
        return ironMg;
    }

    public void setIronMg(Float ironMg) {
        this.ironMg = ironMg;
    }

    public Float getMagnesiumMg() {
        return magnesiumMg;
    }

    public void setMagnesiumMg(Float magnesiumMg) {
        this.magnesiumMg = magnesiumMg;
    }

    public Float getPhosphorusMg() {
        return phosphorusMg;
    }

    public void setPhosphorusMg(Float phosphorusMg) {
        this.phosphorusMg = phosphorusMg;
    }

    public Float getPotassiumMg() {
        return potassiumMg;
    }

    public void setPotassiumMg(Float potassiumMg) {
        this.potassiumMg = potassiumMg;
    }

    public Float getSodiumMg() {
        return sodiumMg;
    }

    public void setSodiumMg(Float sodiumMg) {
        this.sodiumMg = sodiumMg;
    }

    public Float getZincMg() {
        return zincMg;
    }

    public void setZincMg(Float zincMg) {
        this.zincMg = zincMg;
    }

    public Float getCopperMg() {
        return copperMg;
    }

    public void setCopperMg(Float copperMg) {
        this.copperMg = copperMg;
    }

    public Float getManganeseMg() {
        return manganeseMg;
    }

    public void setManganeseMg(Float manganeseMg) {
        this.manganeseMg = manganeseMg;
    }

    public Float getSeleniumMcg() {
        return seleniumMcg;
    }

    public void setSeleniumMcg(Float seleniumMcg) {
        this.seleniumMcg = seleniumMcg;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
}
