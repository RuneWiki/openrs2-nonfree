package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dz")
public class Class139 {

	@OriginalMember(owner = "client!dz", name = "p", descriptor = "I")
	public int anInt3422;

	@OriginalMember(owner = "client!dz", name = "a", descriptor = "I")
	public int anInt3417;

	@OriginalMember(owner = "client!dz", name = "g", descriptor = "I")
	public int anInt3419;

	@OriginalMember(owner = "client!dz", name = "l", descriptor = "I")
	int anInt3420;

	@OriginalMember(owner = "client!dz", name = "h", descriptor = "I")
	public int anInt3418;

	@OriginalMember(owner = "client!dz", name = "x", descriptor = "I")
	public int anInt3421;

	@OriginalMember(owner = "client!dz", name = "s", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!dz", name = "<init>", descriptor = "()V", line = 12)
	public Class139() {
	}

	@OriginalMember(owner = "client!dz", name = "<init>", descriptor = "(IIIIIII)V", line = 14)
	public Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3422 = arg0 * 1729619491;
		this.anInt3417 = arg1 * -649923375;
		this.anInt3419 = arg2 * -23598781;
		this.anInt3420 = arg3 * -2002300069;
		this.anInt3418 = arg4 * 615474131;
		this.anInt3421 = arg5 * -1501506773;
		this.anInt3423 = arg6 * -61625233;
	}

	@OriginalMember(owner = "client!dz", name = "p", descriptor = "(Lclient!dz;I)Z", line = 25)
	public boolean method23013(@OriginalArg(0) Class139 arg0) {
		return this.anInt3422 * -470091381 == arg0.anInt3422 * -470091381 && arg0.anInt3417 * 1125508145 == this.anInt3417 * 1125508145 && this.anInt3419 * -729027733 == arg0.anInt3419 * -729027733 && arg0.anInt3420 * -1794071341 == this.anInt3420 * -1794071341 && arg0.anInt3418 * 742124635 == this.anInt3418 * 742124635 && this.anInt3421 * -866692221 == arg0.anInt3421 * -866692221 && this.anInt3423 * -2009386353 == arg0.anInt3423 * -2009386353;
	}

	@OriginalMember(owner = "client!dz", name = "aft", descriptor = "(Lclient!vs;B)V", line = 9889)
	static final void method23014(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
	}
}
