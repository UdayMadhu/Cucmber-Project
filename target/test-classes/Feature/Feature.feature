Feature: Verifying Adactin Hotel

  Scenario Outline: To book the hotel and Generate the order id
    Given I am in the adactin hotel login page
    When Verify the login with "<userName>" and "<password>"
    And To search a hotel by "<location>","<hotel>","<roomType>","<noOfRooms>","<chkInDate>","<chkOutDate>","<adultPerRoom>","<childrenPerRoom>"
    And Select the hotel from the list
    And Book a hotel by "<firstName>","<lastName>","<billingAddress>","<creditCardNo>","<creditCardType>","<expiryMonth>","<expiryYear>","<cvvNumber>"
    # | creditCardNo        | creditCardType | expiryMonth | expiryYear | cvvNumber |
    #| 9876 2569 2365 5784 | VISA           | January    |       2022 |      9868 |
    #| 9876 2569 2365 5789 | VISA           | January    |       2022 |      9868 |
    #| 9876 2569 2365 5723 | VISA           | January    |       2022 |      9868 |
    #| 9876 2569 2365 5789 | VISA           | January    |       2022 |      9868 |
    #| 9876 2569 2365 5798 | VISA           | January    |       2022 |      9868 |
    Then Check the Booking Confirmation "Booking Confirmation" and get order id
    And cancel Booking

    Examples: 
      | userName  | password | location | hotel          | roomType | noOfRooms | chkInDate  | chkOutDate | adultPerRoom | childrenPerRoom | firstName | lastName | billingAddress | creditCardNo        | creditCardType | expiryMonth | expiryYear | cvvNumber |
      | udaymadhu | CE6WM4   | London   | Hotel Sunshine | Standard | 1 - One   | 01/01/2022 | 02/01/2022 | 2 - Two      | 1 - One         | Uday      | Madhu    | Salem          | 9876 2569 2365 5784 | VISA           | January     |       2022 |      9868 |
      #| udaymadhu | UdayMadhu@123 | London    | Hotel Sunshine | Standard     | 1 - One   | 01/01/2022 | 02/01/2022 | 1 - One      | 1 - One         | Uday      | Madhu    | Salem          |9876 2569 2365 5784 | VISA           | January     |       2022 |      9868 |
      #| udaymadhu | UdayMadhu@123 | Melbourne | Hotel Creek    | Double       | 2 - Two   | 03/01/2022 | 04/01/2022 | 2 - Two      | 2 - Two         | Vinoth    | Kumar    | Tanjore        |9876 2569 2365 5784 | VISA           | January     |       2022 |      9868 |
      #| udaymadhu | UdayMadhu@123 | Brisbane  | Hotel Hervey   | Deluxe       | 1 - One   | 05/01/2022 | 06/01/2022 | 3 - Three    | 1 - One         | Mano      | Vasu     | Karur          |9876 2569 2365 5784 | VISA           | January     |       2022 |      9868 |
      #| udaymadhu | UdayMadhu@123 | Adelaide  | Hotel Cornice  | Super Deluxe | 2 - Two   | 07/01/2022 | 08/01/2022 | 4 - Four     | 2 - Two         | Palani    | Kumar    | Madurai        |9876 2569 2365 5784 | VISA           | January     |       2022 |      9868 |
      #| udaymadhu | UdayMadhu@123 | London      | Hotel Sunshine | Standard     | 1 - One   | 09/01/2022 | 10/01/2022 | 1 - One      | 1 - One         | Kavin     | Raj      | Erode          | 9876 2569 2365 5784 | VISA           | January    |       2022 |      5698 |
     # | udaymadhu | UdayMadhu@123 | New York    | Hotel Creek    | Double       | 2 - Two   | 11/01/2022 | 12/01/2022 | 2 - Two      | 2 - Two         | Dhandraj  | Zephrin  | Madurai        | 9876 2569 2365 5784 | VISA           | January    |       2022 |      5698 |
     # | udaymadhu | UdayMadhu@123 | Los Angeles | Hotel Hervey   | Standard     | 1 - One   | 13/01/2022 | 14/01/2022 | 3 - Three    | 1 - One         | Thiru     | Moorthi  | Tirchy         | 9876 2569 2365 5784 | VISA           | January    |       2022 |      5698 |
     # | udaymadhu | UdayMadhu@123 | Paris       | Hotel Cornice  | Deluxe       | 2 - Two   | 15/01/2022 | 16/01/2022 | 4 - Four     | 2 - Two         | Ponnu     | Samy     | Tirchy         | 9876 2569 2365 5784 | VISA           | January    |       2022 |      5698 |
     # | udaymadhu | UdayMadhu@123 | London      | Hotel Sunshine | Double       | 1 - One   | 17/01/2022 | 18/01/2022 | 1 - One      | 1 - One         | Dharani   | Dharan   | Erode          | 9876 2569 2365 5784 | VISA           | January    |       2022 |      5698 |
     # | udaymadhu | UdayMadhu@123 | Brisbane    | Hotel Creek    | Super Deluxe | 2 - Two   | 19/01/2022 | 20/01/2022 | 2 - Two      | 2 - Two         | Nirmal    | Suresh   | USA            | 9876 2569 2365 5784 | VISA           | January    |       2022 |      5698 |
