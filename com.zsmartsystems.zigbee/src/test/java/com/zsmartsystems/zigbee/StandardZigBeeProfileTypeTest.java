/**
 * Copyright (c) 2016-2018 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Chris Jackson
 *
 */
public class StandardZigBeeProfileTypeTest {

    @Test
    public void testTypes() {
        assertEquals(ZigBeeStandardProfileType.ZIGBEE_HOME_AUTOMATION,
                ZigBeeStandardProfileType.getProfileType(0x0104));
        assertEquals(ZigBeeStandardProfileType.ZIGBEE_LIGHT_LINK, ZigBeeStandardProfileType.getProfileType(0xC05E));
    }
}
