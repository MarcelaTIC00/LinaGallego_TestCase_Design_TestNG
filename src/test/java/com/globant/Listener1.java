package com.globant;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

    // It executes on each test Start
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Method Started :" + result.getName());
    }

    // It executes for only Passed tests
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Method Passed :" + result.getName());
    }

    // It executes for only Failed tests
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Method Failed :" + result.getName());
    }

    // It executes for only Skipped tests
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Method Skipped :" + result.getName());
    }

    // It executes for on Suite start
    //Onstart Se ejecuta antes de cada etiqueta <test> del archivo xml;
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test on Start :" + context.getName());
    }

    // It executes for on Suite finish
    //OnFinish Se ejecuta después de cada etiqueta <test> del archivo xml;
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test on Finish :" + context.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // No need to implement all the methods. Can leave empty.
    }

}
