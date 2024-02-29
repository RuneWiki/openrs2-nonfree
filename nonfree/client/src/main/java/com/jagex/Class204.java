package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class Class204 {

	@OriginalMember(owner = "client!dd", name = "tk", descriptor = "[Lclient!ac;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
	public final int anInt3563;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
	public final int anInt3566;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	final int anInt3565;

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
	public final int anInt3564;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIII)V", line = 9)
	Class204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3563 = arg0 * -698967941;
		this.anInt3566 = arg1 * -1548766383;
		this.anInt3565 = arg2 * 183547625;
		this.anInt3564 = arg3 * 1944564437;
	}

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "(I)Lclient!dd;", line = 17)
	Class204 method25550(@OriginalArg(0) int arg0) {
		return new Class204(this.anInt3563 * 452560563, arg0, this.anInt3565 * -1478655655, this.anInt3564 * -1972242819);
	}

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "(IB)Lclient!dd;", line = 17)
	Class204 method25551(@OriginalArg(0) int arg0) {
		return new Class204(this.anInt3563 * 452560563, arg0, this.anInt3565 * -1478655655, this.anInt3564 * -1972242819);
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lclient!dd;", line = 17)
	Class204 method25552(@OriginalArg(0) int arg0) {
		return new Class204(this.anInt3563 * 452560563, arg0, this.anInt3565 * -1478655655, this.anInt3564 * -1972242819);
	}

	@OriginalMember(owner = "client!dd", name = "l", descriptor = "(I)Lclient!dd;", line = 17)
	Class204 method25553(@OriginalArg(0) int arg0) {
		return new Class204(this.anInt3563 * 452560563, arg0, this.anInt3565 * -1478655655, this.anInt3564 * -1972242819);
	}

	@OriginalMember(owner = "client!dd", name = "aux", descriptor = "(Lclient!yf;B)V", line = 13042)
	static final void method25554(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class497.anInt5063 * 846473929;
	}
}
