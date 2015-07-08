/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.ubl21.codelist;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.id.IHasID;
import com.helger.commons.lang.EnumHelper;
import com.helger.commons.name.IHasDisplayName;


/**
 * This file was automatically generated from Genericode file TransportationStatusCode-2.1.gc. Do NOT edit!
 * It contains a total of 336 entries!
 * @author com.helger.ubl21.main.MainCreateEnumsGenericode21
 * 
 */
@CodingStyleguideUnaware
public enum ETransportationStatusCode21
    implements IHasID<String> , IHasDisplayName
{
    _1("1", "Arrival, completed", "The goods/consignment/equipment/means of transport has arrived."),
    _2("2", "Loading, authorized", "Authorisation to load has been given."),
    _3("3", "Arrival, in defective condition", "The goods/consignment/equipment or a means of transport has arrived in a defective condition."),
    _4("4", "Defective equipment returned to service", "The equipment previously the subject of a 'defective condition' status has been returned to service."),
    _5("5", "Process, begun", "The process has begun."),
    _6("6", "Booking, completed", "The goods/consignment/equipment or means of transport has been booked."),
    _7("7", "Booking, cancelled", "The booking of goods/consignment/equipment or means of transport has been cancelled."),
    _8("8", "Cleared, import restrictions", "The goods/consignment/equipment/means of transport held for import restriction purposes, has been released for import."),
    _9("9", "Cleared, export restrictions", "The goods/consignment/equipment/means of transport held for export restriction purposes, has been released for export."),
    _10("10", "Cleared, by agriculture, food or fisheries authorities", "The goods/consignment/equipment/means of transport has been cleared by agriculture, food or fisheries authorities."),
    _11("11", "Cleared, by port authority", "The goods/consignment/equipment/means of transport has been cleared by port authority."),
    _12("12", "Cleared, by customs", "The goods/consignment/equipment/means of transport has been cleared by customs."),
    _13("13", "Collection/pick-up, completed", "The goods/consignment/equipment has been collected/picked-up."),
    _14("14", "Process, completed", "The process has been completed."),
    _15("15", "Consolidated", "The goods/consignments have been consolidated."),
    _16("16", "Crossed border", "The goods/consignments/equipment/means of transport has crossed a border."),
    _17("17", "Customs clearance, refused", "The goods/consignment/equipment/means of transport has been refused to be cleared by the customs authorities."),
    _18("18", "Damaged in the course of transportation", "The goods/consignment/equipment has been damaged in the course of transportation."),
    _19("19", "Equipment, damage quoted for", "Damaged equipment has been assessed and a repair quotation has been sent."),
    _20("20", "Delayed, in the course of transportation", "The goods/consignment/equipment/means of transport has been delayed in the course of transportation."),
    _21("21", "Delivery, completed", "The goods/consignment/equipment has been delivered."),
    _22("22", "Delivery, completed as per instruction", "Delivery of the goods/consignment/equipment has been completed as per instruction."),
    _23("23", "Delivery, not completed", "Delivery of the goods/consignment/equipment has not been completed."),
    _24("24", "Departure, completed", "The means of transport has departed."),
    _25("25", "Departure, delayed", "The means of transport has been delayed in departure."),
    _26("26", "Deramped", "The equipment has been removed from a position above another type of equipment and/or on a means of transport."),
    _27("27", "Despatch, completed", "The goods/consignment/equipment has been despatched."),
    _28("28", "Stripped", "The goods/consignment/equipment has been unloaded from a piece of equipment in which they were transported."),
    _29("29", "Unloaded", "The goods/consignment/equipment has been unloaded from a means of transport."),
    _30("30", "Empty on inspection", "The package/equipment has been found to be empty on inspection."),
    _31("31", "En route", "The goods/consignment/equipment/means of transport is moving to destination."),
    _32("32", "Equipment, returned from repair", "The equipment has been returned from repair."),
    _33("33", "Equipment, sent for repair", "The equipment has been sent for repair."),
    _34("34", "Equipment, repaired", "The equipment has been repaired."),
    _35("35", "Forwarded to destination", "The goods/consignment/equipment has been forwarded to a destination."),
    _36("36", "Not found", "The goods/consignment/equipment/means of transport has not been found."),
    _37("37", "Found", "The goods/consignment/equipment/means of transport has been found."),
    _38("38", "Freight paid", "The freight charges have been paid."),
    _39("39", "Released from bond", "The goods/consignment/equipment has been released from bond."),
    _40("40", "Arrival, at port", "The goods/consignment/equipment has arrived at the port."),
    _41("41", "Handed over under continued responsibility", "The goods/consignment/equipment has been handed over under responsibility of the same transport operator."),
    _44("44", "Misrouted consignment corrected", "The goods/consignment/equipment/means of transport has been re-routed to the correct destination."),
    _45("45", "Arrival, consignee informed", "The consignee has been informed of the arrival of the goods/consignments/equipment/means of transport."),
    _46("46", "Moved, into bond", "The goods/consignment/equipment has been moved into bond."),
    _47("47", "Moved, into packing depot", "The goods/consignment/equipment has been moved into a packing depot."),
    _48("48", "Loading, completed onto a means of transport", "The goods/consignment/equipment has been loaded onto a means of transport."),
    _49("49", "Lost", "The goods/consignment/equipment/means of transport has been lost ."),
    _50("50", "Manifested", "The goods/consignment/equipment has been included on a manifest ."),
    _51("51", "Onloaded from a means of transport", "The consignment has been onloaded from a means of transport."),
    _53("53", "Collection/pick-up, not completed", "The goods/consignment/equipment expected has not been collected/picked-up."),
    _54("54", "Unidentifiable", "The goods/consignment/equipment/means of transport cannot be identified."),
    _57("57", "Not loaded onto a means of transport", "The goods/consignment/equipment has not been loaded onto a means of transport."),
    _58("58", "Equipment, off hire", "The equipment is no longer under lease."),
    _59("59", "Premature onloading", "The goods/consignment/equipment has been onloaded prematurely from a means of transport."),
    _60("60", "Equipment, on hire", "The equipment has been leased."),
    _61("61", "Outstanding claims settled", "Outstanding claims in respect of the goods/consignment/equipment have been settled."),
    _62("62", "Overlanded", "Unmanifested goods/consignments/equipment has been unloaded."),
    _63("63", "Not available for collection/pick-up", "The goods/consignment/equipment is not available for collection/pick-up."),
    _64("64", "Collection/pick-up, awaited", "The goods/consignment/equipment is awaiting collection/pick-up."),
    _65("65", "Equipment, plugged-in", "The equipment has been plugged into a power source."),
    _66("66", "Plundered", "The goods/consignment/equipment/means of transport has been plundered."),
    _67("67", "Positioned", "The goods/consignment/equipment has been positioned ."),
    _68("68", "Pre-informed", "The party has been informed in advance."),
    _69("69", "Disposed of", null),
    _70("70", "Ramped equipment", "The equipment has been placed above another type of equipment and/or placed on a means of transport."),
    _71("71", "Ready for transportation", "The goods/consignment/equipment is ready for transportation."),
    _72("72", "Receipt of goods fully acknowledged", "The receipt of goods has been fully acknowledged."),
    _73("73", "Receipt of goods partially acknowledged", "The receipt of goods has been partially acknowledged."),
    _74("74", "Received", "The goods/consignment/equipment have been received ."),
    _75("75", "Consignee changed", "The consignee has been changed."),
    _76("76", "Transport re-arranged", "The transport of the goods/consignment/equipment has been re-arranged."),
    _77("77", "Refused, action", "The transport action has been refused."),
    _78("78", "Released", "The goods/consignment/equipment has been released ."),
    _79("79", "Reloaded onto a means of transport", "The goods/consignment/equipment has been reloaded onto a means of transport."),
    _80("80", "Returned as instructed", "The goods/consignment/equipment has been returned as instructed."),
    _81("81", "Returned wrecked", "The goods/consignment/equipment/means of transport has been returned in a wrecked condition ."),
    _82("82", "Returned", "The goods/consignment/equipment has been returned ."),
    _83("83", "Sealed equipment", "The equipment has been sealed."),
    _84("84", "Service ordered", "A service has been ordered."),
    _85("85", "Short landed", "Goods/consignments/equipment manifested for unloading have not been unloaded."),
    _86("86", "Short shipped", "The goods/consignment/equipment expected to be sent has not been fully loaded onto a means of transport."),
    _87("87", "Despatched, completed via a wrong route", "The goods/consignment/equipment has been despatched via a wrong route."),
    _88("88", "Split consignment", "The consignment of goods has been split"),
    _89("89", "Steam cleaned", "The goods/equipment has been steam cleaned."),
    _90("90", "Movement stopped", "The movement of the goods/consignment/equipment has been stopped ."),
    _91("91", "Stored", "The goods/consignment/equipment has been placed into storage."),
    _92("92", "Stowed", "The goods/consignment/equipment has been placed on a means of transport."),
    _93("93", "Stuffed", "The goods/consignments have been loaded into a piece of equipment."),
    _94("94", "Stuffed and sealed", "The goods/consignments have been loaded into a piece of equipment and the equipment has been sealed."),
    _95("95", "Sub-lease notice in", "A sub-lease notice has been sent to the lessor."),
    _96("96", "Sub-lease notice out", "A sub-lease notice has been sent by the lessee."),
    _97("97", "Damage surveyed", "The goods/consignment/equipment has been surveyed to assess the damage."),
    _98("98", "Transferred in", "The goods/consignment/equipment has been transferred in ."),
    _99("99", "Transferred out", "The goods/consignment/equipment has been transferred out ."),
    _100("100", "Transshipment", "The goods/consignment/equipment has been transferred to another means of transport."),
    _101("101", "Delayed in transit", "The goods/consignment/equipment/means of transport has been delayed in transit."),
    _102("102", "Unknown", "The goods/consignment/equipment/means of transport is not known ."),
    _103("103", "Equipment, unplugged", "The equipment has been removed from the power source."),
    _104("104", "Delivery refused, to be re-arranged", "The delivery of the goods has been refused and is to be re-arranged."),
    _105("105", "Delivery, postponed", "A part or the whole of the delivery is postponed."),
    _106("106", "Delivery refused", "A part or the whole of the delivery is refused."),
    _107("107", "Anomaly on arrival", "An anomaly has been found on arrival ."),
    _108("108", "Delivery claim", "A claim has been made at delivery."),
    _109("109", "Delivery, impossible, delivery notice left", "Delivery has not been possible, a delivery notice has been left."),
    _110("110", "Delivery, impossible, no delivery notice left", "Delivery has not been possible, no delivery notice has been left."),
    _111("111", "Transport terminated", "The transport of the goods/consignment/equipment/means of transport has been terminated."),
    _112("112", "Held, at consignee's disposal", "The goods/consignment is held at consignee's disposal"),
    _113("113", "Delivery, in progress", "The delivery of the goods/consignment is in progress."),
    _114("114", "Delivery, accepted subject to further inspection", "Delivery accepted subject to further inspection of the goods/consignment/equipment/means of transport."),
    _115("115", "Discrepancy", "There is a discrepancy in the details."),
    _116("116", "Export inhibited", "Export is inhibited."),
    _117("117", "Missing", "The goods/consignment/equipment is missing."),
    _118("118", "Stowed on deck", "The goods/consignment/equipment has been stowed on/above deck."),
    _119("119", "Unable to be located", "The goods/consignment/equipment cannot be located."),
    _120("120", "Unacceptable condition", "The goods/consignment/equipment/means of transport is in an unacceptable condition ."),
    _121("121", "Stowed under deck", "The goods/consignment/equipment has been stowed under/below deck."),
    _123("123", "Accompanying documents delivered", "All documents accompanying the cargo have been delivered ."),
    _124("124", "For transfer", "The goods/consignment/equipment is to be transferred."),
    _125("125", "No status", "No status information is available."),
    _126("126", "Customs clearance, in progress", "Customs clearance is in progress."),
    _127("127", "Departed, completed on a means of transport", "The goods/consignment/equipment has departed on a means of transport."),
    _128("128", "Awaiting customs import release", "Awaiting customs release for import."),
    _129("129", "In-bond movement", "The goods/consignment/equipment are moving under bond ."),
    _130("130", "Consignment received from shipper", "The consignment has been received from shipper."),
    _131("131", "For transfer, to another carrier", "The goods/consignment/equipment is to be transferred to another carrier."),
    _132("132", "Loading, in progress", "The goods/consignment/equipment is being loaded onto a means of transport."),
    _133("133", "Special loading operations", "Operations related to special loading of goods/consignment/equipment ."),
    _134("134", "Embarking passengers", "The embarkation of passengers."),
    _135("135", "Unloading, in progress", "The goods/consignment/equipment is being unloaded from a means of transport."),
    _136("136", "Special unloading", "Operations related to special unloading of goods/consignment/equipment ."),
    _137("137", "Disembarking passengers", "The disembarkation of passengers."),
    _138("138", "Relocation of a means of transport", "Relocating of a means of transport."),
    _139("139", "Manoeuvring operations, entering port", "Manoeuvring operations connected with entering the port ."),
    _140("140", "Manoeuvring operations, leaving port", "Manoeuvring operations connected with leaving the port ."),
    _141("141", "Manoeuvring operations, within the port", "Manoeuvring operations connected with movement within the port ."),
    _142("142", "Means of transport, under preparation", "Preparation for handling of the means of transport."),
    _143("143", "Ballast loading", "Loading of ballast."),
    _144("144", "Ballast unloading", "Unloading of ballast."),
    _145("145", "Cargo space under preparation", "Preparation of the cargo space of the means of transport."),
    _146("146", "Provisioning", "Provision of supplies for a means of transport."),
    _147("147", "Provisioning, fuel", "Provision of fuel for a means of transport."),
    _148("148", "Provisioning, water", "Provision of water for a means of transport."),
    _149("149", "Provisioning, oil", "Provision of oil for a means of transport."),
    _150("150", "Provisioning, food", "Provision of food for a means of transport."),
    _151("151", "Sanitary operations", "Operations related to sanitary conditions."),
    _152("152", "Fumigation operations", "Operations related to fumigation of the equipment or the means of transport."),
    _153("153", "Disinfestation operations", "Operations related to disinfestation of the equipment or the means of transport."),
    _154("154", "Deratization operations", "Operations related to deratization of the means of transport."),
    _155("155", "Degasation operations", "Operations related to the removal of unwanted gas."),
    _156("156", "Crew recruitment operation", "Operation related to recruitment of crew ."),
    _157("157", "Training operations", "Operations related to training."),
    _158("158", "Salvage operations", "Operations related to salvage work."),
    _159("159", "Loading, alongside", "Loading the goods when the means of transport is alongside."),
    _161("161", "Loading, at anchor", "Loading the goods when the means of transport is at anchor."),
    _162("162", "Unloading, at wharf", "Unloading the goods when the means of transport is at the wharf."),
    _163("163", "Unloading on board", "Unloading the goods from the vessel ."),
    _164("164", "Unloading, at anchor", "Unloading the goods when the means of transport is at anchor."),
    _165("165", "Loading and unloading, simultaneously", "Loading and unloading operations simultaneously."),
    _166("166", "Idle time operations", "Operations during idle time pending a scheduled event."),
    _167("167", "Technical operations", "Operations of a technical nature."),
    _168("168", "Compass calibration", "Operations related to calibration of a compass."),
    _169("169", "Document, clearance operation", "Operation related to clearance of a document."),
    _170("170", "Customs formalities operation", "Operation related to customs formalities."),
    _171("171", "Medical control operations", "Medical control operations related to the crew."),
    _172("172", "Loading, preparation for", "Preparation for the loading of the goods."),
    _174("174", "Unloading, preparation for", "Preparation for the unloading of the goods."),
    _175("175", "Unloading, polluted ballast", "Unloading of polluted ballast."),
    _176("176", "Obtaining documents from shipping register", "Operations related to obtaining documents from the shipping register."),
    _177("177", "Obtaining wreckage documentation", "Operations related to obtaining documents for a wrecked means of transport."),
    _178("178", "Waiting, to enter or leave", "Waiting to enter or leave."),
    _179("179", "Waiting, for a pilot", "Waiting for an available pilot."),
    _180("180", "Waiting, for a tug", "Waiting for an available tug."),
    _181("181", "Waiting, for day light", "Waiting for day light hours."),
    _182("182", "Waiting, due to meteorological circumstances", "Waiting due to meteorological circumstances."),
    _183("183", "Waiting, to form a convoy", "Waiting to form a convoy."),
    _184("184", "Waiting, for action by authorities", "Waiting for action to be taken by authorities."),
    _185("185", "Waiting, due to a ban", "Waiting due to a ban."),
    _186("186", "Waiting, for entry permission", "Waiting for entry permission from the authorities."),
    _187("187", "Waiting, due to an action taken by authorities", "Waiting due to an action taken by the authorities"),
    _188("188", "Waiting, due to the terms of charter", "Waiting due to terms of the charter."),
    _189("189", "Waiting, for a location", "Waiting for a location ."),
    _190("190", "Waiting, for cargo", "Waiting for cargo."),
    _191("191", "Waiting, for workers", "Waiting for workers."),
    _192("192", "Waiting, for storage area", "Waiting for a storage area."),
    _193("193", "Waiting, for equipment", "Waiting for equipment."),
    _194("194", "Waiting, for other means of transport", "Waiting for other means of transport."),
    _195("195", "Waiting, for handling equipment", "Waiting for handling equipment."),
    _196("196", "Waiting, for on board handling equipment", "Waiting for onboard handling equipment."),
    _197("197", "Waiting, for cargo to be ready for loading", "Waiting due to the cargo not being ready to be loaded/handled."),
    _198("198", "Waiting, for means of transport to be  ready", "Waiting due to the means of transport not being ready."),
    _199("199", "Waiting, due to damaged cargo", "Waiting because cargo was damaged."),
    _200("200", "Waiting, for operational periods", "Waiting due to being outside the period of operation."),
    _201("201", "Waiting, for repair and/or maintenance of the means of transport", "Waiting due to repairs and/or maintenance to the means of transport."),
    _202("202", "Waiting, for repair and/or maintenance of handling equipment", "Waiting due to repairs and/or maintenance of handling equipment."),
    _203("203", "Embarking passengers from tender", "The embarkation of passengers from a tender."),
    _204("204", "Waiting, for a counter convoy to pass", "Waiting due to passage of counter convoy."),
    _205("205", "Delivery address outside delivery area", "The address for delivery is outside the area of the carrier/transport operator."),
    _206("206", "Arrival, after means of transport departed", "The goods/consignment/equipment has arrived after the means of transport has departed."),
    _207("207", "Delivery refused, agent", "The agent refused to accept delivery."),
    _208("208", "Seals, replaced", "The seals on the equipment have been replaced."),
    _209("209", "Delivery, scheduled", "The delivery has been scheduled."),
    _210("210", "Delivery, unsuccessful attempt", "An unsuccessful attempt has been made to deliver the goods/consignment/equipment."),
    _211("211", "Delivery not completed, business closed", "The goods/consignment/equipment could not be delivered as the business was closed."),
    _212("212", "Delivery, changed schedule", "The goods/consignment/equipment cannot be delivered at the arranged time because of a change of schedule."),
    _213("213", "Delivery, further address needed", "A further address is needed to effect delivery of the goods/consignment/ equipment."),
    _214("214", "Computer system not in operation", "The computer system is not in operation."),
    _215("215", "Delivery, awaiting credit approval", "Delivery on a credit base is requested."),
    _216("216", "Delivery, awaiting customer arrangements", "The goods/consignment/equipment require delivery arrangements by the customer."),
    _218("218", "Damaged", "The goods/consignments/equipment have been damaged."),
    _219("219", "Delivery pending, awaiting specified dates/times/periods", "Delivery of the goods/consignment/equipment is pending awaiting specified dates/times/periods."),
    _220("220", "Destination incorrect", "The goods/consignment/equipment has been sent to an incorrect destination."),
    _222("222", "Derailment", "The train has derailed."),
    _224("224", "Delivery, industrial dispute", "The goods/consignment/equipment cannot be delivered due to an industrial dispute."),
    _225("225", "Operation affected by customer action", "An operation has been affected by an action of the customer."),
    _227("227", "Delivery, equipment failure", "The goods/consignment/equipment cannot be delivered due to a failure in the equipment."),
    _228("228", "Inspection required by authority", "An inspection of the goods/equipment is required by an authority."),
    _229("229", "Export suspended", "The goods/consignment/equipment has been suspended from export pending further investigation."),
    _231("231", "Missing, goods item", "The goods item is missing."),
    _232("232", "Import suspended", "The goods/consignment/equipment has been suspended from import pending further investigation."),
    _233("233", "Incorrect picklist", "The goods/consignment/equipment was not collected/picked-up due to an incorrect picklist."),
    _234("234", "Incorrect address", "The address is incorrect."),
    _235("235", "Industrial dispute", "An industrial dispute has happened."),
    _236("236", "Waiting, for instructions", "Waiting for further instructions."),
    _238("238", "Means of transport, damaged", "The means of transport has been damaged."),
    _239("239", "Mechanical breakdown", "There has been a mechanical breakdown of the means of transport/equipment ."),
    _240("240", "Mechanical inspection required", "A mechanical inspection of the means of transport/equipment is required."),
    _241("241", "Missing, document", "The document for the goods/consignments/equipment is missing."),
    _242("242", "New delivery arrangements advised", "New delivery arrangements have been advised ."),
    _243("243", "No recipient contact information", "No contact information available concerning the recipient. ."),
    _247("247", "Collection/pick-up, package not available", "The package is not available for collection/pick-up."),
    _248("248", "Tracking number unknown", "The tracking number of the goods/consignment/equipment is unknown."),
    _250("250", "Transport payment not received", "The transport payment has not been received."),
    _251("251", "Refused, non-payment by payer", "Payer refused to make the payment."),
    _253("253", "Refused, no reason given", "The transport action/documentation has been refused without a reason given."),
    _254("254", "Delivery, scheduled past cut-off time", "The goods/consignment/equipment to be delivered has been scheduled past the cut-off time."),
    _255("255", "Shunted to siding", "The means of transport has been shunted to a siding."),
    _256("256", "Signature not required", "A signature is not required."),
    _258("258", "Special service required", "A special service is required."),
    _260("260", "Tracking information unavailable", "The tracking information is unavailable."),
    _265("265", "Reason unknown", "The reason is unknown."),
    _266("266", "Delivery delayed, adverse weather conditions", "Adverse weather conditions have delayed delivery."),
    _267("267", "Free storage time expired", "The goods/consignment/equipment has been in a storage facility for longer than the permitted free time."),
    _269("269", "Delivery, consignee absent", "The goods/consignment/equipment cannot be delivered as the consignee was absent."),
    _270("270", "Delayed operation, local circumstances", "The operation is delayed due to local circumstances."),
    _271("271", "Delayed operation, consignee's instructions", "The operation is delayed awaiting consignee's instructions."),
    _272("272", "Delayed operation, consignor's instructions", "The operation is delayed awaiting consignor's instructions."),
    _273("273", "Delayed operation", "The operation is delayed."),
    _274("274", "Incomplete address", "The address is incomplete."),
    _275("275", "Delivery refused, purchase order cancelled", "The delivery was refused as the purchase order has been cancelled."),
    _276("276", "Delivery refused, return to the consignor", "The delivery was refused and the goods/consignment/equipment will be returned to the consignor ."),
    _277("277", "Delivery refused, inconsistent with purchase order", "The delivery was refused as an inconsistency with the purchase order was found."),
    _278("278", "Delivery refused, incorrect delivery date", "The delivery was refused as the delivery date was incorrect."),
    _279("279", "Delivery refused, automatic return", "The delivery was refused and the goods/consignment/equipment is automatically returned as instructed."),
    _280("280", "Delivery refused, duplicate delivery", "The delivery was refused because of duplicate delivery."),
    _281("281", "Delivery refused, instructions requested", "The delivery was refused and instructions are requested."),
    _282("282", "Delivery refused, consignee's condition", "The delivery was refused due to the consignee's condition."),
    _283("283", "Delivery refused, delivery incomplete", "The delivery was refused due to incomplete delivery."),
    _284("284", "Delivery refused, not ordered", "The delivery was refused as the goods/consignment/equipment had not been ordered ."),
    _285("285", "Delivery refused, remainder not accepted", "The delivery of the remaining goods was not accepted."),
    _286("286", "Delivery refused, spoilt state", "The delivery was refused as the goods/consignment/equipment was in a spoilt state."),
    _287("287", "Missing, contents", "The contents are missing."),
    _288("288", "Not on package list", "The goods/consignment is not on the package list"),
    _291("291", "Delivery refused, collect freight charges not paid", "The delivery was refused as the collect freight charge were not paid."),
    _292("292", "Delivery refused, reimbursement not paid", "The delivery was refused as the reimbursement was not paid."),
    _295("295", "Delivery refused, opened", "The delivery was refused as the goods/consignment was found to be opened."),
    _297("297", "Delivery refused, commercial dispute", "The delivery was refused because of a commercial dispute."),
    _298("298", "Delivery refused, error on product or packaging", "The delivery was refused as an error was found on product or packaging."),
    _299("299", "Delivery refused, delivery date/time changed", "The delivery was refused as the delivery date or time has been changed."),
    _300("300", "Document, received without goods", "A document for a consignment has been received without the corresponding goods."),
    _301("301", "Goods, received without documentation", "Goods/consignment has been received without the corresponding documentation."),
    _302("302", "Overcarried consignment", "The consignment has been overcarried."),
    _306("306", "Document, found", "The document has been found."),
    _307("307", "Damaged but deliverable", "The goods/consignment/equipment has been damaged but delivery can be completed."),
    _308("308", "Spoilt", "The goods/consignment/equipment is spoilt."),
    _309("309", "Packaging/equipment opened", "The packaging/equipment has been opened."),
    _310("310", "Processed as contractually agreed", "The goods/consignment/equipment has been processed as contractually agreed."),
    _311("311", "Claim folder opened", "A claim folder has been opened ."),
    _312("312", "Moved, completed", "The goods/consignment/equipment has been moved."),
    _313("313", "Returned by recipient", "The goods/consignment/equipment has been returned by the recipient."),
    _314("314", "Delayed, at origin", "The goods/consignment/equipment/means of transport has been delayed at the origin."),
    _315("315", "Held, by logistic service provider", "The goods/consignment/equipment has been held by the logistic service provider."),
    _316("316", "Incident occurred but accepted by ordering party", "An incident has occurred but has been accepted by the ordering party."),
    _317("317", "Delivery party' premises closed during normal hours", "The premises of the delivery party were closed during normal hours."),
    _318("318", "Delivery incomplete, time shortage", "The delivery of the goods/consignment/equipment could not be completed due to a shortage of time to handle the delivery."),
    _319("319", "Despatch, preparation error", "An error occurred during the preparation of the despatch."),
    _320("320", "Undefined incident attributed to logistic server provider", "An undefined incident has occurred which has been attributed to the logistic service provider."),
    _321("321", "Instruction to despatch, received", null),
    _322("322", "Despatch, under preparation", "The despatch of the goods/consignment/equipment is in preparation."),
    _323("323", "Return in progress", "The goods/consignment/equipment is being returned."),
    _324("324", "Instruction to despatch, cancelled", "The instruction to despatch has been cancelled."),
    _325("325", "Delivery refused, by recipient", "The delivery of the goods/consignment/equipment has been refused by the recipient."),
    _326("326", "Goods, held by third party on instruction from owner", "Goods are held under control of a third party following an instruction from the owner of the goods."),
    _327("327", "Weight or volume loss", "The goods have suffered a weight or volume loss."),
    _328("328", "Moved, internally", "The goods/consignment/equipment has been moved internally."),
    _329("329", "Consignment partially stolen", "The consignment has been partially stolen."),
    _330("330", "Consignment partially lost or missing", "The consignment is partially lost or missing."),
    _331("331", "Destroyed", "The goods/consignment/equipment has been destroyed."),
    _332("332", "Action by logistics service provider", "An action was taken by the logistics service provider."),
    _333("333", "Action by logistics service provider on instruction by owner", "An action was taken by the logistics service provider as instructed by owner of the goods."),
    _334("334", "Document, refused", "The document has been refused."),
    _335("335", "Seals, damaged", "The seals on the equipment have been damaged."),
    _336("336", "Seals, broken", "The seals on the equipment have been broken."),
    _337("337", "Seals, tampered", "The seals on the equipment have been tampered."),
    _338("338", "Collection/pick-up, business closed", "The goods/consignment/equipment could not be collected/picked-up as the business was closed."),
    _339("339", "Collection/pick-up, changed schedule", "The goods/consignment/equipment cannot be collected/picked-up at the arranged time because of a change of schedule."),
    _340("340", "Collection/pick-up, further address needed", "A further address is needed to effect collection/pick-up of the goods/consignment/ equipment."),
    _341("341", "Collection/pick-up, industrial dispute", "The goods/consignment/equipment cannot be collected/picked-up due to an industrial dispute."),
    _342("342", "Collection/pick-up, equipment failure", "The goods/consignment/equipment cannot be collected/picked-up due to a failure in the equipment."),
    _343("343", "Document, incorrect", "The document for the goods/consignments/equipment is incorrect."),
    _344("344", "Collection/pick-up, scheduled past cut-off time", "The goods/consignment/equipment to be collected/picked-up has been scheduled past the cut-off time."),
    _345("345", "Collection/pick-up, adverse weather conditions", "Adverse weather conditions have affected collection/pick-up."),
    _346("346", "Unloading, completed from a means of transport", "The goods/consignment/equipment has been unloaded from a means of transport."),
    _347("347", "Deliverable", "The goods/consignment/equipment can be delivered."),
    _348("348", "Not deliverable", "The goods/consignment/equipment cannot be delivered."),
    _349("349", "Handed over", "The goods/consignment/equipment has been handed over to another party."),
    _350("350", "Signature required", "A signature is required."),
    _351("351", "Defined incident attributed to logistic server provider", "A defined incident has occurred which has been attributed to the logistic service provider."),
    _352("352", "Delivery not completed, business closed, inventory count", "The goods/consignment/equipment could not be delivered as the business was closed due to inventory count."),
    _353("353", "Delivery not completed, business closed on Saturday", "The goods/consignment/equipment could not be delivered as the business was closed on Saturday."),
    _354("354", "Delivery not completed, business closed on national holiday", "The goods/consignment/equipment could not be delivered as the business was closed on a national holiday."),
    _355("355", "En route, via local route", "The goods/consignment/equipment/means of transport is moving to destination via a local route."),
    _356("356", "En route, via national route", "The goods/consignment/equipment/means of transport is moving to destination via a national route."),
    _357("357", "En route, via international route", "The goods/consignment/equipment/means of transport is moving to destination via an international route."),
    _358("358", "Transport terminated, mail not received", "The transport of the goods/consignment/equipment/means of transport has been terminated and the mail has not been received."),
    _359("359", "Bill of Lading issued", "The Bill of Lading for the goods/consignment/equipment has been issued."),
    _360("360", "Cleared, by logistics service provider", "The goods/consignment/equipment/means of transport has been cleared by logistics service provider."),
    _361("361", "Delivery, expected", "The goods/consignment/equipment expected to be delivered."),
    _362("362", "Measured", "The goods/consignment/equipment/means of transport has been measured."),
    _363("363", "Loading, ready", "The goods/consignment/equipment is ready to be loaded onto a means of transport."),
    _364("364", "Arrival, at yard", "The goods/consignment/equipment/means of transport has arrived at the yard."),
    _365("365", "Departure, from yard", "The goods/consignment/equipment/means of transport has departed from the yard."),
    _366("366", "Accepted at interchange point", "The goods/consignment/equipment/means of transport has been accepted at the interchange point."),
    _367("367", "Alerted, no action taken", "No action taken after an alert in relation to the goods/consignment/equipment/means of transport."),
    _368("368", "Transshipment to another wagon", "The goods/consignment has been transhipped to another wagon."),
    _369("369", "Trip plan revised manually", "The transport route has been re-programmed manually."),
    _370("370", "Special wagon handling arranged", "The handling of a special wagon has been arranged.");
    private final String m_sID;
    private final String m_sDisplayName;
    private final String m_sDescription;

    private ETransportationStatusCode21(
        @Nonnull
        @Nonempty
        final String sID,
        @Nonnull
        final String sDisplayName,
        @Nullable
        final String sDescription) {
        m_sID = sID;
        m_sDisplayName = sDisplayName;
        m_sDescription = sDescription;
    }

    @Nonnull
    @Nonempty
    public String getID() {
        return m_sID;
    }

    @Nonnull
    public String getDisplayName() {
        return m_sDisplayName;
    }

    @Nullable
    public String getDescription() {
        return m_sDescription;
    }

    @Nullable
    public static ETransportationStatusCode21 getFromIDOrNull(
        @Nullable
        final String sID) {
        return EnumHelper.getFromIDOrNull(ETransportationStatusCode21 .class, sID);
    }

    @Nullable
    public static String getDisplayNameFromIDOrNull(
        @Nullable
        final String sID) {
        final ETransportationStatusCode21 eValue = ETransportationStatusCode21 .getFromIDOrNull(sID);
        return ((eValue == null)?null:eValue.getDisplayName());
    }
}