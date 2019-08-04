package com.esc20.model;
// Generated Jan 4, 2019 3:55:15 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ImageApplicationPermissions generated by hbm2java
 */
@Entity
@Table(name = "IMAGE_APPLICATION_PERMISSIONS", schema = "rsccc", catalog = "rsccc")
public class ImageApplicationPermissions implements java.io.Serializable {

	private int imageApplicationPermissionsId;
	private ImageStorage imageStorage;
	private String applicationName;
	private boolean applicationPermission;

	public ImageApplicationPermissions() {
	}

	public ImageApplicationPermissions(int imageApplicationPermissionsId, ImageStorage imageStorage,
			String applicationName, boolean applicationPermission) {
		this.imageApplicationPermissionsId = imageApplicationPermissionsId;
		this.imageStorage = imageStorage;
		this.applicationName = applicationName;
		this.applicationPermission = applicationPermission;
	}

	@Id

	@Column(name = "IMAGE_APPLICATION_PERMISSIONS_ID", nullable = false)
	public int getImageApplicationPermissionsId() {
		return this.imageApplicationPermissionsId;
	}

	public void setImageApplicationPermissionsId(int imageApplicationPermissionsId) {
		this.imageApplicationPermissionsId = imageApplicationPermissionsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IMAGE_STORAGE_ID", nullable = false)
	public ImageStorage getImageStorage() {
		return this.imageStorage;
	}

	public void setImageStorage(ImageStorage imageStorage) {
		this.imageStorage = imageStorage;
	}

	@Column(name = "APPLICATION_NAME", nullable = false, length = 64)
	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	@Column(name = "APPLICATION_PERMISSION", nullable = false)
	public boolean isApplicationPermission() {
		return this.applicationPermission;
	}

	public void setApplicationPermission(boolean applicationPermission) {
		this.applicationPermission = applicationPermission;
	}

}