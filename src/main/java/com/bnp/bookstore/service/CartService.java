package com.bnp.bookstore.service;

import com.bnp.bookstore.model.Cart;
import com.bnp.bookstore.model.User;
import com.bnp.bookstore.repository.BookRepository;
import com.bnp.bookstore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserService userService;

    public Cart getCart(@AuthenticationPrincipal UserDetails userDetails) {
        User user = userService.getUser(userDetails.getUsername()).orElseThrow();
//        cartRepository.findById(cartId).orElse(new Cart())
//        return cartRepository.getReferenceById(id);
        return cartRepository.findByUser(user).orElseGet(() -> {
            Cart cart = new Cart();
            cart.setUser(user);
            return cartRepository.save(cart);
        });
    }

    public Cart addToCart(Long bookId) {
        return cartRepository.getReferenceById(bookId);
    }

    public Cart removeFromCart(Long bookId) {
        return cartRepository.getReferenceById(bookId);
    }
}
