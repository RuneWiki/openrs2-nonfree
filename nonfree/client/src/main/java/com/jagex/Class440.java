package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public class Class440 {

	@OriginalMember(owner = "client!og", name = "g", descriptor = "I")
	public static final int anInt4928 = 3;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public static final int anInt4929 = 11;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "I")
	public static final int anInt4930 = 8;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "I")
	public static final int anInt4931 = 4;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "I")
	public static final int anInt4932 = 10;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public static final int anInt4933 = 15;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "I")
	public static final int anInt4934 = 12;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	public static final int anInt4935 = 9;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "I")
	public static final int anInt4936 = 17;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public static final int anInt4937 = 7;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	public static final int anInt4938 = 6;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "I")
	public static final int anInt4939 = 16;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "I")
	public static final int anInt4940 = 13;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	public static final int anInt4941 = 14;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public static final int anInt4942 = 5;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public static final int anInt4943 = 1;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public static final int anInt4944 = 2;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "I")
	public static final int anInt4945 = 19;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public static final int anInt4946 = 18;

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public static final int anInt4947 = 0;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 25)
	Class440() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(IB)Z", line = 80)
	public static boolean method28946(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(Lclient!zl;B)V", line = 159)
	static void method28947(@OriginalArg(0) Class694 arg0) {
		Class298.aClass694_1 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "le", descriptor = "(Ljava/lang/String;I)I", line = 11944)
	public static final int method28948(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(5) int local5 = 0; local5 < client.anInt3529 * -1979292205; local5++) {
			if (arg0.equalsIgnoreCase(client.aClass162Array1[local5].aString131)) {
				return local5;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!og", name = "auy", descriptor = "(Lclient!yf;B)V", line = 13085)
	static final void method28949(@OriginalArg(0) Class665 arg0) {
		Class660.method33074();
		Class209.method25586();
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
