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

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Subscribe/01.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Subscribe/02.RectView - Investasi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Subscribe/03.PathView - Close Session'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\03.png')

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/04.TextView - Redeem'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\04.png')

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/05.TextView - Question Redeem 1'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/05.TextView - Answer Redeem 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/07.TextView - Question Redeem 2'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/07.TextView - Answer Redeem 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\06.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/09.TextView - Question Redeem 3'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/09.TextView - Answer Redeem 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/11.TextView - Question Redeem 4'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/11.TextView - Answer Redeem 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/13.TextView - Question Redeem 5'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/13.TextView - Answer Redeem 5'), 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\09.png')

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/15.TextView - Question Redeem 6'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Redeem/15.TextView - Answer Redeem 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\10.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\11.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\12.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Redeem\\13.png')

Mobile.closeApplication()//