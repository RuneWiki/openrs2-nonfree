package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gr")
public class Class282 implements Interface75 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "Lclient!gr;")
	public static final Class282 aClass282_4 = new Class282(0, 0);

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Lclient!gr;")
	public static final Class282 aClass282_2 = new Class282(1, 1);

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "Lclient!gr;")
	public static final Class282 aClass282_3 = new Class282(2, 2);

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	final int anInt3963;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	final int anInt3962;

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "()[Lclient!gr;", line = 17)
	public static Class282[] method26689() {
		return new Class282[] { aClass282_4, aClass282_2, aClass282_3 };
	}

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "(I)[Lclient!gr;", line = 17)
	public static Class282[] method26690() {
		return new Class282[] { aClass282_4, aClass282_2, aClass282_3 };
	}

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "()[Lclient!gr;", line = 17)
	public static Class282[] method26691() {
		return new Class282[] { aClass282_4, aClass282_2, aClass282_3 };
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(II)V", line = 20)
	Class282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3963 = arg0 * 893126787;
		this.anInt3962 = arg1 * -1814765471;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "()I", line = 26)
	@Override
	public int method36479() {
		return this.anInt3962 * 1616233377;
	}

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "()I", line = 26)
	@Override
	public int method36478() {
		return this.anInt3962 * 1616233377;
	}

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "()I", line = 26)
	@Override
	public int method36477() {
		return this.anInt3962 * 1616233377;
	}

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "(Lclient!yf;B)V", line = 29)
	static void method26692(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1])).aBoolean695 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "(B)[Lclient!ub;", line = 67)
	static Class571[] method26693() {
		return new Class571[] { Class571.aClass571_2, Class571.aClass571_3 };
	}

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "(ZI)V", line = 90)
	public static void method26694(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gr", name = "aq", descriptor = "(Lclient!yf;I)V", line = 4513)
	static final void method26695(@OriginalArg(0) Class665 arg0) {
		@Pc(7) int local7 = arg0.anIntArray535[arg0.anInt5786 * 662605117];
		@Pc(11) Class77_Sub1_Sub9 local11 = Class257.method26225(local7);
		if (local11 == null) {
			throw new RuntimeException();
		}
		@Pc(24) int[] local24 = new int[local11.anInt3012 * -39710947];
		@Pc(30) Object[] local30 = new Object[local11.anInt3013 * 1127446605];
		@Pc(36) long[] local36 = new long[local11.anInt3015 * -2103375343];
		@Pc(38) int local38;
		for (local38 = 0; local38 < local11.anInt3014 * 1952656637; local38++) {
			local24[local38] = arg0.anIntArray536[arg0.anInt5784 * 2088438307 - local11.anInt3014 * 1952656637 + local38];
		}
		for (local38 = 0; local38 < local11.anInt3016 * -64543921; local38++) {
			local30[local38] = arg0.anObjectArray45[local38 + (arg0.anInt5781 * 1485266147 - local11.anInt3016 * -64543921)];
		}
		for (local38 = 0; local38 < local11.anInt3011 * 590462703; local38++) {
			local36[local38] = arg0.aLongArray28[local38 + (arg0.anInt5782 * 1572578961 - local11.anInt3011 * 590462703)];
		}
		arg0.anInt5784 -= local11.anInt3014 * -2035708321;
		arg0.anInt5781 -= local11.anInt3016 * 2048309157;
		arg0.anInt5782 -= local11.anInt3011 * 2134429055;
		@Pc(148) Class654 local148 = new Class654();
		local148.aClass77_Sub1_Sub9_1 = arg0.aClass77_Sub1_Sub9_2;
		local148.anInt5765 = arg0.anInt5786 * -299918763;
		local148.anIntArray530 = arg0.anIntArray537;
		local148.anObjectArray44 = arg0.anObjectArray46;
		local148.aLongArray26 = arg0.aLongArray27;
		if (arg0.anInt5783 * -1712769137 >= arg0.aClass654Array1.length) {
			throw new RuntimeException();
		}
		arg0.aClass654Array1[(arg0.anInt5783 += 417597295) * -1712769137 - 1] = local148;
		arg0.aClass77_Sub1_Sub9_2 = local11;
		arg0.aClass520Array2 = arg0.aClass77_Sub1_Sub9_2.aClass520Array1;
		arg0.anIntArray535 = arg0.aClass77_Sub1_Sub9_2.anIntArray281;
		arg0.anInt5786 = 793595371;
		arg0.anIntArray537 = local24;
		arg0.anObjectArray46 = local30;
		arg0.aLongArray27 = local36;
	}

	@OriginalMember(owner = "client!gr", name = "ke", descriptor = "(Lclient!yf;I)V", line = 6497)
	static final void method26696(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		Class655.method33010(local16, arg0);
	}
}
