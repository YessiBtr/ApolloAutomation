package newpackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import io.appium.java_client.AppiumDriver
import io.appium.java_client.TouchAction
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class newkeywords {

	@Keyword

	def jsjsncj(int length) {
		String baseChar = "1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 12) {
			// length of the random string.
			int index = (int) (rnd.nextFloat() * baseChar.length());
			salt.append(baseChar.charAt(index));
		}
		String saltStr = salt.toString();
	}

	@Keyword
	def swipeLeft(){
		AppiumDriver<?> driver= MobileDriverFactory.getDriver()
		TouchAction touch = new TouchAction(driver)
		int device_Height, device_Width
		device_Height = Mobile.getDeviceHeight()
		println device_Height
		device_Width = Mobile.getDeviceWidth()
		println device_Width
		int midheight = device_Height/2
		println midheight
		int midwidth = device_Width/2
		println midwidth
		int startX,startY,endX,endY
		startX = device_Width-100
		startY = midheight
		endX = -startX
		endY = 0
		Mobile.swipe(startX,startY,endX,endY)
		touch.tap(startX, startY).perform()
	}
}
