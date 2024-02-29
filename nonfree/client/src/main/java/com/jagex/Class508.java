package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public class Class508 {

	@OriginalMember(owner = "client!rg", name = "ai", descriptor = "I")
	static int anInt5091;

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString221;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString222;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljava/lang/String;")
	static final String aString223;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "Ljava/lang/String;")
	public static final String aString220;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString221 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString222 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		aString223 = local1.toLowerCase();
		aString220 = String.format("%s (%s) [%s]", aString221, aString222, aString223);
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(79) Exception local79) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V", line = 52)
	Class508() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!rg", name = "vc", descriptor = "(Lclient!yf;I)V", line = 8355)
	static final void method30267(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class55.aClass124_1.method11087(local12);
	}

	@OriginalMember(owner = "client!rg", name = "ajm", descriptor = "(Lclient!yf;B)V", line = 11083)
	static final void method30268(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		Class138.method14215((String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147], (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1], "", arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1, false);
	}

	@OriginalMember(owner = "client!rg", name = "aus", descriptor = "(Lclient!yf;I)V", line = 13034)
	static final void method30269(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class73.anInt217 * -1438703763;
	}
}
