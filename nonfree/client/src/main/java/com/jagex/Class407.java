package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public class Class407 implements Interface46 {

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
	public final int anInt4706;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(I)V", line = 8)
	Class407(@OriginalArg(0) int arg0) {
		this.anInt4706 = arg0 * 686099959;
	}

	@OriginalMember(owner = "client!mu", name = "v", descriptor = "(Lclient!akv;)Lclient!mu;", line = 13)
	public static Class407 method28543(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22500();
		return new Class407(local3);
	}

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "()Lclient!mt;", line = 18)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_5;
	}

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)Lclient!mt;", line = 18)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_5;
	}

	@OriginalMember(owner = "client!mu", name = "y", descriptor = "()Lclient!mt;", line = 18)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_5;
	}

	@OriginalMember(owner = "client!mu", name = "w", descriptor = "()Lclient!mt;", line = 18)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_5;
	}

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "(B)[Lclient!jt;", line = 27)
	static Class349[] method28544() {
		return new Class349[] { Class349.aClass349_12, Class349.aClass349_4, Class349.aClass349_3, Class349.aClass349_10, Class349.aClass349_6, Class349.aClass349_14, Class349.aClass349_2, Class349.aClass349_8, Class349.aClass349_7, Class349.aClass349_15, Class349.aClass349_11, Class349.aClass349_9, Class349.aClass349_13, Class349.aClass349_5, Class349.aClass349_1 };
	}

	@OriginalMember(owner = "client!mu", name = "e", descriptor = "(ILclient!yi;Lclient!ws;I)Ljava/lang/String;", line = 616)
	static String method28545(@OriginalArg(0) int arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) Class629 arg2) {
		if (arg0 < 100000) {
			return Class334.method27668(arg2.anInt5682 * -1811112665) + arg0 + Class18.aString4;
		} else if (arg0 < 10000000) {
			return Class334.method27668(arg2.anInt5683 * 1015708637) + arg0 / 1000 + Class44.aClass44_144.method713(arg1) + Class18.aString4;
		} else {
			return Class334.method27668(arg2.anInt5684 * 1348295193) + arg0 / 1000000 + Class44.aClass44_142.method713(arg1) + Class18.aString4;
		}
	}

	@OriginalMember(owner = "client!mu", name = "yn", descriptor = "(Lclient!yf;B)V", line = 8988)
	static final void method28546(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3453 * -1050164879 == 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3532 * 2103713403;
		}
	}

	@OriginalMember(owner = "client!mu", name = "awd", descriptor = "(Lclient!yf;I)V", line = 13236)
	static final void method28547(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
