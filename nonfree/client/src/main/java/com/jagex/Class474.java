package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public class Class474 {

	@OriginalMember(owner = "client!tb", name = "fv", descriptor = "Lclient!ny;")
	public static Class359 aClass359_85;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Lclient!tb;")
	public static final Class474 aClass474_4 = new Class474(1);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!tb;")
	static final Class474 aClass474_2 = new Class474(2);

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!tb;")
	static final Class474 aClass474_3 = new Class474(3);

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!tb;")
	public static final Class474 aClass474_1 = new Class474(4);

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "Lclient!tb;")
	static final Class474 aClass474_6 = new Class474(5);

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!tb;")
	static final Class474 aClass474_5 = new Class474(6);

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!tb;")
	static final Class474 aClass474_7 = new Class474(7);

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!tb;")
	static final Class474 aClass474_8 = new Class474(8);

	@OriginalMember(owner = "client!tb", name = "y", descriptor = "Lclient!tb;")
	static final Class474 aClass474_9 = new Class474(9);

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Lclient!tb;")
	static final Class474 aClass474_10 = new Class474(10);

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
	public final int anInt5121;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V", line = 16)
	Class474(@OriginalArg(0) int arg0) {
		this.anInt5121 = arg0 * 1519975979;
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(IILclient!fo;Lclient!fe;IIB)V", line = 566)
	static void method28785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class169 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) Class68[] local1 = client.aClass68Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class68 local11 = local1[local3];
			if (local11 != null && local11.anInt2017 * 207391421 != 0 && client.anInt3034 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt2017 * 207391421 == 1) {
					@Pc(39) Class3_Sub29 local39 = (Class3_Sub29) client.aClass581_21.method33217((long) (local11.anInt2012 * 403468169));
					if (local39 != null) {
						@Pc(45) Class26_Sub1_Sub1_Sub1_Sub1 local45 = (Class26_Sub1_Sub1_Sub1_Sub1) local39.anObject2;
						@Pc(49) Class320 local49 = local45.method21431().aClass320_61;
						local59 = (int) local49.aFloat259 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat261 / 128 - arg1 / 128;
						Class175.method23407(arg2, arg3, arg4, arg5, local59, local69, local11.anInt2010 * 310804535, 360000L);
					}
				}
				if (local11.anInt2017 * 207391421 == 2) {
					@Pc(98) int local98 = local11.anInt2009 * -2046314719 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt2011 * -1644403279 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt2014 * 138848077 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class175.method23407(arg2, arg3, arg4, arg5, local98, local109, local11.anInt2010 * 310804535, local121);
				}
				if (local11.anInt2017 * 207391421 == 10 && local11.anInt2012 * 403468169 >= 0 && local11.anInt2012 * 403468169 < client.aClass26_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class26_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt2012 * 403468169];
					if (local158 != null) {
						@Pc(165) Class320 local165 = local158.method21431().aClass320_61;
						@Pc(175) int local175 = (int) local165.aFloat259 / 128 - arg0 / 128;
						local59 = (int) local165.aFloat261 / 128 - arg1 / 128;
						Class175.method23407(arg2, arg3, arg4, arg5, local175, local59, local11.anInt2010 * 310804535, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "cv", descriptor = "(Lclient!vs;I)V", line = 4423)
	static final void method28784(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class506.method29547(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "ann", descriptor = "(Lclient!vs;B)V", line = 11497)
	static final void method28786(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (local12 != Class510.aClass3_Sub45_37.aClass60_Sub14_1.method13486()) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, local12);
			Class26_Sub1_Sub1_Sub1.method16728();
			client.aBoolean573 = false;
			client.aClass370_1.method26968();
		}
	}
}
