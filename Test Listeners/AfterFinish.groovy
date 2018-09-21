import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
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

import javax.mail.Message
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

class AfterFinish {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	//@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		Session session = Session.getDefaultInstance(new Properties())
		
			MimeMessage message = new MimeMessage(session)
			message.setFrom("fhadelfadillah@gmail.com")
			message.setRecipient(Message.RecipientType.TO, new InternetAddress("v-fhadel.fadillah@btpn.com"))
			message.setSubject("Important message!")
			message.setText("Here is an important email message!")
			
			MAILER_HOST = "smtp.gmail.com"
			MAILER_USER = "fhadelfadillah@gmail.com"
			MAILER_PASS = "Saver1234A"
			MAILER_PORT = 465
			
			Transport transport = session.getTransport("smtp")
			transport.connect(MAILER_HOST, MAILER_PORT, MAILER_USER, MAILER_PASS)
			transport.sendMessage(message, message.getAllRecipients())
			transport.close()
	}
	
	@AfterTestCase
	def delayAfterTestCase(TestCaseContext testCaseContext){
		
		Mobile.delay(5)
		
	}
}