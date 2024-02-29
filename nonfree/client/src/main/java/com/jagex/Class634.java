package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wx")
public class Class634 {

	@OriginalMember(owner = "client!wx", name = "<init>", descriptor = "()V", line = 6)
	Class634() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wx", name = "c", descriptor = "(B)I", line = 16)
	public static int method32664() {
		@Pc(3) Canvas local3 = new Canvas();
		local3.setSize(100, 100);
		@Pc(19) Class86 local19 = Class345.method27828(0, local3, null, null, null, null, null, null, 0);
		@Pc(22) long local22 = Class280.method26667();
		@Pc(24) int local24;
		for (local24 = 0; local24 < 10000; local24++) {
			local19.method20089(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}
		local24 = (int) (Class280.method26667() - local22);
		local19.method19986(0, 0, 100, 100, -16777216);
		local19.method19929();
		return local24;
	}

	@OriginalMember(owner = "client!wx", name = "l", descriptor = "(Lclient!arc;I)I", line = 200)
	static int method32665(@OriginalArg(0) Class77_Sub39_Sub1 arg0) {
		@Pc(4) int local4 = arg0.method22189(2);
		@Pc(9) int local9;
		if (local4 == 0) {
			local9 = 0;
		} else if (local4 == 1) {
			local9 = arg0.method22189(5);
		} else if (local4 == 2) {
			local9 = arg0.method22189(8);
		} else {
			local9 = arg0.method22189(11);
		}
		return local9;
	}

	@OriginalMember(owner = "client!wx", name = "fl", descriptor = "(Lclient!yf;B)V", line = 5415)
	static final void method32666(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class134.method13702(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!wx", name = "jh", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6206)
	static final void method32667(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(12) int local12 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		@Pc(25) int local25 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307];
		if (local25 >= 1 && local25 <= 10) {
			arg0.method26628(local25 - 1, local12);
		}
	}

	@OriginalMember(owner = "client!wx", name = "lt", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6675)
	static final void method32668(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray24 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!wx", name = "arg", descriptor = "(Lclient!yf;I)V", line = 12455)
	static final void method32669(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class38.method667(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109(), 200);
	}

	@OriginalMember(owner = "client!wx", name = "aru", descriptor = "(Lclient!yf;S)V", line = 12459)
	static final void method32670(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1.method15716();
	}
}
