package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alk")
public class Class93_Sub37 extends Class93 {

	@OriginalMember(owner = "client!alk", name = "an", descriptor = "I")
	public static int anInt1960;

	@OriginalMember(owner = "client!alk", name = "k", descriptor = "I")
	int anInt1958;

	@OriginalMember(owner = "client!alk", name = "w", descriptor = "I")
	int anInt1959;

	@OriginalMember(owner = "client!alk", name = "l", descriptor = "[I")
	int[] anIntArray194;

	@OriginalMember(owner = "client!alk", name = "u", descriptor = "[I")
	int[] anIntArray195;

	@OriginalMember(owner = "client!alk", name = "d", descriptor = "[[[B")
	byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!alk", name = "f", descriptor = "[I")
	int[] anIntArray196;

	@OriginalMember(owner = "client!alk", name = "p", descriptor = "[Ljava/lang/reflect/Method;")
	Method[] aMethodArray1;

	@OriginalMember(owner = "client!alk", name = "z", descriptor = "[Ljava/lang/reflect/Field;")
	Field[] aFieldArray1;

	@OriginalMember(owner = "client!alk", name = "<init>", descriptor = "()V", line = 16)
	Class93_Sub37() {
	}

	@OriginalMember(owner = "client!alk", name = "aya", descriptor = "(Lclient!yf;I)V", line = 14054)
	static final void method14684(@OriginalArg(0) Class681 arg0) {
		Class586.method31641();
		Class275.method26341();
		client.aClass532_1.method30469();
		Class106_Sub1.method5148();
		client.aBoolean601 = false;
	}
}
