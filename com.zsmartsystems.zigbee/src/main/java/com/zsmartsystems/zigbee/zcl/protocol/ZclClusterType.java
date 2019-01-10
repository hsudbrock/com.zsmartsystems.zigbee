/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.protocol;

import com.zsmartsystems.zigbee.zcl.ZclCluster;

/**
 * A ZCL cluster type.
 *
 * @author Henning Sudbrock - initial contribution, based on the ZclClusterType enum from Chris Jackson
 */
public interface ZclClusterType {

    /**
     * @return the cluster identifier of the cluster.
     */
    int getId();

    /**
     * @return a label describing the cluster type
     */
    String getLabel();

    /**
     * @return the class implementing the cluster
     */
    Class<? extends ZclCluster> getClusterClass();

}
