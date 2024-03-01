package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public class Class42 {

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	final int anInt887;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "S")
	final short aShort40;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "S")
	final short aShort41;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "S")
	final short aShort39;

	@OriginalMember(owner = "client!ae", name = "x", descriptor = "B")
	final byte aByte21;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "B")
	final byte aByte20;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "Z")
	final boolean aBoolean185;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
	final int anInt888;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 13)
	Class42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.anInt887 = arg0 * -1125908959;
		this.aShort40 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort39 = (short) arg6;
		this.aByte21 = (byte) arg7;
		this.aByte20 = (byte) arg8;
		this.aBoolean185 = arg9;
		this.anInt888 = arg10 * 536924153;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(II)V", line = 28)
	public static void method8326(@OriginalArg(0) int arg0) {
		Class293.method25561(new Class441(arg0));
	}

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "(I)V", line = 232)
	public static void method8327() {
		Class231.aBoolean678 = true;
		Class34_Sub2.aString40 = Class190.aString178;
		Class60_Sub16.aString66 = Class190.aString179;
		Class394.method27445(false);
		Class34.method16494();
		Class231.aClass218Array1 = null;
		Class626.aClass334_1 = null;
		Class166.method23342(0);
	}

	@OriginalMember(owner = "client!ae", name = "db", descriptor = "(Lclient!de;Lclient!wk;III)V", line = 343)
	static void method8328(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class553 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class269.aClass553_55.method32701();
		if (Class58_Sub1.aBoolean319) {
			return;
		}
		for (@Pc(10) Class3_Sub26 local10 = (Class3_Sub26) arg1.method32768(); local10 != null; local10 = (Class3_Sub26) arg1.method32709()) {
			@Pc(20) Class452 local20 = Class58_Sub1.aClass454_2.method28448(local10.anInt1304 * 1865552421);
			if (Class44_Sub1.method8406(local20)) {
				@Pc(33) boolean local33 = Class343.method26483(arg0, local10, local20, arg2, arg3);
				if (local33) {
					Class201.method24157(arg0, local10, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "bi", descriptor = "(Lclient!vs;I)V", line = 4262)
	static final void method8329(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class109.method21947(local11, arg0);
	}
}
