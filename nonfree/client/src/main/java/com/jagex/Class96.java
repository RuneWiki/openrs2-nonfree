package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public abstract class Class96 {

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	public final int anInt2766;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!akv;)V", line = 9)
	Class96(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2766 = arg0.method22483() * -525321255;
	}

	@OriginalMember(owner = "client!en", name = "p", descriptor = "(III)I", line = 9)
	static int method19898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg1 == 10) {
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg1 == 11) {
			arg0 = arg0 + 3 & 0x3;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!en", name = "s", descriptor = "(Lclient!akv;)Lclient!en;", line = 14)
	static Class96 method19899(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) Class65 local7 = Class254.method26201(local3);
		@Pc(9) Class96 local9 = null;
		switch(local7.anInt194 * -1763082495) {
			case 1:
				local9 = new Class96_Sub20(arg0);
				break;
			case 2:
				local9 = new Class96_Sub11_Sub2(arg0);
				break;
			case 3:
				local9 = new Class96_Sub23(arg0, 0, 1);
				break;
			case 4:
				local9 = new Class96_Sub23(arg0, 1, 1);
				break;
			case 5:
				local9 = new Class96_Sub23(arg0, 0, 0);
				break;
			case 6:
				local9 = new Class96_Sub9(arg0);
				break;
			case 7:
				local9 = new Class96_Sub2(arg0);
				break;
			case 8:
				local9 = new Class96_Sub16(arg0);
				break;
			case 9:
				local9 = new Class96_Sub4(arg0);
				break;
			case 10:
				local9 = new Class96_Sub8(arg0);
				break;
			case 11:
				local9 = new Class96_Sub13(arg0, true);
				break;
			case 12:
				local9 = new Class96_Sub10(arg0);
				break;
			case 13:
				local9 = new Class96_Sub11_Sub1(arg0);
				break;
			case 14:
				local9 = new Class96_Sub12(arg0);
				break;
			case 15:
				local9 = new Class96_Sub6(arg0);
				break;
			case 16:
				local9 = new Class96_Sub23(arg0, 1, 0);
				break;
			case 17:
				local9 = new Class96_Sub19(arg0);
				break;
			case 18:
				local9 = new Class96_Sub18(arg0);
			case 19:
			case 25:
			default:
				break;
			case 20:
				local9 = new Class96_Sub14(arg0);
				break;
			case 21:
				local9 = new Class96_Sub15(arg0);
				break;
			case 22:
				local9 = new Class96_Sub1(arg0);
				break;
			case 23:
				local9 = new Class96_Sub21(arg0);
				break;
			case 24:
				local9 = new Class96_Sub7(arg0);
				break;
			case 26:
				local9 = new Class96_Sub3(arg0);
				break;
			case 27:
				local9 = new Class96_Sub5(arg0);
				break;
			case 28:
				local9 = new Class96_Sub22(arg0);
				break;
			case 29:
				local9 = new Class96_Sub13(arg0, false);
				break;
			case 30:
				local9 = new Class96_Sub17(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(Lclient!akv;)Lclient!en;", line = 14)
	static Class96 method19900(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) int local3 = arg0.method22478();
		@Pc(7) Class65 local7 = Class254.method26201(local3);
		@Pc(9) Class96 local9 = null;
		switch(local7.anInt194 * -1763082495) {
			case 1:
				local9 = new Class96_Sub20(arg0);
				break;
			case 2:
				local9 = new Class96_Sub11_Sub2(arg0);
				break;
			case 3:
				local9 = new Class96_Sub23(arg0, 0, 1);
				break;
			case 4:
				local9 = new Class96_Sub23(arg0, 1, 1);
				break;
			case 5:
				local9 = new Class96_Sub23(arg0, 0, 0);
				break;
			case 6:
				local9 = new Class96_Sub9(arg0);
				break;
			case 7:
				local9 = new Class96_Sub2(arg0);
				break;
			case 8:
				local9 = new Class96_Sub16(arg0);
				break;
			case 9:
				local9 = new Class96_Sub4(arg0);
				break;
			case 10:
				local9 = new Class96_Sub8(arg0);
				break;
			case 11:
				local9 = new Class96_Sub13(arg0, true);
				break;
			case 12:
				local9 = new Class96_Sub10(arg0);
				break;
			case 13:
				local9 = new Class96_Sub11_Sub1(arg0);
				break;
			case 14:
				local9 = new Class96_Sub12(arg0);
				break;
			case 15:
				local9 = new Class96_Sub6(arg0);
				break;
			case 16:
				local9 = new Class96_Sub23(arg0, 1, 0);
				break;
			case 17:
				local9 = new Class96_Sub19(arg0);
				break;
			case 18:
				local9 = new Class96_Sub18(arg0);
			case 19:
			case 25:
			default:
				break;
			case 20:
				local9 = new Class96_Sub14(arg0);
				break;
			case 21:
				local9 = new Class96_Sub15(arg0);
				break;
			case 22:
				local9 = new Class96_Sub1(arg0);
				break;
			case 23:
				local9 = new Class96_Sub21(arg0);
				break;
			case 24:
				local9 = new Class96_Sub7(arg0);
				break;
			case 26:
				local9 = new Class96_Sub3(arg0);
				break;
			case 27:
				local9 = new Class96_Sub5(arg0);
				break;
			case 28:
				local9 = new Class96_Sub22(arg0);
				break;
			case 29:
				local9 = new Class96_Sub13(arg0, false);
				break;
			case 30:
				local9 = new Class96_Sub17(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!en", name = "v", descriptor = "(B)V", line = 109)
	void method19901() {
	}

	@OriginalMember(owner = "client!en", name = "x", descriptor = "()V", line = 109)
	void method19902() {
	}

	@OriginalMember(owner = "client!en", name = "l", descriptor = "(I)Z", line = 112)
	boolean method19903() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "t", descriptor = "()Z", line = 112)
	boolean method19904() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "q", descriptor = "()Z", line = 112)
	boolean method19905() {
		return true;
	}

	@OriginalMember(owner = "client!en", name = "ew", descriptor = "(B)V", line = 1659)
	public static final void method19906() {
		@Pc(7) String local7 = Class537.aString228 == null ? Class313.method27315() : Class537.aString228;
		Class474.method29663(local7, false, client.aBoolean591);
	}

	@OriginalMember(owner = "client!en", name = "xk", descriptor = "(Lclient!yf;I)V", line = 8874)
	static final void method19907(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (client.anInt3453 * -1050164879 == 2 && local12 < client.anInt3529 * -1979292205) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = client.aClass162Array1[local12].aString130;
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		}
	}

	@OriginalMember(owner = "client!en", name = "aee", descriptor = "(Lclient!yf;B)V", line = 9874)
	static final void method19908(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class18 local29 = (Class18) Class537.aClass35_Sub7_1.method18319(local13);
		if (local23 < 1 || local23 > 5 || local29.aStringArray4[local23 - 1] == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local29.aStringArray4[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!en", name = "lh", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 11794)
	static final String[] method19909(@OriginalArg(0) String[] arg0) {
		@Pc(2) String[] local2 = new String[5];
		for (@Pc(4) int local4 = 0; local4 < 5; local4++) {
			local2[local4] = local4 + " ";
			if (arg0 != null && arg0[local4] != null) {
				local2[local4] = local2[local4] + arg0[local4];
			}
		}
		return local2;
	}

	@OriginalMember(owner = "client!en", name = "aos", descriptor = "(Lclient!yf;I)V", line = 12056)
	static final void method19910(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(16) long local16 = Class159.method24318();
		if (local16 == 0L) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 5;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class393.method28389(local16, local13);
		}
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public abstract void method19911();

	@OriginalMember(owner = "client!en", name = "y", descriptor = "()V")
	public abstract void method19912();

	@OriginalMember(owner = "client!en", name = "w", descriptor = "()V")
	public abstract void method19913();
}
