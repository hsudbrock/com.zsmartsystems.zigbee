/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameRequest;
import com.zsmartsystems.zigbee.dongle.ember.internal.serializer.EzspSerializer;

/**
 * Class to implement the Ember EZSP command <b>getNeighbor</b>.
 * <p>
 * Returns the neighbor table entry at the given index. The number of active neighbors can be
 * obtained using the neighborCount command.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetNeighborRequest extends EzspFrameRequest {
    public static final int FRAME_ID = 0x79;

    /**
     * The index of the neighbor of interest. Neighbors are stored in ascending order by node id,
     * with all unused entries at the end of the table.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     */
    private int index;

    /**
     * Serialiser used to serialise to binary line data
     */
    private EzspSerializer serializer;

    /**
     * Request constructor
     */
    public EzspGetNeighborRequest() {
        frameId = FRAME_ID;
        serializer = new EzspSerializer();
    }

    /**
     * The index of the neighbor of interest. Neighbors are stored in ascending order by node id,
     * with all unused entries at the end of the table.
     * <p>
     * EZSP type is <i>uint8_t</i> - Java type is {@link int}
     *
     * @return the current index as {@link int}
     */
    public int getIndex() {
        return index;
    }

    /**
     * The index of the neighbor of interest. Neighbors are stored in ascending order by node id,
     * with all unused entries at the end of the table.
     *
     * @param index the index to set as {@link int}
     */
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int[] serialize() {
        // Serialize the header
        serializeHeader(serializer);

        // Serialize the fields
        serializer.serializeUInt8(index);
        return serializer.getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(50);
        builder.append("EzspGetNeighborRequest [index=");
        builder.append(index);
        builder.append(']');
        return builder.toString();
    }
}
