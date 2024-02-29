package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public class Class548 {

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!aqm;")
	static Class77_Sub1_Sub7 aClass77_Sub1_Sub7_6;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "Lclient!t;")
	static final Class548 aClass548_2 = new Class548();

	@OriginalMember(owner = "client!t", name = "c", descriptor = "Lclient!t;")
	static final Class548 aClass548_1 = new Class548();

	@OriginalMember(owner = "client!t", name = "p", descriptor = "(B)[Lclient!vp;", line = 14)
	public static Class602[] method30976() {
		return new Class602[] { Class602.aClass602_3, Class602.aClass602_1, Class602.aClass602_2 };
	}

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V", line = 285)
	Class548() {
	}

	@OriginalMember(owner = "client!t", name = "jo", descriptor = "(Lclient!alc;IZS)V", line = 6234)
	static final void method30977(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class20.method416(arg0, arg1, false, arg2);
	}

	@OriginalMember(owner = "client!t", name = "pv", descriptor = "(Lclient!yf;I)V", line = 7434)
	static final void method30978(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		@Pc(19) Class277 local19 = Class578.method31654(local14, local11);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local19 == null ? -1 : local19.anInt3863 * -1278450723;
	}

	@OriginalMember(owner = "client!t", name = "aqq", descriptor = "(Lclient!yf;B)V", line = 12407)
	static final void method30979(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1.method15901();
	}
}
