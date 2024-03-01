package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajt")
public class Exception_Sub6 extends Exception {

	@OriginalMember(owner = "client!ajt", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!ajt", name = "a", descriptor = "I")
	public final int anInt2087;

	@OriginalMember(owner = "client!ajt", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 8)
	public Exception_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!ajt", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 12)
	Exception_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString71 = arg1;
		this.anInt2087 = arg0 * 89633025;
	}
}
