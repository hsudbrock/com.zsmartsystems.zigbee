/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.CommandResult;
import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.ZigBeeEndpoint;
import com.zsmartsystems.zigbee.zcl.ZclAttribute;
import com.zsmartsystems.zigbee.zcl.ZclCluster;
import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.clusters.iaszone.InitiateNormalOperationModeCommand;
import com.zsmartsystems.zigbee.zcl.clusters.iaszone.InitiateTestModeCommand;
import com.zsmartsystems.zigbee.zcl.clusters.iaszone.ZoneEnrollRequestCommand;
import com.zsmartsystems.zigbee.zcl.clusters.iaszone.ZoneEnrollResponse;
import com.zsmartsystems.zigbee.zcl.clusters.iaszone.ZoneStatusChangeNotificationCommand;
import com.zsmartsystems.zigbee.zcl.protocol.ZclClusterType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;

/**
 * <b>IAS Zone</b> cluster implementation (<i>Cluster ID 0x0500</i>).
 * <p>
 * The IAS Zone cluster defines an interface to the functionality of an IAS security zone
 * device. IAS Zone supports up to two alarm types per zone, low battery reports and supervision
 * of the IAS network.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-03-25T10:30:58Z")
public class ZclIasZoneCluster extends ZclCluster {
    /**
     * The ZigBee Cluster Library Cluster ID
     */
    public static final int CLUSTER_ID = 0x0500;

    /**
     * The ZigBee Cluster Library Cluster Name
     */
    public static final String CLUSTER_NAME = "IAS Zone";

    // Attribute constants
    /**
     * The Zone State attribute defines if the device is currently enrolled with a CIE or not.
     */
    public static final int ATTR_ZONESTATE = 0x0000;
    /**
     * The Zone Type dictates the meaning of Alarm1 and Alarm2 bits of the ZoneStatus attribute
     */
    public static final int ATTR_ZONETYPE = 0x0001;
    /**
     * The ZoneStatus attribute is a bit map. Each bit defines the state of an alarm.
     */
    public static final int ATTR_ZONESTATUS = 0x0002;
    /**
     * The IAS CIE Address attribute specifies the address that commands generated by the
     * server shall be sent to. All commands received by the server must also come from this
     * address.
     * <p>
     * It is up to the zone's specific implementation to permit or deny change (write) of this
     * attribute at specific times. Also, it is up to the zone's specific implementation to
     * implement some auto-detect for the CIE (example: by requesting the ZigBee cluster
     * discovery service to locate a Zone Server cluster.) or require the intervention of a CT
     * in order to configure this attribute during installation.
     */
    public static final int ATTR_IASCIEADDRESS = 0x0010;
    /**
     * A unique reference number allocated by the CIE at zone enrollment time.
     * <p>
     * Used by IAS devices to reference specific zones when communicating with the CIE. The
     * ZoneID of each zone stays fixed until that zone is unenrolled.
     */
    public static final int ATTR_ZONEID = 0x0011;
    /**
     * Provides the total number of sensitivity levels supported by the IAS Zone server. The
     * purpose of this attribute is to support devices that can be configured to be more or less
     * sensitive (e.g., motion sensor). It provides IAS Zone clients with the range of
     * sensitivity levels that are supported so they may be presented to the user for
     * configuration.
     * <p>
     * The values 0x00 and 0x01 are reserved because a device that has zero or one sensitivity
     * level should NOT support this attribute because no configuration of the IAS Zone
     * server’s sensitivity level is possible.
     * <p>
     * The meaning of each sensitivity level is manufacturer-specific. However, the
     * sensitivity level of the IAS Zone server shall become more sensitive as they ascend. For
     * example, if the server supports three sen- sitivity levels, then the value of this
     * attribute would be 0x03 where 0x03 is more sensitive than 0x02, which is more sensitive
     * than 0x01.
     */
    public static final int ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED = 0x0012;
    /**
     * Allows an IAS Zone client to query and configure the IAS Zone server’s sensitivity
     * level. Please see NumberOfZoneSensitivityLevelsSupported Attribute for more
     * detail on how to interpret this attribute.
     * <p>
     * The default value 0x00 is the device’s default sensitivity level as configured by the
     * manufacturer. It may correspond to the same sensitivity as another value in the
     * NumberOfZoneSensitivityLevelsSupported, but this is the default sensitivity to be
     * used if the CurrentZoneSensitivityLevel attribute is not otherwise configured by an
     * IAS Zone client.
     */
    public static final int ATTR_CURRENTZONESENSITIVITYLEVEL = 0x0013;

    @Override
    protected Map<Integer, ZclAttribute> initializeAttributes() {
        Map<Integer, ZclAttribute> attributeMap = new ConcurrentHashMap<>(7);

        attributeMap.put(ATTR_ZONESTATE, new ZclAttribute(this, ATTR_ZONESTATE, "Zone State", ZclDataType.ENUMERATION_8_BIT, true, true, false, false));
        attributeMap.put(ATTR_ZONETYPE, new ZclAttribute(this, ATTR_ZONETYPE, "Zone Type", ZclDataType.ENUMERATION_16_BIT, true, true, false, false));
        attributeMap.put(ATTR_ZONESTATUS, new ZclAttribute(this, ATTR_ZONESTATUS, "Zone Status", ZclDataType.BITMAP_16_BIT, true, true, false, false));
        attributeMap.put(ATTR_IASCIEADDRESS, new ZclAttribute(this, ATTR_IASCIEADDRESS, "IAS CIE Address", ZclDataType.IEEE_ADDRESS, true, true, true, false));
        attributeMap.put(ATTR_ZONEID, new ZclAttribute(this, ATTR_ZONEID, "Zone ID", ZclDataType.UNSIGNED_8_BIT_INTEGER, true, true, true, false));
        attributeMap.put(ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED, new ZclAttribute(this, ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED, "Number Of Zone Sensitivity Levels Supported", ZclDataType.UNSIGNED_8_BIT_INTEGER, false, true, false, false));
        attributeMap.put(ATTR_CURRENTZONESENSITIVITYLEVEL, new ZclAttribute(this, ATTR_CURRENTZONESENSITIVITYLEVEL, "Current Zone Sensitivity Level", ZclDataType.UNSIGNED_8_BIT_INTEGER, false, true, true, false));

        return attributeMap;
    }

    @Override
    protected Map<Integer, Class<? extends ZclCommand>> initializeServerCommands() {
        Map<Integer, Class<? extends ZclCommand>> commandMap = new ConcurrentHashMap<>(2);

        commandMap.put(0x0000, ZoneStatusChangeNotificationCommand.class);
        commandMap.put(0x0001, ZoneEnrollRequestCommand.class);

        return commandMap;
    }

    @Override
    protected Map<Integer, Class<? extends ZclCommand>> initializeClientCommands() {
        Map<Integer, Class<? extends ZclCommand>> commandMap = new ConcurrentHashMap<>(3);

        commandMap.put(0x0000, ZoneEnrollResponse.class);
        commandMap.put(0x0001, InitiateNormalOperationModeCommand.class);
        commandMap.put(0x0002, InitiateTestModeCommand.class);

        return commandMap;
    }

    /**
     * Default constructor to create a IAS Zone cluster.
     *
     * @param zigbeeEndpoint the {@link ZigBeeEndpoint} this cluster is contained within
     */
    public ZclIasZoneCluster(final ZigBeeEndpoint zigbeeEndpoint) {
        super(zigbeeEndpoint, CLUSTER_ID, CLUSTER_NAME);
    }

    /**
     * Get the <i>Zone State</i> attribute [attribute ID <b>0x0000</b>].
     * <p>
     * The Zone State attribute defines if the device is currently enrolled with a CIE or not.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getZoneStateAsync() {
        return read(attributes.get(ATTR_ZONESTATE));
    }

    /**
     * Synchronously get the <i>Zone State</i> attribute [attribute ID <b>0x0000</b>].
     * <p>
     * The Zone State attribute defines if the device is currently enrolled with a CIE or not.
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getZoneState(final long refreshPeriod) {
        if (attributes.get(ATTR_ZONESTATE).isLastValueCurrent(refreshPeriod)) {
            return (Integer) attributes.get(ATTR_ZONESTATE).getLastValue();
        }

        return (Integer) readSync(attributes.get(ATTR_ZONESTATE));
    }

    /**
     * Set reporting for the <i>Zone State</i> attribute [attribute ID <b>0x0000</b>].
     * <p>
     * The Zone State attribute defines if the device is currently enrolled with a CIE or not.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param minInterval minimum reporting period
     * @param maxInterval maximum reporting period
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setZoneStateReporting(final int minInterval, final int maxInterval) {
        return setReporting(attributes.get(ATTR_ZONESTATE), minInterval, maxInterval);
    }

    /**
     * Get the <i>Zone Type</i> attribute [attribute ID <b>0x0001</b>].
     * <p>
     * The Zone Type dictates the meaning of Alarm1 and Alarm2 bits of the ZoneStatus attribute
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getZoneTypeAsync() {
        return read(attributes.get(ATTR_ZONETYPE));
    }

    /**
     * Synchronously get the <i>Zone Type</i> attribute [attribute ID <b>0x0001</b>].
     * <p>
     * The Zone Type dictates the meaning of Alarm1 and Alarm2 bits of the ZoneStatus attribute
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getZoneType(final long refreshPeriod) {
        if (attributes.get(ATTR_ZONETYPE).isLastValueCurrent(refreshPeriod)) {
            return (Integer) attributes.get(ATTR_ZONETYPE).getLastValue();
        }

        return (Integer) readSync(attributes.get(ATTR_ZONETYPE));
    }

    /**
     * Set reporting for the <i>Zone Type</i> attribute [attribute ID <b>0x0001</b>].
     * <p>
     * The Zone Type dictates the meaning of Alarm1 and Alarm2 bits of the ZoneStatus attribute
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param minInterval minimum reporting period
     * @param maxInterval maximum reporting period
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setZoneTypeReporting(final int minInterval, final int maxInterval) {
        return setReporting(attributes.get(ATTR_ZONETYPE), minInterval, maxInterval);
    }

    /**
     * Get the <i>Zone Status</i> attribute [attribute ID <b>0x0002</b>].
     * <p>
     * The ZoneStatus attribute is a bit map. Each bit defines the state of an alarm.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getZoneStatusAsync() {
        return read(attributes.get(ATTR_ZONESTATUS));
    }

    /**
     * Synchronously get the <i>Zone Status</i> attribute [attribute ID <b>0x0002</b>].
     * <p>
     * The ZoneStatus attribute is a bit map. Each bit defines the state of an alarm.
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getZoneStatus(final long refreshPeriod) {
        if (attributes.get(ATTR_ZONESTATUS).isLastValueCurrent(refreshPeriod)) {
            return (Integer) attributes.get(ATTR_ZONESTATUS).getLastValue();
        }

        return (Integer) readSync(attributes.get(ATTR_ZONESTATUS));
    }

    /**
     * Set reporting for the <i>Zone Status</i> attribute [attribute ID <b>0x0002</b>].
     * <p>
     * The ZoneStatus attribute is a bit map. Each bit defines the state of an alarm.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param minInterval minimum reporting period
     * @param maxInterval maximum reporting period
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setZoneStatusReporting(final int minInterval, final int maxInterval) {
        return setReporting(attributes.get(ATTR_ZONESTATUS), minInterval, maxInterval);
    }

    /**
     * Set the <i>IAS CIE Address</i> attribute [attribute ID <b>0x0010</b>].
     * <p>
     * The IAS CIE Address attribute specifies the address that commands generated by the
     * server shall be sent to. All commands received by the server must also come from this
     * address.
     * <p>
     * It is up to the zone's specific implementation to permit or deny change (write) of this
     * attribute at specific times. Also, it is up to the zone's specific implementation to
     * implement some auto-detect for the CIE (example: by requesting the ZigBee cluster
     * discovery service to locate a Zone Server cluster.) or require the intervention of a CT
     * in order to configure this attribute during installation.
     * <p>
     * The attribute is of type {@link IeeeAddress}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param iasCieAddress the {@link IeeeAddress} attribute value to be set
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setIasCieAddress(final IeeeAddress value) {
        return write(attributes.get(ATTR_IASCIEADDRESS), value);
    }

    /**
     * Get the <i>IAS CIE Address</i> attribute [attribute ID <b>0x0010</b>].
     * <p>
     * The IAS CIE Address attribute specifies the address that commands generated by the
     * server shall be sent to. All commands received by the server must also come from this
     * address.
     * <p>
     * It is up to the zone's specific implementation to permit or deny change (write) of this
     * attribute at specific times. Also, it is up to the zone's specific implementation to
     * implement some auto-detect for the CIE (example: by requesting the ZigBee cluster
     * discovery service to locate a Zone Server cluster.) or require the intervention of a CT
     * in order to configure this attribute during installation.
     * <p>
     * The attribute is of type {@link IeeeAddress}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getIasCieAddressAsync() {
        return read(attributes.get(ATTR_IASCIEADDRESS));
    }

    /**
     * Synchronously get the <i>IAS CIE Address</i> attribute [attribute ID <b>0x0010</b>].
     * <p>
     * The IAS CIE Address attribute specifies the address that commands generated by the
     * server shall be sent to. All commands received by the server must also come from this
     * address.
     * <p>
     * It is up to the zone's specific implementation to permit or deny change (write) of this
     * attribute at specific times. Also, it is up to the zone's specific implementation to
     * implement some auto-detect for the CIE (example: by requesting the ZigBee cluster
     * discovery service to locate a Zone Server cluster.) or require the intervention of a CT
     * in order to configure this attribute during installation.
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link IeeeAddress}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link IeeeAddress} attribute value, or null on error
     */
    public IeeeAddress getIasCieAddress(final long refreshPeriod) {
        if (attributes.get(ATTR_IASCIEADDRESS).isLastValueCurrent(refreshPeriod)) {
            return (IeeeAddress) attributes.get(ATTR_IASCIEADDRESS).getLastValue();
        }

        return (IeeeAddress) readSync(attributes.get(ATTR_IASCIEADDRESS));
    }

    /**
     * Set reporting for the <i>IAS CIE Address</i> attribute [attribute ID <b>0x0010</b>].
     * <p>
     * The IAS CIE Address attribute specifies the address that commands generated by the
     * server shall be sent to. All commands received by the server must also come from this
     * address.
     * <p>
     * It is up to the zone's specific implementation to permit or deny change (write) of this
     * attribute at specific times. Also, it is up to the zone's specific implementation to
     * implement some auto-detect for the CIE (example: by requesting the ZigBee cluster
     * discovery service to locate a Zone Server cluster.) or require the intervention of a CT
     * in order to configure this attribute during installation.
     * <p>
     * The attribute is of type {@link IeeeAddress}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param minInterval minimum reporting period
     * @param maxInterval maximum reporting period
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setIasCieAddressReporting(final int minInterval, final int maxInterval) {
        return setReporting(attributes.get(ATTR_IASCIEADDRESS), minInterval, maxInterval);
    }

    /**
     * Set the <i>Zone ID</i> attribute [attribute ID <b>0x0011</b>].
     * <p>
     * A unique reference number allocated by the CIE at zone enrollment time.
     * <p>
     * Used by IAS devices to reference specific zones when communicating with the CIE. The
     * ZoneID of each zone stays fixed until that zone is unenrolled.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param zoneId the {@link Integer} attribute value to be set
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setZoneId(final Integer value) {
        return write(attributes.get(ATTR_ZONEID), value);
    }

    /**
     * Get the <i>Zone ID</i> attribute [attribute ID <b>0x0011</b>].
     * <p>
     * A unique reference number allocated by the CIE at zone enrollment time.
     * <p>
     * Used by IAS devices to reference specific zones when communicating with the CIE. The
     * ZoneID of each zone stays fixed until that zone is unenrolled.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getZoneIdAsync() {
        return read(attributes.get(ATTR_ZONEID));
    }

    /**
     * Synchronously get the <i>Zone ID</i> attribute [attribute ID <b>0x0011</b>].
     * <p>
     * A unique reference number allocated by the CIE at zone enrollment time.
     * <p>
     * Used by IAS devices to reference specific zones when communicating with the CIE. The
     * ZoneID of each zone stays fixed until that zone is unenrolled.
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getZoneId(final long refreshPeriod) {
        if (attributes.get(ATTR_ZONEID).isLastValueCurrent(refreshPeriod)) {
            return (Integer) attributes.get(ATTR_ZONEID).getLastValue();
        }

        return (Integer) readSync(attributes.get(ATTR_ZONEID));
    }

    /**
     * Set reporting for the <i>Zone ID</i> attribute [attribute ID <b>0x0011</b>].
     * <p>
     * A unique reference number allocated by the CIE at zone enrollment time.
     * <p>
     * Used by IAS devices to reference specific zones when communicating with the CIE. The
     * ZoneID of each zone stays fixed until that zone is unenrolled.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is MANDATORY
     *
     * @param minInterval minimum reporting period
     * @param maxInterval maximum reporting period
     * @param reportableChange {@link Object} delta required to trigger report
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setZoneIdReporting(final int minInterval, final int maxInterval, final Object reportableChange) {
        return setReporting(attributes.get(ATTR_ZONEID), minInterval, maxInterval, reportableChange);
    }

    /**
     * Get the <i>Number Of Zone Sensitivity Levels Supported</i> attribute [attribute ID <b>0x0012</b>].
     * <p>
     * Provides the total number of sensitivity levels supported by the IAS Zone server. The
     * purpose of this attribute is to support devices that can be configured to be more or less
     * sensitive (e.g., motion sensor). It provides IAS Zone clients with the range of
     * sensitivity levels that are supported so they may be presented to the user for
     * configuration.
     * <p>
     * The values 0x00 and 0x01 are reserved because a device that has zero or one sensitivity
     * level should NOT support this attribute because no configuration of the IAS Zone
     * server’s sensitivity level is possible.
     * <p>
     * The meaning of each sensitivity level is manufacturer-specific. However, the
     * sensitivity level of the IAS Zone server shall become more sensitive as they ascend. For
     * example, if the server supports three sen- sitivity levels, then the value of this
     * attribute would be 0x03 where 0x03 is more sensitive than 0x02, which is more sensitive
     * than 0x01.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is OPTIONAL
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getNumberOfZoneSensitivityLevelsSupportedAsync() {
        return read(attributes.get(ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED));
    }

    /**
     * Synchronously get the <i>Number Of Zone Sensitivity Levels Supported</i> attribute [attribute ID <b>0x0012</b>].
     * <p>
     * Provides the total number of sensitivity levels supported by the IAS Zone server. The
     * purpose of this attribute is to support devices that can be configured to be more or less
     * sensitive (e.g., motion sensor). It provides IAS Zone clients with the range of
     * sensitivity levels that are supported so they may be presented to the user for
     * configuration.
     * <p>
     * The values 0x00 and 0x01 are reserved because a device that has zero or one sensitivity
     * level should NOT support this attribute because no configuration of the IAS Zone
     * server’s sensitivity level is possible.
     * <p>
     * The meaning of each sensitivity level is manufacturer-specific. However, the
     * sensitivity level of the IAS Zone server shall become more sensitive as they ascend. For
     * example, if the server supports three sen- sitivity levels, then the value of this
     * attribute would be 0x03 where 0x03 is more sensitive than 0x02, which is more sensitive
     * than 0x01.
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is OPTIONAL
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getNumberOfZoneSensitivityLevelsSupported(final long refreshPeriod) {
        if (attributes.get(ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED).isLastValueCurrent(refreshPeriod)) {
            return (Integer) attributes.get(ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED).getLastValue();
        }

        return (Integer) readSync(attributes.get(ATTR_NUMBEROFZONESENSITIVITYLEVELSSUPPORTED));
    }

    /**
     * Set the <i>Current Zone Sensitivity Level</i> attribute [attribute ID <b>0x0013</b>].
     * <p>
     * Allows an IAS Zone client to query and configure the IAS Zone server’s sensitivity
     * level. Please see NumberOfZoneSensitivityLevelsSupported Attribute for more
     * detail on how to interpret this attribute.
     * <p>
     * The default value 0x00 is the device’s default sensitivity level as configured by the
     * manufacturer. It may correspond to the same sensitivity as another value in the
     * NumberOfZoneSensitivityLevelsSupported, but this is the default sensitivity to be
     * used if the CurrentZoneSensitivityLevel attribute is not otherwise configured by an
     * IAS Zone client.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is OPTIONAL
     *
     * @param currentZoneSensitivityLevel the {@link Integer} attribute value to be set
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> setCurrentZoneSensitivityLevel(final Integer value) {
        return write(attributes.get(ATTR_CURRENTZONESENSITIVITYLEVEL), value);
    }

    /**
     * Get the <i>Current Zone Sensitivity Level</i> attribute [attribute ID <b>0x0013</b>].
     * <p>
     * Allows an IAS Zone client to query and configure the IAS Zone server’s sensitivity
     * level. Please see NumberOfZoneSensitivityLevelsSupported Attribute for more
     * detail on how to interpret this attribute.
     * <p>
     * The default value 0x00 is the device’s default sensitivity level as configured by the
     * manufacturer. It may correspond to the same sensitivity as another value in the
     * NumberOfZoneSensitivityLevelsSupported, but this is the default sensitivity to be
     * used if the CurrentZoneSensitivityLevel attribute is not otherwise configured by an
     * IAS Zone client.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is OPTIONAL
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> getCurrentZoneSensitivityLevelAsync() {
        return read(attributes.get(ATTR_CURRENTZONESENSITIVITYLEVEL));
    }

    /**
     * Synchronously get the <i>Current Zone Sensitivity Level</i> attribute [attribute ID <b>0x0013</b>].
     * <p>
     * Allows an IAS Zone client to query and configure the IAS Zone server’s sensitivity
     * level. Please see NumberOfZoneSensitivityLevelsSupported Attribute for more
     * detail on how to interpret this attribute.
     * <p>
     * The default value 0x00 is the device’s default sensitivity level as configured by the
     * manufacturer. It may correspond to the same sensitivity as another value in the
     * NumberOfZoneSensitivityLevelsSupported, but this is the default sensitivity to be
     * used if the CurrentZoneSensitivityLevel attribute is not otherwise configured by an
     * IAS Zone client.
     * <p>
     * This method can return cached data if the attribute has already been received.
     * The parameter <i>refreshPeriod</i> is used to control this. If the attribute has been received
     * within <i>refreshPeriod</i> milliseconds, then the method will immediately return the last value
     * received. If <i>refreshPeriod</i> is set to 0, then the attribute will always be updated.
     * <p>
     * This method will block until the response is received or a timeout occurs unless the current value is returned.
     * <p>
     * The attribute is of type {@link Integer}.
     * <p>
     * The implementation of this attribute by a device is OPTIONAL
     *
     * @param refreshPeriod the maximum age of the data (in milliseconds) before an update is needed
     * @return the {@link Integer} attribute value, or null on error
     */
    public Integer getCurrentZoneSensitivityLevel(final long refreshPeriod) {
        if (attributes.get(ATTR_CURRENTZONESENSITIVITYLEVEL).isLastValueCurrent(refreshPeriod)) {
            return (Integer) attributes.get(ATTR_CURRENTZONESENSITIVITYLEVEL).getLastValue();
        }

        return (Integer) readSync(attributes.get(ATTR_CURRENTZONESENSITIVITYLEVEL));
    }

    /**
     * The Zone Enroll Response
     *
     * @param enrollResponseCode {@link Integer} Enroll Response Code
     * @param zoneId {@link Integer} Zone ID
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> zoneEnrollResponse(Integer enrollResponseCode, Integer zoneId) {
        ZoneEnrollResponse command = new ZoneEnrollResponse();

        // Set the fields
        command.setEnrollResponseCode(enrollResponseCode);
        command.setZoneId(zoneId);

        return send(command);
    }

    /**
     * The Initiate Normal Operation Mode Command
     * <p>
     * Used to tell the IAS Zone server to commence normal operation mode. <br> Upon receipt,
     * the IAS Zone server shall commence normal operational mode. <br> Any configurations
     * and changes made (e.g., CurrentZoneSensitivityLevel attribute) to the IAS Zone
     * server shall be retained. <br> Upon commencing normal operation mode, the IAS Zone
     * server shall send a Zone Status Change Notification command updating the ZoneStatus
     * attribute Test bit to zero (i.e., “operation mode”).
     *
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> initiateNormalOperationModeCommand() {
        return send(new InitiateNormalOperationModeCommand());
    }

    /**
     * The Initiate Test Mode Command
     * <p>
     * Certain IAS Zone servers may have operational configurations that could be configured
     * OTA or locally on the device. This command enables them to be remotely placed into a test
     * mode so that the user or installer may configure their field of view, sensitivity, and
     * other operational parameters. They may also verify the placement and proper operation
     * of the IAS Zone server, which may have been placed in a difficult to reach location (i.e.,
     * making a physical input on the device impractical to trigger). <br> Another use case for
     * this command is large deployments, especially commercial and industrial, where
     * placing the entire IAS system into test mode instead of a single IAS Zone server is
     * infeasible due to the vulnerabilities that might arise. This command enables only a
     * single IAS Zone server to be placed into test mode. <br> The biggest limitation of this
     * command is that most IAS Zone servers today are battery-powered sleepy nodes that
     * cannot reliably receive commands. However, implementers may decide to program an IAS
     * Zone server by factory default to maintain a limited duration of normal polling upon
     * initialization/joining to a new network. Some IAS Zone servers may also have AC mains
     * power and are able to receive commands. Some types of IAS Zone servers that may benefit
     * from this command are: motion sensors and fire sensor/smoke alarm listeners (i.e., a
     * device that listens for a non-communicating fire sensor to alarm and communicates this
     * to the IAS CIE).
     *
     * @param testModeDuration {@link Integer} Test Mode Duration
     * @param currentZoneSensitivityLevel {@link Integer} Current Zone Sensitivity Level
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> initiateTestModeCommand(Integer testModeDuration, Integer currentZoneSensitivityLevel) {
        InitiateTestModeCommand command = new InitiateTestModeCommand();

        // Set the fields
        command.setTestModeDuration(testModeDuration);
        command.setCurrentZoneSensitivityLevel(currentZoneSensitivityLevel);

        return send(command);
    }

    /**
     * The Zone Status Change Notification Command
     * <p>
     * The Zone Status Change Notification command is generated when a change takes place in
     * one or more bits of the ZoneStatus attribute.
     *
     * @param zoneStatus {@link Integer} Zone Status
     * @param extendedStatus {@link Integer} Extended Status
     * @param zoneId {@link Integer} Zone ID
     * @param delay {@link Integer} Delay
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> zoneStatusChangeNotificationCommand(Integer zoneStatus, Integer extendedStatus, Integer zoneId, Integer delay) {
        ZoneStatusChangeNotificationCommand command = new ZoneStatusChangeNotificationCommand();

        // Set the fields
        command.setZoneStatus(zoneStatus);
        command.setExtendedStatus(extendedStatus);
        command.setZoneId(zoneId);
        command.setDelay(delay);

        return send(command);
    }

    /**
     * The Zone Enroll Request Command
     * <p>
     * The Zone Enroll Request command is generated when a device embodying the Zone server
     * cluster wishes to be enrolled as an active alarm device. It must do this immediately it
     * has joined the network (during commissioning).
     *
     * @param zoneType {@link Integer} Zone Type
     * @param manufacturerCode {@link Integer} Manufacturer Code
     * @return the {@link Future<CommandResult>} command result future
     */
    public Future<CommandResult> zoneEnrollRequestCommand(Integer zoneType, Integer manufacturerCode) {
        ZoneEnrollRequestCommand command = new ZoneEnrollRequestCommand();

        // Set the fields
        command.setZoneType(zoneType);
        command.setManufacturerCode(manufacturerCode);

        return send(command);
    }
}
