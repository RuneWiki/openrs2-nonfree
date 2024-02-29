package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afh")
public class Class96_Sub8 extends Class96 {

	@OriginalMember(owner = "client!afh", name = "c", descriptor = "I")
	final int anInt831;

	@OriginalMember(owner = "client!afh", name = "<init>", descriptor = "(Lclient!akv;)V", line = 9)
	Class96_Sub8(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt831 = arg0.method22483() * -613480619;
	}

	@OriginalMember(owner = "client!afh", name = "y", descriptor = "()V", line = 14)
	@Override
	public void method19912() {
		Class589.aClass222Array1[this.anInt831 * -949174787].method25748();
	}

	@OriginalMember(owner = "client!afh", name = "c", descriptor = "(I)V", line = 14)
	@Override
	public void method19911() {
		Class589.aClass222Array1[this.anInt831 * -949174787].method25748();
	}

	@OriginalMember(owner = "client!afh", name = "w", descriptor = "()V", line = 14)
	@Override
	public void method19913() {
		Class589.aClass222Array1[this.anInt831 * -949174787].method25748();
	}

	@OriginalMember(owner = "client!afh", name = "ay", descriptor = "(III)V", line = 275)
	static void method7198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(12, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
	}

	@OriginalMember(owner = "client!afh", name = "dh", descriptor = "(Lclient!yf;B)V", line = 5034)
	static final void method7199(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class125.method12684(local11, local14, arg0);
	}
}
