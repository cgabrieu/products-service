package br.com.gabriel.controller

import br.com.gabriel.ProductsServiceReply
import br.com.gabriel.ProductsServiceRequest
import br.com.gabriel.ProductsServiceServiceGrpc
import io.grpc.stub.StreamObserver
import io.micronaut.grpc.annotation.GrpcService

@GrpcService
class ProductController: ProductsServiceServiceGrpc.ProductsServiceServiceImplBase() {
    override fun send(request: ProductsServiceRequest?, responseObserver: StreamObserver<ProductsServiceReply>?) {
        val toSend = "Hello, ${request?.name}"

        val reply = ProductsServiceReply.newBuilder()
            .setMessage(toSend)
            .build()

        responseObserver?.onNext(reply)
        responseObserver?.onCompleted()
    }
}