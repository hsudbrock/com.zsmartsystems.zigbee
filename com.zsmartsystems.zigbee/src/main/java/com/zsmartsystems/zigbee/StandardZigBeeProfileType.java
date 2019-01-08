/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Standard ZigBee Profile Type value enumeration.
 * <p>
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZclProtocolCodeGenerator", date = "2018-08-29T17:17:08Z")
public enum StandardZigBeeProfileType implements ZigBeeProfileType {

    /**
     * ZigBee Home Automation
     */
    ZIGBEE_HOME_AUTOMATION(0x0104),

    /**
     * ZigBee Smart Energy
     */
    ZIGBEE_SMART_ENERGY(0x0109),

    /**
     * ZigBee Green Power
     */
    ZIGBEE_GREEN_POWER(0xA10E),

    /**
     * Manufacturer Telegesis
     */
    MANUFACTURER_TELEGESIS(0xC059),

    /**
     * ZigBee Light Link
     */
    ZIGBEE_LIGHT_LINK(0xC05E),

    /**
     * Manufacturer Digi
     */
    MANUFACTURER_DIGI(0xC105);

    /**
     * A mapping between the integer code and its corresponding ZigBeeProfileType type to facilitate lookup by value.
     */
    private static Map<Integer, StandardZigBeeProfileType> idMap;

    static {
        idMap = new HashMap<Integer, StandardZigBeeProfileType>();
        for (StandardZigBeeProfileType enumValue : values()) {
            idMap.put(enumValue.key, enumValue);
        }
    }

    private final int key;

    private StandardZigBeeProfileType(final int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static StandardZigBeeProfileType getByValue(final int value) {
        return idMap.get(value);
    }

    @Override
    public int getProfileId() {
        return key;
    }

    @Override
    public boolean isManufacturerSpecific() {
        return false;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}
