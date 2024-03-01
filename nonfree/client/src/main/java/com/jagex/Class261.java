package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class Class261 {

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
	final int anInt4201;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	final int anInt4200;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	final int anInt4202;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	final int anInt4199;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "S")
	final short aShort163;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "S")
	final short aShort162;

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "S")
	final short aShort164;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "Z")
	final boolean aBoolean690;

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	final int anInt4203;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 14)
	Class261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt4201 = arg0;
		this.anInt4200 = arg1;
		this.anInt4202 = arg2;
		this.anInt4199 = arg3;
		this.aShort163 = (short) arg4;
		this.aShort162 = (short) arg5;
		this.aShort164 = (short) arg6;
		this.aBoolean690 = arg10;
		this.anInt4203 = arg11;
	}
}
