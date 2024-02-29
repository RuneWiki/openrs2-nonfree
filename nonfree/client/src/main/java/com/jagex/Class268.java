package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gc")
public class Class268 implements Interface27 {

	@OriginalMember(owner = "client!gc", name = "i", descriptor = "I")
	public static int anInt3833;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gc", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "I")
	final int anInt3832;

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "I")
	final int anInt3831;

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "(Lclient!ot;I)F", line = 13)
	public static float method26484(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat276);
		local4.method29130();
		return (float) local14;
	}

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "(I)[Lclient!gu;", line = 30)
	static Class285[] method26485() {
		return new Class285[] { Class285.aClass285_10, Class285.aClass285_7, Class285.aClass285_14, Class285.aClass285_15, Class285.aClass285_6, Class285.aClass285_5, Class285.aClass285_9, Class285.aClass285_2, Class285.aClass285_1, Class285.aClass285_3, Class285.aClass285_11, Class285.aClass285_13, Class285.aClass285_8, Class285.aClass285_18, Class285.aClass285_16, Class285.aClass285_12, Class285.aClass285_17, Class285.aClass285_4 };
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 204)
	Class268(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		this.anInt3832 = arg1.method22483() * -813255215;
		this.anInt3831 = arg1.method22483() * 2019321485;
	}

	@OriginalMember(owner = "client!gc", name = "v", descriptor = "(Lclient!fd;)V", line = 210)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26079(this.anInt3832 * -1737899215, this.anInt3831 * 2061552709);
		arg0.method26054(this.anInt3832 * -1737899215).method25991();
	}

	@OriginalMember(owner = "client!gc", name = "p", descriptor = "(Lclient!fd;I)V", line = 210)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26079(this.anInt3832 * -1737899215, this.anInt3831 * 2061552709);
		arg0.method26054(this.anInt3832 * -1737899215).method25991();
	}

	@OriginalMember(owner = "client!gc", name = "c", descriptor = "(Lclient!fd;)V", line = 210)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26079(this.anInt3832 * -1737899215, this.anInt3831 * 2061552709);
		arg0.method26054(this.anInt3832 * -1737899215).method25991();
	}

	@OriginalMember(owner = "client!gc", name = "tu", descriptor = "(Lclient!yf;B)V", line = 8083)
	static final void method26486(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(37) Class277 local37 = Class155.method23628(local33);
		Class143_Sub37.method16141(local37, local13, local23);
	}

	@OriginalMember(owner = "client!gc", name = "xl", descriptor = "(Lclient!yf;I)V", line = 8706)
	static final void method26487(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class36 local39 = (Class36) Class663.aClass35_Sub21_1.method18319(local12);
		if (Class498.aClass498_158 != local39.aClass498_1) {
			throw new RuntimeException();
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local39.method628(local26) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gc", name = "alt", descriptor = "(Lclient!yf;B)V", line = 11484)
	static final void method26488(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		Class597.aClass107_Sub1_2.method8842((float) ((double) local13 * 3.141592653589793D * 2.0D / 16384.0D), (float) (2.0D * 3.141592653589793D * (double) local23 / 16384.0D));
	}

	@OriginalMember(owner = "client!gc", name = "ast", descriptor = "(Lclient!yf;I)V", line = 12551)
	static final void method26489(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		client.aShort154 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		if (client.aShort154 <= 0) {
			client.aShort154 = 256;
		}
		client.aShort155 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (client.aShort155 <= 0) {
			client.aShort155 = 205;
		}
	}
}
