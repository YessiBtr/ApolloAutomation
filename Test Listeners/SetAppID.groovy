import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

//class SetAppID {
//@BeforeTestSuite
//def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
//	println testSuiteContext.getTestSuiteId()
//	// FIRST STEP Send Request and Response
//	// load test request object which will do the login step and retrieve the token for later usages
//	//RequestObject getAppID = findTestObject('Object Repository/GetAPKName')
//	ResponseObject responseAppId = WS.sendRequest(findTestObject('Object Repository/GetAPKName'))
//	
//	// use groovy.json.JsonSlurper to parse the text into object
//	def ResponseAppId = new groovy.json.JsonSlurper().parseText(responseAppId.getResponseText())
//	System.out.println("Response " + ResponseAppId)
//	GlobalVariable.apkName = "kobiton-store:" +(ResponseAppId.apps.id.first()).toString()
//	System.out.println(GlobalVariable.apkName)
//}
//}