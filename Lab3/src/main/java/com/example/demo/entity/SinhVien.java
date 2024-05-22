package com.example.demo.entity;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SinhVien {
    @NotNull(message="Không được để trống")
    private String mssv;
    @NotNull(message="Không được để trống tên")
    private String name;
    private String tuoi;
    @NotNull(message="Không được để trống email")
    private String email;
    @NotNull(message="Không được để trống gt")
    private Byte gt;
    @NotBlank(message = "Không được để trống Chuyên Ngành")
    private String chuyenNganh;
    //private byte gt; //không hiện lỗi

    @DecimalMax(value="10.0", message="GPA phải thoả 1.0 <= GPA <= 10")
    @DecimalMin(value = "1.0", message = "GPA phải thoả 1.0 <= GPA <= 10")
    private Double gpa;
    private String className;


}
