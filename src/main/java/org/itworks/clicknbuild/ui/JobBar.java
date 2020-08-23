package org.itworks.clicknbuild.ui;

import javafx.scene.control.ProgressBar;
import org.itworks.clicknbuild.engine.building.BuildingAttrType;
import org.itworks.clicknbuild.engine.city.ResManager;
import org.itworks.clicknbuild.engine.res.ResPack;
import org.itworks.clicknbuild.engine.res.ResType;
import org.itworks.clicknbuild.util.math.MathHelper;

import java.util.Objects;
import java.util.Set;

public final class JobBar extends ProgressBar {
    private ResPack jobPrice;
    private ResPack jobReward;
    private double step;

    public void initJob(ResPack jobPrice, ResPack jobReward) {
        this.jobPrice = Objects.requireNonNull(jobPrice);
        this.jobReward = Objects.requireNonNull(jobReward);
        setProgress(0);
        step = 1d / MathHelper.clamp(jobPrice.getCurrent(ResType.ACTION), 1, Integer.MAX_VALUE);
        setOnMouseClicked(event -> addProgress());
    }

    public void addProgress() {
        if (!checkPrice()) return;
        double newValue = getProgress() + step * 5;
        while (newValue >= 1d) {
            payPrice();
            receiveReward();
            newValue -= 1d;
        }
        setProgress(newValue);
    }

    private boolean checkPrice() {
        Set<ResType> resTypes = jobPrice.pack.keySet();
        for (ResType resType : resTypes) {
            if (resType.equals(ResType.ACTION)) continue;
            if (ResManager.inst().get(BuildingAttrType.STORE).getTotal(resType).getCurrent()
                < jobPrice.getCurrent(resType)) return false;
        }
        return true;
    }

    private void payPrice() {
        jobPrice.pack.keySet()
                .stream()
                .filter(resType -> !resType.equals(ResType.ACTION))
                .forEach(resType -> ResManager.inst().get(BuildingAttrType.STORE)
                        .getTotal(resType).sub(jobPrice.getCurrent(resType)));
    }

    private void receiveReward() {
        jobReward.pack.keySet().forEach(resType ->
                ResManager.inst().get(BuildingAttrType.STORE).getTotal(resType).add(jobReward.getCurrent(resType)));
    }
}
