/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Registry for all {@link ZigBeeProfileType}s.
 *
 * @author Henning Sudbrock - initial contribution
 */
public class ZigBeeProfileTypeRegistry {

    private Map<Integer, ZigBeeProfileType> nonStandardProfileTypes = new ConcurrentHashMap<>();

    /**
     * Add a profile type that is not provided by the collection of standard profile types from
     * {@link StandardZigBeeProfileType}.
     *
     * @param profileType The profile type to add.
     */
    public void addNonStandardProfileType(ZigBeeProfileType profileType) {
        nonStandardProfileTypes.put(profileType.getProfileId(), profileType);
    }

    /**
     * Removes a non-standard profile type.
     *
     * @param profileId The ID of the non-standard profile type to remove.
     * @return The {@link ZigBeeProfileType} that was provided by the registry for the given profile ID.
     */
    public ZigBeeProfileType removeNonStandardProfileType(int profileId) {
        return nonStandardProfileTypes.remove(profileId);
    }

    /**
     * Returns a {@link ZigBeeProfileType} with the given ID, if provided by either a non-standard profile type that has
     * been added to this registry, or if provided by the {@link StandardZigBeeProfileType} enum.
     * 
     * @param profileId The ID of the profile type.
     * @return The {@link ZigBeeProfileType}, or null if no profile type with the given ID is available.
     */
    public ZigBeeProfileType getByProfileId(int profileId) {
        ZigBeeProfileType zigBeeProfileType = nonStandardProfileTypes.get(profileId);
        if (zigBeeProfileType != null) {
            return zigBeeProfileType;
        } else {
            return StandardZigBeeProfileType.getByValue(profileId);
        }
    }

}
