package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public class Class522 {

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
	int anInt5154;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
	int anInt5155;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
	int anInt5153;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "I")
	int anInt5156;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "Ljava/lang/String;")
	String aString225;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(II)Lclient!ym;", line = 29)
	public static Class670 method30604(@OriginalArg(0) int arg0) {
		@Pc(2) Class670[] local2 = Class131_Sub6.method13133();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class670 local12 = local2[local4];
			if (local12.anInt5791 * -1082924039 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(Lclient!aqm;B)V", line = 494)
	static void method30605(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		if (arg0 == null) {
			return;
		}
		Class683.aClass695_55.method36383(arg0);
		Class683.anInt5826 += 914117357;
		@Pc(12) Class77_Sub1_Sub11 local12 = null;
		if (arg0.aBoolean491 || "".equals(arg0.aString93)) {
			local12 = new Class77_Sub1_Sub11(arg0.aString93);
			Class683.anInt5840 += -210574503;
		} else {
			@Pc(25) long local25 = arg0.aLong150 * -6387465159951953483L;
			for (local12 = (Class77_Sub1_Sub11) Class683.aClass12_39.method173(local25); local12 != null && !local12.aString107.equals(arg0.aString93); local12 = (Class77_Sub1_Sub11) Class683.aClass12_39.method176()) {
			}
			if (local12 == null) {
				local12 = (Class77_Sub1_Sub11) Class683.aClass232_93.method25835(local25);
				if (local12 != null && !local12.aString107.equals(arg0.aString93)) {
					local12 = null;
				}
				if (local12 == null) {
					local12 = new Class77_Sub1_Sub11(arg0.aString93);
				}
				Class683.aClass12_39.method184(local12, local25);
				Class683.anInt5840 += -210574503;
			}
		}
		if (local12.method22231(arg0)) {
			Class532.method30743(local12);
		}
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(IIIILjava/lang/String;)V", line = 856)
	public Class522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		this.anInt5154 = arg0 * 841081689;
		this.anInt5155 = arg1 * -333122647;
		this.anInt5153 = arg2 * -595290433;
		this.anInt5156 = arg3 * -1922414797;
		this.aString225 = arg4;
	}

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "()I", line = 865)
	int method30606() {
		return this.anInt5154 * -2020985623;
	}

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "()I", line = 865)
	int method30607() {
		return this.anInt5154 * -2020985623;
	}

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "()I", line = 865)
	int method30608() {
		return this.anInt5154 * -2020985623;
	}

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "(I)I", line = 865)
	int method30609() {
		return this.anInt5154 * -2020985623;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)I", line = 869)
	int method30610() {
		return this.anInt5155 * -1525456743;
	}

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "(B)I", line = 873)
	int method30611() {
		return this.anInt5153 * -1926637249;
	}

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "()I", line = 873)
	int method30612() {
		return this.anInt5153 * -1926637249;
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(I)I", line = 877)
	int method30613() {
		return this.anInt5156 * -179368965;
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "()I", line = 877)
	int method30614() {
		return this.anInt5156 * -179368965;
	}

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "()I", line = 877)
	int method30615() {
		return this.anInt5156 * -179368965;
	}

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "()I", line = 877)
	int method30616() {
		return this.anInt5156 * -179368965;
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "()I", line = 877)
	int method30617() {
		return this.anInt5156 * -179368965;
	}

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "()Ljava/lang/String;", line = 881)
	String method30618() {
		return this.aString225;
	}

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "()Ljava/lang/String;", line = 881)
	String method30619() {
		return this.aString225;
	}

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "(I)Ljava/lang/String;", line = 881)
	String method30620() {
		return this.aString225;
	}

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "()Ljava/lang/String;", line = 881)
	String method30621() {
		return this.aString225;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "()Ljava/lang/String;", line = 881)
	String method30622() {
		return this.aString225;
	}

	@OriginalMember(owner = "client!rw", name = "jn", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6169)
	static final void method30623(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aStringArray25 = null;
	}

	@OriginalMember(owner = "client!rw", name = "aae", descriptor = "(Lclient!yf;I)V", line = 9247)
	static final void method30624(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aByte150;
	}

	@OriginalMember(owner = "client!rw", name = "avd", descriptor = "(Lclient!yf;B)V", line = 13136)
	static final void method30625(@OriginalArg(0) Class665 arg0) {
		if (client.aBoolean588) {
			Class413.aClass413_10.method28607();
		}
	}
}
