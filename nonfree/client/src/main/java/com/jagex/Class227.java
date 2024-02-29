package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
class Class227 implements Interface41 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ek", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(Lclient!ary;I)Lclient!tp;", line = 15)
	static Class559 method25796(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		@Pc(5) Class559 local5;
		if (Class559.aClass559_2 == null) {
			local5 = new Class559();
		} else {
			local5 = Class559.aClass559_2;
			Class559.aClass559_2 = Class559.aClass559_2.aClass559_1;
			local5.aClass559_1 = null;
			Class559.anInt5279 -= -510773381;
		}
		local5.aClass104_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "(Ljava/lang/CharSequence;I)J", line = 154)
	public static long method25797(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "(IIII)I", line = 174)
	public static int method25798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!fw;)V", line = 470)
	Class227(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(S)F", line = 472)
	@Override
	public float method26249() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "()F", line = 472)
	@Override
	public float method26250() {
		return (float) Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2.method15901() / 255.0F;
	}

	@OriginalMember(owner = "client!ek", name = "ao", descriptor = "(Lclient!yf;I)V", line = 4440)
	static final void method25799(@OriginalArg(0) Class665 arg0) {
		if (arg0.anInt5783 * -1712769137 == 0) {
			return;
		}
		@Pc(18) Class654 local18 = arg0.aClass654Array1[(arg0.anInt5783 -= 417597295) * -1712769137];
		arg0.aClass77_Sub1_Sub9_2 = local18.aClass77_Sub1_Sub9_1;
		arg0.aClass520Array2 = arg0.aClass77_Sub1_Sub9_2.aClass520Array1;
		arg0.anIntArray535 = arg0.aClass77_Sub1_Sub9_2.anIntArray281;
		arg0.anInt5786 = local18.anInt5765 * 1371575037;
		arg0.anIntArray537 = local18.anIntArray530;
		arg0.anObjectArray46 = local18.anObjectArray44;
		arg0.aLongArray27 = local18.aLongArray26;
	}

	@OriginalMember(owner = "client!ek", name = "mx", descriptor = "(Lclient!yf;I)V", line = 6733)
	static final void method25800(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class118.method21258(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ek", name = "wu", descriptor = "(Lclient!yf;I)V", line = 8580)
	static final void method25801(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class77_Sub36.aBoolean351 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ek", name = "acj", descriptor = "(Lclient!yf;B)V", line = 9633)
	static final void method25802(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(51) int local51 = Class239.method25926(local43 - local33 + 1);
		if (local23 > local51) {
			local23 = local51;
		}
		local13 = Class223.method25767(local13, local33, local43);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 | local23 << local33;
	}
}
