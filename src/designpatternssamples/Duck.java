/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternssamples;

/**
 *
 * @author Dallas
 */
public abstract class Duck{
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;
        public Duck(){
        }
        
        public abstract void display();
        
        public void performFly(){
            flyBehavior.fly();
        }
        public void performQuack(){
            quackBehavior.quack();
        }
        public void swim(){
            System.out.println("All ducks float, even decoys!");
        }

    /**
     *
     * @param fb
     */
    public void setFlyBehavior(FlyBehavior fb){
            flyBehavior = fb;
        }
        public void setQuackBehavior(QuackBehavior qb){
            quackBehavior = qb;
        }
    }
