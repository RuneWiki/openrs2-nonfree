package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public class Class315 {

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static final int anInt4537 = 5;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static final int anInt4538 = 2;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public static final int anInt4539 = 1;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static final int anInt4540 = 4;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static final int anInt4541 = 6;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	public static final int anInt4542 = 3;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 11)
	Class315() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!mc", name = "fu", descriptor = "(ILjava/lang/String;ZI)V", line = 1962)
	public static void method25834(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		if (arg0 == 0) {
			Class613.aClass21_13 = Class544.method32605(0, Class106.aCanvas6, Class43_Sub5.aClass134_5, Class325.anInterface11_9, Class127.aClass359_33, Class510.aClass3_Sub45_37.aClass60_Sub27_2.method13857() * 2);
			if (arg1 != null) {
				Class613.aClass21_13.method17061(1, 0);
				@Pc(29) Class611 local29 = Class457.method28517(Class475.aClass359_86, Class568.anInt5372 * -349930659, 0);
				@Pc(42) Class14 local42 = Class613.aClass21_13.method17096(local29, (Class15_Sub1[]) Class137.method22942(Class294.aClass359_54, Class568.anInt5372 * -349930659, 0), true);
				Class199.method24133();
				Class250.method25081(arg1, true, Class613.aClass21_13, local42, local29);
			}
		} else {
			label245: {
				@Pc(54) Class21 local54 = null;
				if (arg1 != null) {
					local54 = Class544.method32605(0, Class106.aCanvas6, Class43_Sub5.aClass134_5, Class325.anInterface11_9, Class127.aClass359_33, 0);
					local54.method17061(1, 0);
					@Pc(78) Class611 local78 = Class457.method28517(Class475.aClass359_86, Class568.anInt5372 * -349930659, 0);
					@Pc(91) Class14 local91 = local54.method17096(local78, (Class15_Sub1[]) Class137.method22942(Class294.aClass359_54, Class568.anInt5372 * -349930659, 0), true);
					Class199.method24133();
					Class250.method25081(arg1, true, local54, local91, local78);
					try {
						local54.method17020();
						local54 = null;
					} catch (@Pc(107) Throwable local107) {
					}
				}
				try {
					try {
						Class47_Sub1.method8801();
						System.gc();
						Class613.aClass21_13 = Class544.method32605(arg0, Class106.aCanvas6, Class43_Sub5.aClass134_5, Class325.anInterface11_9, Class127.aClass359_33, Class510.aClass3_Sub45_37.aClass60_Sub27_2.method13857() * 2);
						if (Class613.aClass21_13.method17231()) {
							@Pc(129) boolean local129 = true;
							try {
								local129 = Class298.aClass3_Sub47_1.anInt1811 * 573273029 > 256;
							} catch (@Pc(141) Throwable local141) {
							}
							@Pc(147) Class3_Sub11 local147;
							if (local129) {
								local147 = Class613.aClass21_13.method17348(146800640);
							} else {
								local147 = Class613.aClass21_13.method17348(104857600);
							}
							Class613.aClass21_13.method17084(local147);
						}
						break label245;
					} catch (@Pc(165) Throwable local165) {
						switch(arg0) {
							case 1:
								Class10.method715(Class600.aClass600_4);
								break;
							case 3:
								Class10.method715(Class600.aClass600_9);
						}
					}
					if (local165 instanceof RuntimeException_Sub2) {
						Class510.aClass3_Sub45_37.aClass60_Sub27_1.method14598(0);
						Class510.aClass3_Sub45_37.aClass60_Sub27_2.method14598(0);
					}
					@Pc(192) int local192 = Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373();
					Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_2, 0);
					if (local54 != null) {
						try {
							local54.method17020();
							local54 = null;
						} catch (@Pc(208) Throwable local208) {
						}
					}
					Class47_Sub1.method8801();
					System.gc();
					method25834(local192, arg1, arg2);
				} finally {
					if (local54 != null) {
						try {
							local54.method17020();
						} catch (@Pc(234) Throwable local234) {
						}
					}
				}
				return;
			}
		}
		if (arg2) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, !arg2);
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_2, arg0);
		if (!arg2) {
			Class510.aClass3_Sub45_37.method13000(Class510.aClass3_Sub45_37.aClass60_Sub10_2, !arg2);
		}
		Class108.method21942();
		Class613.aClass21_13.method17343(20000);
		Class613.aClass21_13.method17412(32);
		client.aClass370_1.method26976();
		if (Class613.aClass21_13.method17166()) {
			Class61_Sub1.method12789(Class510.aClass3_Sub45_37.aClass60_Sub29_1.method13917() == 1);
		}
		client.aClass370_1.method26938();
		client.aClass370_1.method26953().method28901();
		Class3_Sub35_Sub1.method18870();
		client.aBoolean573 = false;
		client.aBoolean606 = true;
		Class528.aClass573Array1 = null;
		Class613.aClass21_13.method17055(0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!mc", name = "cl", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4430)
	static final void method25831(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean629 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
	}

	@OriginalMember(owner = "client!mc", name = "sx", descriptor = "(Lclient!vs;B)V", line = 7362)
	static final void method25832(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3513 * -2138884745 == 1 ? local16.anInt3514 * -472903775 : -1;
	}

	@OriginalMember(owner = "client!mc", name = "vu", descriptor = "(Lclient!vs;I)V", line = 7960)
	static final void method25833(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2391 * -841431615;
	}
}
