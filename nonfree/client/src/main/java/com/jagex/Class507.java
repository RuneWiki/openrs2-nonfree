package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class507 {

	@OriginalMember(owner = "client!re", name = "z", descriptor = "I")
	public static final int anInt5070 = 29;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static final int anInt5071 = -3;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public static final int anInt5072 = -4;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	public static final int anInt5073 = -5;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "I")
	public static final int anInt5074 = 48;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	public static final int anInt5075 = 2;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "I")
	public static final int anInt5076 = 3;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static final int anInt5077 = 6;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	public static final int anInt5078 = 9;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public static final int anInt5079 = 15;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public static final int anInt5080 = 23;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "I")
	public static final int anInt5081 = 21;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static final int anInt5082 = 1;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public static final int anInt5083 = 52;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static final int anInt5084 = 35;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static final int anInt5085 = 49;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "I")
	public static final int anInt5086 = 45;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	public static final int anInt5087 = -2;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	public static final int anInt5088 = 7;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static final int anInt5089 = 42;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public static final int anInt5090 = 53;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 26)
	Class507() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!re", name = "od", descriptor = "(Lclient!yf;I)V", line = 7135)
	static final void method30265(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class494.method30056(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!re", name = "mh", descriptor = "(Ljava/lang/String;I)V", line = 12009)
	public static final void method30266(@OriginalArg(0) String arg0) {
		if (Class204.aClass50Array1 == null) {
			return;
		}
		@Pc(5) Class82 local5 = Class230.method25826();
		@Pc(11) Class77_Sub20 local11 = Class365.method28132(Class414.aClass414_66, local5.aClass16_1);
		local11.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0));
		local11.aClass77_Sub39_Sub1_2.method22440(arg0);
		local5.method2004(local11);
	}
}
