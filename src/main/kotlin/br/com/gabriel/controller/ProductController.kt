package br.com.gabriel.controller

import br.com.gabriel.ProductServiceRequest
import br.com.gabriel.ProductServiceResponse
import br.com.gabriel.ProductsServiceGrpc
import io.grpc.stub.StreamObserver
import io.micronaut.grpc.annotation.GrpcService

@GrpcService
class ProductController: ProductsServiceGrpc.ProductsServiceImplBase() {
    override fun create(request: ProductServiceRequest?, responseObserver: StreamObserver<ProductServiceResponse>?) {
        super.create(request, responseObserver)
    }
}