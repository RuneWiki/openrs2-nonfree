package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public class Class536 {

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "[I")
	int[] anIntArray494;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray41;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	int anInt5314;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "[J")
	long[] aLongArray17;

	@OriginalMember(owner = "client!vs", name = "ah", descriptor = "Lclient!amj;")
	Class3_Sub1_Sub6 aClass3_Sub1_Sub6_2;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "Z")
	boolean aBoolean822;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Lclient!ko;")
	Class283 aClass283_1;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Lclient!ago;")
	Class3_Sub30 aClass3_Sub30_3;

	@OriginalMember(owner = "client!vs", name = "v", descriptor = "Lclient!act;")
	Class26_Sub1_Sub1_Sub1 aClass26_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Lclient!pp;")
	Interface43 anInterface43_1;

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Lclient!aow;")
	Class26_Sub1_Sub5_Sub1 aClass26_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Lclient!iu;")
	Class245 aClass245_4;

	@OriginalMember(owner = "client!vs", name = "at", descriptor = "Lclient!k;")
	Class269 aClass269_2;

	@OriginalMember(owner = "client!vs", name = "af", descriptor = "[I")
	int[] anIntArray497;

	@OriginalMember(owner = "client!vs", name = "ak", descriptor = "[Lclient!pc;")
	Class385[] aClass385Array2;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "[I")
	int[] anIntArray495 = new int[5];

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "[[I")
	int[][] anIntArrayArray62 = new int[5][5000];

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "[I")
	int[] anIntArray496 = new int[1000];

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	int anInt5319 = 0;

	@OriginalMember(owner = "client!vs", name = "y", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray42 = new Object[1000];

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	int anInt5315 = 0;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "[J")
	long[] aLongArray18 = new long[1000];

	@OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
	int anInt5316 = 0;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	int anInt5317 = 0;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "[Lclient!up;")
	Class509[] aClass509Array1 = new Class509[50];

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!vq;")
	Class534 aClass534_1 = new Class534();

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "Lclient!vq;")
	Class534 aClass534_2 = new Class534();

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "Ljava/util/Map;")
	Map aMap15 = new HashMap();

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Ljava/util/Map;")
	Map aMap16 = new HashMap();

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	int anInt5313 = 0;

	@OriginalMember(owner = "client!vs", name = "aa", descriptor = "I")
	int anInt5318 = 836839043;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "()V", line = 50)
	Class536() {
	}

	@OriginalMember(owner = "client!vs", name = "hz", descriptor = "(Lclient!act;ZI)V", line = 3730)
	static final void method32541(@OriginalArg(0) Class26_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int local2 = Class538.aClass538_4.aByte171;
		@Pc(4) int local4 = 0;
		if (arg0.anInt2372 * 1696493467 > client.anInt3034) {
			Class271.method25314(arg0);
		} else if (arg0.anInt2386 * -557111183 >= client.anInt3034) {
			Class19_Sub2.method21422(arg0);
		} else {
			Class75.method19527(arg0, arg1);
			local2 = Class30_Sub1.anInt770 * -1032780661;
			local4 = Class107.anInt2992 * 1690541573;
		}
		@Pc(40) Class320 local40 = arg0.method21431().aClass320_61;
		@Pc(79) int local79;
		if ((int) local40.aFloat259 < 512 || (int) local40.aFloat261 < 512 || (int) local40.aFloat259 >= (client.aClass370_1.method26943() - 1) * 512 || (int) local40.aFloat261 >= (client.aClass370_1.method27062() - 1) * 512) {
			arg0.aClass71_3.method20038(-1);
			for (local79 = 0; local79 < arg0.aClass384Array3.length; local79++) {
				arg0.aClass384Array3[local79].anInt4716 = -1212547221;
				arg0.aClass384Array3[local79].aClass71_7.method20038(-1);
			}
			arg0.anIntArray234 = null;
			arg0.anInt2372 = 0;
			arg0.anInt2386 = 0;
			local2 = Class538.aClass538_4.aByte171;
			local4 = 0;
			arg0.method21437((float) (arg0.anIntArray241[0] * 512 + arg0.method16630() * 256), local40.aFloat260, (float) (arg0.anIntArray239[0] * 512 + arg0.method16630() * 256));
			arg0.method16640();
		}
		if (arg0 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 && ((int) local40.aFloat259 < 6144 || (int) local40.aFloat261 < 6144 || (int) local40.aFloat259 >= (client.aClass370_1.method26943() - 12) * 512 || (int) local40.aFloat261 >= (client.aClass370_1.method27062() - 12) * 512)) {
			arg0.aClass71_3.method20038(-1);
			for (local79 = 0; local79 < arg0.aClass384Array3.length; local79++) {
				arg0.aClass384Array3[local79].anInt4716 = -1212547221;
				arg0.aClass384Array3[local79].aClass71_7.method20038(-1);
			}
			arg0.anIntArray234 = null;
			arg0.anInt2372 = 0;
			arg0.anInt2386 = 0;
			local2 = Class538.aClass538_4.aByte171;
			local4 = 0;
			arg0.method21437((float) (arg0.anIntArray241[0] * 512 + arg0.method16630() * 256), local40.aFloat260, (float) (arg0.anIntArray239[0] * 512 + arg0.method16630() * 256));
			arg0.method16640();
		}
		local79 = Class218.method24360(arg0);
		Class19_Sub2.method21423(arg0);
		Class544.method32610(arg0, local2, local4, local79);
		Class43_Sub2.method8762(arg0, local2);
		Class14_Sub1.method1412(arg0);
		@Pc(279) Class335 local279 = Class335.method26300();
		local279.method26303(Class317.method25842(arg0.aClass106_7.method21910()), Class317.method25842(arg0.aClass106_9.method21910()), Class317.method25842(arg0.aClass106_8.method21910()));
		arg0.method21435(local279);
		local279.method26293();
	}

	@OriginalMember(owner = "client!vs", name = "agt", descriptor = "(Lclient!vs;I)V", line = 10113)
	static final void method32540(@OriginalArg(0) Class536 arg0) {
		Class13_Sub9.method6252(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}
}
