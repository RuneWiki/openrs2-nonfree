package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abq")
public class Class41 {

	@OriginalMember(owner = "client!abq", name = "w", descriptor = "I")
	static final int anInt162 = 1;

	@OriginalMember(owner = "client!abq", name = "t", descriptor = "I")
	static final int anInt163 = 32768;

	@OriginalMember(owner = "client!abq", name = "v", descriptor = "I")
	public int anInt161 = 0;

	@OriginalMember(owner = "client!abq", name = "l", descriptor = "I")
	public int anInt160 = 0;

	@OriginalMember(owner = "client!abq", name = "y", descriptor = "Lclient!er;")
	final Class232 aClass232_3 = new Class232(64);

	@OriginalMember(owner = "client!abq", name = "q", descriptor = "Lclient!we;")
	Interface71 anInterface71_1 = null;

	@OriginalMember(owner = "client!abq", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_7;

	@OriginalMember(owner = "client!abq", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_6;

	@OriginalMember(owner = "client!abq", name = "<init>", descriptor = "(Lclient!yi;Lclient!pw;Lclient!pw;Lclient!we;)V", line = 19)
	public Class41(@OriginalArg(0) Class667 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class478 arg2, @OriginalArg(3) Interface71 arg3) {
		this.aClass478_7 = arg1;
		this.aClass478_6 = arg2;
		this.anInterface71_1 = arg3;
		if (this.aClass478_7 != null) {
			this.anInt161 = this.aClass478_7.method29752(1) * 873941565;
		}
		if (this.aClass478_6 != null) {
			this.anInt160 = this.aClass478_6.method29752(1) * -536968583;
		}
	}

	@OriginalMember(owner = "client!abq", name = "y", descriptor = "(I)Lclient!arh;", line = 28)
	public Class77_Sub1_Sub13 method687(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub13 local6 = (Class77_Sub1_Sub13) this.aClass232_3.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass478_6.method29725(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass478_7.method29725(1, arg0);
		}
		local6 = new Class77_Sub1_Sub13();
		local6.aClass41_1 = this;
		if (local22 != null) {
			local6.method22299(new Class77_Sub39(local22));
		}
		if (arg0 >= 32768) {
			local6.method22323();
		}
		this.aClass232_3.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!abq", name = "p", descriptor = "(II)Lclient!arh;", line = 28)
	public Class77_Sub1_Sub13 method688(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub13 local6 = (Class77_Sub1_Sub13) this.aClass232_3.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass478_6.method29725(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass478_7.method29725(1, arg0);
		}
		local6 = new Class77_Sub1_Sub13();
		local6.aClass41_1 = this;
		if (local22 != null) {
			local6.method22299(new Class77_Sub39(local22));
		}
		if (arg0 >= 32768) {
			local6.method22323();
		}
		this.aClass232_3.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!abq", name = "v", descriptor = "(I)Lclient!arh;", line = 28)
	public Class77_Sub1_Sub13 method689(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub13 local6 = (Class77_Sub1_Sub13) this.aClass232_3.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass478_6.method29725(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass478_7.method29725(1, arg0);
		}
		local6 = new Class77_Sub1_Sub13();
		local6.aClass41_1 = this;
		if (local22 != null) {
			local6.method22299(new Class77_Sub39(local22));
		}
		if (arg0 >= 32768) {
			local6.method22323();
		}
		this.aClass232_3.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!abq", name = "l", descriptor = "(I)Lclient!arh;", line = 28)
	public Class77_Sub1_Sub13 method690(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub13 local6 = (Class77_Sub1_Sub13) this.aClass232_3.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass478_6.method29725(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass478_7.method29725(1, arg0);
		}
		local6 = new Class77_Sub1_Sub13();
		local6.aClass41_1 = this;
		if (local22 != null) {
			local6.method22299(new Class77_Sub39(local22));
		}
		if (arg0 >= 32768) {
			local6.method22323();
		}
		this.aClass232_3.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!abq", name = "w", descriptor = "(I)Lclient!arh;", line = 28)
	public Class77_Sub1_Sub13 method691(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub13 local6 = (Class77_Sub1_Sub13) this.aClass232_3.method25835((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass478_6.method29725(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass478_7.method29725(1, arg0);
		}
		local6 = new Class77_Sub1_Sub13();
		local6.aClass41_1 = this;
		if (local22 != null) {
			local6.method22299(new Class77_Sub39(local22));
		}
		if (arg0 >= 32768) {
			local6.method22323();
		}
		this.aClass232_3.method25844(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!abq", name = "v", descriptor = "(I)Lclient!ajt;", line = 39)
	public static Class77_Sub20 method692() {
		@Pc(2) Class77_Sub20 local2 = Class144.method14993();
		local2.aClass414_1 = null;
		local2.anInt1527 = 0;
		local2.aClass77_Sub39_Sub1_2 = new Class77_Sub39_Sub1(5000);
		return local2;
	}

	@OriginalMember(owner = "client!abq", name = "c", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 42)
	String method693(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface71_1 != null) {
			@Pc(10) String local10 = this.anInterface71_1.method28552(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!abq", name = "t", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 42)
	String method694(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface71_1 != null) {
			@Pc(10) String local10 = this.anInterface71_1.method28552(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!abq", name = "q", descriptor = "(Lclient!xb;[IJ)Ljava/lang/String;", line = 42)
	String method695(@OriginalArg(0) Class638 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface71_1 != null) {
			@Pc(10) String local10 = this.anInterface71_1.method28552(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!abq", name = "v", descriptor = "(I)V", line = 80)
	static void method696() {
		Class157.anInt3241 = Class346.aClass17_12.anInt51 * -858559641 + -218904694 + Class346.aClass17_12.anInt52 * -2123874781;
		Class157.anInt3239 = Class611.aClass17_13.anInt52 * -309101603 + Class611.aClass17_13.anInt51 * 376293017 + -1626528650;
		Class96_Sub12.aStringArray10 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class96_Sub12.aStringArray10.length; local28++) {
			Class96_Sub12.aStringArray10[local28] = "";
		}
		Class51.method764(Class44.aClass44_171.method713(Class128.aClass667_3));
	}

	@OriginalMember(owner = "client!abq", name = "aam", descriptor = "(Lclient!yf;I)V", line = 9235)
	static final void method697(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aBoolean726 ? 1 : 0;
	}
}
