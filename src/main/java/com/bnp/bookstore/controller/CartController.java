package com.bnp.bookstore.controller;

import com.bnp.bookstore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/bookstore/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    public ResponseEntity.BodyBuilder getCartDetails(){
//        Cart cart = cartService.getCart();
//        cartService.getCart(@AuthenticationPrincipal UserDetails userDetails);

        return ResponseEntity.ok();
    }

    public void addToCart(@PathVariable Long cartId, @PathVariable Long bookId){

    }
}
