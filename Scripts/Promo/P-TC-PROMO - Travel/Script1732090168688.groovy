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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\01.png')

Mobile.tap(findTestObject('Object Repository/Promo/Lainnya/01. Button - Promo'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\02.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/02. ViewGroup - Travel and Entertainment'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\03.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/01. TextView - Travel 1'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\04.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\05.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/02. TextView - Travel 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\06.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\07.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/03. TextView - Travel 3'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\08.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\09.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/04. TextView - Travel 4'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\10.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\11.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/05. TextView - Travel 5'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\12.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\13.png')

Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\14.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/06. TextView - Travel 6'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\15.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\16.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/07. TextView - Travel 7'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\17.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\18.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/08. TextView - Travel 8'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\19.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\20.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/09. TextView - Travel 9'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\21.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\22.png')

Mobile.scrollToText('Program Garansi Nilai Tukar Kompetitif')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\23.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/10. TextView - Travel 10'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\24.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\25.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/11. TextView - Travel 11'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\26.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\27.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/12. TextView - Travel 12'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\28.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\29.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/13. TextView - Travel 13'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\30.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\31.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/14. TextView - Travel 14'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\32.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\33.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/15. TextView - Travel 15'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\34.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\35.png')

Mobile.scrollToText('MRT - VISA')

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\36.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/16. TextView - Travel 16'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\37.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\38.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/17. TextView - Travel 17'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\39.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\40.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/18. TextView - Travel 18'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\41.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\42.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/19. TextView - Travel 19'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\43.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\44.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/20. TextView - Travel 20'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\45.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\46.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/21. TextView - Travel 21'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\47.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\48.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/22. TextView - Travel 22'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\49.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\50.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/23. TextView - Travel 23'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\51.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\52.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/24. TextView - Travel 24'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\53.png')

Mobile.tap(findTestObject('Object Repository/Promo/Travel dan Entertainment/ViewGroup - Back Btn Travel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\54.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-PROMO - Travel\\55.png')

Mobile.closeApplication()
