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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\01.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/01. ViewGroup-Voice'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\02.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/02. ViewGroup-Inbox'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\03.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\04.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/03. ViewGroup-QRIS'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\05.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\06.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/04. ViewGroup-Top Up'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\07.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\08.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/05. ViewGroup-Bayar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\10.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/06. ViewGroup-Transfer'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\12.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/07. ViewGroup-Tarik Tunai'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\13.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\14.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/08. ViewGroup-Akun Saya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\15.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\16.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/09. ViewGroup-Layanan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\17.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\18.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/10. ViewGroup-Investasi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\19.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\20.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/11. ViewGroup-Apply'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\21.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\22.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/12. ViewGroup-Financial Dashboard'), 0)

Mobile.delay(10)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\23.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/13. ViewGroup-Tap To Pay'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\24.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/14. Button-OK'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\25.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/15. ViewGroup-Lihat Semua'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\26.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\27.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Menu - Icons/16. ImageView-Highlights'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\28.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Menus Icons\\29.png')

Mobile.closeApplication()

