import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\01.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/01. Button - Promo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\02.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/02. ViewGroup - E-Commerce'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\03.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/03. ViewGroup - E-Commerce 1'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\04.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/04. ViewGroup - Back Btn E-Commerce 1'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\05.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/05. ViewGroup - E-Commerce 2'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\06.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/06. ViewGroup - Back Btn E-Commerce 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\07.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/07. ViewGroup - E-Commerce 3'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\08.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/08. ViewGroup - Back Btn E-Commerce 3'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\09.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/09. ViewGroup - E-Commerce 4'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\10.png')

Mobile.tap(findTestObject('Object Repository/Promo/E-Commerce/10. ViewGroup - Back Btn E-Commerce 4'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\11.png')

Mobile.pressBack()

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - E-Commerce\\12.png')

Mobile.closeApplication()

