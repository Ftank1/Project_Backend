package com.project.modulo4.models.club.dto;



import com.project.modulo4.models.league.model.LeagueModel;
import lombok.*;

@Data
public class ClubDTO {
    private long clubId;
    private String clubName;
    private String clubShortName;
    private LeagueModel league;
    private String stadium;
    private String clubImage;
}
