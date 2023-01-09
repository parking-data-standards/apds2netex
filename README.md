[![License](https://img.shields.io/badge/license-GPL_v3-informational)](/LICENSE)
# apds2netex 
an Open-Source APDS-to-NeTEx Adapter

## Table of Contents
[Starting Point and Motivation](#starting-point-and-motivation)  
[Reference Documents](#reference-documents)  
[Project Artefacts](#project-artefacts)  
[License](#license)  
[Documentation](#documentation)  
[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Solution Architecture](#solution-architecture)  
[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Result Validation](#validation-of-the-result)  
[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Build Instructions](#build-instructions)  
[&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Command Line Utility](#command-line-utility)  

## Starting Point and Motivation
### APDS
With the input of numerous parking industry professionals, the _Alliance for Parking Data Standards_ (https://www.allianceforparkingdatastandards.org) has created the APDS standard. The latest version of the standard specification is v4.0. The _Alliance_ also provides an accompanying APDS Messaging Specification (published on GitHub) to facilitate implementation work for APDS adopters. 

### NeTEx, NeTEx Parking Profile
There is a variety of other specifications covering selected aspects of transport and mobility. One such standard specification is Transmodel (EN 12896, http://www.transmodel-cen.eu ), the CEN reference data model for public transport. Transmodel has also been the basis for NeTEx (“Network Timetable Exchange”, http://netex-cen.eu ) which constitutes a CEN Technical Standard for exchanging Public Transport schedules and related data (CEN TS 16614-1, CEN TS 16614-2, CEN TS 16614-3).

There are some profiles using a subset of NetEx. One of them is “NeTEx – Profil Français pour les Parkings”. It is related to parking facilities as one important element in the greater scheme of transport modes. It originally was created to serve as a basis for 3rd parties who are mandated to fulfill the French LOM (Lois d’Orientation pour les Mobilités), a national regulation.

### APDS-to-NeTEx Adapter
The sheer number of mobility-related standards and specifications makes it difficult for potential adopters to select the one that best matches their individual requirements, and most of the time, no information is available elaborating on the reciprocal representability between two different standards.

The subject of this project is precisely this: a software to convert information available in the APDS Messaging Specification format into its corresponding NeTEx (Parking Profile) representation. That way, implementers can safely base their work on APDS and know that it can be converted into a format processible by NeTEx endpoints (e.g. National Access Points expecting NeTEx-formatted data).

## Reference Documents
### APDS
Concerning the APDS standard, the proposed work will be based on the contents of the GitHub repository published at https://github.com/parkingdata/spec.

### NeTEx
Copies of the NeTEx specifications that this project is based on can be found in this repository:
* [NF_Profil-NeTEx-pour-les-ParkingsF-v1.2a.pdf](/specs/NF_Profil-NeTEx-pour-les-ParkingsF-v1.2a.pdf)
* [Profil-NeTEx-elements-communsF-v2.2.pdf](/specs/Profil-NeTEx-elements-communsF-v2.2.pdf) _(only the elements used in the Parking Profile)_

## Project Artefacts
This project provides two main artefacts:
* a Java library which you can use to translate between APDS and NeTEx (Parking Profile)
* an embedded command line utility using the library for demonstration purposes

## License
This project is provided under the GPL v3 (GNU General Public License, version 3 dated 29 June 2007). A copy of the full LICENSE can be found [here](/LICENSE). Please note that the _NeTEx_ specifications used here are provided under GPL v3, too.

## Documentation
### Solution Architecture
The technical approach is this: 
* read APDS schema (OpenAPI) ⇨ generate corresponding Java objects to represent the APDS model (using the _openapi-generator_ maven plugin)
* read NeTEx schema definition (XSD) ⇨ generate corresponding Java objects  to represent the NeTEx model (using the _jaxb_ maven plugin, better known as the _xjc_ command line tool)
* connect both via programmed transformation logic
* use the automatically generated JAXB classes to serialize the NeTEx-conformant output


<img src="images/buildstep1.png" width="800px">

<br/>
<img src="images/buildstep2.png" width="800px">
<br/><br/>

#### Overall Working Principle
<br/>
<img src="images/principle.png" width="800px">

### Validation of the Result
Via this approach, schema conformity is ensured to a great extent. Even though the project is using a sub-set of the NeTEx schema, the output will always successfully validate against the official full-blown _NeTEx\_publication.xsd_. 
In our project, we use open source tools to confirm this. Given an output file named "converter\_output.xml", this can be done like this: 

```bash
 xmllint --noout --schema NeTEx_publication.xsd converter_output.xml

```

This is expected to generate a response output like this one here: 

```
 xmllint: converter_output.xml validates

```

<br/>
<img src="images/validation.png" width="500px">


### Build Instructions
#### Building the Library
The library itself is based on _Java_ source code. We have chosen _Maven_ as the build tool, but this can easily be changed to a different tool of your choice (like. e.g. _Gradle_). The .jar file with the library can be built in three simple steps.

##### Step 1: Generate Java Source Code from APDS Specification
```
 mvn generate-sources

```

##### Step 2: Generate Java Source Code from NeTEx XML Schema
```
 mvn jaxb2:xjc

```

##### Step 3: Compile Generated Code and Transformation Logic into Library
```
 mvn package

```

Obviously, the steps only need to be executed in case you have made changes (to the source code or to the input schemata).


### Command Line Utility
The library comes with an embedded command line utility (embedded as main class _Demo_ in the _demo_ package).
The tool supports the following command line parameters:

| parameter name | mandatory | description |
| --- | --- | --- |
| --places | yes | APDS-conformant input file with one or more places |
| --rights | yes | APDS-conformant input file with one or more right specifications |
| --rates | yes | APDS-conformant input file with one or more rate tables |
| --out | no | (optional) name of a file to write the NeTEx-formatted output to; if missing, output will be written to the console |

Parameter values are specified in the form _&lt;parameter name&gt;_=_&lt;parameter value&gt;_

A typical run of the command line utility will look like this:

```bash
java -jar apds2netex-1.0.SNAPSHOT.jar org.apds.interop.apds2netex.demo.Demo --places=demo_places.json --rights=demo_rights.json --rates=demo_rates.json

```

This will 
* start the command line utility,
* read the APDS-conformant place/right/rate data from the specified files
* convert the information into a NeTEx-conformant format
* and output the result

By adding `--out=result.xml`, you could write the result into a file named "result.xml".

#### Sample Input Files
The project repository contains a set of example input files (places, rights, rates). You can find them in the `src/test/resources` folder.

##### places.json
```json
[
  {
    "id":"805432",
    "version":1,
    "type":"place",
    "layer":1,
    "name":{"en":"Arndale"},
    "indicativePointLocation":{"type":"Point","coordinates":[-2.23873926627018,53.4841328804172]},
    "description":{"en":"Arndale Car Park in Manchester City"},
    "areaType":"generalParking",
    "characteristics":{
      "accessControlled":false,
      "evChargingPoints":0,
      "openToPublic":true,
      "spacesTotal":1382,
      "structureGrade":"aboveGround",
      "structureType":"offStreetStructure"
    },
    "contacts":[
      {
        "organisationName":{"en":"Manchester City Council"},
        "type":"operator",
        "emails":[{"address":"representations@manchester.gov.uk","typeCode":"customerService"}]
      }
    ],
    "rightSpecifications":[
      {"id":"6091d5d0-5264-4d66-a31a-1a9e2c9eed89","version":1}
    ],
    "paymentMethods":[{"paymentMode":["payOnEntry"]}],
    "placeStreetAddress":{
      "postCode":"M4 1QB",
      "city":{"en":"Manchester"},
      "countryCode":"GB",
      "addressLines":[
        {"type":"street","order":0,"text":"High St"}
      ]
    },
    "openingTimes": {
      "available24hours": true,
      "openAllYear": true,
      "accessAndEgress": [
        {
          "validity": {
            "validPeriods": [
              {
                "periodName": {
                  "en": "standardTimes"
                },
                "recurringTimePeriodOfDay": {
                  "startTimeOfPeriod": "08:00",
                  "endTimeOfPeriod": "19:00"
                }
              },
              {
                "periodName": {
                  "en": "Mo-Sat"
                },
                "recurringDayWeekMonthPeriod": {
                  "applicableDay": [
                    "monday",
                    "tuesday",
                    "wednesday",
                    "thursday",
                    "friday",
                    "saturday"
                  ]
                }
              }
            ],
            "exceptionPeriods": [
              {
                "periodName": {
                  "en": "not on Sundays"
                },
                "recurringDayWeekMonthPeriod": {
                  "applicableDay": [
                    "sunday"
                  ]
                }
              }
            ]
          }
        }
      ]
    }
  }
]
```

##### rights.json
```json
[
  {
    "id":"6091d5d0-5264-4d66-a31a-1a9e2c9eed89",
    "version":1,
    "type":"oneTimeUseParking",
    "description":{"en":"right specification for Arndale Car Park in Manchester City"},
    "expiry":"2025-12-31T23:59:59+00:00",
    "hierarchyElements":[{"id":"805432","version":1}],
    "rateEligibility":[
      {
        "id":"b49794f3-a845-4451-8618-641100f49b2e",
        "version":1,
        "rate":{
          "id":"0376c349-ed20-4f6f-9551-1a82f9f5f734",
          "version":1
        }
      }
    ],
    "validity":
    {
      "validPeriods":[
        {
          "periodName":{"en":"all week long"},
          "recurringDayWeekMonthPeriod":{"applicableDay":["monday","tuesday","wednesday","thursday","friday","saturday","sunday"]
          }
        }
      ]
    }
  }
]
```
##### rates.json
```json
[
  {
    "id":"0376c349-ed20-4f6f-9551-1a82f9f5f734",
    "version":1,
    "rateTableName":{"en":"rate table for Arndale Car Park in Manchester (general public parking)"},
    "rateLineCollections":[
      {
        "applicableCurrency":"GBP",
        "collectionSequence":0,
        "rateLines":
        [
          {"sequence":0,"description":{"en":"Up to 1 hour"},"rateLineType":"incrementingRate","value":3.7,"durationStart":"00:00","durationEnd":"01:00"},
          {"sequence":1,"description":{"en":"Up to 2 hours"},"rateLineType":"incrementingRate","value":6.7,"durationStart":"01:00","durationEnd":"02:00"},
          {"sequence":2,"description":{"en":"Up to 3 hours"},"rateLineType":"incrementingRate","value":9.2,"durationStart":"02:01","durationEnd":"03:00"},
          {"sequence":3,"description":{"en":"Up to 4 hours"},"rateLineType":"incrementingRate","value":12.2,"durationStart":"03:01","durationEnd":"04:00"},
          {"sequence":4,"description":{"en":"Up to 5 hours"},"rateLineType":"incrementingRate","value":15.2,"durationStart":"04:01","durationEnd":"05:00"},
          {"sequence":5,"description":{"en":"Up to 24 hours"},"rateLineType":"incrementingRate","value":20.5,"durationStart":"05:01","durationEnd":"24:00"}
        ],
        "relativeTimes":true
      }
    ],
    "availability":"public",
    "rateResponsibleParty":"Manchester City Council"
  }
]
```
##### NeTEx result example
An example for the corresponding library-generated NeTEx equivalent can be found in `src/test/resources/temp/arndale.xml`

```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<PublicationDelivery version="1.0" xmlns="http://www.netex.org.uk/netex">
    <PublicationTimestamp>2023-01-09T11:19:18.250+01:00</PublicationTimestamp>
    <ParticipantRef>APDS_DEMO</ParticipantRef>
    <dataObjects>
        <CompositeFrame id="FR:CompositeFrame:a54fe5a8-e7e9-4ac3-a691-07d412c5be45:LOC" created="2023-01-09T11:19:18.335+01:00" version="1">
            <frames>
                <GeneralFrame id="GF1" version="1">
                    <TypeOfFrameRef ref="FR:TypeOfFrame:NETEX_PARKING">version="2.01:FR-NETEX_PARKING-1.0"</TypeOfFrameRef>
                    <members>
                        <Parking id="805432" version="1">
                            <validityConditions>
                                <AvailabilityCondition id="FR:AvailabilityCondition:standardTimes:1" version="any">
                                    <IsAvailable>true</IsAvailable>
                                    <timebands id="FR:timebands:01">
                                        <Timeband id="FR:Timeband:01" version="any">
                                            <StartTime>08:00:00</StartTime>
                                            <EndTime>19:00:00</EndTime>
                                        </Timeband>
                                    </timebands>
                                </AvailabilityCondition>
                                <AvailabilityCondition id="FR:AvailabilityCondition:Mo-Sat:2" version="any">
                                    <IsAvailable>true</IsAvailable>
                                    <dayTypes>
                                        <DayType id="FR:DayType:02" version="any">
                                            <properties>
                                                <PropertyOfDay>
                                                    <DaysOfWeek>Monday Tuesday Wednesday Thursday Friday Saturday</DaysOfWeek>
                                                </PropertyOfDay>
                                            </properties>
                                        </DayType>
                                    </dayTypes>
                                </AvailabilityCondition>
                                <AvailabilityCondition id="FR:AvailabilityCondition:not on Sundays:1" version="any">
                                    <IsAvailable>false</IsAvailable>
                                    <dayTypes>
                                        <DayType id="FR:DayType:01" version="any">
                                            <properties>
                                                <PropertyOfDay>
                                                    <DaysOfWeek>Sunday</DaysOfWeek>
                                                </PropertyOfDay>
                                            </properties>
                                        </DayType>
                                    </dayTypes>
                                </AvailabilityCondition>
                            </validityConditions>
                            <Name lang="GB">Arndale</Name>
                            <Description lang="GB">Arndale Car Park in Manchester City</Description>
                            <Centroid>
                                <Location>
                                    <Longitude>-2.23873926627018</Longitude>
                                    <Latitude>53.4841328804172</Latitude>
                                </Location>
                            </Centroid>
                            <PostalAddress id="GB:PostalAddress:805432:LOC" version="any">
                                <Street lang="GB">High St</Street>
                                <Town lang="GB">Manchester</Town>
                                <PostCode>M4 1QB</PostCode>
                            </PostalAddress>
                            <PublicCode>805432</PublicCode>
                            <ParkingType>other</ParkingType>
                            <ParkingLayout>multistorey</ParkingLayout>
                            <TotalCapacity>1382</TotalCapacity>
                            <RechargingAvailable>false</RechargingAvailable>
                            <ParkingPaymentProcess>payAndDisplay payByMobileDevice</ParkingPaymentProcess>
                        </Parking>
                        <ParkingTariff id="e01d514a-5d8c-447f-94b7-9607be78c5e0:0376c349-ed20-4f6f-9551-1a82f9f5f734" version="any">
                            <Name lang="GB">rate table for Arndale Car Park in Manchester (general public parking)</Name>
                            <appliesTo>
                                <ParkingRef ref="805432"/>
                            </appliesTo>
                            <parkingChargeBands>
                                <ParkingChargeBand>
                                    <MaximumStay>PT1H</MaximumStay>
                                    <prices>
                                        <TimeIntervalPrice id="GB:TimeIntervalPrice:629b26f6-90dd-44c1-92cf-21635f9a7fbf:0376c349-ed20-4f6f-9551-1a82f9f5f734:0:0:LOC" version="any">
                                            <Amount>3.7</Amount>
                                        </TimeIntervalPrice>
                                    </prices>
                                </ParkingChargeBand>
                                <ParkingChargeBand>
                                    <MaximumStay>PT1H</MaximumStay>
                                    <prices>
                                        <TimeIntervalPrice id="GB:TimeIntervalPrice:a7589fba-22fd-4ca2-a1ba-ea1a38b0ba27:0376c349-ed20-4f6f-9551-1a82f9f5f734:0:1:LOC" version="any">
                                            <Amount>6.7</Amount>
                                        </TimeIntervalPrice>
                                    </prices>
                                </ParkingChargeBand>
                                <ParkingChargeBand>
                                    <MaximumStay>PT59M</MaximumStay>
                                    <prices>
                                        <TimeIntervalPrice id="GB:TimeIntervalPrice:6663c413-2c13-4a8a-b178-41ac919a10c8:0376c349-ed20-4f6f-9551-1a82f9f5f734:0:2:LOC" version="any">
                                            <Amount>9.2</Amount>
                                        </TimeIntervalPrice>
                                    </prices>
                                </ParkingChargeBand>
                                <ParkingChargeBand>
                                    <MaximumStay>PT59M</MaximumStay>
                                    <prices>
                                        <TimeIntervalPrice id="GB:TimeIntervalPrice:32a5249c-c62b-499b-ad92-95589f05d030:0376c349-ed20-4f6f-9551-1a82f9f5f734:0:3:LOC" version="any">
                                            <Amount>12.2</Amount>
                                        </TimeIntervalPrice>
                                    </prices>
                                </ParkingChargeBand>
                                <ParkingChargeBand>
                                    <MaximumStay>PT59M</MaximumStay>
                                    <prices>
                                        <TimeIntervalPrice id="GB:TimeIntervalPrice:1c093078-6812-445c-8ea9-a1857ab83ea7:0376c349-ed20-4f6f-9551-1a82f9f5f734:0:4:LOC" version="any">
                                            <Amount>15.2</Amount>
                                        </TimeIntervalPrice>
                                    </prices>
                                </ParkingChargeBand>
                                <ParkingChargeBand>
                                    <MaximumStay>PT18H59M</MaximumStay>
                                    <prices>
                                        <TimeIntervalPrice id="GB:TimeIntervalPrice:e5b95704-db62-4478-8968-a395c6ee13fe:0376c349-ed20-4f6f-9551-1a82f9f5f734:0:5:LOC" version="any">
                                            <Amount>20.5</Amount>
                                        </TimeIntervalPrice>
                                    </prices>
                                </ParkingChargeBand>
                            </parkingChargeBands>
                        </ParkingTariff>
                    </members>
                </GeneralFrame>
            </frames>
        </CompositeFrame>
    </dataObjects>
</PublicationDelivery>

```
