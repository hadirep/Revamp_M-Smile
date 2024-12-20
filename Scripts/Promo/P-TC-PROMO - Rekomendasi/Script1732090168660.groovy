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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\01.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/01. Button - Promo'), 0)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\02.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/02. ViewGroup - Rekomendasi 1'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\03.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/03. ViewGroup - Back Btn 1'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\04.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/04. ViewGroup - Rekomendasi 2'), 0)


Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\05.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/05. ViewGroup - Back Btn 2'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\06.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/06. ViewGroup - Rekomendasi 3'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\07.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/07. ViewGroup - Back Btn 3'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\08.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/08. ViewGroup - Rekomendasi 4'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\09.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/09. ViewGroup - Back Btn 4'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\10.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/10. ViewGroup - Rekomendasi 5'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\11.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/11. ViewGroup - Back Btn 5'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\12.png')

Mobile.swipe(500, 2000, 500, 500)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\13.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/12. ViewGroup - Rekomendasi 6'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\14.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/13. ViewGroup - Back Btn 6'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\15.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/14. ViewGroup - Rekomendasi 7'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\16.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/15. ViewGroup - Back Btn 7'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\17.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/16. ViewGroup - Rekomendasi 8'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\18.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/17. ViewGroup - Back Btn 8'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\19.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/18. ViewGroup - Rekomendasi 9'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\20.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/19. ViewGroup - Back Btn 9'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\21.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/20. ViewGroup - Rekomendasi 10'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\22.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/21. ViewGroup - Back Btn 10'), 0)

Mobile.delay(2)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\23.png')

Mobile.closeApplication()

