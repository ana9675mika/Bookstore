package com.capgemini.bookstore.beans;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="CustomerReview")
public class CustomerReview {
 
	@Id
	@Column(name="customerreviewid")
	@NotNull
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerReviewId;
	
	@Column(name="rating")
	@NotNull
	@Size(min=1)
	@Size(max=5)
	private int rating;
	
	@Column(name="headline")
	@NotNull
	@Size(min=20)
	@Size(max=128)
	private String headline;
	
	@Column(name="comments")
	@NotNull
	@Size(min=100)
	@Size(max=300)
	private String comments;

	
	public int getCustomerReviewId() {
		return customerReviewId;
	}

	public void setCustomerReviewId(int customerReviewId) {
		this.customerReviewId = customerReviewId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "CustomerReview [customerReviewId=" + customerReviewId + ", rating=" + rating + ", headline=" + headline
				+ ", comments=" + comments + "]";
	}
	
	
	
}
