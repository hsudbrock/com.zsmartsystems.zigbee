/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.protocol;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Registry for all {@link ZclClusterType}s.
 *
 * @author Henning Sudbrock - initial contribution
 */
public class ZclClusterTypeRegistry {

    private ZclClusterTypeRegistry() {
        // only private instantiation permitted
    }

    private static ZclClusterTypeRegistry instance = new ZclClusterTypeRegistry();

    public static ZclClusterTypeRegistry getInstance() {
        return instance;
    }

    private Map<Integer, ZclClusterType> nonStandardClusterTypes = new ConcurrentHashMap<>();

    /**
     * Add a cluster type that is not provided by the collection of standard cluster types from
     * {@link ZclStandardClusterType}.
     *
     * @param clusterType The cluster type to add.
     */
    public void addNonStandardClusterType(ZclClusterType clusterType) {
        nonStandardClusterTypes.put(clusterType.getId(), clusterType);
    }

    /**
     * Removes a non-standard cluster type.
     *
     * @param clusterId The ID of the non-standard cluster type to remove.
     * @return The {@link ZclClusterType} that was provided by the registry for the given cluster ID.
     */
    public ZclClusterType removeNonStandardClusterType(int clusterId) {
        return nonStandardClusterTypes.remove(clusterId);
    }

    /**
     * Returns a {@link ZclClusterType} with the given ID, if provided by either a non-standard cluster type that has
     * been added to this registry, or if provided by the {@link ZigBeeStandardClusterType} enum.
     *
     * @param clusterId The ID of the cluster type.
     * @return The {@link ZclClusterType}, or null if no cluster type with the given ID is available.
     */
    public ZclClusterType getByClusterId(int clusterId) {
        ZclClusterType zigBeeClusterType = nonStandardClusterTypes.get(clusterId);
        if (zigBeeClusterType != null) {
            return zigBeeClusterType;
        } else {
            return ZclStandardClusterType.getValueById(clusterId);
        }
    }

}
