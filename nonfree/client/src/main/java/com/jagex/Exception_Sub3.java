package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajj")
public class Exception_Sub3 extends Exception {

	@OriginalMember(owner = "client!ajj", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "client!ajj", name = "a", descriptor = "I")
	public final int anInt2061;

	@OriginalMember(owner = "client!ajj", name = "<init>", descriptor = "(ILjava/lang/String;)V", line = 8)
	Exception_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	@OriginalMember(owner = "client!ajj", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 12)
	Exception_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Throwable arg2) {
		super(arg2);
		this.aString67 = arg1;
		this.anInt2061 = arg0 * 1108677827;
	}
}
