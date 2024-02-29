package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!x")
public class Class636 {

	@OriginalMember(owner = "client!x", name = "in", descriptor = "Lclient!wq;")
	public static Class627 aClass627_1;

	@OriginalMember(owner = "client!x", name = "qr", descriptor = "I")
	static int anInt5713;

	@OriginalMember(owner = "client!x", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString238 = Class255.method26206() + "\\RuneScape-Setup.exe";

	@OriginalMember(owner = "client!x", name = "v", descriptor = "Lclient!al;")
	static Class142 aClass142_5 = Class142.aClass142_1;

	@OriginalMember(owner = "client!x", name = "<init>", descriptor = "()V", line = 13)
	Class636() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!x", name = "w", descriptor = "()V", line = 18)
	public static void method32680() throws RuntimeException {
		if (!Class508.aString221.startsWith("win")) {
			return;
		}
		Class418.method28682();
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = aString238;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class142.aClass142_4 == aClass142_5) {
			throw new RuntimeException();
		}
		try {
			Class257.aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			aClass142_5 = Class142.aClass142_4;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!x", name = "y", descriptor = "()V", line = 18)
	public static void method32681() throws RuntimeException {
		if (!Class508.aString221.startsWith("win")) {
			return;
		}
		Class418.method28682();
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = aString238;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class142.aClass142_4 == aClass142_5) {
			throw new RuntimeException();
		}
		try {
			Class257.aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			aClass142_5 = Class142.aClass142_4;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!x", name = "q", descriptor = "()I", line = 43)
	public static int method32682() {
		Class418.method28682();
		return aClass142_5.anInt2016 * 756058023;
	}

	@OriginalMember(owner = "client!x", name = "t", descriptor = "()I", line = 43)
	public static int method32683() {
		Class418.method28682();
		return aClass142_5.anInt2016 * 756058023;
	}

	@OriginalMember(owner = "client!x", name = "x", descriptor = "()V", line = 48)
	static void method32684() {
		if (Class195.method25447()) {
			aClass142_5 = Class257.aProcess1.exitValue() == 0 ? Class142.aClass142_2 : Class142.aClass142_3;
			Class257.aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!x", name = "d", descriptor = "()V", line = 48)
	static void method32685() {
		if (Class195.method25447()) {
			aClass142_5 = Class257.aProcess1.exitValue() == 0 ? Class142.aClass142_2 : Class142.aClass142_3;
			Class257.aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!x", name = "s", descriptor = "()Z", line = 55)
	static boolean method32686() {
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

	@OriginalMember(owner = "client!x", name = "e", descriptor = "(Lclient!yf;B)V", line = 111)
	static void method32687(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(17) TwitchWebcamDevice local17 = Class630.method32603(local13);
		if (local17 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local17.v * -1989490985;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.p;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local17.c;
		}
	}

	@OriginalMember(owner = "client!x", name = "x", descriptor = "(IIFB)I", line = 180)
	public static int method32688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return Class227.method25798(arg0, arg1, (int) arg2);
	}

	@OriginalMember(owner = "client!x", name = "e", descriptor = "(Lclient!cu;Lclient!as;B)I", line = 259)
	static int method32689(@OriginalArg(0) Interface19 arg0, @OriginalArg(1) Interface13 arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18318(); local3++) {
			@Pc(14) Class303 local14 = (Class303) arg1.method18319(local3);
			if (local14.method27169(arg0)) {
				local1 += local14.anInt4054 * -1628667329;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!x", name = "iq", descriptor = "(Lclient!yf;I)V", line = 5954)
	static final void method32690(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class294.method27029(local11, local14, arg0, Class283.aClass283_6);
	}

	@OriginalMember(owner = "client!x", name = "ams", descriptor = "(Lclient!yf;B)V", line = 11797)
	static final void method32691(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 1235998252;
		@Pc(14) float local14 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) float local25 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] / 1000.0F;
		Class597.aClass107_Sub1_2.method8828(Class447.method29120(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!x", name = "amo", descriptor = "(Lclient!yf;I)V", line = 11838)
	static final void method32692(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class11.anInt36 * -891094135 == 3 ? 1 : 0;
	}
}
