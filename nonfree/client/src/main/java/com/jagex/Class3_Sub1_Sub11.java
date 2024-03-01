package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amq")
public class Class3_Sub1_Sub11 extends Class3_Sub1 {

	@OriginalMember(owner = "client!amq", name = "w", descriptor = "I")
	static final int anInt2672 = 12;

	@OriginalMember(owner = "client!amq", name = "e", descriptor = "I")
	static final int anInt2673 = 5;

	@OriginalMember(owner = "client!amq", name = "t", descriptor = "I")
	static final int anInt2674 = 11;

	@OriginalMember(owner = "client!amq", name = "c", descriptor = "I")
	static final int anInt2675 = 1;

	@OriginalMember(owner = "client!amq", name = "n", descriptor = "I")
	static final int anInt2677 = 4;

	@OriginalMember(owner = "client!amq", name = "k", descriptor = "I")
	static final int anInt2678 = 16;

	@OriginalMember(owner = "client!amq", name = "r", descriptor = "I")
	static final int anInt2679 = 6;

	@OriginalMember(owner = "client!amq", name = "d", descriptor = "I")
	static final int anInt2680 = 7;

	@OriginalMember(owner = "client!amq", name = "q", descriptor = "I")
	static final int anInt2681 = 8;

	@OriginalMember(owner = "client!amq", name = "ah", descriptor = "I")
	static final int anInt2682 = 23;

	@OriginalMember(owner = "client!amq", name = "v", descriptor = "I")
	static final int anInt2683 = 10;

	@OriginalMember(owner = "client!amq", name = "z", descriptor = "I")
	static final int anInt2684 = 2;

	@OriginalMember(owner = "client!amq", name = "o", descriptor = "I")
	static final int anInt2685 = 13;

	@OriginalMember(owner = "client!amq", name = "i", descriptor = "I")
	static final int anInt2686 = 14;

	@OriginalMember(owner = "client!amq", name = "f", descriptor = "I")
	static final int anInt2687 = 15;

	@OriginalMember(owner = "client!amq", name = "at", descriptor = "I")
	static final int anInt2688 = 17;

	@OriginalMember(owner = "client!amq", name = "m", descriptor = "I")
	static final int anInt2689 = 9;

	@OriginalMember(owner = "client!amq", name = "ak", descriptor = "I")
	static final int anInt2690 = 21;

	@OriginalMember(owner = "client!amq", name = "aa", descriptor = "I")
	static final int anInt2691 = 22;

	@OriginalMember(owner = "client!amq", name = "j", descriptor = "I")
	static final int anInt2692 = 3;

	@OriginalMember(owner = "client!amq", name = "af", descriptor = "I")
	static final int anInt2694 = 20;

	@OriginalMember(owner = "client!amq", name = "ai", descriptor = "J")
	static final long aLong165 = Long.MAX_VALUE;

	@OriginalMember(owner = "client!amq", name = "aq", descriptor = "J")
	static final long aLong166 = Long.MIN_VALUE;

	@OriginalMember(owner = "client!amq", name = "av", descriptor = "J")
	static final long aLong167 = 500L;

	@OriginalMember(owner = "client!amq", name = "an", descriptor = "Lclient!wc;")
	static Class546 aClass546_10 = new Class546();

	@OriginalMember(owner = "client!amq", name = "aj", descriptor = "Lclient!wc;")
	static Class546 aClass546_11 = new Class546();

	@OriginalMember(owner = "client!amq", name = "as", descriptor = "Lclient!xn;")
	static Class581 aClass581_17 = new Class581(16);

	@OriginalMember(owner = "client!amq", name = "ax", descriptor = "Z")
	static boolean aBoolean471 = false;

	@OriginalMember(owner = "client!amq", name = "b", descriptor = "Ljava/lang/String;")
	String aString114;

	@OriginalMember(owner = "client!amq", name = "y", descriptor = "I")
	int anInt2676;

	@OriginalMember(owner = "client!amq", name = "s", descriptor = "I")
	int anInt2693;

	@OriginalMember(owner = "client!amq", name = "u", descriptor = "I")
	int anInt2695;

	@OriginalMember(owner = "client!amq", name = "ba", descriptor = "(IJ)Lclient!amq;", line = 48)
	static Class3_Sub1_Sub11 method19129(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		aBoolean471 = false;
		@Pc(11) Class3_Sub1_Sub11 local11 = (Class3_Sub1_Sub11) aClass581_17.method33217((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class3_Sub1_Sub11(arg0, arg1);
			aClass581_17.method33241(local11, local11.aLong296 * -1930649055099428229L);
			aBoolean471 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!amq", name = "bu", descriptor = "(IJ)Lclient!amq;", line = 48)
	static Class3_Sub1_Sub11 method19132(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		aBoolean471 = false;
		@Pc(11) Class3_Sub1_Sub11 local11 = (Class3_Sub1_Sub11) aClass581_17.method33217((long) arg0 << 56 | arg1);
		if (local11 == null) {
			local11 = new Class3_Sub1_Sub11(arg0, arg1);
			aClass581_17.method33241(local11, local11.aLong296 * -1930649055099428229L);
			aBoolean471 = true;
		}
		return local11;
	}

	@OriginalMember(owner = "client!amq", name = "bo", descriptor = "()V", line = 59)
	static void method19134() {
		aClass581_17.method33222();
		aClass546_11.method32620();
		aClass546_10.method32620();
	}

	@OriginalMember(owner = "client!amq", name = "bc", descriptor = "()V", line = 59)
	static void method19135() {
		aClass581_17.method33222();
		aClass546_11.method32620();
		aClass546_10.method32620();
	}

	@OriginalMember(owner = "client!amq", name = "bn", descriptor = "()V", line = 59)
	static void method19136() {
		aClass581_17.method33222();
		aClass546_11.method32620();
		aClass546_10.method32620();
	}

	@OriginalMember(owner = "client!amq", name = "bx", descriptor = "()Lclient!amq;", line = 66)
	static Class3_Sub1_Sub11 method19138() {
		@Pc(4) Class3_Sub1_Sub11 local4 = (Class3_Sub1_Sub11) aClass546_10.method32623();
		if (local4 != null) {
			local4.method33656();
			local4.method33669();
			return local4;
		}
		do {
			local4 = (Class3_Sub1_Sub11) aClass546_11.method32623();
			if (local4 == null) {
				return null;
			}
			if (local4.method19131() > Class176.method23413()) {
				return null;
			}
			local4.method33656();
			local4.method33669();
		} while ((local4.aLong297 * -2884094411549009029L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!amq", name = "bh", descriptor = "()Lclient!amq;", line = 66)
	static Class3_Sub1_Sub11 method19139() {
		@Pc(4) Class3_Sub1_Sub11 local4 = (Class3_Sub1_Sub11) aClass546_10.method32623();
		if (local4 != null) {
			local4.method33656();
			local4.method33669();
			return local4;
		}
		do {
			local4 = (Class3_Sub1_Sub11) aClass546_11.method32623();
			if (local4 == null) {
				return null;
			}
			if (local4.method19131() > Class176.method23413()) {
				return null;
			}
			local4.method33656();
			local4.method33669();
		} while ((local4.aLong297 * -2884094411549009029L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!amq", name = "be", descriptor = "()Lclient!amq;", line = 66)
	static Class3_Sub1_Sub11 method19198() {
		@Pc(4) Class3_Sub1_Sub11 local4 = (Class3_Sub1_Sub11) aClass546_10.method32623();
		if (local4 != null) {
			local4.method33656();
			local4.method33669();
			return local4;
		}
		do {
			local4 = (Class3_Sub1_Sub11) aClass546_11.method32623();
			if (local4 == null) {
				return null;
			}
			if (local4.method19131() > Class176.method23413()) {
				return null;
			}
			local4.method33656();
			local4.method33669();
		} while ((local4.aLong297 * -2884094411549009029L & Long.MIN_VALUE) == 0L);
		return local4;
	}

	@OriginalMember(owner = "client!amq", name = "bj", descriptor = "(Lclient!cy;)V", line = 83)
	public static void method19140(@OriginalArg(0) Class11 arg0) {
		@Pc(7) Class3_Sub1_Sub11 local7 = Class60_Sub34.method14470(1, (long) (arg0.anInt130 * -112096509));
		local7.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "bq", descriptor = "(Lclient!cy;)V", line = 88)
	public static void method19141(@OriginalArg(0) Class11 arg0) {
		@Pc(7) Class3_Sub1_Sub11 local7 = Class60_Sub34.method14470(2, (long) (arg0.anInt130 * -112096509));
		local7.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "bv", descriptor = "(Lclient!cy;)V", line = 88)
	public static void method19142(@OriginalArg(0) Class11 arg0) {
		@Pc(7) Class3_Sub1_Sub11 local7 = Class60_Sub34.method14470(2, (long) (arg0.anInt130 * -112096509));
		local7.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "bz", descriptor = "(Lclient!cy;)V", line = 88)
	public static void method19143(@OriginalArg(0) Class11 arg0) {
		@Pc(7) Class3_Sub1_Sub11 local7 = Class60_Sub34.method14470(2, (long) (arg0.anInt130 * -112096509));
		local7.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ck", descriptor = "(I)V", line = 93)
	public static void method19144(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cj", descriptor = "(I)V", line = 93)
	public static void method19146(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cm", descriptor = "(I)V", line = 93)
	public static void method19189(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cu", descriptor = "(I)V", line = 98)
	public static void method19147(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cv", descriptor = "(I)V", line = 98)
	public static void method19210(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cl", descriptor = "(I)V", line = 103)
	public static void method19149(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(4, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cq", descriptor = "(I)V", line = 108)
	public static void method19150(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(5, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cg", descriptor = "(I)V", line = 118)
	public static void method19151(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cp", descriptor = "(I)V", line = 118)
	public static void method19152(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cc", descriptor = "(I)V", line = 123)
	public static void method19153(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cs", descriptor = "(I)V", line = 123)
	public static void method19154(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cx", descriptor = "(I)V", line = 123)
	public static void method19188(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ct", descriptor = "(I)V", line = 123)
	public static void method19199(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cy", descriptor = "(I)V", line = 128)
	public static void method19157(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(9, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cb", descriptor = "(I)V", line = 128)
	public static void method19158(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(9, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cz", descriptor = "(I)V", line = 133)
	public static void method19159(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "co", descriptor = "(I)V", line = 133)
	public static void method19161(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cn", descriptor = "(I)V", line = 133)
	public static void method19183(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cd", descriptor = "(I)V", line = 138)
	public static void method19162(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(11, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ch", descriptor = "(I)V", line = 138)
	public static void method19214(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(11, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ci", descriptor = "(I)V", line = 143)
	public static void method19164(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(12, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ca", descriptor = "(I)V", line = 143)
	public static void method19165(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(12, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cr", descriptor = "(I)V", line = 148)
	public static void method19166(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(13, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ce", descriptor = "(I)V", line = 148)
	public static void method19167(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(13, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cw", descriptor = "(I)V", line = 153)
	public static void method19168(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(15, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "cf", descriptor = "(I)V", line = 158)
	public static void method19169(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(21, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dv", descriptor = "(I)V", line = 163)
	public static void method19170(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(22, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "df", descriptor = "(I)V", line = 168)
	public static void method19160(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(16, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dh", descriptor = "(I)V", line = 168)
	public static void method19213(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(16, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "db", descriptor = "()V", line = 173)
	static void method19133() {
		@Pc(3) Class3_Sub1_Sub11 local3 = Class60_Sub34.method14470(14, 0L);
		local3.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dp", descriptor = "()V", line = 173)
	static void method19175() {
		@Pc(3) Class3_Sub1_Sub11 local3 = Class60_Sub34.method14470(14, 0L);
		local3.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dk", descriptor = "()V", line = 173)
	static void method19190() {
		@Pc(3) Class3_Sub1_Sub11 local3 = Class60_Sub34.method14470(14, 0L);
		local3.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dg", descriptor = "(II)V", line = 178)
	public static void method19177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(17, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dq", descriptor = "(II)V", line = 178)
	public static void method19178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(17, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dy", descriptor = "(II)V", line = 178)
	public static void method19227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(17, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "ds", descriptor = "(II)V", line = 183)
	public static void method19179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(20, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dr", descriptor = "(II)V", line = 183)
	public static void method19180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(20, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dc", descriptor = "(II)V", line = 183)
	public static void method19181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(20, (long) arg1 << 32 | (long) arg0);
		local9.method19145();
	}

	@OriginalMember(owner = "client!amq", name = "dd", descriptor = "(II)V", line = 194)
	static void method19171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class290 local4 = Class308.aClass70_Sub2_3.method33886(arg0);
		@Pc(13) Class3_Sub1_Sub11 local13 = Class60_Sub34.method14470(1, (long) (local4.aClass11_1.anInt130 * -112096509));
		try {
			if (aBoolean471) {
				local13.anInt2693 = Class302.aClass10_Sub1_1.method32385(local4.aClass11_1) * 1666161167;
			}
			local13.anInt2693 = local4.method25524(local13.anInt2693 * -2097539857, arg1) * 1666161167;
			local13.method19155();
		} catch (@Pc(41) Exception_Sub5 local41) {
			Class27_Sub1.method7214("" + arg0, local41);
		}
	}

	@OriginalMember(owner = "client!amq", name = "dt", descriptor = "(II)V", line = 194)
	static void method19187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class290 local4 = Class308.aClass70_Sub2_3.method33886(arg0);
		@Pc(13) Class3_Sub1_Sub11 local13 = Class60_Sub34.method14470(1, (long) (local4.aClass11_1.anInt130 * -112096509));
		try {
			if (aBoolean471) {
				local13.anInt2693 = Class302.aClass10_Sub1_1.method32385(local4.aClass11_1) * 1666161167;
			}
			local13.anInt2693 = local4.method25524(local13.anInt2693 * -2097539857, arg1) * 1666161167;
			local13.method19155();
		} catch (@Pc(41) Exception_Sub5 local41) {
			Class27_Sub1.method7214("" + arg0, local41);
		}
	}

	@OriginalMember(owner = "client!amq", name = "dz", descriptor = "(ILjava/lang/String;)V", line = 207)
	static void method19184(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(2, (long) arg0);
		local4.method19155();
		local4.aString114 = arg1;
	}

	@OriginalMember(owner = "client!amq", name = "da", descriptor = "(ILjava/lang/String;)V", line = 207)
	static void method19217(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(2, (long) arg0);
		local4.method19155();
		local4.aString114 = arg1;
	}

	@OriginalMember(owner = "client!amq", name = "de", descriptor = "(ILjava/lang/String;)V", line = 213)
	static void method19130(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19155();
		local4.aString114 = arg1;
	}

	@OriginalMember(owner = "client!amq", name = "dl", descriptor = "(ILjava/lang/String;)V", line = 213)
	static void method19186(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19155();
		local4.aString114 = arg1;
	}

	@OriginalMember(owner = "client!amq", name = "dm", descriptor = "(IZ)V", line = 219)
	static void method19126(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19155();
		local4.anInt2693 = (arg1 ? 1 : 0) * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "dx", descriptor = "(IZ)V", line = 219)
	static void method19148(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19155();
		local4.anInt2693 = (arg1 ? 1 : 0) * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "dj", descriptor = "(IZ)V", line = 219)
	static void method19173(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(23, (long) arg0);
		local4.method19155();
		local4.anInt2693 = (arg1 ? 1 : 0) * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "dw", descriptor = "(IIII)V", line = 225)
	static void method19127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(4, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!amq", name = "du", descriptor = "(IIII)V", line = 225)
	static void method19191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(4, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!amq", name = "do", descriptor = "(II)V", line = 233)
	static void method19192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(5, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "di", descriptor = "(II)V", line = 233)
	static void method19193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(5, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "dn", descriptor = "(II)V", line = 233)
	static void method19194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(5, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ee", descriptor = "(II)V", line = 239)
	static void method19195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(6, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ex", descriptor = "(II)V", line = 239)
	static void method19196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(6, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "eb", descriptor = "(II)V", line = 239)
	static void method19197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(6, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ef", descriptor = "(II)V", line = 239)
	static void method19211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(6, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "er", descriptor = "(II)V", line = 245)
	static void method19200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ej", descriptor = "(II)V", line = 245)
	static void method19201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ey", descriptor = "(II)V", line = 245)
	static void method19215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "en", descriptor = "(IIII)V", line = 251)
	static void method19202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!amq", name = "ew", descriptor = "(IIII)V", line = 251)
	static void method19203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(8, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!amq", name = "em", descriptor = "(III)V", line = 259)
	static void method19204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(9, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
	}

	@OriginalMember(owner = "client!amq", name = "ec", descriptor = "(III)V", line = 259)
	static void method19205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(9, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
	}

	@OriginalMember(owner = "client!amq", name = "ez", descriptor = "(IIII)V", line = 266)
	static void method19207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!amq", name = "ea", descriptor = "(IIII)V", line = 266)
	static void method19228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(10, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
		local4.anInt2676 = arg3 * -835820601;
	}

	@OriginalMember(owner = "client!amq", name = "ep", descriptor = "(III)V", line = 274)
	static void method19208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(11, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
	}

	@OriginalMember(owner = "client!amq", name = "ed", descriptor = "(II)V", line = 281)
	static void method19137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(12, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "eq", descriptor = "(II)V", line = 281)
	static void method19176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(12, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "et", descriptor = "(II)V", line = 287)
	static void method19163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(13, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ev", descriptor = "(II)V", line = 287)
	static void method19174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(13, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "eo", descriptor = "(II)V", line = 293)
	static void method19209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(15, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ek", descriptor = "(IZ)V", line = 299)
	static void method19172(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(22, (long) arg0);
		local4.method19155();
		local4.anInt2693 = (arg1 ? 1 : 0) * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "ei", descriptor = "(IZ)V", line = 299)
	static void method19219(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(22, (long) arg0);
		local4.method19155();
		local4.anInt2693 = (arg1 ? 1 : 0) * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "el", descriptor = "(II)V", line = 305)
	static void method19216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(16, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
	}

	@OriginalMember(owner = "client!amq", name = "eu", descriptor = "(IIII)V", line = 318)
	static void method19212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(17, (long) arg1 << 32 | (long) arg0);
		local9.method19155();
		local9.anInt2693 = arg2 * 1666161167;
		local9.anInt2695 = arg3 * 378120307;
	}

	@OriginalMember(owner = "client!amq", name = "es", descriptor = "(IIII)V", line = 325)
	static void method19206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(20, (long) arg1 << 32 | (long) arg0);
		local9.method19155();
		local9.anInt2693 = arg2 * 1666161167;
		local9.anInt2695 = arg3 * 378120307;
	}

	@OriginalMember(owner = "client!amq", name = "eg", descriptor = "(IIII)V", line = 325)
	static void method19218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class3_Sub1_Sub11 local9 = Class60_Sub34.method14470(20, (long) arg1 << 32 | (long) arg0);
		local9.method19155();
		local9.anInt2693 = arg2 * 1666161167;
		local9.anInt2695 = arg3 * 378120307;
	}

	@OriginalMember(owner = "client!amq", name = "<init>", descriptor = "(IJ)V", line = 331)
	Class3_Sub1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		this.aLong296 = ((long) arg0 << 56 | arg1) * 7335455165921340595L;
	}

	@OriginalMember(owner = "client!amq", name = "br", descriptor = "(B)V", line = 336)
	void method19145() {
		this.aLong297 = (-2884094411549009029L * this.aLong297 & Long.MIN_VALUE | Class176.method23413() + 500L) * -2199417693621122125L;
		aClass546_11.method32621(this);
	}

	@OriginalMember(owner = "client!amq", name = "bb", descriptor = "(I)V", line = 341)
	void method19155() {
		this.aLong297 = (-2884094411549009029L * this.aLong297 | Long.MIN_VALUE) * -2199417693621122125L;
		if (this.method19131() == 0L) {
			aClass546_10.method32621(this);
		}
	}

	@OriginalMember(owner = "client!amq", name = "eh", descriptor = "()V", line = 341)
	void method19220() {
		this.aLong297 = (-2884094411549009029L * this.aLong297 | Long.MIN_VALUE) * -2199417693621122125L;
		if (this.method19131() == 0L) {
			aClass546_10.method32621(this);
		}
	}

	@OriginalMember(owner = "client!amq", name = "ft", descriptor = "()V", line = 341)
	void method19221() {
		this.aLong297 = (-2884094411549009029L * this.aLong297 | Long.MIN_VALUE) * -2199417693621122125L;
		if (this.method19131() == 0L) {
			aClass546_10.method32621(this);
		}
	}

	@OriginalMember(owner = "client!amq", name = "fp", descriptor = "()V", line = 341)
	void method19222() {
		this.aLong297 = (-2884094411549009029L * this.aLong297 | Long.MIN_VALUE) * -2199417693621122125L;
		if (this.method19131() == 0L) {
			aClass546_10.method32621(this);
		}
	}

	@OriginalMember(owner = "client!amq", name = "by", descriptor = "(B)I", line = 346)
	int method19182() {
		return (int) (this.aLong296 * -1930649055099428229L >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!amq", name = "fm", descriptor = "()I", line = 346)
	int method19223() {
		return (int) (this.aLong296 * -1930649055099428229L >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!amq", name = "fn", descriptor = "()I", line = 346)
	int method19224() {
		return (int) (this.aLong296 * -1930649055099428229L >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!amq", name = "fs", descriptor = "()I", line = 346)
	int method19225() {
		return (int) (this.aLong296 * -1930649055099428229L >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!amq", name = "bl", descriptor = "(I)J", line = 350)
	long method19156() {
		return this.aLong296 * -1930649055099428229L & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!amq", name = "fx", descriptor = "()J", line = 350)
	long method19226() {
		return this.aLong296 * -1930649055099428229L & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!amq", name = "fh", descriptor = "()J", line = 354)
	long method19128() {
		return this.aLong297 * -2884094411549009029L & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!amq", name = "bi", descriptor = "(I)J", line = 354)
	long method19131() {
		return this.aLong297 * -2884094411549009029L & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!amq", name = "fu", descriptor = "()J", line = 354)
	long method19185() {
		return this.aLong297 * -2884094411549009029L & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!amq", name = "fg", descriptor = "()J", line = 354)
	long method19229() {
		return this.aLong297 * -2884094411549009029L & Long.MAX_VALUE;
	}
}
