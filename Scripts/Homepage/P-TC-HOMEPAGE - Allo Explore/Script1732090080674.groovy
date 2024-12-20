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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\01.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/02. TextView - Starter'), 
	'Starter')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/03. TextView - Advanced'), 
	'Advanced')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/04. TextView - Akses semua aplikasi unit bisnis CT Corp dengan mudah'), 
    'Akses semua aplikasi unit bisnis CT Corp dengan mudah')

Mobile.delay(5)

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/05. TextView - Promotion'), 
	'Promotion')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/06. TextView - Ticket Tour Hotel'), 
	'Ticket Tour & Hotel')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/07. TextView - Trans Hotel Group'), 
	'Trans Hotel Group')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\02.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/08. Image - Trans Hotel Group'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\03.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\04.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/09. TextView - Antavaya'), 
	'Antavaya')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\05.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/10. Image - Antavaya') , 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\06.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\07.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/11. TextView - vConsole'), 
	'vConsole')

Mobile.scrollToText('Theme Park & Entertainment')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\08.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/12. TextView - Media'), 
	'Media')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/13. TextView - detikcom'), 
	'detikcom')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/14. Image - detikcom'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\09.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\10.png')

Mobile.scrollToText('Theme Park & Entertainment')
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\11.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/15. TextView - Transvision'), 
	'Transvision')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/16. Image - Transvision'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\12.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\13.png')

Mobile.scrollToText('Theme Park & Entertainment')
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\14.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/17. TextView - Bank Finance'), 
	'Bank & Finance')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/18. TextView - Allo Bank'), 
	'Allo Bank')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/19. Image - Allo Bank'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\15.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\16.png')
Mobile.scrollToText('Entertainment')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\17.png')
Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/20. TextView - Mega Syariah Tab Haji'), 
	'Mega Syariah Tab Haji')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/21. Image - Mega Syariah'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\18.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\19.png')
Mobile.scrollToText('Entertainment')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/22. TextView - Investasiku'), 
	'Investasiku')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/23. Image - Investasiku'), 0)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\20.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\21.png')


Mobile.scrollToText('Entertainment')
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\22.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/24. TextView - PFI Mega Life'), 
	'PFI Mega Life')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/25. Image - Mega Life'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\23.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\24.png')

Mobile.scrollToText('Entertainment')
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\25.png')

Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/26. TextView - Mega Insurance'), 
	'Mega Insurance')
Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/27. Image - Mega Insurance'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\26.png')
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. Button - Allo Explorer'), 0)
Mobile.delay(5)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\27.png')

Mobile.scrollToText('Entertainment')
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\28.png')
Mobile.verifyElementText(findTestObject('Object Repository/Homepage/Allo Explore/28. TextView - Theme Park Entertainment'), 
	'Theme Park & Entertainment')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/30. Image - Trans Entertainment'), 0)
Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\29.png')
Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explore\\30.png')

Mobile.closeApplication()

