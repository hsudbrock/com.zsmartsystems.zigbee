/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee;

/**
 * A ZigBee profile type.
 *
 * @author Henning Sudbrock - initial contribution, based on the ZigBeeProfileType enum from Chris Jackson
 */
public interface ZigBeeProfileType {

    /**
     * @return the profile identifier of the application profile.
     */
    int getProfileId();

    /**
     * Indicates whether this is a manufacturer-specific application profile.
     * <p>
     * According to the cluster library specification, a profile identifier in the range 0xc000-0xffff indicates
     * a manufacturer-specific application profile. I.e., in principle, it could be determined by the profile ID whether
     * the application profile is manufacturer-specific. This interface provides this method separately nevertheless.
     *
     * @return whether this is a manufacturer-specific application profile.
     */
    boolean isManufacturerSpecific();

    /**
     * @return A textual description of the application profile.
     */
    String getDescription();

}
