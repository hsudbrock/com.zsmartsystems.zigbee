/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.virtual;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zsmartsystems.zigbee.ExtendedPanId;
import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.ZigBeeChannel;
import com.zsmartsystems.zigbee.ZigBeeStatus;
import com.zsmartsystems.zigbee.aps.ZigBeeApsFrame;
import com.zsmartsystems.zigbee.security.ZigBeeKey;
import com.zsmartsystems.zigbee.transport.TransportConfig;
import com.zsmartsystems.zigbee.transport.ZigBeeTransportReceive;
import com.zsmartsystems.zigbee.transport.ZigBeeTransportTransmit;

/**
 * A simulated dongle that talks to a simulated ZigBee network.
 * 
 * @author Henning Sudbrock
 */
public class ZigBeeDongleVirtual implements ZigBeeTransportTransmit {
    
    private final Logger logger = LoggerFactory.getLogger(ZigBeeDongleVirtual.class);
    
    private static final IeeeAddress IEEE_ADDRESS = new IeeeAddress();
    private static final int NETWORK_ADDRESS = 0;
    private static final ZigBeeChannel CHANNEL = ZigBeeChannel.CHANNEL_11;
    
    private int panId = 0;
    private ExtendedPanId extendedPanId = new ExtendedPanId();

    private ZigBeeTransportReceive zigbeeTransportReceive;
    private TransportConfig configuration;
    
    private ZigBeeKey networkKey = new ZigBeeKey();
    private ZigBeeKey linkKey = new ZigBeeKey();

    @Override
    public ZigBeeStatus initialize() {
        // no initialization needed so far, simply return success
        return ZigBeeStatus.SUCCESS;
    }

    @Override
    public ZigBeeStatus startup(boolean reinitialize) {
        // we just state that we restarted every time
        return ZigBeeStatus.SUCCESS;
    }

    @Override
    public void shutdown() {
        // do nothing for now
    }

    @Override
    public String getVersionString() {
        return "Virtual Dongle 0.1";
    }

    @Override
    public IeeeAddress getIeeeAddress() {
        return IEEE_ADDRESS;
    }

    @Override
    public Integer getNwkAddress() {
        return NETWORK_ADDRESS;
    }

    @Override
    public void sendCommand(int msgTag, ZigBeeApsFrame apsFrame) {
        logger.info("Received command msgTag={} apsFrame={}", msgTag, apsFrame);
    }

    @Override
    public void setZigBeeTransportReceive(ZigBeeTransportReceive zigbeeTransportReceive) {
        this.zigbeeTransportReceive = zigbeeTransportReceive;        
    }

    @Override
    public ZigBeeChannel getZigBeeChannel() {
        return CHANNEL;
    }

    @Override
    public ZigBeeStatus setZigBeeChannel(ZigBeeChannel channel) {
        // not supported at the moment
        return ZigBeeStatus.FAILURE;
    }

    @Override
    public int getZigBeePanId() {
        return panId;
    }

    @Override
    public ZigBeeStatus setZigBeePanId(int panId) {
        this.panId = panId;
        return ZigBeeStatus.SUCCESS;
    }

    @Override
    public ExtendedPanId getZigBeeExtendedPanId() {
        return extendedPanId;
    }

    @Override
    public ZigBeeStatus setZigBeeExtendedPanId(ExtendedPanId extendedPanId) {
        this.extendedPanId = extendedPanId;
        return ZigBeeStatus.SUCCESS;
    }

    @Override
    public ZigBeeStatus setZigBeeNetworkKey(ZigBeeKey networkKey) {
        this.networkKey = networkKey;
        return ZigBeeStatus.SUCCESS;
    }

    @Override
    public ZigBeeKey getZigBeeNetworkKey() {
        return networkKey;
    }

    @Override
    public ZigBeeStatus setTcLinkKey(ZigBeeKey linkKey) {
        this.linkKey = linkKey;
        return ZigBeeStatus.SUCCESS;
    }

    @Override
    public ZigBeeKey getTcLinkKey() {
        return linkKey;
    }

    @Override
    public void updateTransportConfig(TransportConfig configuration) {
        this.configuration = configuration;
    }

}
