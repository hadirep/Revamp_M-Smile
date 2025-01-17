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

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Fitur/01.PathView - Bantuan'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\01.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Fitur/02.RectView - Investasi'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\02.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/03.TextView - Reksadana'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\03.png')

Mobile.tap(findTestObject('Bantuan/Investasi/Reksadana/04.TextView - Question Reksadana 1'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Reksadana/04.TextView - Answer Reksadana 1'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\04.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/06.TextView - Question Reksadana 2'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/06.TextView - Answer Reksadana 2'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\05.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/08.TextView - Question Reksadana 3'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/08.TextView - Answer Reksadana 3'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\06.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/10.TextView - Question Reksadana 4'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/10.TextView - Answer Reksadana 4'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/12.TextView - Question Reksadana 5'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/12.TextView - Answer Reksadana 5'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\08.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/14.TextView - Question Reksadana 6'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/14.TextView - Answer Reksadana 6'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\09.png')

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/16.TextView - Question Reksadana 7'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/16.TextView - Answer Reksadana 7'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\10.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/18.TextView - Question Reksadana 8'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/18.TextView - Answer Reksadana 8'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\11.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/20.TextView - Question Reksadana 9'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/20.TextView - Answer Reksadana 9'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\12.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/22.TextView - Question Reksadana 10'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/22.TextView - Answer Reksadana 10'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\13.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/24.TextView - Question Reksadana 11'), 0)

Mobile.tap(findTestObject('Object Repository/Bantuan/Investasi/Reksadana/24.TextView - Answer Reksadana 11'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\14.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Bantuan/Investasi/Reksadana/26.TextView - Question Reksadana 12'), 0)

Mobile.tap(findTestObject('Bantuan/Investasi/Reksadana/26.TextView - Answer Reksadana 12'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\15.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\16.png')

Mobile.pressBack()

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshoot\\P-TC-BANTUAN - Investasi - Reksadana\\17.png')

Mobile.tap(findTestObject('Topik Populer/09.PathView - Home Button'), 0)

Mobile.closeApplication()//