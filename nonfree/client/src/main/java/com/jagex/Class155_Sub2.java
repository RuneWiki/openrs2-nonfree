package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alz")
final class Class155_Sub2 extends Class155 {

	@OriginalMember(owner = "client!alz", name = "<init>", descriptor = "(Ljava/lang/String;IZZ)V", line = 25)
	Class155_Sub2(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class155_Sub2) null);
	}

	@OriginalMember(owner = "client!alz", name = "f", descriptor = "(Lclient!alq;I)V", line = 185)
	static void method15310(@OriginalArg(0) Class54_Sub1 arg0) {
		arg0.method14871(0);
		@Pc(18) byte local18;
		if (Class553.anInt3419 * 1798078423 >= 96) {
			@Pc(11) int local11 = Class699.method36706();
			if (local11 <= 100) {
				Class642.method32521();
				local18 = 4;
			} else if (local11 <= 500) {
				Class586.method31641();
				local18 = 3;
			} else if (local11 <= 1003) {
				Class260.method26153();
				local18 = 2;
			} else {
				Class238.method25796();
				local18 = 1;
			}
			arg0.method14875(0, local11);
		} else {
			Class238.method25796();
			local18 = 1;
			arg0.method14870(64);
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 0) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, true);
		} else {
			Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_1, 0);
			Class543.method30948(0, false);
		}
		Class106_Sub1.method5148();
		arg0.method14869(local18);
	}
}
