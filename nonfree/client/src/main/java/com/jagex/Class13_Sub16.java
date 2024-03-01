package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acq")
public class Class13_Sub16 extends Class13 {

	@OriginalMember(owner = "client!acq", name = "a", descriptor = "I")
	final int anInt681;

	@OriginalMember(owner = "client!acq", name = "g", descriptor = "I")
	final int anInt678;

	@OriginalMember(owner = "client!acq", name = "l", descriptor = "I")
	final int anInt677;

	@OriginalMember(owner = "client!acq", name = "h", descriptor = "I")
	final int anInt680;

	@OriginalMember(owner = "client!acq", name = "x", descriptor = "I")
	final int anInt679;

	@OriginalMember(owner = "client!acq", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 13)
	Class13_Sub16(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt681 = arg0.method20271() * -854211549;
		@Pc(13) int local13 = arg0.method20275();
		this.anInt678 = (local13 >>> 16) * -149519267;
		this.anInt677 = (local13 & 0xFFFF) * 438403407;
		this.anInt680 = arg0.method20269() * -1815818209;
		this.anInt679 = arg0.method20269() * 1203939387;
	}

	@OriginalMember(owner = "client!acq", name = "a", descriptor = "(I)V", line = 23)
	@Override
	public void method16888() {
		Class131.aClass142Array1[this.anInt681 * -87356533].method23035(this.anInt680 * -701060129, this.anInt678 * 593194997, this.anInt677 * -1037503057, this.anInt679 * 945418483);
	}

	@OriginalMember(owner = "client!acq", name = "h", descriptor = "()V", line = 23)
	@Override
	public void method16896() {
		Class131.aClass142Array1[this.anInt681 * -87356533].method23035(this.anInt680 * -701060129, this.anInt678 * 593194997, this.anInt677 * -1037503057, this.anInt679 * 945418483);
	}

	@OriginalMember(owner = "client!acq", name = "la", descriptor = "(Lclient!fo;I)Lclient!fo;", line = 11145)
	static Class178 method6687(@OriginalArg(0) Class178 arg0) {
		@Pc(2) Class178 local2 = client.method22682(arg0);
		if (local2 == null) {
			local2 = arg0.aClass178_14;
		}
		return local2;
	}
}
