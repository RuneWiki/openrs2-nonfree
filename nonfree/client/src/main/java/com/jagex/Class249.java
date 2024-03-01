package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iz")
public class Class249 {

	@OriginalMember(owner = "client!iz", name = "a", descriptor = "I")
	int anInt3798 = 128;

	@OriginalMember(owner = "client!iz", name = "g", descriptor = "I")
	int anInt3797 = 128;

	@OriginalMember(owner = "client!iz", name = "p", descriptor = "I")
	int anInt3799;

	@OriginalMember(owner = "client!iz", name = "l", descriptor = "I")
	int anInt3800;

	@OriginalMember(owner = "client!iz", name = "h", descriptor = "I")
	int anInt3801;

	@OriginalMember(owner = "client!iz", name = "x", descriptor = "I")
	int anInt3802;

	@OriginalMember(owner = "client!iz", name = "<init>", descriptor = "(I)V", line = 11)
	Class249(@OriginalArg(0) int arg0) {
		this.anInt3799 = arg0;
	}

	@OriginalMember(owner = "client!iz", name = "<init>", descriptor = "(IIIIII)V", line = 15)
	Class249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3799 = arg0;
		this.anInt3798 = arg1;
		this.anInt3797 = arg2;
		this.anInt3800 = arg3;
		this.anInt3801 = arg4;
		this.anInt3802 = arg5;
	}

	@OriginalMember(owner = "client!iz", name = "p", descriptor = "()Lclient!iz;", line = 25)
	Class249 method24915() {
		return new Class249(this.anInt3799, this.anInt3798, this.anInt3797, this.anInt3800, this.anInt3801, this.anInt3802);
	}

	@OriginalMember(owner = "client!iz", name = "l", descriptor = "()Lclient!iz;", line = 25)
	Class249 method24916() {
		return new Class249(this.anInt3799, this.anInt3798, this.anInt3797, this.anInt3800, this.anInt3801, this.anInt3802);
	}

	@OriginalMember(owner = "client!iz", name = "g", descriptor = "()Lclient!iz;", line = 25)
	Class249 method24920() {
		return new Class249(this.anInt3799, this.anInt3798, this.anInt3797, this.anInt3800, this.anInt3801, this.anInt3802);
	}

	@OriginalMember(owner = "client!iz", name = "x", descriptor = "(Lclient!iz;)V", line = 29)
	void method24917(@OriginalArg(0) Class249 arg0) {
		this.anInt3798 = arg0.anInt3798;
		this.anInt3797 = arg0.anInt3797;
		this.anInt3800 = arg0.anInt3800;
		this.anInt3801 = arg0.anInt3801;
		this.anInt3799 = arg0.anInt3799;
		this.anInt3802 = arg0.anInt3802;
	}

	@OriginalMember(owner = "client!iz", name = "a", descriptor = "(Lclient!iz;)V", line = 29)
	void method24918(@OriginalArg(0) Class249 arg0) {
		this.anInt3798 = arg0.anInt3798;
		this.anInt3797 = arg0.anInt3797;
		this.anInt3800 = arg0.anInt3800;
		this.anInt3801 = arg0.anInt3801;
		this.anInt3799 = arg0.anInt3799;
		this.anInt3802 = arg0.anInt3802;
	}

	@OriginalMember(owner = "client!iz", name = "h", descriptor = "(Lclient!iz;)V", line = 29)
	void method24919(@OriginalArg(0) Class249 arg0) {
		this.anInt3798 = arg0.anInt3798;
		this.anInt3797 = arg0.anInt3797;
		this.anInt3800 = arg0.anInt3800;
		this.anInt3801 = arg0.anInt3801;
		this.anInt3799 = arg0.anInt3799;
		this.anInt3802 = arg0.anInt3802;
	}
}
