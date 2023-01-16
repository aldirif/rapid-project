package com.rapidtech.rapidproject.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Audit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String condition;
    private String typeWindows;
    private String licenseWindows;
    private String typeOffice;
    private String licenseOffice;
    private String antivirus;
    private String result;

    @OneToMany(mappedBy = "audit",cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
    private List<Asset> assets;
}
