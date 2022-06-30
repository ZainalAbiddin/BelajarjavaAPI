package com.teamc.bioskop.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleResponseFilmSeatDTO {

    private Integer scheduleId;
    private Long filmId;
    private Long seatId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateShow;

//    @JsonFormat(pattern = "HH-mm-ss")
    private LocalTime showStart;

//    @JsonFormat(pattern = "HH-mm-ss")
    private LocalTime showEnd;

    private Integer price;

//    private LocalDateTime updatedAt;
//    private LocalDateTime createdAt;
}
