package br.com.gabriel.repository

import br.com.gabriel.domain.Product
import io.micronaut.data.jpa.repository.JpaRepository
import jakarta.inject.Singleton

@Singleton
interface ProductReposity: JpaRepository<Product, Long>