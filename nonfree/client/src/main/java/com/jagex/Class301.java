package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public class Class301 {

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Lclient!aqm;")
	static Class77_Sub1_Sub7 aClass77_Sub1_Sub7_4;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!hk;")
	static final Class301 aClass301_2 = new Class301(0);

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!hk;")
	static final Class301 aClass301_1 = new Class301(1);

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	final int anInt4017;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V", line = 8)
	Class301(@OriginalArg(0) int arg0) {
		this.anInt4017 = arg0 * 98680741;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)Lclient!hk;", line = 13)
	public static Class301 method27115(@OriginalArg(0) int arg0) {
		if (aClass301_2.anInt4017 * -28635091 == arg0) {
			return aClass301_2;
		} else if (aClass301_1.anInt4017 * -28635091 == arg0) {
			return aClass301_1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "(I)Lclient!hk;", line = 13)
	public static Class301 method27116(@OriginalArg(0) int arg0) {
		if (aClass301_2.anInt4017 * -28635091 == arg0) {
			return aClass301_2;
		} else if (aClass301_1.anInt4017 * -28635091 == arg0) {
			return aClass301_1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "(I)[Lclient!zh;", line = 21)
	public static Class690[] method27117() {
		return new Class690[] { Class690.aClass690_4, Class690.aClass690_5, Class690.aClass690_3, Class690.aClass690_7, Class690.aClass690_6, Class690.aClass690_11, Class690.aClass690_10, Class690.aClass690_8, Class690.aClass690_9, Class690.aClass690_2 };
	}

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "(IZB)V", line = 155)
	static void method27118(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg1);
		if (local4 != null) {
			local4.method24063();
		}
	}

	@OriginalMember(owner = "client!hk", name = "ka", descriptor = "(Lclient!yf;I)V", line = 6430)
	static final void method27119(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class14_Sub1.method17053(local16, arg0);
	}

	@OriginalMember(owner = "client!hk", name = "auw", descriptor = "(Lclient!yf;I)V", line = 12985)
	static final void method27120(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aBoolean620 && !client.aBoolean616 ? 1 : 0;
	}
}
