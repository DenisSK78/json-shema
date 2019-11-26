package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class NomenclatureAffair {


    private static final long serialVersionUID = 2796038403051676028L;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    @Size(min = 2, max = 100, message = "Value length should be 2-255 signs")
    @NotNull(message = "Please provide name")
    @NotBlank(message = "Please provide name")
    private String name;

    @JsonProperty("index")
    @Size(min = 2, max = 255, message = "Value length should be 2-255 signs")
    @NotNull(message = "Please provide index")
    @NotBlank(message = "Please provide index")
    private String index;

    @JsonProperty("calendarYear")
    @NotNull(message = "Please provide calendar_year")
    @Min(value = 1, message = "Should not be less than 1")
    private Integer calendarYear;

    @JsonProperty("active")
    private Boolean active = true;

    @JsonProperty("deleted")
    private Boolean deleted = false;

    public NomenclatureAffair() {
    }

    public NomenclatureAffair(Long id,
                              @Size(min = 2, max = 100, message = "Value length should be 2-255 signs")
                              @NotNull(message = "Please provide name")
                              @NotBlank(message = "Please provide name") String name,
                              @Size(min = 2, max = 255, message = "Value length should be 2-255 signs")
                              @NotNull(message = "Please provide index")
                              @NotBlank(message = "Please provide index") String index,
                              @NotNull(message = "Please provide calendar_year")
                              @Min(value = 1, message = "Should not be less than 1") Integer calendarYear,
                              Boolean active,
                              Boolean deleted){
        this.id = id;
        this.name = name;
        this.index = index;
        this.calendarYear = calendarYear;
        this.active = active;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Integer getCalendarYear() {
        return calendarYear;
    }

    public void setCalendarYear(Integer calendarYear) {
        this.calendarYear = calendarYear;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NomenclatureAffair that = (NomenclatureAffair) o;
        return id.equals(that.id) &&
                name.equals(that.name) &&
                index.equals(that.index) &&
                calendarYear.equals(that.calendarYear) &&
                active.equals(that.active) &&
                deleted.equals(that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, index, calendarYear, active, deleted);
    }

}
