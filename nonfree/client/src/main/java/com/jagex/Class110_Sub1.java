package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afj")
public class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!afj", name = "<init>", descriptor = "(Lclient!alw;)V", line = 7)
	Class110_Sub1(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!afj", name = "n", descriptor = "(I)V", line = 11)
	@Override
	public void method20138() {
		Class501.method30172(true);
	}

	@OriginalMember(owner = "client!afj", name = "f", descriptor = "()V", line = 11)
	@Override
	public void method20140() {
		Class501.method30172(true);
	}

	@OriginalMember(owner = "client!afj", name = "f", descriptor = "(IIFLclient!ma;I)V", line = 49)
	public static void method6371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface39 arg3) {
		if (Class670.aClass146_6 != null) {
			Class670.aClass146_6.method11689().method28657(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!afj", name = "y", descriptor = "(IB)V", line = 137)
	public static void method6372(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(11, (long) arg0);
		local4.method21865();
	}

	@OriginalMember(owner = "client!afj", name = "gv", descriptor = "(I)V", line = 3828)
	static final void method6370() {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3540 * 568731113; local1++) {
			@Pc(10) int local10 = client.anIntArray323[local1];
			@Pc(16) Class93_Sub15 local16 = (Class93_Sub15) client.aClass16_18.method215((long) local10);
			if (local16 != null) {
				@Pc(23) Class132_Sub1_Sub1_Sub1_Sub1 local23 = (Class132_Sub1_Sub1_Sub1_Sub1) local16.anObject5;
				Class233.method25732(local23, false);
			}
		}
	}
}
