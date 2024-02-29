package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public class Class403 implements Interface46 {

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
	public static final int anInt4696 = 2;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
	public static final int anInt4697 = 1;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
	public static final int anInt4701 = 0;

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "Lclient!my;")
	public final Class410 aClass410_10;

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Lclient!mk;")
	public final Class402 aClass402_13;

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
	public final int anInt4698;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
	public final int anInt4699;

	@OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
	public final int anInt4700;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
	public final int anInt4695;

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
	public final int anInt4702;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!my;Lclient!mk;IIIII)V", line = 17)
	Class403(@OriginalArg(0) Class410 arg0, @OriginalArg(1) Class402 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass410_10 = arg0;
		this.aClass402_13 = arg1;
		this.anInt4698 = arg2 * 1498205783;
		this.anInt4699 = arg3 * 689095985;
		this.anInt4700 = arg4 * 1784230569;
		this.anInt4695 = arg5 * -1219867273;
		this.anInt4702 = arg6 * -323893073;
	}

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "(I)Z", line = 19)
	public static boolean method28510() {
		try {
			if (!IcmpService_Sub1.available()) {
				return false;
			}
		} catch (@Pc(5) Throwable local5) {
			return false;
		}
		if (IcmpService_Sub1.anIcmpService_Sub1_1 != null) {
			throw new IllegalStateException("");
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = new IcmpService_Sub1();
		@Pc(26) Thread local26 = new Thread(new Class643());
		local26.setDaemon(true);
		local26.start();
		return true;
	}

	@OriginalMember(owner = "client!mm", name = "v", descriptor = "(Lclient!akv;)Lclient!mm;", line = 28)
	public static Class403 method28511(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(6) Class410 local6 = Class683.method36094()[arg0.method22478()];
		@Pc(13) Class402 local13 = Class700.method36485()[arg0.method22478()];
		@Pc(17) int local17 = arg0.method22487();
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22549();
		@Pc(29) int local29 = arg0.method22500();
		@Pc(33) int local33 = arg0.method22478();
		return new Class403(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "(Lclient!akv;)Lclient!mm;", line = 28)
	public static Class403 method28512(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(6) Class410 local6 = Class683.method36094()[arg0.method22478()];
		@Pc(13) Class402 local13 = Class700.method36485()[arg0.method22478()];
		@Pc(17) int local17 = arg0.method22487();
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22549();
		@Pc(29) int local29 = arg0.method22500();
		@Pc(33) int local33 = arg0.method22478();
		return new Class403(local6, local13, local17, local21, local25, local29, local33);
	}

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "(IB)I", line = 34)
	static int method28513(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub40 local5 = (Class77_Sub40) Class622.aClass12_38.method173((long) arg0);
		if (local5 == null) {
			@Pc(12) Class395 local12 = Class622.anInterface45_1.method28446(arg0);
			if (local12 == null || local12.anInt4610 * 302557339 != 2) {
				return -1;
			}
			local5 = new Class77_Sub40(Class622.anInt5635 * 1254165885);
			Class622.aClass12_38.method184(local5, (long) arg0);
			Class622.aClass395Array1[(Class622.anInt5635 += 1391825877) * 1254165885 - 1] = local12;
		}
		return local5.anInt1786 * -705967177;
	}

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)Lclient!mt;", line = 39)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_11;
	}

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "()Lclient!mt;", line = 39)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_11;
	}

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "()Lclient!mt;", line = 39)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_11;
	}

	@OriginalMember(owner = "client!mm", name = "l", descriptor = "()Lclient!mt;", line = 39)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_11;
	}

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "(B)Ljava/lang/String;", line = 147)
	public static String method28514() {
		return Class77_Sub3_Sub2.aString96;
	}

	@OriginalMember(owner = "client!mm", name = "aew", descriptor = "(Lclient!yf;B)V", line = 10009)
	static final void method28515(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt58 * 1160623023;
	}

	@OriginalMember(owner = "client!mm", name = "anr", descriptor = "(Lclient!yf;I)V", line = 11924)
	static final void method28516(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5494 * 1426180139;
	}

	@OriginalMember(owner = "client!mm", name = "aog", descriptor = "(Lclient!yf;I)V", line = 12074)
	static final void method28517(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, local12);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, local12);
		Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1.method15436();
		Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2.method15436();
		Class127_Sub5.method13161();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
