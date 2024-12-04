package com.iptrace.ipexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iptrace.ipexample.entity.GeoLocationEntity;

public interface GeoLocationRepository extends JpaRepository<GeoLocationEntity, Long> {

}
