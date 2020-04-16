package de.infomotion.kw.demo.dto;


import de.infomotion.kw.demo.model.kwdb.Variety;
import de.infomotion.kw.demo.model.summerwine.SummerwineVariety;

import java.util.ArrayList;
import java.util.List;

public class VarietyDto {

    private List<SummerwineVariety> summerwineVarietyList;
    private List<Variety> varietyList = new ArrayList<>();

    public VarietyDto(List<SummerwineVariety> summerwineVarietyList) {
        this.summerwineVarietyList = summerwineVarietyList;
    }

    public void transferObject() {
        summerwineVarietyList.forEach(summerwineVariety -> {
            Variety variety = new Variety();
            variety.setDepartmentNumber(summerwineVariety.getDepartmentNumber());
            variety.setDepartmentName(summerwineVariety.getDepartmentName());
            variety.setGrapeVariety(summerwineVariety.getGrapeVariety());
            variety.setVarietyMark(summerwineVariety.getVarietyMark());

            varietyList.add(variety);

        });
    }

    public List<Variety> getVarietyList() {
        return varietyList;
    }

}


