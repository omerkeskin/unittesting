package com.omerkeskin.unittesting.basicwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omerkeskin.unittesting.basicwork.model.Item;

public interface IItemRepository extends JpaRepository<Item, Integer>{

}
