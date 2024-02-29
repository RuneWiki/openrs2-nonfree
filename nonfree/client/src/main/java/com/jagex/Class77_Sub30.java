package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akg")
public class Class77_Sub30 extends Class77 {

	@OriginalMember(owner = "client!akg", name = "y", descriptor = "I")
	public int anInt1633;

	@OriginalMember(owner = "client!akg", name = "x", descriptor = "I")
	public int anInt1634;

	@OriginalMember(owner = "client!akg", name = "t", descriptor = "I")
	public int anInt1636;

	@OriginalMember(owner = "client!akg", name = "q", descriptor = "I")
	public int anInt1637;

	@OriginalMember(owner = "client!akg", name = "w", descriptor = "I")
	public int anInt1638;

	@OriginalMember(owner = "client!akg", name = "l", descriptor = "I")
	public int anInt1635 = 477995975;

	@OriginalMember(owner = "client!akg", name = "d", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!akg", name = "<init>", descriptor = "(I)V", line = 14)
	Class77_Sub30(@OriginalArg(0) int arg0) {
		this.anInt1635 = arg0 * -477995975;
	}

	@OriginalMember(owner = "client!akg", name = "zt", descriptor = "(Lclient!yf;I)V", line = 9054)
	static final void method13775(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class430.anInt4881 * -1988701703;
	}
}
