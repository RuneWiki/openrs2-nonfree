package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asx")
public class RuntimeException_Sub4 extends RuntimeException {

	@OriginalMember(owner = "client!asx", name = "l", descriptor = "I")
	static int anInt3175;

	@OriginalMember(owner = "client!asx", name = "it", descriptor = "Lclient!abq;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!asx", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 457)
	public RuntimeException_Sub4(@OriginalArg(0) String arg0) {
		super(arg0);
	}
}
