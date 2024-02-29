package com.jagex;

import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public class Class341 {

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
	int anInt4477;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "[S")
	short[] aShortArray122;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V", line = 7)
	public Class341(@OriginalArg(0) int arg0) {
		this.anInt4477 = arg0 * -1443436619;
		this.aShortArray122 = new short[0x1 << arg0];
	}

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "(Ljava/lang/CharSequence;I)I", line = 9)
	public static int method27747(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "(I)V", line = 13)
	public void method27748() {
		Class350.method27880(this.aShortArray122);
	}

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "()V", line = 13)
	public void method27749() {
		Class350.method27880(this.aShortArray122);
	}

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "()V", line = 13)
	public void method27750() {
		Class350.method27880(this.aShortArray122);
	}

	@OriginalMember(owner = "client!jg", name = "y", descriptor = "()V", line = 13)
	public void method27751() {
		Class350.method27880(this.aShortArray122);
	}

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "(Lclient!akv;I)Lclient!mr;", line = 13)
	public static Class404 method27752(@OriginalArg(0) Class77_Sub39 arg0) {
		@Pc(3) Class404 local3 = new Class404();
		local3.anInt4703 = arg0.method22483() * 167533425;
		local3.aClass77_Sub1_Sub13_1 = RuntimeException_Sub4.aClass41_2.method688(local3.anInt4703 * -1791556207);
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(Lclient!jh;I)I", line = 17)
	public int method27753(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4477 * -1203237219; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method27779(this.aShortArray122, local1);
		}
		return local1 - (0x1 << this.anInt4477 * -1203237219);
	}

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "(Lclient!jh;)I", line = 17)
	public int method27754(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4477 * -1203237219; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method27779(this.aShortArray122, local1);
		}
		return local1 - (0x1 << this.anInt4477 * -1203237219);
	}

	@OriginalMember(owner = "client!jg", name = "x", descriptor = "(Lclient!jh;)I", line = 17)
	public int method27755(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		for (@Pc(6) int local6 = this.anInt4477 * -1203237219; local6 != 0; local6--) {
			local1 = (local1 << 1) + arg0.method27779(this.aShortArray122, local1);
		}
		return local1 - (0x1 << this.anInt4477 * -1203237219);
	}

	@OriginalMember(owner = "client!jg", name = "v", descriptor = "(Lclient!jh;B)I", line = 23)
	public int method27756(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4477 * -1203237219; local5++) {
			@Pc(18) int local18 = arg0.method27779(this.aShortArray122, local1);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(Lclient!jh;)I", line = 23)
	public int method27757(@OriginalArg(0) Class342 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < this.anInt4477 * -1203237219; local5++) {
			@Pc(18) int local18 = arg0.method27779(this.aShortArray122, local1);
			local1 <<= 0x1;
			local1 += local18;
			local3 |= local18 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "([SILclient!jh;I)I", line = 35)
	public static int method27758(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class342 arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method27779(arg0, local1 + arg1);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "([SILclient!jh;I)I", line = 35)
	public static int method27759(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class342 arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method27779(arg0, local1 + arg1);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "([SILclient!jh;I)I", line = 35)
	public static int method27760(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class342 arg2, @OriginalArg(3) int arg3) throws IOException {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			@Pc(16) int local16 = arg2.method27779(arg0, local1 + arg1);
			local1 <<= 0x1;
			local1 += local16;
			local3 |= local16 << local5;
		}
		return local3;
	}

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "(IZB)Ljava/lang/String;", line = 114)
	public static String method27761(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class302.method27133(arg0, 10, arg1) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "dz", descriptor = "(B)V", line = 277)
	static void method27762() {
		@Pc(1) int local1 = -1;
		if (Class136_Sub1.aClass77_Sub1_Sub8_2 != null) {
			local1 = Class136_Sub1.aClass77_Sub1_Sub8_2.anInt3004 * 848546455;
		}
		Class208.method25580();
		for (@Pc(12) int local12 = 0; local12 < 3; local12++) {
			for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
				Class136_Sub1.aClass94ArrayArray1[local12][local17] = null;
				Class136_Sub1.aClass17ArrayArray1[local12][local17] = null;
			}
		}
		Class136_Sub1.aClass77_Sub1_Sub8_2 = null;
		if (local1 != -1) {
			Class131_Sub1.method12543(local1, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!jg", name = "mw", descriptor = "(Lclient!yf;I)V", line = 6754)
	static final void method27763(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class681.method36083(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!jg", name = "ow", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 7142)
	static final void method27764(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray11 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!jg", name = "jj", descriptor = "(IIIIB)V", line = 10037)
	static final void method27765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3494 * 1372795039; local1++) {
			@Pc(10) Rectangle local10 = client.aRectangleArray1[local1];
			if (local10.width + local10.x > arg0 && local10.x < arg2 + arg0 && local10.y + local10.height > arg1 && local10.y < arg3 + arg1) {
				client.aBooleanArray17[local1] = true;
			}
		}
	}
}
