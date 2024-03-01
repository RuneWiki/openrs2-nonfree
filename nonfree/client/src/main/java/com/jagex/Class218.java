package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public class Class218 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!hd;")
	static final Class218 aClass218_16 = new Class218(0, Class601.aClass601_105, 2);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!hd;")
	static final Class218 aClass218_2 = new Class218(1, Class601.aClass601_105, Class601.aClass601_105, 2, 3);

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "Lclient!hd;")
	static final Class218 aClass218_17 = new Class218(2, Class601.aClass601_105, 3);

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!hd;")
	static final Class218 aClass218_7 = new Class218(3, Class601.aClass601_105, Class601.aClass601_105, 3, 4);

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!hd;")
	static final Class218 aClass218_3 = new Class218(4, Class601.aClass601_105, 4);

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "Lclient!hd;")
	static final Class218 aClass218_10 = new Class218(5, Class601.aClass601_105, Class601.aClass601_105, 4, 5);

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!hd;")
	static final Class218 aClass218_5 = new Class218(6, Class601.aClass601_105, Class601.aClass601_105, 5, 98, true, true);

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!hd;")
	static final Class218 aClass218_12 = new Class218(7, Class601.aClass601_105, 99);

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "Lclient!hd;")
	static final Class218 aClass218_4 = new Class218(8, Class601.aClass601_105, 100);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!hd;")
	static final Class218 aClass218_8 = new Class218(9, Class601.aClass601_106, Class601.aClass601_106, 0, 92, true, true);

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!hd;")
	static final Class218 aClass218_9 = new Class218(10, Class601.aClass601_106, Class601.aClass601_106, 92, 93);

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!hd;")
	static final Class218 aClass218_1 = new Class218(11, Class601.aClass601_106, Class601.aClass601_106, 94, 95);

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!hd;")
	static final Class218 aClass218_11 = new Class218(12, Class601.aClass601_106, Class601.aClass601_106, 96, 97);

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!hd;")
	static final Class218 aClass218_6 = new Class218(13, Class601.aClass601_106, 97);

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!hd;")
	static final Class218 aClass218_13 = new Class218(14, Class601.aClass601_106, 97);

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!hd;")
	static final Class218 aClass218_14 = new Class218(15, Class601.aClass601_106, 100);

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!hd;")
	static final Class218 aClass218_15 = new Class218(16, Class601.aClass601_106, 100);

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!hd;")
	static final Class218 aClass218_18 = new Class218(17, Class601.aClass601_106, 100);

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Z")
	final boolean aBoolean672;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!yk;")
	final Class601 aClass601_1;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public final int anInt3725;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Z")
	final boolean aBoolean673;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!yk;")
	final Class601 aClass601_2;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	final int anInt3726;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	final int anInt3727;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "(IIB)I", line = 9)
	static int method24357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "()[Lclient!hd;", line = 37)
	static Class218[] method24352() {
		return new Class218[] { aClass218_16, aClass218_2, aClass218_17, aClass218_7, aClass218_3, aClass218_10, aClass218_5, aClass218_12, aClass218_4, aClass218_8, aClass218_9, aClass218_1, aClass218_11, aClass218_6, aClass218_13, aClass218_14, aClass218_15, aClass218_18 };
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()[Lclient!hd;", line = 37)
	static Class218[] method24353() {
		return new Class218[] { aClass218_16, aClass218_2, aClass218_17, aClass218_7, aClass218_3, aClass218_10, aClass218_5, aClass218_12, aClass218_4, aClass218_8, aClass218_9, aClass218_1, aClass218_11, aClass218_6, aClass218_13, aClass218_14, aClass218_15, aClass218_18 };
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "()[Lclient!hd;", line = 37)
	static Class218[] method24354() {
		return new Class218[] { aClass218_16, aClass218_2, aClass218_17, aClass218_7, aClass218_3, aClass218_10, aClass218_5, aClass218_12, aClass218_4, aClass218_8, aClass218_9, aClass218_1, aClass218_11, aClass218_6, aClass218_13, aClass218_14, aClass218_15, aClass218_18 };
	}

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "()[Lclient!hd;", line = 37)
	static Class218[] method24355() {
		return new Class218[] { aClass218_16, aClass218_2, aClass218_17, aClass218_7, aClass218_3, aClass218_10, aClass218_5, aClass218_12, aClass218_4, aClass218_8, aClass218_9, aClass218_1, aClass218_11, aClass218_6, aClass218_13, aClass218_14, aClass218_15, aClass218_18 };
	}

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "(I)[Lclient!hd;", line = 37)
	static Class218[] method24356() {
		return new Class218[] { aClass218_16, aClass218_2, aClass218_17, aClass218_7, aClass218_3, aClass218_10, aClass218_5, aClass218_12, aClass218_4, aClass218_8, aClass218_9, aClass218_1, aClass218_11, aClass218_6, aClass218_13, aClass218_14, aClass218_15, aClass218_18 };
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILclient!yk;I)V", line = 41)
	Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class601 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILclient!yk;Lclient!yk;II)V", line = 45)
	Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class601 arg1, @OriginalArg(2) Class601 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(ILclient!yk;Lclient!yk;IIZZ)V", line = 48)
	Class218(@OriginalArg(0) int arg0, @OriginalArg(1) Class601 arg1, @OriginalArg(2) Class601 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3725 = arg0 * -456978799;
		this.aClass601_1 = arg1;
		this.aClass601_2 = arg2;
		this.anInt3727 = arg3 * 367018667;
		this.anInt3726 = arg4 * 659261359;
		this.aBoolean672 = arg5;
		this.aBoolean673 = arg6;
	}

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "(IS)V", line = 871)
	static void method24358(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "hw", descriptor = "(Lclient!act;B)I", line = 3966)
	static final int method24360(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt2358 * 1280627541 == 0) {
			return 0;
		}
		@Pc(72) int local72;
		@Pc(64) Class320 local64;
		if (-867983489 * arg0.anInt2364 != -1) {
			@Pc(15) Class26_Sub1_Sub1_Sub1 local15 = null;
			if (arg0.anInt2364 * -867983489 < 32768) {
				@Pc(30) Class3_Sub29 local30 = (Class3_Sub29) client.aClass581_21.method33217((long) (arg0.anInt2364 * -867983489));
				if (local30 != null) {
					local15 = (Class26_Sub1_Sub1_Sub1) local30.anObject2;
				}
			} else if (arg0.anInt2364 * -867983489 >= 32768) {
				local15 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt2364 * -867983489 - 32768];
			}
			if (local15 != null) {
				local64 = Class320.method25928(arg0.method21431().aClass320_61, local15.method21431().aClass320_61);
				@Pc(68) int local68 = (int) local64.aFloat259;
				local72 = (int) local64.aFloat261;
				if (local68 != 0 || local72 != 0) {
					arg0.method16633((int) (Math.atan2((double) local68, (double) local72) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class26_Sub1_Sub1_Sub1_Sub2) {
			@Pc(96) Class26_Sub1_Sub1_Sub1_Sub2 local96 = (Class26_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local96.anInt2395 * 1668894213 != -1 && (local96.anInt2362 * -162520433 == 0 || local96.anInt2384 * -1570075277 > 0)) {
				local96.method16633(local96.anInt2395 * 1668894213);
				local96.anInt2395 = 1905570099;
			}
		} else if (arg0 instanceof Class26_Sub1_Sub1_Sub1_Sub1) {
			@Pc(130) Class26_Sub1_Sub1_Sub1_Sub1 local130 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local130.anInt2265 * -327216029 != -1 && (local130.anInt2362 * -162520433 == 0 || local130.anInt2384 * -1570075277 > 0)) {
				local64 = local130.method21431().aClass320_61;
				@Pc(154) Class464 local154 = client.aClass370_1.method26942();
				local72 = (int) local64.aFloat259 - (local130.anInt2265 * 2132042496 - local154.anInt5071 * -1927819008 - local154.anInt5071 * -1927819008);
				@Pc(192) int local192 = (int) local64.aFloat261 - (local130.anInt2266 * -303503616 - local154.anInt5073 * 312561920 - local154.anInt5073 * 312561920);
				if (local72 != 0 || local192 != 0) {
					local130.method16633((int) (Math.atan2((double) local72, (double) local192) * 2607.5945876176133D) & 0x3FFF);
				}
				local130.anInt2265 = -420744523;
			}
		}
		return arg0.method16635();
	}

	@OriginalMember(owner = "client!hd", name = "avm", descriptor = "(Lclient!vs;I)V", line = 12746)
	static final void method24359(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
	}
}
