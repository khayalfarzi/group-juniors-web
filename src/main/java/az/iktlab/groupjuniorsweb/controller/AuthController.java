package az.iktlab.groupjuniorsweb.controller;

import az.iktlab.groupjuniorsweb.model.JwtResponse;
import az.iktlab.groupjuniorsweb.model.LoginRequest;
import az.iktlab.groupjuniorsweb.model.MessageResponse;
import az.iktlab.groupjuniorsweb.model.SignupRequest;
import az.iktlab.groupjuniorsweb.security.UserDetailsImpl;
import az.iktlab.groupjuniorsweb.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signin")
    public JwtResponse authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        return authService.authenticateUser(loginRequest);
    }

    @PostMapping("/signup")
    public MessageResponse registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
        return authService.registerUser(signUpRequest);
    }
}