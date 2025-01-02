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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\01.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/02. TextView-verif Promotion'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/03. TextView-verif Travel, Hotel Event'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/04. TextView-verif Trans Hotel Group'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\02.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/05. Image-Trans Hotel'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\03.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\04.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/06. TextView-verif Antavaya'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/07. Image-Antavaya'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\05.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/08. TextView-verif detikEvent'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\06.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/09. Image-Detikevent'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\07.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\08.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\09.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/10. TextView-verif Media'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/11. TextView-verif detikcom'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/12. Image-Detikcom'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\10.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\11.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\12.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/13. TextView-verif Transvision'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/14. Image-Transvision'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\13.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\14.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\15.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/15. TextView-verif CNN Indonesia'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/16. Image-CNN Indonesia'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\16.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\17.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\18.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/17. TextView-verif CNBC Indonesia'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/18. Image-CNBC Indonesia'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\19.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\20.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\21.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/19. TextView-verif Haibunda'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/20. Image-HaiBunda'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\22.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\23.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\24.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/21. TextView-verif Female Daily'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/22. Image-Female daily'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\25.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\26.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\27.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/23. TextView-verif Beautynesia'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/24. Image-Beautynesia'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\28.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\29.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\30.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/25. TextView-verif CXO Media'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/26. Image-CXO media'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\31.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/27. TextView-InsertLive'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/28. Image-InsertLive'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\32.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\33.png')

Mobile.swipe(500, 1250, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\34.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/29. TextView-verif Bank  Finance'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/30. TextView-verif Allo Bank'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/31. Image-Allo Bank'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\36.png')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/32. TextView-Mega Syariah Tab Haji'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\37.png')

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/33. Image-BANK MEGA SYARIAH'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\38.png')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/01. PathView-Allo Explore'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\39.png')

Mobile.swipe(500, 1500, 500, 200)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\40.png')

Mobile.getText(findTestObject('Object Repository/Homepage/Allo Explore/34. TextView-Investasiku'), 0)

Mobile.tap(findTestObject('Object Repository/Homepage/Allo Explore/35. Image-InvestasiKu'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-HOMEPAGE - Allo Explorer\\41.png')

Mobile.closeApplication()

