package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xc")
public final class Class639 {

	@OriginalMember(owner = "client!xc", name = "ai", descriptor = "I")
	static int anInt5719;

	@OriginalMember(owner = "client!xc", name = "lh", descriptor = "I")
	public static int anInt5720;

	@OriginalMember(owner = "client!xc", name = "c", descriptor = "I")
	public volatile int anInt5718 = -1659133145;

	@OriginalMember(owner = "client!xc", name = "p", descriptor = "Ljava/lang/String;")
	volatile String aString239;

	@OriginalMember(owner = "client!xc", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 7)
	Class639(@OriginalArg(0) String arg0) {
		this.aString239 = arg0;
	}

	@OriginalMember(owner = "client!xc", name = "d", descriptor = "(Lclient!akv;IB)V", line = 428)
	static void method32723(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (Class504.aClass34_4 == null) {
			return;
		}
		try {
			Class504.aClass34_4.method542(0L);
			Class504.aClass34_4.method562(arg0.aByteArray53, arg1, 24);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!xc", name = "ad", descriptor = "(B)Lclient!aqm;", line = 1066)
	public static Class77_Sub1_Sub7 method32724() {
		return Class281.aClass77_Sub1_Sub7_3;
	}

	@OriginalMember(owner = "client!xc", name = "jz", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 6133)
	static final void method32725(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aString179 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
	}

	@OriginalMember(owner = "client!xc", name = "mm", descriptor = "(Ljava/lang/String;ZI)V", line = 12129)
	public static final void method32726(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) int local5 = client.aBoolean629 ? 400 : 100;
		if (arg0 == null) {
			return;
		}
		if (client.anInt3532 * 2103713403 >= local5) {
			Class554.method31068(4, client.aBoolean629 ? Class44.aClass44_148.method713(Class128.aClass667_3) : Class44.aClass44_41.method713(Class128.aClass667_3));
			return;
		}
		@Pc(33) String local33 = Class471.method29622(arg0, Class33.aClass53_11);
		if (local33 == null) {
			return;
		}
		@Pc(38) int local38;
		@Pc(53) String local53;
		@Pc(84) String local84;
		for (local38 = 0; local38 < client.anInt3532 * 2103713403; local38++) {
			@Pc(47) Class217 local47 = client.aClass217Array1[local38];
			local53 = Class471.method29622(local47.aString169, Class33.aClass53_11);
			if (local53 != null && local53.equals(local33)) {
				Class554.method31068(4, arg0 + Class44.aClass44_150.method713(Class128.aClass667_3));
				return;
			}
			if (local47.aString171 != null) {
				local84 = Class471.method29622(local47.aString171, Class33.aClass53_11);
				if (local84 != null && local84.equals(local33)) {
					Class554.method31068(4, arg0 + Class44.aClass44_150.method713(Class128.aClass667_3));
					return;
				}
			}
		}
		for (local38 = 0; local38 < client.anInt3529 * -1979292205; local38++) {
			@Pc(118) Class162 local118 = client.aClass162Array1[local38];
			local53 = Class471.method29622(local118.aString131, Class33.aClass53_11);
			if (local53 != null && local53.equals(local33)) {
				Class554.method31068(4, Class44.aClass44_156.method713(Class128.aClass667_3) + arg0 + Class44.aClass44_157.method713(Class128.aClass667_3));
				return;
			}
			if (local118.aString129 != null) {
				local84 = Class471.method29622(local118.aString129, Class33.aClass53_11);
				if (local84 != null && local84.equals(local33)) {
					Class554.method31068(4, Class44.aClass44_156.method713(Class128.aClass667_3) + arg0 + Class44.aClass44_157.method713(Class128.aClass667_3));
					return;
				}
			}
		}
		if (Class471.method29622(Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aString82, Class33.aClass53_11).equals(local33)) {
			Class554.method31068(4, Class44.aClass44_152.method713(Class128.aClass667_3));
			return;
		}
		@Pc(207) Class82 local207 = Class230.method25826();
		@Pc(213) Class77_Sub20 local213 = Class365.method28132(Class414.aClass414_106, local207.aClass16_1);
		local213.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0) + 1);
		local213.aClass77_Sub39_Sub1_2.method22440(arg0);
		local213.aClass77_Sub39_Sub1_2.method22403(arg1 ? 1 : 0);
		local207.method2004(local213);
	}
}
