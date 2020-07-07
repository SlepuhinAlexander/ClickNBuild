package org.itworks.clicknbuild.config.stats;

import org.itworks.clicknbuild.engine.building.BuildingAttrType;

/**
 * One of the default building attributes like production, storage, etc which this building would have at some its
 * level.
 * Represented by a {@link ResStatPack} supplemented with additional methods specific to building attributes.
 * Aggregated in {@link BuildingDefStats}
 * Can only be of certain types: {@link BuildingAttrType}
 * Nullable: meaning that a building does not use such attribute at all.
 */
public final class BuildingDefAttr extends ResStatPack {
    // seems like no additional specific methods needed =)
}
