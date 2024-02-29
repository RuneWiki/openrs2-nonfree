package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public class Class462 implements Interface75 {

	@OriginalMember(owner = "client!pf", name = "ty", descriptor = "I")
	public static int anInt4970;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!pf;")
	public static final Class462 aClass462_6 = new Class462(0);

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!pf;")
	public static final Class462 aClass462_4 = new Class462(1);

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Lclient!pf;")
	public static final Class462 aClass462_5 = new Class462(2);

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	final int anInt4969;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "()[Lclient!pf;", line = 14)
	public static Class462[] method29535() {
		return new Class462[] { aClass462_6, aClass462_5, aClass462_4 };
	}

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "()[Lclient!pf;", line = 14)
	public static Class462[] method29536() {
		return new Class462[] { aClass462_6, aClass462_5, aClass462_4 };
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V", line = 17)
	Class462(@OriginalArg(0) int arg0) {
		this.anInt4969 = arg0 * -1455098039;
	}

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method36478() {
		return this.anInt4969 * -116544775;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()I", line = 22)
	@Override
	public int method36479() {
		return this.anInt4969 * -116544775;
	}

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "()I", line = 22)
	@Override
	public int method36477() {
		return this.anInt4969 * -116544775;
	}

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "(FFB)F", line = 30)
	public static float method29537(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "(II)I", line = 60)
	public static int method29538(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 >>> 1;
		@Pc(9) int local9 = local3 | local3 >>> 1;
		@Pc(15) int local15 = local9 | local9 >>> 2;
		@Pc(21) int local21 = local15 | local15 >>> 4;
		@Pc(27) int local27 = local21 | local21 >>> 8;
		@Pc(33) int local33 = local27 | local27 >>> 16;
		return arg0 & ~local33;
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(Lclient!yf;I)V", line = 201)
	static void method29539(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class316.method27380();
	}

	@OriginalMember(owner = "client!pf", name = "hb", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5852)
	static final void method29540(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3888 = -1284996546;
		arg0.aClass328_2 = null;
		arg0.anInt3889 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 931070365;
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class623.method32473(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!pf", name = "zi", descriptor = "(Lclient!yf;I)V", line = 9180)
	static final void method29541(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class254) client.aClass243_1.method26027().get(local12)).method26196();
	}

	@OriginalMember(owner = "client!pf", name = "ahx", descriptor = "(Lclient!yf;I)V", line = 10698)
	static final void method29542(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class136.method13911(local12);
		if (local15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3008 * 36458189 - local15.anInt3003 * -192382841;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15.anInt3010 * 189160645 - local15.anInt3009 * -1004159431;
		}
	}
}
