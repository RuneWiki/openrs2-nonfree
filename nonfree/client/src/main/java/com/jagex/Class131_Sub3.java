package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiv")
public class Class131_Sub3 extends Class131 {

	@OriginalMember(owner = "client!aiv", name = "ak", descriptor = "I")
	static int anInt1436;

	@OriginalMember(owner = "client!aiv", name = "v", descriptor = "I")
	int anInt1435 = (int) (Class280.method26667() / 1000L) * -1664898365;

	@OriginalMember(owner = "client!aiv", name = "l", descriptor = "Ljava/lang/String;")
	String aString45;

	@OriginalMember(owner = "client!aiv", name = "y", descriptor = "S")
	short aShort100;

	@OriginalMember(owner = "client!aiv", name = "dx", descriptor = "(IIIB)V", line = 791)
	static void method13094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1008) {
			Class675.method35962(Class135.aClass135_24, arg1, arg2);
		} else if (arg0 == 1009) {
			Class675.method35962(Class135.aClass135_34, arg1, arg2);
		} else if (arg0 == 1010) {
			Class675.method35962(Class135.aClass135_25, arg1, arg2);
		} else if (arg0 == 1011) {
			Class675.method35962(Class135.aClass135_23, arg1, arg2);
		} else if (arg0 == 1012) {
			Class675.method35962(Class135.aClass135_43, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!aiv", name = "aa", descriptor = "(IIIIIIILclient!are;Lclient!dj;Lclient!aar;IIB)V", line = 1181)
	static void method13095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class77_Sub1_Sub11 arg7, @OriginalArg(8) Class94 arg8, @OriginalArg(9) Class17 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg0 > arg2 && arg0 < arg4 + arg2 && arg1 > arg6 - arg9.anInt52 * 102396103 - 1 && arg1 < arg6 + arg9.anInt51 * 728893755) {
			arg10 = arg11;
		}
		@Pc(31) String local31 = Class632.method32648(arg7);
		arg8.method7628(local31, arg2 + 3, arg6, arg10, 0, client.aRandom2, Class703.anInt5889, Class148.aClass83Array6, null);
	}

	@OriginalMember(owner = "client!aiv", name = "aas", descriptor = "(Lclient!yf;I)V", line = 9259)
	static final void method13096(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = arg0.aClass368_3.aStringArray30[local12];
	}

	@OriginalMember(owner = "client!aiv", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 12494)
	Class131_Sub3(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString45 = arg0;
		this.aShort100 = (short) arg1;
	}
}
