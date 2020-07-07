package org.itworks.clicknbuild.engine.building;

import org.itworks.clicknbuild.engine.res.ResPack;

/**
 * One of actual building attributes like production, supply, storage, etc.
 * Represented by a {@link ResPack} supplemented with additional methods specific to building attributes.
 * Aggregated in {@link Building#}
 */
public abstract class BuildingAttribute extends ResPack {
    protected abstract void initValues(BuildingType type, int level);

    protected abstract void applyMultipliers(ResPack multipliers);

    protected abstract void applyProductivity(double productivity);
}
