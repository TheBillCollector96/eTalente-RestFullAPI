package com.enviro.assessment.grad001.KatlegoMtileni.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.KatlegoMtileni.Service.ContextService;
import com.enviro.assessment.grad001.KatlegoMtileni.Service.CouponService;
import com.enviro.assessment.grad001.KatlegoMtileni.Service.Coupon_UsageService;
import com.enviro.assessment.grad001.KatlegoMtileni.Service.GenericService;
import com.enviro.assessment.grad001.KatlegoMtileni.Service.UserService;
import com.enviro.assessment.grad001.KatlegoMtileni.model.Context;
import com.enviro.assessment.grad001.KatlegoMtileni.model.Coupon;
import com.enviro.assessment.grad001.KatlegoMtileni.model.Coupon_Usage;
import com.enviro.assessment.grad001.KatlegoMtileni.model.User;

@RestController
@RequestMapping("/api")
public class ControllerLayer {

	
	@Autowired
    private UserService userService;

	@Autowired
    private CouponService couponService;

	@Autowired
    private ContextService contextService;

	@Autowired
    private Coupon_UsageService coupon_usageService;

	// User Endpoints 
    
	@GetMapping("/user")
	public List<User> listAll() {
		
		return userService.findAll();
	}

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        Optional<User> user = userService.findById(id);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
    	userService.save(user);
        return "User Details Saved Successfully";
    }

    @PutMapping("/user/{id}")
    public String updateUser(@PathVariable Integer id, @RequestBody User userDetails) {
    	userDetails.setUserID(id); // Ensure the ID matches for the update
    	userService.update(userDetails);
        return "User Details Updated Successfully";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable Integer id) {
    	userService.deleteById(id); 
    	return "User Details Deleted Successfully";
    }
	
    // Coupon Endpoints
    
    @GetMapping("/coupon")
    public List<Coupon> getAllCoupons() {
        return couponService.findAll();
    }

    @GetMapping("/coupon/{id}")
    public ResponseEntity<Coupon> getCouponById(@PathVariable Integer id) {
        Optional<Coupon> coupon = couponService.findById(id);
        return coupon.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/coupon")
    public String createCoupon(@RequestBody Coupon coupon) {
    	couponService.save(coupon);
        return "Coupon Details Saved Successfully";
    }

    @PutMapping("/coupon/{id}")
    public String updateCoupon(@PathVariable Integer id, @RequestBody Coupon couponDetails) {
    	couponDetails.setCouponID(id); // Ensure the ID matches for the update
    	couponService.update(couponDetails);
        return "User Details Updated Successfully";
    }

    @DeleteMapping("/coupon/{id}")
    public String deleteCoupon(@PathVariable Integer id) {
    	couponService.deleteById(id);
    	return "Coupon Details Deleted Successfully";
    }
	
    // Context Endpoints
    
    @GetMapping("/context")
    public List<Context> getAllContexts() {
        return contextService.findAll();
    }

    @GetMapping("/context/{id}")
    public ResponseEntity<Context> getContextById(@PathVariable Integer id) {
        Optional<Context> context = contextService.findById(id);
        return context.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/context")
    public String createContext(@RequestBody Context context) {
    	contextService.save(context);
        return "Context Details Saved Successfully";
    }

    @PutMapping("/context/{id}")
    public String updateContext(@PathVariable Integer id, @RequestBody Context contextDetails) {
    	contextDetails.setContextID(id); // Ensure the ID matches for the update
    	contextService.update(contextDetails);
        return "Context Details Updated Successfully";
    }

    @DeleteMapping("/context/{id}")
    public String deleteContext(@PathVariable Integer id) {
    	contextService.deleteById(id);
    	return "Context Details Deleted Successfully";
    }
    
    // Context_Usage Endpoints
    
    @GetMapping("/coupon_usage")
    public List<Coupon_Usage> getAllCoupon_Usage() {
        return coupon_usageService.findAll();
    }

    @GetMapping("/coupon_usage/{id}")
    public ResponseEntity<Coupon_Usage> getCoupon_UsageById(@PathVariable Integer id) {
        Optional<Coupon_Usage> context = coupon_usageService.findById(id);
        return context.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/coupon_usage")
    public String createCoupon_Usage(@RequestBody Coupon_Usage usage) {
    	coupon_usageService.save(usage);
        return "Coupon Usage Details Saved Successfully";
    }

    @PutMapping("/coupon_usage/{id}")
    public String updateCoupon_Usage(@PathVariable Integer id, @RequestBody Coupon_Usage coupon_usageDetails) {
    	coupon_usageDetails.setUsageID(id); // Ensure the ID matches for the update
    	coupon_usageService.update(coupon_usageDetails);
        return "Coupon_Usage Details Updated Successfully";
    }

    @DeleteMapping("/coupon_usage/{id}")
    public String deleteCoupon_Usage(@PathVariable Integer id) {
    	coupon_usageService.deleteById(id);
    	return "Coupon Usage Details Deleted Successfully";
    }
    
 // Find coupon_usage by userId
    @GetMapping("/coupon_usage/user/{userId}")
    public List<Coupon_Usage> getBehaviorsByUserId(@PathVariable Integer userId) {
        return coupon_usageService.findAll().stream()
                .filter(coupon_usage -> coupon_usage.getUser().getUserID().equals(userId))
                .toList();
    }

    // Find coupon_usage by couponId
    @GetMapping("/coupon_usage/coupon/{couponId}")
    public List<Coupon_Usage> getBehaviorsByCouponId(@PathVariable Integer couponId) {
        return coupon_usageService.findAll().stream()
                .filter(coupon_usage -> coupon_usage.getCoupon().getCouponID().equals(couponId))
                .toList();
    }

    // Find coupon_usage by contextId
    @GetMapping("/coupon_usage/context/{contextId}")
    public List<Coupon_Usage> getBehaviorsByContextId(@PathVariable Integer contextId) {
        return coupon_usageService.findAll().stream()
                .filter(coupon_usage -> coupon_usage.getContext().getContextID().equals(contextId))
                .toList();
    }
    
}
