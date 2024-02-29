package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public class Class409 implements Interface46 {

	@OriginalMember(owner = "client!mw", name = "bn", descriptor = "Lclient!zy;")
	static Class705 aClass705_1;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "I")
	public final int anInt4713;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Lclient!my;")
	public final Class410 aClass410_11;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!mk;")
	public final Class402 aClass402_14;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
	public final int anInt4711;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
	public final int anInt4708;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	public final int anInt4707;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
	public final int anInt4714;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
	public final int anInt4709;

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "I")
	public final int anInt4710;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
	public final int anInt4712;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Z")
	public final boolean aBoolean744;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(ILclient!my;Lclient!mk;IIIIIIIZ)V", line = 18)
	Class409(@OriginalArg(0) int arg0, @OriginalArg(1) Class410 arg1, @OriginalArg(2) Class402 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt4713 = arg0 * 1598778093;
		this.aClass410_11 = arg1;
		this.aClass402_14 = arg2;
		this.anInt4711 = arg3 * 1081540345;
		this.anInt4708 = arg4 * 1152343343;
		this.anInt4707 = arg5 * -1962620777;
		this.anInt4714 = arg6 * -669841951;
		this.anInt4709 = arg7 * -2043822201;
		this.anInt4710 = arg8 * -698633307;
		this.anInt4712 = arg9 * 1569225733;
		this.aBoolean744 = arg10;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(Lclient!aap;IIIII)Ljava/awt/Frame;", line = 29)
	public static Frame method28561(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class7[] local6 = Class642.method32811(arg0);
			if (local6 == null) {
				return null;
			}
			@Pc(12) boolean local12 = false;
			for (@Pc(14) int local14 = 0; local14 < local6.length; local14++) {
				if (local6[local14].anInt24 * -1991181227 == arg1 && local6[local14].anInt25 * -778390023 == arg2 && (arg4 == 0 || arg4 == local6[local14].anInt27 * 1793071357) && (!local12 || local6[local14].anInt26 * 198554383 > arg3)) {
					arg3 = local6[local14].anInt26 * 198554383;
					local12 = true;
				}
			}
			if (!local12) {
				return null;
			}
		}
		@Pc(75) Frame local75 = new Frame("Jagex Full Screen");
		local75.setResizable(false);
		arg0.method254(local75, arg1, arg2, arg3, arg4);
		return local75;
	}

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "(Lclient!akv;)Lclient!mw;", line = 33)
	public static Class409 method28562(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(10) Class410 local10 = Class683.method36094()[arg0.method22478()];
		@Pc(17) Class402 local17 = Class700.method36485()[arg0.method22478()];
		@Pc(21) int local21 = arg0.method22487();
		@Pc(25) int local25 = arg0.method22487();
		@Pc(29) int local29 = arg0.method22483();
		@Pc(33) int local33 = arg0.method22483();
		@Pc(37) int local37 = arg0.method22500();
		@Pc(41) int local41 = arg0.method22500();
		@Pc(45) int local45 = arg0.method22500();
		@Pc(54) boolean local54 = arg0.method22478() == 1;
		return new Class409(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local54);
	}

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "()Lclient!mt;", line = 48)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_1;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)Lclient!mt;", line = 48)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_1;
	}

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "()Lclient!mt;", line = 48)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_1;
	}

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "()Lclient!mt;", line = 48)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_1;
	}

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "(IB)Lclient!gh;", line = 278)
	public static Class273 method28563(@OriginalArg(0) int arg0) {
		return Class35_Sub11.aClass273Array1[arg0 >> 16];
	}

	@OriginalMember(owner = "client!mw", name = "px", descriptor = "(Lclient!yf;I)V", line = 7328)
	static final void method28564(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class85.method4908(local11, local14, arg0);
	}
}
