package br.com.gabriel.services

import br.com.gabriel.dto.ProductReq
import br.com.gabriel.dto.ProductRes

interface ProductService {
    fun create(req: ProductReq): ProductRes
}