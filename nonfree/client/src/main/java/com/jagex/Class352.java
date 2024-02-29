package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jx")
public class Class352 {

	@OriginalMember(owner = "client!jx", name = "<init>", descriptor = "(I)V", line = 4)
	public Class352(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jx", name = "l", descriptor = "(Ljava/lang/String;B)V", line = 123)
	static final void method27911(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class474.method29677(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!jx", name = "cl", descriptor = "(Lclient!yf;B)V", line = 4866)
	static final void method27912(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class350.method27882(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!jx", name = "md", descriptor = "(Lclient!yf;I)V", line = 6898)
	static final void method27913(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class586.method31731(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!jx", name = "nk", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6912)
	static final void method27914(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray31 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}
}
