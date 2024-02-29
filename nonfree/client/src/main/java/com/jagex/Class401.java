package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public class Class401 implements Interface46 {

	@OriginalMember(owner = "client!mj", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString211;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!my;")
	public final Class410 aClass410_9;

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "Lclient!mk;")
	public final Class402 aClass402_9;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
	public final int anInt4686;

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
	public final int anInt4685;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
	public final int anInt4684;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
	public final int anInt4687;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public final int anInt4688;

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
	public final int anInt4689;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
	public final int anInt4690;

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	public final int anInt4691;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	public final int anInt4692;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	public final int anInt4693;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!my;Lclient!mk;IIIIIIIIII)V", line = 20)
	Class401(@OriginalArg(0) String arg0, @OriginalArg(1) Class410 arg1, @OriginalArg(2) Class402 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aString211 = arg0;
		this.aClass410_9 = arg1;
		this.aClass402_9 = arg2;
		this.anInt4686 = arg3 * 1294675587;
		this.anInt4685 = arg4 * -470001307;
		this.anInt4684 = arg5 * -1154027331;
		this.anInt4687 = arg6 * 191357863;
		this.anInt4688 = arg7 * -341865107;
		this.anInt4689 = arg8 * -1558876151;
		this.anInt4690 = arg9 * -741087003;
		this.anInt4691 = arg10 * 298934645;
		this.anInt4692 = arg11 * -114876607;
		this.anInt4693 = arg12 * -838278333;
	}

	@OriginalMember(owner = "client!mj", name = "v", descriptor = "(Lclient!akv;)Lclient!mj;", line = 37)
	public static Class401 method28493(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) String local3 = arg0.method22523();
		@Pc(10) Class410 local10 = Class683.method36094()[arg0.method22478()];
		@Pc(17) Class402 local17 = Class700.method36485()[arg0.method22478()];
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22487();
		@Pc(29) int local29 = arg0.method22478();
		@Pc(33) int local33 = arg0.method22478();
		@Pc(37) int local37 = arg0.method22478();
		@Pc(41) int local41 = arg0.method22483();
		@Pc(45) int local45 = arg0.method22483();
		@Pc(49) int local49 = arg0.method22549();
		@Pc(53) int local53 = arg0.method22500();
		@Pc(57) int local57 = arg0.method22500();
		return new Class401(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "()Lclient!mt;", line = 54)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_9;
	}

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "()Lclient!mt;", line = 54)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_9;
	}

	@OriginalMember(owner = "client!mj", name = "y", descriptor = "()Lclient!mt;", line = 54)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_9;
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Lclient!mt;", line = 54)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_9;
	}

	@OriginalMember(owner = "client!mj", name = "ab", descriptor = "(Lclient!yf;I)V", line = 4599)
	static final void method28494(@OriginalArg(0) Class665 arg0) {
		arg0.aLongArray28[(arg0.anInt5782 += 1091885681) * 1572578961 - 1] = (Long) arg0.aClass77_Sub1_Sub9_2.anObjectArray5[arg0.anInt5786 * 662605117];
	}

	@OriginalMember(owner = "client!mj", name = "es", descriptor = "(Lclient!yf;I)V", line = 5258)
	static final void method28495(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class127.method13155(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "ii", descriptor = "(Lclient!yf;B)V", line = 5985)
	static final void method28496(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class294.method27029(local11, local14, arg0, Class574.aClass77_Sub25_2 == arg0.aClass77_Sub25_3 ? Class283.aClass283_7 : Class283.aClass283_5);
	}

	@OriginalMember(owner = "client!mj", name = "jy", descriptor = "(Lclient!yf;I)V", line = 6219)
	static final void method28497(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class634.method32667(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "adt", descriptor = "(Lclient!yf;I)V", line = 9830)
	static final void method28498(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Character.toLowerCase((char) local12);
	}

	@OriginalMember(owner = "client!mj", name = "ask", descriptor = "(Lclient!yf;B)V", line = 12547)
	static final void method28499(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1.method15950();
	}
}
