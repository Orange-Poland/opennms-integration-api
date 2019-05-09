/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2017-2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.integration.api.v1.config.datacollection.thresholding;


public interface Threshold {

    /**
     * Threshold Type
     */
    ThresholdType getType(); // BASIC | EXPRESSION

    /**
     * Threshold Description
     */
    String getDescription();

    /*   
    <group name="netsnmp" rrdRepository="/mnt/c/git/opennms/target/opennms/share/rrd/snmp/">
    <threshold description="Trigger an alert when the percentage of disk space used on any disk reaches or goes above 90% full for two consecutive measurement intervals" type="high" ds-type="dskIndex" value="90.0" rearm="75.0" trigger="2" ds-label="ns-dskPath" filterOperator="OR" ds-name="ns-dskPercent"/>
    <threshold description="Trigger an alert when the percentage of inodes used on any disk (excluding the specified special paths) reaches or goes above 90% for two consecutive measurement intervals" type="high" ds-type="dskIndex" value="90.0" rearm="75.0" trigger="2" ds-label="ns-dskPath" filterOperator="OR" ds-name="ns-dskPercentNode">
       <resource-filter field="ns-dskPath">^(?:(?!(/proc|/sys|/dev/pts)).)+$</resource-filter>
    </threshold>
    <threshold description="Trigger an alert when the percentage of disk space used on any disk increases by a relative 33.3% compared to its most recent previous measurement (that is, there is suddenly less free space)" type="relativeChange" ds-type="dskIndex" value="1.333" rearm="0.0" trigger="1" ds-label="ns-dskPath" filterOperator="OR" ds-name="ns-dskPercent"/>
    <threshold description="Trigger an alert when the percentage of inodes used on any disk increases by a relative 33.3% compared to its most recent previous measurement (that is, there are suddenly fewer free inodes)" type="relativeChange" ds-type="dskIndex" value="1.333" rearm="0.0" trigger="1" ds-label="ns-dskPath" filterOperator="OR" ds-name="ns-dskPercentNode"/>
    <expression description="Trigger an alert when the five minute CPU load average metric reaches or goes above 70% for two consecutive measurement intervals" type="high" ds-type="node" value="70.0" rearm="50.0" trigger="2" filterOperator="OR" expression="((loadavg5 / 100) / CpuNumCpus) * 100.0"/>
    <expression description="Trigger an alert when the amount of available swap space reaches or goes below 10% of the total amount of swap space for two consecutive measurement intervals (only for systems that have a total swap space value defined)" type="low" ds-type="node" value="10.0" rearm="15.0" trigger="2" filterOperator="OR" expression="memAvailSwap / memTotalSwap * 100.0">
       <resource-filter field="memTotalSwap">^[1-9]+[.0-9]*$</resource-filter>
    </expression>
    </group>
    */
}
