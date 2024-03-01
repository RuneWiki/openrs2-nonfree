package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yj")
public class Class600 implements Interface56 {

	@OriginalMember(owner = "client!yj", name = "p", descriptor = "Lclient!yj;")
	static final Class600 aClass600_11 = new Class600(0);

	@OriginalMember(owner = "client!yj", name = "a", descriptor = "Lclient!yj;")
	static final Class600 aClass600_2 = new Class600(1);

	@OriginalMember(owner = "client!yj", name = "g", descriptor = "Lclient!yj;")
	static final Class600 aClass600_3 = new Class600(2);

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_4 = new Class600(3);

	@OriginalMember(owner = "client!yj", name = "h", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_9 = new Class600(4);

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "Lclient!yj;")
	static final Class600 aClass600_6 = new Class600(5);

	@OriginalMember(owner = "client!yj", name = "s", descriptor = "Lclient!yj;")
	static final Class600 aClass600_7 = new Class600(6);

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "Lclient!yj;")
	static final Class600 aClass600_8 = new Class600(7);

	@OriginalMember(owner = "client!yj", name = "y", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_5 = new Class600(8);

	@OriginalMember(owner = "client!yj", name = "b", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_15 = new Class600(9);

	@OriginalMember(owner = "client!yj", name = "c", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_10 = new Class600(10);

	@OriginalMember(owner = "client!yj", name = "z", descriptor = "Lclient!yj;")
	static final Class600 aClass600_12 = new Class600(11);

	@OriginalMember(owner = "client!yj", name = "j", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_13 = new Class600(12);

	@OriginalMember(owner = "client!yj", name = "n", descriptor = "Lclient!yj;")
	public static final Class600 aClass600_14 = new Class600(13);

	@OriginalMember(owner = "client!yj", name = "e", descriptor = "I")
	final int anInt5522;

	@OriginalMember(owner = "client!yj", name = "<init>", descriptor = "(I)V", line = 22)
	Class600(@OriginalArg(0) int arg0) {
		this.anInt5522 = arg0 * -1113912639;
	}

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "()I", line = 27)
	@Override
	public int method33767() {
		return this.anInt5522 * 1309443393;
	}

	@OriginalMember(owner = "client!yj", name = "a", descriptor = "(I)I", line = 27)
	@Override
	public int method33765() {
		return this.anInt5522 * 1309443393;
	}

	@OriginalMember(owner = "client!yj", name = "h", descriptor = "()I", line = 27)
	@Override
	public int method33766() {
		return this.anInt5522 * 1309443393;
	}

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "()I", line = 27)
	@Override
	public int method33764() {
		return this.anInt5522 * 1309443393;
	}

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "(IIB)V", line = 377)
	static void method33509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class250.anInt3810 * 1646436957 == 1) {
			Class396.method27512(Class141.aClass3_Sub1_Sub7_2, arg0, arg1);
		} else if (Class250.anInt3810 * 1646436957 == 2) {
			Class210.method24249(arg0, arg1);
		}
		Class250.anInt3810 = 0;
		Class141.aClass3_Sub1_Sub7_2 = null;
	}

	@OriginalMember(owner = "client!yj", name = "aet", descriptor = "(Lclient!vs;I)V", line = 9783)
	static final void method33508(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.aClass283_1.anIntArray410[local13] = local23;
	}

	@OriginalMember(owner = "client!yj", name = "kc", descriptor = "([Lclient!fo;IB)V", line = 11009)
	static final void method33510(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class178 local9 = arg0[local1];
			if (local9 != null) {
				if (local9.anInt3492 * -107621169 == 0) {
					if (local9.aClass178Array6 != null) {
						method33510(local9.aClass178Array6, arg1);
					}
					@Pc(36) Class3_Sub42 local36 = (Class3_Sub42) client.aClass581_22.method33217((long) (local9.anInt3570 * 954808515));
					if (local36 != null) {
						Class60_Sub15.method13525(local36.anInt2796 * 1705574607, arg1);
					}
				}
				@Pc(56) Class3_Sub17 local56;
				if (arg1 == 0 && local9.anObjectArray35 != null) {
					local56 = new Class3_Sub17();
					local56.aClass178_2 = local9;
					local56.anObjectArray1 = local9.anObjectArray35;
					Class410.method27671(local56);
				}
				if (arg1 == 1 && local9.anObjectArray5 != null) {
					if (local9.anInt3491 * 18828465 >= 0) {
						@Pc(84) Class178 local84 = Class375.method27235(local9.anInt3570 * 954808515);
						if (local84 == null || local84.aClass178Array5 == null || local9.anInt3491 * 18828465 >= local84.aClass178Array5.length || local9 != local84.aClass178Array5[local9.anInt3491 * 18828465]) {
							continue;
						}
					}
					local56 = new Class3_Sub17();
					local56.aClass178_2 = local9;
					local56.anObjectArray1 = local9.anObjectArray5;
					Class410.method27671(local56);
				}
			}
		}
	}
}
