package com.fsb.eblood.dao.entities;


import com.fsb.eblood.dao.enumr.TypeSang;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Notification {

    @Id
    @SequenceGenerator(name = "notification_sequence", sequenceName = "notification_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notification_sequence")
    private int id;
    private String source;
    private String createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User appUser;
    private String address;
    private String beneficiary_name;
    private TypeSang type_sang ;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
