package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public class Class192 implements Interface75 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Ljava/lang/String;")
	static String aString165;

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "Lclient!dp;")
	static Class209 aClass209_10;

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "Lclient!cm;")
	static final Class192 aClass192_5 = new Class192(1, 1);

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!cm;")
	static final Class192 aClass192_2 = new Class192(5, 2);

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "Lclient!cm;")
	static final Class192 aClass192_3 = new Class192(6, 3);

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!cm;")
	static final Class192 aClass192_4 = new Class192(2, 4);

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "Lclient!cm;")
	static final Class192 aClass192_1 = new Class192(0, 5);

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "Lclient!cm;")
	static final Class192 aClass192_6 = new Class192(4, 6);

	@OriginalMember(owner = "client!cm", name = "t", descriptor = "Lclient!cm;")
	static final Class192 aClass192_7 = new Class192(3, 7);

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
	final int anInt3544;

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
	final int anInt3545;

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "()[Lclient!cm;", line = 19)
	static Class192[] method25431() {
		return new Class192[] { aClass192_6, aClass192_5, aClass192_3, aClass192_2, aClass192_4, aClass192_7, aClass192_1 };
	}

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "()[Lclient!cm;", line = 19)
	static Class192[] method25432() {
		return new Class192[] { aClass192_6, aClass192_5, aClass192_3, aClass192_2, aClass192_4, aClass192_7, aClass192_1 };
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)Ljava/lang/String;", line = 21)
	public static String method25433(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(II)V", line = 22)
	Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3544 = arg0 * -186174197;
		this.anInt3545 = arg1 * 1676989923;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "()I", line = 28)
	@Override
	public int method36479() {
		return this.anInt3545 * 88152011;
	}

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method36478() {
		return this.anInt3545 * 88152011;
	}

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "()I", line = 28)
	@Override
	public int method36477() {
		return this.anInt3545 * 88152011;
	}

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "(IIIILclient!aah;ZI)V", line = 111)
	static void method25434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) boolean arg5) {
		@Pc(8) long local8 = (long) (arg0 | (arg5 ? Integer.MIN_VALUE : 0));
		@Pc(13) Class77_Sub7 local13 = (Class77_Sub7) Class77_Sub7.aClass12_10.method173(local8);
		if (local13 == null) {
			local13 = new Class77_Sub7();
			Class77_Sub7.aClass12_10.method184(local13, local8);
		}
		if (local13.anIntArray192.length <= arg1) {
			@Pc(33) int[] local33 = new int[arg1 + 1];
			@Pc(38) int[] local38 = new int[arg1 + 1];
			@Pc(40) Class9[] local40 = null;
			if (local13.aClass9Array1 != null) {
				local40 = new Class9[arg1 + 1];
			}
			@Pc(51) int local51;
			for (local51 = 0; local51 < local13.anIntArray192.length; local51++) {
				local33[local51] = local13.anIntArray192[local51];
				local38[local51] = local13.anIntArray193[local51];
				if (local13.aClass9Array1 != null) {
					local40[local51] = local13.aClass9Array1[local51];
				}
			}
			for (local51 = local13.anIntArray192.length; local51 < arg1; local51++) {
				local33[local51] = -1;
				local38[local51] = 0;
			}
			local13.anIntArray192 = local33;
			local13.anIntArray193 = local38;
			local13.aClass9Array1 = local40;
		}
		local13.anIntArray192[arg1] = arg2;
		local13.anIntArray193[arg1] = arg3;
		if (arg4 != null) {
			if (local13.aClass9Array1 == null) {
				local13.aClass9Array1 = new Class9[local13.anIntArray192.length];
			}
			local13.aClass9Array1[arg1] = arg4;
		} else if (local13.aClass9Array1 != null) {
			local13.aClass9Array1[arg1] = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "dz", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5079)
	static final void method25435(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3888 = -214166091;
		arg0.anInt3889 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * 931070365;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class623.method32473(arg0.anInt3863 * -1278450723);
		}
	}
}
