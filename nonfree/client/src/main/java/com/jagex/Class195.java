package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cs")
public class Class195 {

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "Lclient!oi;")
	public Class442 aClass442_96;

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "Lclient!cs;")
	public Class195 aClass195_2;

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
	public int anInt3546;

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "I")
	public int anInt3547;

	@OriginalMember(owner = "client!cs", name = "y", descriptor = "I")
	public int anInt3548;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
	public final int anInt3549;

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
	public final int anInt3550;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(II)V", line = 16)
	Class195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3549 = arg0 * 1112319467;
		this.anInt3550 = arg1 * -1254290551;
	}

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "(Lclient!mn;)Lclient!mc;", line = 22)
	public Class395 method25443(@OriginalArg(0) Interface45 arg0) {
		return arg0.method28446(this.anInt3549 * 1218140867);
	}

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "(Lclient!mn;B)Lclient!mc;", line = 22)
	public Class395 method25444(@OriginalArg(0) Interface45 arg0) {
		return arg0.method28446(this.anInt3549 * 1218140867);
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(II)Lclient!cs;", line = 26)
	Class195 method25445(@OriginalArg(0) int arg0) {
		return new Class195(this.anInt3549 * 1218140867, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "(I)Lclient!cs;", line = 26)
	Class195 method25446(@OriginalArg(0) int arg0) {
		return new Class195(this.anInt3549 * 1218140867, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "l", descriptor = "(I)Z", line = 55)
	static boolean method25447() {
		if (Class257.aProcess1 == null) {
			return false;
		}
		try {
			Class257.aProcess1.exitValue();
			return true;
		} catch (@Pc(9) IllegalThreadStateException local9) {
			return false;
		}
	}

	@OriginalMember(owner = "client!cs", name = "hr", descriptor = "(Lclient!yf;I)V", line = 5831)
	static final void method25448(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class77_Sub19.method13488(local11, local14, false, 1, arg0);
	}

	@OriginalMember(owner = "client!cs", name = "abk", descriptor = "(Lclient!yf;I)V", line = 9360)
	static final void method25449(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass77_Sub25_3.aClass358Array1[local12].aByte149;
	}

	@OriginalMember(owner = "client!cs", name = "avt", descriptor = "(Lclient!yf;I)V", line = 13160)
	static final void method25450(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1.method14934() ? 1 : 0;
	}
}
