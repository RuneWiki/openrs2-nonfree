package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ym")
public class Class670 {

	@OriginalMember(owner = "client!ym", name = "p", descriptor = "Lclient!ym;")
	public static final Class670 aClass670_5 = new Class670("runescape", "RuneScape", 0, Class53.aClass53_8);

	@OriginalMember(owner = "client!ym", name = "c", descriptor = "Lclient!ym;")
	public static final Class670 aClass670_6 = new Class670("stellardawn", "Stellar Dawn", 1, Class53.aClass53_4);

	@OriginalMember(owner = "client!ym", name = "v", descriptor = "Lclient!ym;")
	static final Class670 aClass670_7 = new Class670("game3", "Game 3", 2, Class53.aClass53_8);

	@OriginalMember(owner = "client!ym", name = "l", descriptor = "Lclient!ym;")
	static final Class670 aClass670_8 = new Class670("game4", "Game 4", 3, Class53.aClass53_7);

	@OriginalMember(owner = "client!ym", name = "y", descriptor = "Lclient!ym;")
	static final Class670 aClass670_9 = new Class670("game5", "Game 5", 4, Class53.aClass53_5);

	@OriginalMember(owner = "client!ym", name = "w", descriptor = "Lclient!ym;")
	static final Class670 aClass670_10 = new Class670("oldscape", "RuneScape 2007", 5, Class53.aClass53_8);

	@OriginalMember(owner = "client!ym", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString245;

	@OriginalMember(owner = "client!ym", name = "q", descriptor = "Ljava/lang/String;")
	public final String aString246;

	@OriginalMember(owner = "client!ym", name = "x", descriptor = "I")
	public final int anInt5791;

	@OriginalMember(owner = "client!ym", name = "v", descriptor = "()[Lclient!ym;", line = 18)
	static Class670[] method33191() {
		return new Class670[] { aClass670_10, aClass670_7, aClass670_6, aClass670_9, aClass670_8, aClass670_5 };
	}

	@OriginalMember(owner = "client!ym", name = "p", descriptor = "(I)[Lclient!mt;", line = 19)
	public static Class406[] method33192() {
		return new Class406[] { Class406.aClass406_5, Class406.aClass406_2, Class406.aClass406_3, Class406.aClass406_4, Class406.aClass406_1, Class406.aClass406_6, Class406.aClass406_7, Class406.aClass406_9, Class406.aClass406_8, Class406.aClass406_10, Class406.aClass406_11 };
	}

	@OriginalMember(owner = "client!ym", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILclient!acd;)V", line = 21)
	Class670(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class53 arg3) {
		this.aString245 = arg0;
		this.aString246 = arg1;
		this.anInt5791 = arg2 * 230125129;
	}

	@OriginalMember(owner = "client!ym", name = "y", descriptor = "(I)Lclient!ym;", line = 29)
	public static Class670 method33193(@OriginalArg(0) int arg0) {
		@Pc(2) Class670[] local2 = Class131_Sub6.method13133();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class670 local12 = local2[local4];
			if (local12.anInt5791 * -1082924039 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ym", name = "l", descriptor = "(I)Lclient!ym;", line = 29)
	public static Class670 method33194(@OriginalArg(0) int arg0) {
		@Pc(2) Class670[] local2 = Class131_Sub6.method13133();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class670 local12 = local2[local4];
			if (local12.anInt5791 * -1082924039 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ym", name = "fk", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5429)
	static final void method33195(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 617999126;
		arg0.anInt3881 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * -468308361;
		arg0.anInt3882 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * -599876415;
		Class461.method29531(arg0);
		if (arg0.anInt3857 * -1960530827 == 0) {
			Class145.method15080(arg1, arg0, false);
		}
	}

	@OriginalMember(owner = "client!ym", name = "fi", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5451)
	static final void method33196(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean671 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
		Class461.method29531(arg0);
	}

	@OriginalMember(owner = "client!ym", name = "sd", descriptor = "(Lclient!yf;B)V", line = 7900)
	static final void method33197(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3884 * 1943720095;
	}

	@OriginalMember(owner = "client!ym", name = "art", descriptor = "(Lclient!yf;I)V", line = 12499)
	static final void method33198(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
