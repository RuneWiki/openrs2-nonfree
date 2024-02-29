package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xb")
public class Class638 {

	@OriginalMember(owner = "client!xb", name = "wo", descriptor = "Lclient!f;")
	public static Class240 aClass240_1;

	@OriginalMember(owner = "client!xb", name = "p", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_3 = new Class638(0, 2, 2, 1);

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_6 = new Class638(1, 2, 2, 0);

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "Lclient!xb;")
	static final Class638 aClass638_14 = new Class638(2, 4, 4, 0);

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "Lclient!xb;")
	static final Class638 aClass638_4 = new Class638(4, 1, 1, 1);

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_1 = new Class638(6, 0, 4, 2);

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_10 = new Class638(7, 0, 1, 1);

	@OriginalMember(owner = "client!xb", name = "t", descriptor = "Lclient!xb;")
	static final Class638 aClass638_7 = new Class638(8, 0, 4, 1);

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "Lclient!xb;")
	static final Class638 aClass638_2 = new Class638(9, 0, 4, 1);

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_9 = new Class638(10, 2, 2, 0);

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_8 = new Class638(11, 0, 1, 2);

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "Lclient!xb;")
	static final Class638 aClass638_11 = new Class638(12, 0, 1, 0);

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "Lclient!xb;")
	static final Class638 aClass638_12 = new Class638(13, 0, 1, 0);

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "Lclient!xb;")
	static final Class638 aClass638_13 = new Class638(14, 0, 4, 1);

	@OriginalMember(owner = "client!xb", name = "z", descriptor = "Lclient!xb;")
	static final Class638 aClass638_5 = new Class638(15, 0, 1, 0);

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "Lclient!xb;")
	public static final Class638 aClass638_15 = new Class638(16, 0, 4, 2);

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	public int anInt5714;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	public int anInt5715;

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "I")
	public int anInt5716;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	public int anInt5717;

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "()[Lclient!xb;", line = 26)
	static Class638[] method32714() {
		return new Class638[] { aClass638_2, aClass638_9, aClass638_4, aClass638_11, aClass638_12, aClass638_3, aClass638_15, aClass638_7, aClass638_5, aClass638_14, aClass638_10, aClass638_13, aClass638_6, aClass638_8, aClass638_1 };
	}

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "()[Lclient!xb;", line = 26)
	static Class638[] method32715() {
		return new Class638[] { aClass638_2, aClass638_9, aClass638_4, aClass638_11, aClass638_12, aClass638_3, aClass638_15, aClass638_7, aClass638_5, aClass638_14, aClass638_10, aClass638_13, aClass638_6, aClass638_8, aClass638_1 };
	}

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "(IIII)V", line = 29)
	Class638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5714 = arg0 * -903382041;
		this.anInt5715 = arg1 * -1993371159;
		this.anInt5716 = arg2 * -1939226833;
		this.anInt5717 = arg3 * -1403162539;
	}

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "(I)Lclient!xb;", line = 37)
	public static Class638 method32716(@OriginalArg(0) int arg0) {
		@Pc(2) Class638[] local2 = Class311.method27295();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (local2[local4].anInt5714 * 41641943 == arg0) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "(IZIZB)V", line = 109)
	public static void method32717(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		Class12.method196(0, Class8.aClass145_Sub1Array1.length - 1, arg0, arg1, arg2, arg3);
		Class8.anInt28 = 0;
		Class8.aClass639_1 = null;
	}

	@OriginalMember(owner = "client!xb", name = "hz", descriptor = "(I)V", line = 3756)
	public static final void method32718() {
		for (@Pc(1) int local1 = 0; local1 < 5; local1++) {
			client.aBooleanArray16[local1] = false;
		}
		client.anInt3441 = 1871523627;
		client.anInt3442 = -378787251;
		Class56.anInt190 = 0;
		Class250.anInt3805 = 0;
		Class11.anInt36 = 1952677974;
		if (Class96_Sub6.method7162() == 3) {
			@Pc(28) Class595 local28 = client.aClass517_1.method30409();
			@Pc(35) int local35 = local28.anInt5504 * -424199969 << 9;
			@Pc(42) int local42 = local28.anInt5506 * -1166289421 << 9;
			@Pc(47) int local47 = 1000 / Class475.method29690();
			Class597.aClass107_Sub1_2.method8778((float) local47 / 1000.0F, client.aClass517_1.method30459().anIntArrayArrayArray14, client.aClass517_1.method30441(), local35, local42);
		}
		Class142.anInt2017 = 309821991;
		Class70.anInt203 = 1899572639;
		client.anInt3521 = client.anInt3414 * -1427605517;
		Class559.anInt5280 = Class96_Sub13.anInt883 * 1813674585;
		Class19.anInt109 = Class672.anInt5796 * -410893275;
		Class255.anInt3806 = Class633.anInt5710 * -1314647103;
		Class485.anInt5038 = Class565.anInt5338 * -196476289;
		Class55.anInt187 = Class639.anInt5720 * -2138584449;
		Class27.anInt125 = client.anInt3528 * 368642879;
	}

	@OriginalMember(owner = "client!xb", name = "he", descriptor = "(Lclient!agh;[I[I[IB)V", line = 4312)
	public static void method32719(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(9) int local9 = arg1[local1];
			@Pc(13) int local13 = arg3[local1];
			@Pc(17) int local17 = arg2[local1];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && local19 < arg0.aClass151_Sub3_Sub1Array3.length) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass151_Sub3_Sub1Array3[local19] = null;
					} else {
						@Pc(46) Class234 local46 = (Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local9);
						@Pc(51) int local51 = local46.anInt3773 * 629077835;
						@Pc(56) Class151_Sub3_Sub1 local56 = arg0.aClass151_Sub3_Sub1Array3[local19];
						if (local56 != null && local56.method23396()) {
							if (local9 == local56.method23399()) {
								if (local51 == 0) {
									arg0.aClass151_Sub3_Sub1Array3[local19] = null;
									local56 = null;
								} else if (local51 == 1) {
									local56.method23457();
									local56.anInt3164 = local17 * -1464312229;
								} else if (local51 == 2) {
									local56.method23450();
								}
							} else if (local46.anInt3768 * 995056269 >= local56.method23398().anInt3768 * 995056269) {
								arg0.aClass151_Sub3_Sub1Array3[local19] = null;
								local56 = null;
							}
						}
						if (local56 == null || !local56.method23396()) {
							local56 = arg0.aClass151_Sub3_Sub1Array3[local19] = new Class151_Sub3_Sub1(arg0);
							local56.method23401(local9);
							local56.anInt3164 = local17 * -1464312229;
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!xb", name = "sn", descriptor = "(Lclient!yf;I)V", line = 7912)
	static final void method32720(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3932 * 1797197351;
	}

	@OriginalMember(owner = "client!xb", name = "tl", descriptor = "(Lclient!yf;I)V", line = 8155)
	static final void method32721(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(19) Class77_Sub20 local19 = Class365.method28132(Class414.aClass414_54, client.aClass82_2.aClass16_1);
		local19.aClass77_Sub39_Sub1_2.method22403(local13.length() + 1);
		local19.aClass77_Sub39_Sub1_2.method22440(local13);
		client.aClass82_2.method2004(local19);
	}

	@OriginalMember(owner = "client!xb", name = "ais", descriptor = "(Lclient!yf;B)V", line = 10875)
	static final void method32722(@OriginalArg(0) Class665 arg0) {
		Class151.method23482(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}
}
