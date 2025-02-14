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

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\01.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/01. SvgView-Promo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\02.png')

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/02. TextView-verif 1'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/03. TextView-verif 2'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/04. TextView-verif 3'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/05. TextView-4'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/06. TextView-5'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/07. TextView-6'), 0)

Mobile.scrollToText('Garuda Erik')

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/08. TextView-7'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/09. TextView-8'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/10. TextView-9'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/11. TextView-10'), 0)

Mobile.getText(findTestObject('Object Repository/Promo/Rekomendasi/12. TextView-11'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\03.png')

Mobile.swipe(0, 200, 0, 500)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\04.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/13. TextView-Tap 1'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\05.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\06.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/14. TextView-Tap 2'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\07.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\08.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/15. TextView-Tap 3'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\09.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\10.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/16. TextView-Tap 4'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\11.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\12.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/17. TextView-Tap 5'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\13.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\14.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/18. TextView-Tap 6'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\15.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\16.png')

Mobile.swipe(0, 500, 0, 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\17.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/19. TextView-Tap 7'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\18.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\19.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/20. TextView-Tap 8'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\20.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\21.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/21. TextView-Tap 9'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\22.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\23.png')

Mobile.tap(findTestObject('Object Repository/Promo/Rekomendasi/22. TextView-Tap 10'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\24.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\25.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Rekomendasi\\26.png')

Mobile.closeApplication()