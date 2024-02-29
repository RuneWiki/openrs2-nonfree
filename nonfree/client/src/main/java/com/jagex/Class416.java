package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public class Class416 implements Interface75 {

	@OriginalMember(owner = "client!ne", name = "hm", descriptor = "Lclient!ady;")
	public static Class80_Sub1_Sub2 aClass80_Sub1_Sub2_4;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!ne;")
	static final Class416 aClass416_5 = new Class416(0, -1, true, false, true);

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!ne;")
	static final Class416 aClass416_7 = new Class416(1, 0, true, true, true);

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!ne;")
	static final Class416 aClass416_4 = new Class416(2, 1, true, true, false);

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!ne;")
	static final Class416 aClass416_10 = new Class416(3, 8, false, true, true);

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "Lclient!ne;")
	static final Class416 aClass416_6 = new Class416(4, 9, false, false, true);

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "Lclient!ne;")
	static final Class416 aClass416_3 = new Class416(5, 10, false, true, true);

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!ne;")
	static final Class416 aClass416_2 = new Class416(6, 11, false, false, true);

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!ne;")
	static final Class416 aClass416_8 = new Class416(7, 12, false, false, true);

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "Lclient!ne;")
	static final Class416 aClass416_9 = new Class416(8, 13, false, false, true);

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	final int anInt4721;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	public final int anInt4720;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "Z")
	public final boolean aBoolean745;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
	public final boolean aBoolean746;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "()[Lclient!ne;", line = 23)
	public static Class416[] method28666() {
		return new Class416[] { aClass416_10, aClass416_6, aClass416_2, aClass416_9, aClass416_4, aClass416_7, aClass416_8, aClass416_5, aClass416_3 };
	}

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "(I)[Lclient!ne;", line = 23)
	public static Class416[] method28667() {
		return new Class416[] { aClass416_10, aClass416_6, aClass416_2, aClass416_9, aClass416_4, aClass416_7, aClass416_8, aClass416_5, aClass416_3 };
	}

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "()[Lclient!ne;", line = 23)
	public static Class416[] method28668() {
		return new Class416[] { aClass416_10, aClass416_6, aClass416_2, aClass416_9, aClass416_4, aClass416_7, aClass416_8, aClass416_5, aClass416_3 };
	}

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIZZZ)V", line = 26)
	Class416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4721 = arg0 * 317879063;
		this.anInt4720 = arg1 * 881215973;
		this.aBoolean745 = arg3;
		this.aBoolean746 = arg4;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Lclient!dx;B)V", line = 28)
	static void method28669(@OriginalArg(0) Class86 arg0) {
		if (Class132.aClass695_16.method36413() == 0) {
			return;
		}
		@Pc(14) Class77_Sub8 local14;
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109() == 0) {
			for (local14 = (Class77_Sub8) Class132.aClass695_16.method36395(); local14 != null; local14 = (Class77_Sub8) Class132.aClass695_16.method36406()) {
				Class537.aClass35_Sub7_1.method17012(arg0, arg0, local14.anInt1468 * -2069726317, local14.anInt1467 * -863343329, local14.anInt1471 * 1038549693, local14.anInt1470 * 304308761, false, false, local14.anInt1469 * 1740682347, Class248.aClass94_7, local14.aBoolean325 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 : null, Class617.aClass629_1);
				local14.method24063();
			}
			Class430.method28815();
			return;
		}
		if (Class132.aClass86_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Class132.aClass86_8 = Class345.method27828(0, local72, Class147.aClass209_7, Class77.anInterface24_117, Class354.aClass411_1, Class112.aClass405_3, Class392.aClass398_1, Class323.aClass478_96, 0);
			Class657.aClass94_13 = Class132.aClass86_8.method20111(Class151.method23390(Class145.aClass478_46, Class611.anInt5569 * -1643399711, 0), Class210.method25596(Class470.aClass478_125, Class611.anInt5569 * -1643399711, 0), true);
		}
		for (local14 = (Class77_Sub8) Class132.aClass695_16.method36395(); local14 != null; local14 = (Class77_Sub8) Class132.aClass695_16.method36406()) {
			Class537.aClass35_Sub7_1.method17012(Class132.aClass86_8, arg0, local14.anInt1468 * -2069726317, local14.anInt1467 * -863343329, local14.anInt1471 * 1038549693, local14.anInt1470 * 304308761, false, false, local14.anInt1469 * 1740682347, Class657.aClass94_13, local14.aBoolean325 ? Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 : null, Class617.aClass629_1);
			local14.method24063();
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "()I", line = 34)
	@Override
	public int method36479() {
		return this.anInt4721 * -31198041;
	}

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "()I", line = 34)
	@Override
	public int method36478() {
		return this.anInt4721 * -31198041;
	}

	@OriginalMember(owner = "client!ne", name = "y", descriptor = "()I", line = 34)
	@Override
	public int method36477() {
		return this.anInt4721 * -31198041;
	}

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "(IS)V", line = 140)
	static void method28670(@OriginalArg(0) int arg0) {
		Class412.anInt4715 = arg0 * 365309251;
		@Pc(6) Class232 local6 = Class412.aClass232_81;
		synchronized (Class412.aClass232_81) {
			Class412.aClass232_81.method25850();
		}
	}

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "(I)V", line = 642)
	static void method28671() {
		@Pc(6) Class28 local6 = Class145.method15079("2", client.aClass670_4.aString245, false);
		Class56.aClass93_Sub1_1.method6432(local6);
	}

	@OriginalMember(owner = "client!ne", name = "kr", descriptor = "(Lclient!ajt;IIIB)V", line = 10272)
	static void method28672(@OriginalArg(0) Class77_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg0.aClass77_Sub39_Sub1_2.method22417(arg1);
		arg0.aClass77_Sub39_Sub1_2.method22609(arg2);
		arg0.aClass77_Sub39_Sub1_2.method22609(arg3);
	}
}
