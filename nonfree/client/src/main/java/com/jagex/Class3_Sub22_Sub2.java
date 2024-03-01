package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ane")
public class Class3_Sub22_Sub2 extends Class3_Sub22 {

	@OriginalMember(owner = "client!ane", name = "az", descriptor = "I")
	static final int anInt2728 = 672;

	@OriginalMember(owner = "client!ane", name = "j", descriptor = "I")
	static final int anInt2729 = 161;

	@OriginalMember(owner = "client!ane", name = "n", descriptor = "I")
	static final int anInt2730 = 162;

	@OriginalMember(owner = "client!ane", name = "e", descriptor = "I")
	static final int anInt2731 = 163;

	@OriginalMember(owner = "client!ane", name = "r", descriptor = "I")
	static final int anInt2732 = 164;

	@OriginalMember(owner = "client!ane", name = "al", descriptor = "I")
	static final int anInt2734 = 674;

	@OriginalMember(owner = "client!ane", name = "m", descriptor = "I")
	static final int anInt2735 = 167;

	@OriginalMember(owner = "client!ane", name = "aa", descriptor = "I")
	static final int anInt2736 = 515;

	@OriginalMember(owner = "client!ane", name = "aq", descriptor = "I")
	static final int anInt2737 = 521;

	@OriginalMember(owner = "client!ane", name = "z", descriptor = "I")
	static final int anInt2738 = 160;

	@OriginalMember(owner = "client!ane", name = "o", descriptor = "I")
	static final int anInt2739 = 171;

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "I")
	static final int anInt2740 = 172;

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "I")
	static final int anInt2741 = 173;

	@OriginalMember(owner = "client!ane", name = "k", descriptor = "I")
	static final int anInt2742 = 174;

	@OriginalMember(owner = "client!ane", name = "at", descriptor = "I")
	static final int anInt2743 = 512;

	@OriginalMember(owner = "client!ane", name = "af", descriptor = "I")
	static final int anInt2744 = 513;

	@OriginalMember(owner = "client!ane", name = "ak", descriptor = "I")
	static final int anInt2745 = 514;

	@OriginalMember(owner = "client!ane", name = "ah", descriptor = "I")
	static final int anInt2746 = 516;

	@OriginalMember(owner = "client!ane", name = "an", descriptor = "I")
	static final int anInt2747 = 517;

	@OriginalMember(owner = "client!ane", name = "aj", descriptor = "I")
	static final int anInt2748 = 518;

	@OriginalMember(owner = "client!ane", name = "as", descriptor = "I")
	static final int anInt2749 = 519;

	@OriginalMember(owner = "client!ane", name = "ai", descriptor = "I")
	static final int anInt2750 = 520;

	@OriginalMember(owner = "client!ane", name = "d", descriptor = "I")
	static final int anInt2751 = 165;

	@OriginalMember(owner = "client!ane", name = "av", descriptor = "I")
	static final int anInt2752 = 522;

	@OriginalMember(owner = "client!ane", name = "ax", descriptor = "I")
	static final int anInt2753 = 525;

	@OriginalMember(owner = "client!ane", name = "v", descriptor = "I")
	static final int anInt2755 = 168;

	@OriginalMember(owner = "client!ane", name = "t", descriptor = "I")
	static final int anInt2756 = 169;

	@OriginalMember(owner = "client!ane", name = "q", descriptor = "I")
	static final int anInt2758 = 166;

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "I")
	static final int anInt2760 = 170;

	@OriginalMember(owner = "client!ane", name = "ao", descriptor = "[Lclient!ane;")
	static Class3_Sub22_Sub2[] aClass3_Sub22_Sub2Array1 = new Class3_Sub22_Sub2[0];

	@OriginalMember(owner = "client!ane", name = "ar", descriptor = "I")
	int anInt2733;

	@OriginalMember(owner = "client!ane", name = "ag", descriptor = "J")
	long aLong189;

	@OriginalMember(owner = "client!ane", name = "au", descriptor = "I")
	int anInt2754;

	@OriginalMember(owner = "client!ane", name = "ay", descriptor = "I")
	int anInt2757;

	@OriginalMember(owner = "client!ane", name = "am", descriptor = "I")
	int anInt2759;

	@OriginalMember(owner = "client!ane", name = "aq", descriptor = "(I)V", line = 47)
	public static void method19874(@OriginalArg(0) int arg0) {
		Class13_Sub18.anInt694 = arg0 * 1541295941;
		aClass3_Sub22_Sub2Array1 = new Class3_Sub22_Sub2[arg0];
		Class134.anInt3383 = 0;
	}

	@OriginalMember(owner = "client!ane", name = "av", descriptor = "(I)V", line = 47)
	public static void method19876(@OriginalArg(0) int arg0) {
		Class13_Sub18.anInt694 = arg0 * 1541295941;
		aClass3_Sub22_Sub2Array1 = new Class3_Sub22_Sub2[arg0];
		Class134.anInt3383 = 0;
	}

	@OriginalMember(owner = "client!ane", name = "ax", descriptor = "(IIII)Lclient!ane;", line = 53)
	public static Class3_Sub22_Sub2 method19877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			@Pc(11) Class3_Sub22_Sub2 local11;
			if (Class134.anInt3383 * 2109755311 == 0) {
				local11 = new Class3_Sub22_Sub2();
			} else {
				local11 = aClass3_Sub22_Sub2Array1[(Class134.anInt3383 -= -706189489) * 2109755311];
			}
			local11.anInt2759 = arg0 * 384311683;
			local11.anInt2733 = arg1 * -1707596037;
			local11.anInt2754 = arg2 * -681463111;
			local11.anInt2757 = arg3 * -790897887;
			local11.aLong189 = Class176.method23413() * -6339356479119732283L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ane", name = "az", descriptor = "(IIII)Lclient!ane;", line = 53)
	public static Class3_Sub22_Sub2 method19878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			@Pc(11) Class3_Sub22_Sub2 local11;
			if (Class134.anInt3383 * 2109755311 == 0) {
				local11 = new Class3_Sub22_Sub2();
			} else {
				local11 = aClass3_Sub22_Sub2Array1[(Class134.anInt3383 -= -706189489) * 2109755311];
			}
			local11.anInt2759 = arg0 * 384311683;
			local11.anInt2733 = arg1 * -1707596037;
			local11.anInt2754 = arg2 * -681463111;
			local11.anInt2757 = arg3 * -790897887;
			local11.aLong189 = Class176.method23413() * -6339356479119732283L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ane", name = "al", descriptor = "(IIII)Lclient!ane;", line = 53)
	public static Class3_Sub22_Sub2 method19879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			@Pc(11) Class3_Sub22_Sub2 local11;
			if (Class134.anInt3383 * 2109755311 == 0) {
				local11 = new Class3_Sub22_Sub2();
			} else {
				local11 = aClass3_Sub22_Sub2Array1[(Class134.anInt3383 -= -706189489) * 2109755311];
			}
			local11.anInt2759 = arg0 * 384311683;
			local11.anInt2733 = arg1 * -1707596037;
			local11.anInt2754 = arg2 * -681463111;
			local11.anInt2757 = arg3 * -790897887;
			local11.aLong189 = Class176.method23413() * -6339356479119732283L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ane", name = "ao", descriptor = "(IIII)Lclient!ane;", line = 53)
	public static Class3_Sub22_Sub2 method19881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			@Pc(11) Class3_Sub22_Sub2 local11;
			if (Class134.anInt3383 * 2109755311 == 0) {
				local11 = new Class3_Sub22_Sub2();
			} else {
				local11 = aClass3_Sub22_Sub2Array1[(Class134.anInt3383 -= -706189489) * 2109755311];
			}
			local11.anInt2759 = arg0 * 384311683;
			local11.anInt2733 = arg1 * -1707596037;
			local11.anInt2754 = arg2 * -681463111;
			local11.anInt2757 = arg3 * -790897887;
			local11.aLong189 = Class176.method23413() * -6339356479119732283L;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "()V", line = 66)
	Class3_Sub22_Sub2() {
	}

	@OriginalMember(owner = "client!ane", name = "k", descriptor = "()V", line = 69)
	@Override
	public void method19868() {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			if (Class134.anInt3383 * 2109755311 < Class13_Sub18.anInt694 * -1807553651 - 1) {
				aClass3_Sub22_Sub2Array1[(Class134.anInt3383 += -706189489) * 2109755311 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ane", name = "s", descriptor = "(I)V", line = 69)
	@Override
	public void method19859() {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			if (Class134.anInt3383 * 2109755311 < Class13_Sub18.anInt694 * -1807553651 - 1) {
				aClass3_Sub22_Sub2Array1[(Class134.anInt3383 += -706189489) * 2109755311 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ane", name = "at", descriptor = "()V", line = 69)
	@Override
	public void method19861() {
		@Pc(2) Class3_Sub22_Sub2[] local2 = aClass3_Sub22_Sub2Array1;
		synchronized (aClass3_Sub22_Sub2Array1) {
			if (Class134.anInt3383 * 2109755311 < Class13_Sub18.anInt694 * -1807553651 - 1) {
				aClass3_Sub22_Sub2Array1[(Class134.anInt3383 += -706189489) * 2109755311 - 1] = this;
			}
		}
	}

	@OriginalMember(owner = "client!ane", name = "an", descriptor = "(B)I", line = 75)
	public int method19871() {
		return this.anInt2757 * -1126209311;
	}

	@OriginalMember(owner = "client!ane", name = "ap", descriptor = "()I", line = 79)
	public int method19872() {
		return this.anInt2754 * 1925231497;
	}

	@OriginalMember(owner = "client!ane", name = "aj", descriptor = "(B)I", line = 79)
	public int method19880() {
		return this.anInt2754 * 1925231497;
	}

	@OriginalMember(owner = "client!ane", name = "ab", descriptor = "()I", line = 79)
	public int method19882() {
		return this.anInt2754 * 1925231497;
	}

	@OriginalMember(owner = "client!ane", name = "au", descriptor = "()I", line = 79)
	public int method19883() {
		return this.anInt2754 * 1925231497;
	}

	@OriginalMember(owner = "client!ane", name = "as", descriptor = "(I)Z", line = 83)
	public boolean method19873() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@OriginalMember(owner = "client!ane", name = "ay", descriptor = "()Z", line = 83)
	public boolean method19884() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 161:
			case 162:
			case 163:
			case 164:
			case 165:
			case 166:
			case 167:
			case 168:
			case 169:
			case 170:
			case 171:
			case 172:
			case 173:
			case 174:
			case 672:
			case 674:
				return true;
			default:
				return false;
		}
	}

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "()I", line = 108)
	@Override
	public int method19866() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "(I)I", line = 108)
	@Override
	public int method19856() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!ane", name = "f", descriptor = "()I", line = 108)
	@Override
	public int method19865() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 512:
				return 0;
			case 163:
			case 166:
			case 169:
			case 173:
			case 515:
			case 518:
			case 521:
			case 525:
				return 2;
			default:
				return 1;
		}
	}

	@OriginalMember(owner = "client!ane", name = "p", descriptor = "(B)I", line = 127)
	@Override
	public int method19853() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!ane", name = "u", descriptor = "()I", line = 127)
	@Override
	public int method19869() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!ane", name = "y", descriptor = "()I", line = 127)
	@Override
	public int method19860() {
		switch(this.anInt2754 * 1925231497) {
			case 160:
			case 512:
				return -1;
			case 161:
			case 163:
			case 513:
			case 515:
				return 0;
			case 162:
			case 514:
				return 3;
			case 164:
			case 166:
			case 516:
			case 518:
				return 2;
			case 165:
			case 517:
				return 5;
			case 167:
			case 169:
			case 519:
			case 521:
				return 1;
			case 168:
			case 520:
				return 4;
			case 170:
			case 522:
				return 6;
			default:
				return -2;
		}
	}

	@OriginalMember(owner = "client!ane", name = "ai", descriptor = "(Ljava/awt/Point;I)V", line = 163)
	public void method19875(@OriginalArg(0) Point arg0) {
		this.anInt2759 -= arg0.x * 384311683;
		this.anInt2733 -= arg0.y * -1707596037;
	}

	@OriginalMember(owner = "client!ane", name = "ag", descriptor = "(Ljava/awt/Point;)V", line = 163)
	public void method19885(@OriginalArg(0) Point arg0) {
		this.anInt2759 -= arg0.x * 384311683;
		this.anInt2733 -= arg0.y * -1707596037;
	}

	@OriginalMember(owner = "client!ane", name = "z", descriptor = "()J", line = 168)
	@Override
	public long method19855() {
		return this.aLong189 * -6601053707936201459L;
	}

	@OriginalMember(owner = "client!ane", name = "j", descriptor = "()J", line = 168)
	@Override
	public long method19864() {
		return this.aLong189 * -6601053707936201459L;
	}

	@OriginalMember(owner = "client!ane", name = "n", descriptor = "()J", line = 168)
	@Override
	public long method19852() {
		return this.aLong189 * -6601053707936201459L;
	}

	@OriginalMember(owner = "client!ane", name = "h", descriptor = "(I)J", line = 168)
	@Override
	public long method19857() {
		return this.aLong189 * -6601053707936201459L;
	}

	@OriginalMember(owner = "client!ane", name = "a", descriptor = "(I)I", line = 172)
	@Override
	public int method19854() {
		return this.anInt2759 * -2108623573;
	}

	@OriginalMember(owner = "client!ane", name = "b", descriptor = "()I", line = 172)
	@Override
	public int method19863() {
		return this.anInt2759 * -2108623573;
	}

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "(I)I", line = 176)
	@Override
	public int method19867() {
		return this.anInt2733 * -1465125837;
	}

	@OriginalMember(owner = "client!ane", name = "c", descriptor = "()I", line = 176)
	@Override
	public int method19858() {
		return this.anInt2733 * -1465125837;
	}
}
