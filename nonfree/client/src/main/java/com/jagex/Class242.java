package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public class Class242 {

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	static final int anInt3762 = 4;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
	static final int anInt3764 = 10;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	static final int anInt3765 = 2;

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
	static final int anInt3766 = 3;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
	static final int anInt3767 = 14;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
	static final int anInt3768 = 5;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	static final int anInt3769 = 1;

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
	static final int anInt3770 = 7;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	static final int anInt3771 = 8;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
	static final int anInt3772 = 9;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
	static final int anInt3773 = 6;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "I")
	static final int anInt3774 = 11;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
	static final int anInt3775 = 12;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
	static final int anInt3776 = 13;

	@OriginalMember(owner = "client!iq", name = "jc", descriptor = "I")
	static int anInt3777;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "J")
	long aLong251;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
	int anInt3763 = -1751234175;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!wk;")
	Class553 aClass553_51 = new Class553();

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 26)
	public Class242(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method24743(arg0);
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(IIIB)I", line = 27)
	public static int method24749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "(Lclient!ahb;B)V", line = 31)
	void method24743(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aLong251 = arg0.method20371() * 1042662565242409375L;
		this.anInt3763 = arg0.method20275() * 1751234175;
		for (@Pc(17) int local17 = arg0.method20269(); local17 != 0; local17 = arg0.method20269()) {
			@Pc(27) Class3_Sub24 local27;
			if (local17 == 3) {
				local27 = new Class3_Sub24_Sub2(this);
			} else if (local17 == 1) {
				local27 = new Class3_Sub24_Sub7(this);
			} else if (local17 == 13) {
				local27 = new Class3_Sub24_Sub3(this);
			} else if (local17 == 4) {
				local27 = new Class3_Sub24_Sub13(this);
			} else if (local17 == 6) {
				local27 = new Class3_Sub24_Sub12(this);
			} else if (local17 == 5) {
				local27 = new Class3_Sub24_Sub5(this);
			} else if (local17 == 2) {
				local27 = new Class3_Sub24_Sub8(this);
			} else if (local17 == 7) {
				local27 = new Class3_Sub24_Sub14(this);
			} else if (local17 == 14) {
				local27 = new Class3_Sub24_Sub10(this);
			} else if (local17 == 8) {
				local27 = new Class3_Sub24_Sub11(this);
			} else if (local17 == 9) {
				local27 = new Class3_Sub24_Sub1(this);
			} else if (local17 == 10) {
				local27 = new Class3_Sub24_Sub4(this);
			} else if (local17 == 11) {
				local27 = new Class3_Sub24_Sub6(this);
			} else if (local17 == 12) {
				local27 = new Class3_Sub24_Sub9(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method18644(arg0);
			this.aClass553_51.method32702(local27);
		}
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(Lclient!ahb;)V", line = 31)
	void method24745(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aLong251 = arg0.method20371() * 1042662565242409375L;
		this.anInt3763 = arg0.method20275() * 1751234175;
		for (@Pc(17) int local17 = arg0.method20269(); local17 != 0; local17 = arg0.method20269()) {
			@Pc(27) Class3_Sub24 local27;
			if (local17 == 3) {
				local27 = new Class3_Sub24_Sub2(this);
			} else if (local17 == 1) {
				local27 = new Class3_Sub24_Sub7(this);
			} else if (local17 == 13) {
				local27 = new Class3_Sub24_Sub3(this);
			} else if (local17 == 4) {
				local27 = new Class3_Sub24_Sub13(this);
			} else if (local17 == 6) {
				local27 = new Class3_Sub24_Sub12(this);
			} else if (local17 == 5) {
				local27 = new Class3_Sub24_Sub5(this);
			} else if (local17 == 2) {
				local27 = new Class3_Sub24_Sub8(this);
			} else if (local17 == 7) {
				local27 = new Class3_Sub24_Sub14(this);
			} else if (local17 == 14) {
				local27 = new Class3_Sub24_Sub10(this);
			} else if (local17 == 8) {
				local27 = new Class3_Sub24_Sub11(this);
			} else if (local17 == 9) {
				local27 = new Class3_Sub24_Sub1(this);
			} else if (local17 == 10) {
				local27 = new Class3_Sub24_Sub4(this);
			} else if (local17 == 11) {
				local27 = new Class3_Sub24_Sub6(this);
			} else if (local17 == 12) {
				local27 = new Class3_Sub24_Sub9(this);
			} else {
				throw new RuntimeException("");
			}
			local27.method18644(arg0);
			this.aClass553_51.method32702(local27);
		}
	}

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "(IIII)I", line = 35)
	public static int method24750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!iu;I)V", line = 58)
	public void method24744(@OriginalArg(0) Class245 arg0) {
		if (arg0.aLong252 * -8864226775975645295L != this.aLong251 * 7472752877439535711L || arg0.anInt3786 * 592795959 != this.anInt3763 * 1105463679) {
			throw new RuntimeException("");
		}
		for (@Pc(29) Class3_Sub24 local29 = (Class3_Sub24) this.aClass553_51.method32768(); local29 != null; local29 = (Class3_Sub24) this.aClass553_51.method32709()) {
			local29.method18643(arg0);
		}
		arg0.anInt3786 += -321147769;
	}

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 119)
	static final String method24752(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(3) int local3 = arg0.indexOf(arg1); local3 != -1; local3 = arg0.indexOf(arg1, local3 + arg2.length())) {
			arg0 = arg0.substring(0, local3) + arg2 + arg0.substring(local3 + arg1.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(Ljava/lang/String;I)Z", line = 162)
	static boolean method24751(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(11) MalformedURLException local11) {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "de", descriptor = "(Lclient!vs;I)V", line = 4697)
	static final void method24748(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class537.method32551(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "ju", descriptor = "(Lclient!vs;B)V", line = 5853)
	static final void method24746(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class343.method26482(local16, arg0);
	}

	@OriginalMember(owner = "client!iq", name = "adn", descriptor = "(Lclient!vs;B)V", line = 9597)
	static final void method24747(@OriginalArg(0) Class536 arg0) {
		@Pc(10) String local10;
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 == null || Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString77 == null) {
			local10 = "";
		} else {
			local10 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method16735(true);
		}
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local10;
	}
}
