package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public class Class222 implements Interface19 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!yx;")
	public static Class611 aClass611_7;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!kr;")
	final Class286 aClass286_1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!kr;)V", line = 11)
	Class222(@OriginalArg(0) Class286 arg0) {
		this.aClass286_1 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "(Z)V", line = 16)
	@Override
	public void method24605(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class613.aClass21_13.method17050(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, this.aClass286_1.anInt4358 * -464490037, 0);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V", line = 16)
	@Override
	public void method24606(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Class613.aClass21_13.method17050(0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, this.aClass286_1.anInt4358 * -464490037, 0);
		}
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "()V", line = 19)
	@Override
	public void method24609() {
	}

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "(I)V", line = 19)
	@Override
	public void method24604() {
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "()V", line = 19)
	@Override
	public void method24603() {
	}

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "()V", line = 19)
	@Override
	public void method24608() {
	}

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "()V", line = 19)
	@Override
	public void method24607() {
	}

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "()Z", line = 22)
	@Override
	public boolean method24610() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)Z", line = 22)
	@Override
	public boolean method24602() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([[[Lclient!rj;B)V", line = 23)
	static void method24430(@OriginalArg(0) Class432[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class432[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class432 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass26_Sub1_Sub2_1 instanceof Interface43) {
							((Interface43) local29.aClass26_Sub1_Sub2_1).method11148();
						}
						if (local29.aClass26_Sub1_Sub4_2 instanceof Interface43) {
							((Interface43) local29.aClass26_Sub1_Sub4_2).method11148();
						}
						if (local29.aClass26_Sub1_Sub4_1 instanceof Interface43) {
							((Interface43) local29.aClass26_Sub1_Sub4_1).method11148();
						}
						if (local29.aClass26_Sub1_Sub3_1 instanceof Interface43) {
							((Interface43) local29.aClass26_Sub1_Sub3_1).method11148();
						}
						if (local29.aClass26_Sub1_Sub3_2 instanceof Interface43) {
							((Interface43) local29.aClass26_Sub1_Sub3_2).method11148();
						}
						for (@Pc(81) Class437 local81 = local29.aClass437_1; local81 != null; local81 = local81.aClass437_3) {
							@Pc(87) Class26_Sub1_Sub1 local87 = local81.aClass26_Sub1_Sub1_1;
							if (local87 instanceof Interface43) {
								((Interface43) local87).method11148();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "(IIII)I", line = 174)
	public static int method24431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local21 + (((arg0 & 0xFF00FF) * local3 & 0xFF00FF00 | local3 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!hh", name = "el", descriptor = "(Lclient!vs;I)V", line = 4919)
	static final void method24432(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class177.method23423(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hh", name = "sy", descriptor = "(Lclient!vs;B)V", line = 7481)
	static final void method24433(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(15) int local15 = 0;
		if (Class469.method28756(local13)) {
			local15 = Class70.method33883(local13);
		}
		@Pc(29) Class3_Sub23 local29 = Class269.method25284(Class311.aClass311_23, client.aClass82_2.aClass577_2);
		local29.aClass3_Sub41_Sub1_1.method20254(local15);
		client.aClass82_2.method21601(local29);
	}

	@OriginalMember(owner = "client!hh", name = "ajg", descriptor = "(Lclient!vs;I)V", line = 10723)
	static final void method24434(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(21) Class320 local21 = Class320.method25891((float) local13, (float) local13, (float) local13);
		Class80.aClass23_Sub1_1.method5813(local21);
		local21.method25874();
	}
}
