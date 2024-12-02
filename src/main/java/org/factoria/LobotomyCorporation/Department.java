package org.factoria.LobotomyCorporation;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private final String floor;
    private final Sephirah sephirah;
    private List<Abnormality> abnormalityList = new ArrayList<>();

    public Department(String floor, Sephirah sephirah) {
        this.floor = floor;
        this.sephirah = sephirah;
    }

    public String getFloor() {
        return floor;
    }

    public Sephirah getSephirah() {
        return sephirah;
    }

    public List<Abnormality> getAbnormalityList() {
        return abnormalityList;
    }

    public void addAbnormality(Abnormality abnormality) {
        abnormalityList.add(abnormality);
    }
}
