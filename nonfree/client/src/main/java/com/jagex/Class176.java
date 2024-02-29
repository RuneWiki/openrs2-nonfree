package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class Class176 {

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "I")
	int anInt3300;

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
	int anInt3301;

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "I")
	int anInt3303;

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	int anInt3299 = 128;

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
	int anInt3298 = 128;

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
	int anInt3302;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(I)V", line = 12)
	Class176(@OriginalArg(0) int arg0) {
		this.anInt3302 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIIII)V", line = 16)
	Class176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3302 = arg0;
		this.anInt3299 = arg1;
		this.anInt3298 = arg2;
		this.anInt3301 = arg3;
		this.anInt3300 = arg4;
		this.anInt3303 = arg5;
	}

	@OriginalMember(owner = "client!bp", name = "v", descriptor = "()Lclient!bp;", line = 26)
	Class176 method24550() {
		return new Class176(this.anInt3302, this.anInt3299, this.anInt3298, this.anInt3301, this.anInt3300, this.anInt3303);
	}

	@OriginalMember(owner = "client!bp", name = "l", descriptor = "()Lclient!bp;", line = 26)
	Class176 method24551() {
		return new Class176(this.anInt3302, this.anInt3299, this.anInt3298, this.anInt3301, this.anInt3300, this.anInt3303);
	}

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "()Lclient!bp;", line = 26)
	Class176 method24552() {
		return new Class176(this.anInt3302, this.anInt3299, this.anInt3298, this.anInt3301, this.anInt3300, this.anInt3303);
	}

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "()Lclient!bp;", line = 26)
	Class176 method24553() {
		return new Class176(this.anInt3302, this.anInt3299, this.anInt3298, this.anInt3301, this.anInt3300, this.anInt3303);
	}

	@OriginalMember(owner = "client!bp", name = "t", descriptor = "(Lclient!bp;)V", line = 30)
	void method24554(@OriginalArg(0) Class176 arg0) {
		this.anInt3299 = arg0.anInt3299;
		this.anInt3298 = arg0.anInt3298;
		this.anInt3301 = arg0.anInt3301;
		this.anInt3300 = arg0.anInt3300;
		this.anInt3302 = arg0.anInt3302;
		this.anInt3303 = arg0.anInt3303;
	}

	@OriginalMember(owner = "client!bp", name = "w", descriptor = "(Lclient!bp;)V", line = 30)
	void method24555(@OriginalArg(0) Class176 arg0) {
		this.anInt3299 = arg0.anInt3299;
		this.anInt3298 = arg0.anInt3298;
		this.anInt3301 = arg0.anInt3301;
		this.anInt3300 = arg0.anInt3300;
		this.anInt3302 = arg0.anInt3302;
		this.anInt3303 = arg0.anInt3303;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(Lclient!bp;)V", line = 30)
	void method24556(@OriginalArg(0) Class176 arg0) {
		this.anInt3299 = arg0.anInt3299;
		this.anInt3298 = arg0.anInt3298;
		this.anInt3301 = arg0.anInt3301;
		this.anInt3300 = arg0.anInt3300;
		this.anInt3302 = arg0.anInt3302;
		this.anInt3303 = arg0.anInt3303;
	}
}
