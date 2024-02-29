package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ain")
public class Class131_Sub2 extends Class131 {

	@OriginalMember(owner = "client!ain", name = "l", descriptor = "Lclient!ain;")
	public Class131_Sub2 aClass131_Sub2_5;

	@OriginalMember(owner = "client!ain", name = "v", descriptor = "Lclient!ain;")
	public Class131_Sub2 aClass131_Sub2_6;

	@OriginalMember(owner = "client!ain", name = "y", descriptor = "(I)V", line = 8)
	public void method23065() {
		if (this.aClass131_Sub2_5 != null) {
			this.aClass131_Sub2_5.aClass131_Sub2_6 = this.aClass131_Sub2_6;
			this.aClass131_Sub2_6.aClass131_Sub2_5 = this.aClass131_Sub2_5;
			this.aClass131_Sub2_6 = null;
			this.aClass131_Sub2_5 = null;
		}
	}

	@OriginalMember(owner = "client!ain", name = "w", descriptor = "()V", line = 8)
	public void method23066() {
		if (this.aClass131_Sub2_5 != null) {
			this.aClass131_Sub2_5.aClass131_Sub2_6 = this.aClass131_Sub2_6;
			this.aClass131_Sub2_6.aClass131_Sub2_5 = this.aClass131_Sub2_5;
			this.aClass131_Sub2_6 = null;
			this.aClass131_Sub2_5 = null;
		}
	}

	@OriginalMember(owner = "client!ain", name = "t", descriptor = "()V", line = 8)
	public void method23067() {
		if (this.aClass131_Sub2_5 != null) {
			this.aClass131_Sub2_5.aClass131_Sub2_6 = this.aClass131_Sub2_6;
			this.aClass131_Sub2_6.aClass131_Sub2_5 = this.aClass131_Sub2_5;
			this.aClass131_Sub2_6 = null;
			this.aClass131_Sub2_5 = null;
		}
	}

	@OriginalMember(owner = "client!ain", name = "s", descriptor = "(Lclient!akv;B)Lclient!mq;", line = 14)
	public static Class118 method23068(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(4) Class118_Sub1 local4 = (Class118_Sub1) Class35.method18320(arg0);
		@Pc(8) int local8 = arg0.method22487();
		return new Class118_Sub1_Sub1(local4.aClass410_8, local4.aClass402_8, local4.anInt2926 * -2127596367, local4.anInt2920 * -1055236307, local4.anInt2922 * -1607607997, local4.anInt2923 * -228886179, local4.anInt2924 * -81046249, local4.anInt2925 * -120853723, local4.anInt2921 * 1210620409, local4.anInt2928 * 1333388775, local4.anInt2927 * -2081665769, local4.anInt2932 * 845449995, local4.anInt2930 * -773478983, local4.anInt2931 * -1674677163, local4.anInt2929 * 2123496001, local8);
	}

	@OriginalMember(owner = "client!ain", name = "j", descriptor = "(Lclient!dx;IILclient!gm;Lclient!cd;III)V", line = 519)
	static void method23069(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class277 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3527 * -1125820437; local1++) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173((long) client.anIntArray317[local1]);
			if (local14 != null) {
				@Pc(20) Class104_Sub1_Sub1_Sub1_Sub1 local20 = (Class104_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method19824() && local20.aByte100 == Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100) {
					@Pc(32) Class333 local32 = local20.aClass333_1;
					if (local32 != null && local32.anIntArray437 != null) {
						local32 = local32.method27642(Class55.aClass124_1, Class55.aClass124_1);
					}
					if (local32 != null && local32.aBoolean712 && local32.aBoolean714) {
						@Pc(57) Class447 local57 = local20.method24085().aClass447_61;
						@Pc(67) int local67 = (int) local57.aFloat277 / 128 - arg1 / 128;
						@Pc(77) int local77 = (int) local57.aFloat278 / 128 - arg2 / 128;
						if (local32.anInt4124 * -161851867 == -1) {
							Class276.method26567(arg3, arg4, arg5, arg6, local67, local77, Class611.aClass83Array10[1]);
						} else {
							Class212.method25610(arg0, arg4, arg3, arg5, arg6, local67, local77, local32.anInt4124 * -161851867);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ain", name = "axp", descriptor = "(Lclient!yf;B)V", line = 13414)
	static final void method23070(@OriginalArg(0) Class665 arg0) {
		client.aBoolean622 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		if (client.aBoolean622) {
			Class510.method30292();
		}
	}
}
