package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acd")
public class Class53 implements Interface75 {

	@OriginalMember(owner = "client!acd", name = "p", descriptor = "Lclient!acd;")
	public static final Class53 aClass53_8 = new Class53(2, 0, "", "");

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "Lclient!acd;")
	static final Class53 aClass53_2 = new Class53(1, 1, "", "");

	@OriginalMember(owner = "client!acd", name = "v", descriptor = "Lclient!acd;")
	static final Class53 aClass53_3 = new Class53(5, 2, "", "");

	@OriginalMember(owner = "client!acd", name = "l", descriptor = "Lclient!acd;")
	public static final Class53 aClass53_4 = new Class53(6, 3, "", "");

	@OriginalMember(owner = "client!acd", name = "y", descriptor = "Lclient!acd;")
	static final Class53 aClass53_10 = new Class53(8, 4, "", "");

	@OriginalMember(owner = "client!acd", name = "w", descriptor = "Lclient!acd;")
	public static final Class53 aClass53_7 = new Class53(7, 5, "", "");

	@OriginalMember(owner = "client!acd", name = "t", descriptor = "Lclient!acd;")
	public static final Class53 aClass53_5 = new Class53(4, 6, "", "");

	@OriginalMember(owner = "client!acd", name = "q", descriptor = "Lclient!acd;")
	static final Class53 aClass53_6 = new Class53(3, 7, "", "");

	@OriginalMember(owner = "client!acd", name = "x", descriptor = "Lclient!acd;")
	public static final Class53 aClass53_9 = new Class53(0, -1, "", "", true, new Class53[] { aClass53_8, aClass53_2, aClass53_3, aClass53_10, aClass53_4 });

	@OriginalMember(owner = "client!acd", name = "d", descriptor = "I")
	final int anInt182;

	@OriginalMember(owner = "client!acd", name = "s", descriptor = "I")
	final int anInt181;

	@OriginalMember(owner = "client!acd", name = "r", descriptor = "Ljava/lang/String;")
	final String aString12;

	@OriginalMember(owner = "client!acd", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;)V", line = 20)
	Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.anInt182 = arg0 * -864842895;
		this.anInt181 = arg1 * 425623215;
		this.aString12 = arg3;
	}

	@OriginalMember(owner = "client!acd", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lclient!acd;)V", line = 26)
	Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class53[] arg5) {
		this.anInt182 = arg0 * -864842895;
		this.anInt181 = arg1 * 425623215;
		this.aString12 = arg3;
	}

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "()I", line = 33)
	@Override
	public int method36479() {
		return this.anInt181 * -1995335601;
	}

	@OriginalMember(owner = "client!acd", name = "l", descriptor = "()I", line = 33)
	@Override
	public int method36478() {
		return this.anInt181 * -1995335601;
	}

	@OriginalMember(owner = "client!acd", name = "y", descriptor = "()I", line = 33)
	@Override
	public int method36477() {
		return this.anInt181 * -1995335601;
	}

	@OriginalMember(owner = "client!acd", name = "toString", descriptor = "()Ljava/lang/String;", line = 37)
	@Override
	public String toString() {
		return this.aString12;
	}

	@OriginalMember(owner = "client!acd", name = "rs", descriptor = "()Ljava/lang/String;", line = 37)
	public String method792() {
		return this.aString12;
	}

	@OriginalMember(owner = "client!acd", name = "ro", descriptor = "()Ljava/lang/String;", line = 37)
	public String method793() {
		return this.aString12;
	}

	@OriginalMember(owner = "client!acd", name = "ru", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 7658)
	static final void method794(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		@Pc(5) Class17 local5 = arg0.method26602(Class367.aClass415_1, client.anInterface51_1);
		@Pc(18) int local18 = arg1.anIntArray536[(arg1.anInt5784 -= 308999563) * 2088438307];
		@Pc(34) Point local34 = local5.method313(arg0.aString178, arg0.anInt3874 * -881188269, arg0.anInt3907 * -1959194819, local18, Class148.aClass83Array6);
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local34.x;
		arg1.anIntArray536[(arg1.anInt5784 += 308999563) * 2088438307 - 1] = local34.y;
	}
}
