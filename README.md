# SeleniumeExtractTextfromImage
This demo demonstrates that how to extract text form image by using tesseract in Selenium, whilst it used data tabe  of cucunber
## About this demo story
Recently, my ten years old son study hacker skills, he is success when he attacked ** web sever, I can not believe it. His behavior inspired me whichsecurity verfication technologies are more safety,so I start doing some research about verfication code skills of website, one of them is doing jigsaw that moving one of piece to slide it's correct position, If you are curious about which technology is more safety, first please access https://github.com/AnnaQiao/CucumberOutline_SeleniumSlidermovement. Today, let me explaining the solution how to extract code from picture in Selenium by using Tesseract.
## getting started
### prerequesite
 - Installing Tesseract
 - add Tess4J dependency to pom.xlm
 - installing related automation tools JDE, Selenium, Cucumber,so on.
### What is Tesseract
   Tesseract is a famous open source OCR engine. Tesseract support a wide variety of image formats and convert them to text in over 60 languages.
   installing Tesseract, Please refer https://github.com/tesseract-ocr/tesseractReadme page for installation instructions.
   an addition to Tesseract (written in C++), we need a Java wrapper called Tess4J which provides JNA wrapper for Tesseract OCR API.
   - add Tess4J dependency to POM.XML, please refer the following picture. 
![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/dependency.JPG)


