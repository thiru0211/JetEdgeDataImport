Feature: GV FILE UPLOAD

  @TC_01
  Scenario: GV File Upload:Sign In Check
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Check Page Landed to Homepage or not in GV File Upload
    Then close the GV File Upload Page

  @TC_02
  Scenario: GV File Upload:Order Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Order Data button in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_03
  Scenario: GV File Upload:Order Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Order Data button in GV File Upload
    And Upload invalid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_04
  Scenario: GV File Upload:Order Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Order Data button in GV File Upload
    And Upload valid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_05
  Scenario: GV File Upload:Order Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Order Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload
    And Upload valid file in GV File Upload
    Then Enter valid notes "Test" in the field
    And click clear button in GV File Upload
    Then close the GV File Upload Page

  @TC_06
  Scenario: GV File Upload:Order Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Order Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload
    And Upload valid file in GV File Upload
    Then Enter valid notes "Test" in the field
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_07
  Scenario: GV File Upload:Order Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Order Data button in GV File Upload
    And Click Download button in GV File Upload
    Then close the GV File Upload Page

  @TC_08
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Click Help button in GV File Upload
    Then close the GV File Upload Page

  @TC_09
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Click Sample file button in GV File Upload
    Then close the GV File Upload Page

  @TC_10
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_11
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Upload invalid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_12
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Upload valid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_13
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload
    And Upload valid file in GV File Upload
   # Then Enter valid notes "Test" in the field
    And click clear button in GV File Upload
    Then close the GV File Upload Page

  @TC_14
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload
    And Upload valid file in GV File Upload
  #  Then Enter valid notes "Test" in the field
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_15
  Scenario: GV File Upload:Leg Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Leg Data button in GV File Upload
    And Click Download button in GV File Upload
    Then close the GV File Upload Page

  @TC_16
  Scenario: GV File Upload:Revenue Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Revenue Data button in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_17
  Scenario: GV File Upload:Revenue Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Revenue Data button in GV File Upload
    And Upload invalid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_18
  Scenario: GV File Upload:Revenue Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Revenue Data button in GV File Upload
    And Upload valid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_19
  Scenario: GV File Upload:Revenue Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Revenue Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload in Revenue Data
    And Upload valid file in GV File Upload
   # Then Enter valid notes "Test" in the field
    And click clear button in GV File Upload
    Then close the GV File Upload Page

  @TC_20
  Scenario: GV File Upload:Revenue Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Revenue Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload in Revenue Data
    And Upload valid file in GV File Upload
   # Then Enter valid notes "Test" in the field
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_21
  Scenario: GV File Upload:Revenue Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Revenue Data button in GV File Upload
    And Click Download button in GV File Upload
    Then close the GV File Upload Page

  @TC_22
  Scenario: GV File Upload:MX Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click MX Data button in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_23
  Scenario: GV File Upload:MX Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click MX Data button in GV File Upload
    And Upload invalid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_24
  Scenario: GV File Upload:MX Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click MX Data button in GV File Upload
    And Upload valid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_25
  Scenario: GV File Upload:MX Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click MX Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload in MX Data
    And Upload valid file in GV File Upload
    Then Enter valid notes "Test" in the field
    And click clear button in GV File Upload
    Then close the GV File Upload Page

  @TC_26
  Scenario: GV File Upload:MX Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click MX Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload in MX Data
    And Upload valid file in GV File Upload
    Then Enter valid notes "Test" in the field
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_27
  Scenario: GV File Upload:MX Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click MX Data button in GV File Upload
    And Click Download button in GV File Upload
    Then close the GV File Upload Page

  @TC_28
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click Help button in GV File Upload in crew data
    Then close the GV File Upload Page

  @TC_29
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click Sample file button in GV File Upload
    Then close the GV File Upload Page

  @TC_30
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_31
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Upload invalid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_32
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Upload valid file in GV File Upload
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_33
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload in Crew Data
    And Upload valid file in GV File Upload
   # Then Enter valid notes "Test" in the field
    And click clear button in GV File Upload
    Then close the GV File Upload Page

  @TC_34
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Enter valid From Date in GV File Upload
    Then Enter valid to date in GV File Upload in Crew Data
    And Upload valid file in GV File Upload
   # Then Enter valid notes "Test" in the field
    And Click upload button in GV File Upload
    Then close the GV File Upload Page

  @TC_35
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click Download button in GV File Upload
    Then close the GV File Upload Page

  @TC_36
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click View Report button in GV File Upload
    Then Click Back button in GV File Upload
    Then close the GV File Upload Page

  @TC_37
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click View Report button in GV File Upload
    Then Click Run button in GV File Upload
    Then close the GV File Upload Page

  @TC_38
  Scenario: GV File Upload:Crew Data
    Given To Check GV File Upload User is navigating to JetEdge URL is "http://192.168.1.33/DATAIMPORT/Login.aspx"
    When To Check GV File Upload User Enter username and password are "soundharya@sankarasoftware.com" and "Soundharya@123"
    And click the Signin button To Check GV File Upload
    Then Click Crew Data button in GV File Upload
    And Click View Report button in GV File Upload
    Then Enter valid from date in View Report
    And Enter valid to date in View Report
    Then Click Run button in GV File Upload
    Then close the GV File Upload Page
