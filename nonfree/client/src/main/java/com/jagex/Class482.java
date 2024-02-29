package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public class Class482 implements Interface29 {

	@OriginalMember(owner = "client!q", name = "hy", descriptor = "Lclient!anh;")
	public static Class35_Sub4 aClass35_Sub4_1;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V", line = 10)
	Class482() {
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(Lclient!ik;I)Lclient!ir;", line = 13)
	@Override
	public Interface30 method29826(@OriginalArg(0) Class324 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class324.aClass324_1) {
			return client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (arg0 == Class324.aClass324_2) {
			@Pc(15) Class77_Sub6 local15 = (Class77_Sub6) client.aClass12_22.method173((long) arg1);
			if (local15 != null) {
				return (Interface30) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!q", name = "p", descriptor = "(Lclient!ik;IB)Lclient!ir;", line = 13)
	@Override
	public Interface30 method29827(@OriginalArg(0) Class324 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class324.aClass324_1) {
			return client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (arg0 == Class324.aClass324_2) {
			@Pc(15) Class77_Sub6 local15 = (Class77_Sub6) client.aClass12_22.method173((long) arg1);
			if (local15 != null) {
				return (Interface30) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!q", name = "u", descriptor = "(I)V", line = 682)
	static void method29828() {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub40_1.method16206() == 1) {
			Class196.aClass514_1.method30351(new Class516(Class505.aClass505_7, null));
		} else {
			client.aClass517_1.method30486();
			Class561.method31294();
		}
	}

	@OriginalMember(owner = "client!q", name = "zr", descriptor = "(Lclient!yf;I)V", line = 9068)
	static final void method29829(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.aString163 == null || local12 >= Class462.anInt4970 * -217094943) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class204.aClass50Array1[local12].aString9;
		}
	}

	@OriginalMember(owner = "client!q", name = "ahs", descriptor = "(Lclient!yf;I)V", line = 10660)
	static final void method29830(@OriginalArg(0) Class665 arg0) {
		Class131_Sub1.method12543(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307], -1, -1, false);
	}

	@OriginalMember(owner = "client!q", name = "ald", descriptor = "(Lclient!yf;B)V", line = 11614)
	static final void method29831(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8880() != Class331.aClass331_4) {
			throw new RuntimeException();
		}
		@Pc(13) Class115_Sub1 local13 = (Class115_Sub1) Class597.aClass107_Sub1_2.method8871();
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((double) local13.method9859() * 2607.5945876176133D) & 0x3FFF;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) ((double) local13.method9861() * 2607.5945876176133D) & 0x3FFF;
	}
}
