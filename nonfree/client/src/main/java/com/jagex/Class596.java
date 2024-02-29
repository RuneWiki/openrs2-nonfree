package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public class Class596 {

	@OriginalMember(owner = "client!vi", name = "p", descriptor = "Lclient!vi;")
	public static final Class596 aClass596_1 = new Class596(0);

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!vi;")
	public static final Class596 aClass596_2 = new Class596(1);

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Lclient!vi;")
	public static final Class596 aClass596_3 = new Class596(4);

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(I)V", line = 8)
	Class596(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "adn", descriptor = "(Lclient!yf;B)V", line = 9691)
	static final void method31918(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local13.toLowerCase();
	}

	@OriginalMember(owner = "client!vi", name = "kw", descriptor = "(Lclient!gm;Lclient!gm;I)V", line = 10144)
	static void method31919(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class277 arg1) {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_8, client.aClass82_2.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22635(arg0.anInt3863 * -1278450723);
		local5.aClass77_Sub39_Sub1_2.method22417(arg1.anInt3863 * -1278450723);
		local5.aClass77_Sub39_Sub1_2.method22609(arg0.anInt3927 * 1365669833);
		local5.aClass77_Sub39_Sub1_2.method22610(arg1.anInt3936 * 403396513);
		local5.aClass77_Sub39_Sub1_2.method22605(arg1.anInt3927 * 1365669833);
		local5.aClass77_Sub39_Sub1_2.method22610(arg0.anInt3936 * 403396513);
		client.aClass82_2.method2004(local5);
	}

	@OriginalMember(owner = "client!vi", name = "aiz", descriptor = "(Lclient!yf;I)V", line = 10835)
	static final void method31920(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(15) Class77_Sub1_Sub8 local15 = Class261.method26362();
		if (local15 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			return;
		}
		@Pc(36) boolean local36 = local15.method21866(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class674.anIntArray538);
		if (local36) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anIntArray538[1];
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anIntArray538[2];
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "mr", descriptor = "(Lclient!gm;I)Ljava/lang/String;", line = 12273)
	static String method31921(@OriginalArg(0) Class277 arg0) {
		if (client.method25376(arg0).method13649() == 0) {
			return null;
		} else if (arg0.aString180 == null || arg0.aString180.trim().length() == 0) {
			return client.aBoolean600 ? "Hidden-use" : null;
		} else {
			return arg0.aString180;
		}
	}

	@OriginalMember(owner = "client!vi", name = "atk", descriptor = "(Lclient!yf;I)V", line = 12934)
	static final void method31922(@OriginalArg(0) Class665 arg0) {
		client.aClass277_4 = null;
		client.aClass277_8 = null;
	}
}
