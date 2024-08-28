Feature: SignIn

  @TC_01
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Signin
    ##Then close the Signin Page

  @TC_02
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Signin
    Then Click the menu icon in homepage
    And Click Signout button in homepage
    #Then close the Signin Page

  @TC_03
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter Invalid username and password are "sound@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check Signin
    Then Check error message in signin page
    #Then close the Signin Page

  @TC_04
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter username and invalid password are "soundharya@sankarasoftware.com" and "Sound@1234"
    And click the Signin button To Check Signin
    Then Check error message in signin page
    #Then close the Signin Page

  @TC_05
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter invalid username and invalid password are "sound@sankarasoftware.com" and "Sound@1234"
    And click the Signin button To Check Signin
    Then Check error message in signin page
    #Then close the Signin Page

  @TC_06
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter username and without password are "soundharya@sankarasoftware.com" and ""
    And click the Signin button To Check Signin
    #Then close the Signin Page

  @TC_07
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User without username and valid password are "" and "Soundharya@123"
    And click the Signin button To Check Signin
    #Then close the Signin Page

  @TC_08
  Scenario: Sign In:Valid Check
    Given To Check Signin User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check Signin User Enter username and without password are "soundharya@sankarasoftware.com" and ""
    When Click forget password button in Admin portal
    #Then close the Signin Page
