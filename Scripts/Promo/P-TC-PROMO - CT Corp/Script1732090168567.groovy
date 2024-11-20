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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\01.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/01. Button - Promo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\02.png')

Mobile.swipe(900, 880, 70, 855)

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/02. ViewGroup - CT Corp Lifetime Benefit'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\03.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/03. ViewGroup - CT Corp 1'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\04.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/04. ViewGroup - Back Btn CT Corp 1'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\05.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/05. ViewGroup - CT Corp 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\06.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/06. ViewGroup - Back Btn CT Corp 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\07.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/07. ViewGroup - CT Corp 3'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\08.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/08. ViewGroup - Back Btn CT Corp 3'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\09.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/09. ViewGroup - CT Corp 4'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\10.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/10. ViewGroup - Back Btn CT Corp 4'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\11.png')

Mobile.swipe(500, 1000, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\12.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/11. ViewGroup - CT Corp 5'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\13.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/12. ViewGroup - Back Btn CT Corp 5'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\14.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/13. ViewGroup - CT Corp 6'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\15.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/14. ViewGroup - Back Btn CT Corp 6'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\16.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/15. ViewGroup - CT Corp 7'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\17.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/16. ViewGroup - Back Btn CT Corp 7'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\18.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/17. ViewGroup - CT Corp 8'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\19.png')

Mobile.tap(findTestObject('Object Repository/Promo/CT Corp Lifetime Benefit/18. ViewGroup - Back Btn CT Corp 8'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\20.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - CT Corp\\21.png')

Mobile.closeApplication()

