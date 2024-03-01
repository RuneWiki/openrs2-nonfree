package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public class Class502 {

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!uh;")
	public static final Class502 aClass502_13 = new Class502(0, 2, 2, 1);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "Lclient!uh;")
	public static final Class502 aClass502_2 = new Class502(1, 2, 2, 0);

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!uh;")
	static final Class502 aClass502_3 = new Class502(2, 4, 4, 0);

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "Lclient!uh;")
	static final Class502 aClass502_14 = new Class502(4, 1, 1, 1);

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!uh;")
	public static final Class502 aClass502_4 = new Class502(6, 0, 4, 2);

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Lclient!uh;")
	public static final Class502 aClass502_5 = new Class502(7, 0, 1, 1);

	@OriginalMember(owner = "client!uh", name = "s", descriptor = "Lclient!uh;")
	static final Class502 aClass502_6 = new Class502(8, 0, 4, 1);

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "Lclient!uh;")
	static final Class502 aClass502_8 = new Class502(9, 0, 4, 1);

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Lclient!uh;")
	public static final Class502 aClass502_7 = new Class502(10, 2, 2, 0);

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "Lclient!uh;")
	public static final Class502 aClass502_1 = new Class502(11, 0, 1, 2);

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!uh;")
	static final Class502 aClass502_9 = new Class502(12, 0, 1, 0);

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "Lclient!uh;")
	static final Class502 aClass502_10 = new Class502(13, 0, 1, 0);

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Lclient!uh;")
	static final Class502 aClass502_11 = new Class502(14, 0, 4, 1);

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!uh;")
	static final Class502 aClass502_12 = new Class502(15, 0, 1, 0);

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
	public int anInt5248;

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
	public int anInt5247;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
	public int anInt5249;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
	public int anInt5246;

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "(I)[Lclient!cx;", line = 19)
	static Class122[] method29460() {
		return new Class122[] { Class122.aClass122_1, Class122.aClass122_4, Class122.aClass122_2, Class122.aClass122_6, Class122.aClass122_7, Class122.aClass122_5, Class122.aClass122_3 };
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IIII)V", line = 28)
	Class502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5248 = arg0 * 1712108645;
		this.anInt5247 = arg1 * -262414135;
		this.anInt5249 = arg2 * 1097809911;
		this.anInt5246 = arg3 * 1131797741;
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)Lclient!uh;", line = 36)
	public static Class502 method29456(@OriginalArg(0) int arg0) {
		@Pc(2) Class502[] local2 = Class196.method24111();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (arg0 == local2[local4].anInt5248 * 1303174509) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "(I)Lclient!uh;", line = 36)
	public static Class502 method29457(@OriginalArg(0) int arg0) {
		@Pc(2) Class502[] local2 = Class196.method24111();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (arg0 == local2[local4].anInt5248 * 1303174509) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uh", name = "gp", descriptor = "(I)V", line = 2524)
	static final void method29462() {
		Class555.aClass499_5.method29367();
		Class598.aClass575_5.method33139();
		Class585.aClass228_2.method24512();
		client.aClass370_1.method26954().method28495();
		Class498.aClass579_1.method33187();
		Class44_Sub3.aClass596_1.method33444();
		Class110.aClass436_1.method28007();
		Class19.aClass523_14.method29825();
		Class308.aClass70_Sub2_3.method33889();
		Class429.aClass70_Sub1_Sub1_2.method14254();
		Class419.aClass70_Sub1_Sub2_11.method14737();
		Class69.aClass70_Sub1_Sub2_9.method14737();
		Class135.aClass70_Sub1_Sub2_10.method14737();
		Class399.aClass428_1.method27918();
		Class342.aClass629_3.method33838();
		Class107.aClass454_3.method28440();
		Class3_Sub20.aClass625_1.method33786();
		Class369.aClass413_1.method27714();
		Class375.aClass200_1.method24138();
		Class16.aClass616_3.method33689();
		FileFilter_Sub1.aClass597_1.method33469();
		Class284.aClass465_1.method28637();
		Class623.aClass415_2.method27757();
		Class341.method26461();
		Class44_Sub2.method15143();
		Class379.aClass312_1.method25790();
		Class11.method1215();
		Class52.method9918();
		client.aClass161_14.method23245();
		client.aClass161_15.method23245();
		Class250.aClass161_30.method23245();
		Class525.aClass161_61.method23245();
		client.aClass161_16.method23245();
	}

	@OriginalMember(owner = "client!uh", name = "cx", descriptor = "(Lclient!vs;I)V", line = 4480)
	static final void method29458(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class403.method27631(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!uh", name = "qs", descriptor = "(Lclient!vs;I)V", line = 6973)
	static final void method29461(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3513 * -2138884745 == 1 ? local11.anInt3514 * -472903775 : -1;
	}

	@OriginalMember(owner = "client!uh", name = "aua", descriptor = "(Lclient!vs;I)V", line = 12497)
	static final void method29459(@OriginalArg(0) Class536 arg0) {
		arg0.aClass26_Sub1_Sub1_Sub1_4.method16692(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}
}
