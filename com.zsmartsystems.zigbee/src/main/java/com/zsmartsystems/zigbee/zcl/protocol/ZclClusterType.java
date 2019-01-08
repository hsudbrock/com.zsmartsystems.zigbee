/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.protocol;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.zsmartsystems.zigbee.StandardZigBeeProfileType;
import com.zsmartsystems.zigbee.ZigBeeProfileType;
import com.zsmartsystems.zigbee.zcl.ZclCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAlarmsCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogInputBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogInputBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogInputBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogOutputBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogOutputBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogOutputBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogValueBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogValueBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclAnalogValueBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclApplianceControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclApplianceEventsAndAlertsCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclApplianceIdentificationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclApplianceStatisticsCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBaCnetProtocolTunnelCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBallastConfigurationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryInputBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryInputBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryInputBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryOutputBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryOutputBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryOutputBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryValueBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryValueBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclBinaryValueBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclColorControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclCommissioningCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclDehumidificationControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclDemandResponseAndLoadControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclDeviceTemperatureConfigurationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclDiagnosticsCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclDoorLockCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclElectricalMeasurementCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclFanControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclFlowMeasurementCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclGeneralCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclGenericTunnelCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclGroupsCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclIasAceCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclIasWdCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclIasZoneCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclIdentifyCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclIlluminanceLevelSensingCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclIlluminanceMeasurementCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclKeyEstablishmentCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclLevelControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMessagingCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMeteringCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateInputBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateInputBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateInputBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateOutputBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateOutputBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateOutputBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateValueBaCnetExtendedCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateValueBaCnetRegularCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclMultistateValueBasicCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclOccupancySensingCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclOnOffCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclOnOffSwitchConfigurationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclOtaUpgradeCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclPollControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclPowerConfigurationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclPressureMeasurementCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclPriceCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclPumpConfigurationAndControlCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclRelativeHumidityMeasurementCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclRssiLocationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclScenesCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclShadeConfigurationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclTemperatureMeasurementCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclThermostatCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclThermostatUserInterfaceConfigurationCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclTimeCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclTouchlinkCluster;
import com.zsmartsystems.zigbee.zcl.clusters.ZclTunnelingCluster;

/**
 * Enumeration of ZigBee Clusters
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 *
 * @author Chris Jackson
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-04-07T17:43:10Z")
public enum ZclClusterType {
    BASIC(0x0000, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclBasicCluster.class, "Basic"),
    POWER_CONFIGURATION(0x0001, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclPowerConfigurationCluster.class,
            "Power configuration"),
    DEVICE_TEMPERATURE_CONFIGURATION(0x0002, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclDeviceTemperatureConfigurationCluster.class, "Device Temperature Configuration"),
    IDENTIFY(0x0003, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclIdentifyCluster.class, "Identify"),
    GROUPS(0x0004, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclGroupsCluster.class, "Groups"),
    SCENES(0x0005, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclScenesCluster.class, "Scenes"),
    ON_OFF(0x0006, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclOnOffCluster.class, "On/Off"),
    ON_OFF_SWITCH_CONFIGURATION(0x0007, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclOnOffSwitchConfigurationCluster.class, "On/off Switch Configuration"),
    LEVEL_CONTROL(0x0008, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclLevelControlCluster.class,
            "Level Control"),
    ALARMS(0x0009, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclAlarmsCluster.class, "Alarms"),
    TIME(0x000A, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclTimeCluster.class, "Time"),
    RSSI_LOCATION(0x000B, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclRssiLocationCluster.class,
            "RSSI Location"),
    ANALOG_INPUT__BASIC(0x000C, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclAnalogInputBasicCluster.class,
            "Analog Input (Basic)"),
    ANALOG_OUTPUT__BASIC(0x000D, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclAnalogOutputBasicCluster.class,
            "Analog Output (Basic)"),
    ANALOG_VALUE__BASIC(0x000E, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclAnalogValueBasicCluster.class,
            "Analog Value (Basic)"),
    BINARY_INPUT__BASIC(0x000F, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclBinaryInputBasicCluster.class,
            "Binary Input (Basic)"),
    BINARY_OUTPUT__BASIC(0x0010, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclBinaryOutputBasicCluster.class,
            "Binary Output (Basic)"),
    BINARY_VALUE__BASIC(0x0011, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclBinaryValueBasicCluster.class,
            "Binary Value (Basic)"),
    MULTISTATE_INPUT__BASIC(0x0012, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateInputBasicCluster.class, "Multistate Input (Basic)"),
    MULTISTATE_OUTPUT__BASIC(0x0013, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateOutputBasicCluster.class, "Multistate Output (Basic)"),
    MULTISTATE_VALUE__BASIC(0x0014, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateValueBasicCluster.class, "Multistate Value (Basic)"),
    COMMISSIONING(0x0015, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclCommissioningCluster.class,
            "Commissioning"),
    OTA_UPGRADE(0x0019, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclOtaUpgradeCluster.class, "OTA Upgrade"),
    APPLIANCE_CONTROL(0x001B, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclApplianceControlCluster.class,
            "Appliance Control"),
    POLL_CONTROL(0x0020, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclPollControlCluster.class, "Poll Control"),
    SHADE_CONFIGURATION(0x0100, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclShadeConfigurationCluster.class,
            "Shade Configuration"),
    DOOR_LOCK(0x0101, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclDoorLockCluster.class, "Door Lock"),
    PUMP_CONFIGURATION_AND_CONTROL(0x0200, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclPumpConfigurationAndControlCluster.class, "Pump Configuration and Control"),
    THERMOSTAT(0x0201, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclThermostatCluster.class, "Thermostat"),
    FAN_CONTROL(0x0202, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclFanControlCluster.class, "Fan Control"),
    DEHUMIDIFICATION_CONTROL(0x0203, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclDehumidificationControlCluster.class, "Dehumidification Control"),
    THERMOSTAT_USER_INTERFACE_CONFIGURATION(0x0204, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclThermostatUserInterfaceConfigurationCluster.class, "Thermostat User Interface Configuration"),
    COLOR_CONTROL(0x0300, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclColorControlCluster.class,
            "Color Control"),
    BALLAST_CONFIGURATION(0x0301, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBallastConfigurationCluster.class, "Ballast Configuration"),
    ILLUMINANCE_MEASUREMENT(0x0400, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclIlluminanceMeasurementCluster.class, "Illuminance measurement"),
    ILLUMINANCE_LEVEL_SENSING(0x0401, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclIlluminanceLevelSensingCluster.class, "Illuminance level sensing"),
    TEMPERATURE_MEASUREMENT(0x0402, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclTemperatureMeasurementCluster.class, "Temperature measurement"),
    PRESSURE_MEASUREMENT(0x0403, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclPressureMeasurementCluster.class,
            "Pressure measurement"),
    FLOW_MEASUREMENT(0x0404, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclFlowMeasurementCluster.class,
            "Flow measurement"),
    RELATIVE_HUMIDITY_MEASUREMENT(0x0405, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclRelativeHumidityMeasurementCluster.class, "Relative humidity measurement"),
    OCCUPANCY_SENSING(0x0406, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclOccupancySensingCluster.class,
            "Occupancy sensing"),
    IAS_ZONE(0x0500, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclIasZoneCluster.class, "IAS Zone"),
    IAS_ACE(0x0501, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclIasAceCluster.class, "IAS ACE"),
    IAS_WD(0x0502, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclIasWdCluster.class, "IAS WD"),
    GENERIC_TUNNEL(0x0600, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclGenericTunnelCluster.class,
            "Generic Tunnel"),
    BACNET_PROTOCOL_TUNNEL(0x0601, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBaCnetProtocolTunnelCluster.class, "BACnet Protocol Tunnel"),
    ANALOG_INPUT__BACNET_REGULAR(0x0602, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclAnalogInputBaCnetRegularCluster.class, "Analog Input (BACnet Regular)"),
    ANALOG_INPUT__BACNET_EXTENDED(0x0603, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclAnalogInputBaCnetExtendedCluster.class, "Analog Input (BACnet Extended)"),
    ANALOG_OUTPUT__BACNET_REGULAR(0x0604, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclAnalogOutputBaCnetRegularCluster.class, "Analog Output (BACnet Regular)"),
    ANALOG_OUTPUT__BACNET_EXTENDED(0x0605, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclAnalogOutputBaCnetExtendedCluster.class, "Analog Output (BACnet Extended)"),
    ANALOG_VALUE__BACNET_REGULAR(0x0606, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclAnalogValueBaCnetRegularCluster.class, "Analog Value (BACnet Regular)"),
    ANALOG_VALUE__BACNET_EXTENDED(0x0607, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclAnalogValueBaCnetExtendedCluster.class, "Analog Value (BACnet Extended)"),
    BINARY_INPUT__BACNET_REGULAR(0x0608, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBinaryInputBaCnetRegularCluster.class, "Binary Input (BACnet Regular)"),
    BINARY_INPUT__BACNET_EXTENDED(0x0609, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBinaryInputBaCnetExtendedCluster.class, "Binary Input (BACnet Extended)"),
    BINARY_OUTPUT__BACNET_REGULAR(0x060A, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBinaryOutputBaCnetRegularCluster.class, "Binary Output (BACnet Regular)"),
    BINARY_OUTPUT__BACNET_EXTENDED(0x060B, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBinaryOutputBaCnetExtendedCluster.class, "Binary Output (BACnet Extended)"),
    BINARY_VALUE__BACNET_REGULAR(0x060C, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBinaryValueBaCnetRegularCluster.class, "Binary Value (BACnet Regular)"),
    BINARY_VALUE__BACNET_EXTENDED(0x060D, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclBinaryValueBaCnetExtendedCluster.class, "Binary Value (BACnet Extended)"),
    MULTISTATE_INPUT__BACNET_REGULAR(0x060E, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateInputBaCnetRegularCluster.class, "Multistate Input (BACnet Regular)"),
    MULTISTATE_INPUT__BACNET_EXTENDED(0x060F, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateInputBaCnetExtendedCluster.class, "Multistate Input (BACnet Extended)"),
    MULTISTATE_OUTPUT__BACNET_REGULAR(0x0610, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateOutputBaCnetRegularCluster.class, "Multistate Output (BACnet Regular)"),
    MULTISTATE_OUTPUT__BACNET_EXTENDED(0x0611, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateOutputBaCnetExtendedCluster.class, "Multistate Output (BACnet Extended)"),
    MULTISTATE_VALUE__BACNET_REGULAR(0x0612, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateValueBaCnetRegularCluster.class, "Multistate Value (BACnet Regular)"),
    MULTISTATE_VALUE__BACNET_EXTENDED(0x0613, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclMultistateValueBaCnetExtendedCluster.class, "Multistate Value (BACnet Extended)"),
    PRICE(0x0700, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclPriceCluster.class, "Price"),
    DEMAND_RESPONSE_AND_LOAD_CONTROL(0x0701, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclDemandResponseAndLoadControlCluster.class, "Demand Response and Load Control"),
    METERING(0x0702, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclMeteringCluster.class, "Metering"),
    MESSAGING(0x0703, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclMessagingCluster.class, "Messaging"),
    TUNNELING(0x0704, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclTunnelingCluster.class, "Tunneling"),
    KEY_ESTABLISHMENT(0x0800, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclKeyEstablishmentCluster.class,
            "Key Establishment"),
    APPLIANCE_IDENTIFICATION(0x0B00, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclApplianceIdentificationCluster.class, "Appliance Identification"),
    APPLIANCE_EVENTS_AND_ALERTS(0x0B02, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclApplianceEventsAndAlertsCluster.class, "Appliance Events and Alerts"),
    APPLIANCE_STATISTICS(0x0B03, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclApplianceStatisticsCluster.class,
            "Appliance Statistics"),
    ELECTRICAL_MEASUREMENT(0x0B04, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION,
            ZclElectricalMeasurementCluster.class, "Electrical Measurement"),
    DIAGNOSTICS(0x0B05, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclDiagnosticsCluster.class, "Diagnostics"),
    GENERAL(0xFFFF, StandardZigBeeProfileType.ZIGBEE_HOME_AUTOMATION, ZclGeneralCluster.class, "General"),
    TOUCHLINK(0x1000, StandardZigBeeProfileType.ZIGBEE_LIGHT_LINK, ZclTouchlinkCluster.class, "Touchlink");

    private static final Map<Integer, ZclClusterType> idValueMap = new HashMap<Integer, ZclClusterType>();

    private final int clusterId;
    private final ZigBeeProfileType profileType;
    private final String label;
    private final Class<? extends ZclCluster> clusterClass;

    ZclClusterType(final int clusterId, final ZigBeeProfileType profileType,
            final Class<? extends ZclCluster> clusterClass, final String label) {
        this.clusterId = clusterId;
        this.profileType = profileType;
        this.clusterClass = clusterClass;
        this.label = label;
    }

    static {
        for (final ZclClusterType value : values()) {
            idValueMap.put(value.clusterId, value);
        }
    }

    public int getId() {
        return clusterId;
    }

    public ZigBeeProfileType getProfileType() {
        return profileType;
    }

    public String getLabel() {
        return label;
    }

    public Class<? extends ZclCluster> getClusterClass() {
        return clusterClass;
    }

    public static ZclClusterType getValueById(final int clusterId) {
        return idValueMap.get(clusterId);
    }

}
