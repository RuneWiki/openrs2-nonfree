package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yt")
public class Class676 implements Interface75 {

	@OriginalMember(owner = "client!yt", name = "p", descriptor = "Lclient!yt;")
	public static final Class676 aClass676_1 = new Class676(0, "");

	@OriginalMember(owner = "client!yt", name = "c", descriptor = "Lclient!yt;")
	public static final Class676 aClass676_2 = new Class676(1, "");

	@OriginalMember(owner = "client!yt", name = "v", descriptor = "I")
	final int anInt5803;

	@OriginalMember(owner = "client!yt", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 10)
	Class676(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this.anInt5803 = arg0 * 2005154403;
	}

	@OriginalMember(owner = "client!yt", name = "c", descriptor = "()I", line = 15)
	@Override
	public int method36479() {
		return this.anInt5803 * 1177294667;
	}

	@OriginalMember(owner = "client!yt", name = "y", descriptor = "()I", line = 15)
	@Override
	public int method36477() {
		return this.anInt5803 * 1177294667;
	}

	@OriginalMember(owner = "client!yt", name = "l", descriptor = "()I", line = 15)
	@Override
	public int method36478() {
		return this.anInt5803 * 1177294667;
	}

	@OriginalMember(owner = "client!yt", name = "q", descriptor = "(Lclient!akv;I)Lclient!mq;", line = 16)
	public static Class118 method35968(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class118 local3 = Class35_Sub19.method17775(arg0);
		@Pc(7) int local7 = arg0.method22500();
		@Pc(11) int local11 = arg0.method22500();
		@Pc(15) int local15 = arg0.method22549();
		return new Class118_Sub2(local3.aClass410_8, local3.aClass402_8, local3.anInt2926 * -2127596367, local3.anInt2920 * -1055236307, local3.anInt2922 * -1607607997, local3.anInt2923 * -228886179, local3.anInt2924 * -81046249, local3.anInt2925 * -120853723, local3.anInt2921 * 1210620409, local7, local11, local15);
	}

	@OriginalMember(owner = "client!yt", name = "p", descriptor = "(Lclient!akv;B)Lclient!ml;", line = 21)
	public static Class121 method35969(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22549();
		@Pc(10) Class410 local10 = Class683.method36094()[arg0.method22478()];
		@Pc(17) Class402 local17 = Class700.method36485()[arg0.method22478()];
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22487();
		return new Class121(local3, local10, local17, local21, local25);
	}

	@OriginalMember(owner = "client!yt", name = "abq", descriptor = "(Lclient!yf;I)V", line = 9415)
	static final void method35970(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass497ArrayArray1[local23][local13].anInt5061 * 818084131;
	}

	@OriginalMember(owner = "client!yt", name = "ahp", descriptor = "(Lclient!yf;I)V", line = 10652)
	static final void method35971(@OriginalArg(0) Class665 arg0) {
		Class202.method25547(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}
}
