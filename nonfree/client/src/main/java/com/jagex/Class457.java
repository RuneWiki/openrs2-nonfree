package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oy")
public class Class457 implements Interface4 {

	@OriginalMember(owner = "client!oy", name = "v", descriptor = "Z")
	boolean aBoolean751;

	@OriginalMember(owner = "client!oy", name = "p", descriptor = "Ljava/lang/String;")
	final String aString214;

	@OriginalMember(owner = "client!oy", name = "c", descriptor = "Z")
	final boolean aBoolean750;

	@OriginalMember(owner = "client!oy", name = "<init>", descriptor = "(Ljava/lang/String;Z)V", line = 15)
	Class457(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		this.aString214 = arg0;
		this.aBoolean750 = arg1;
	}

	@OriginalMember(owner = "client!oy", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 21)
	Class457(@OriginalArg(0) String arg0) {
		this(arg0, false);
	}

	@OriginalMember(owner = "client!oy", name = "p", descriptor = "(I)I", line = 25)
	@Override
	public int method29477() {
		if (this.aBoolean751) {
			return 100;
		}
		try {
			return Class629.aClass541_1.method30928(this.aString214, this.aBoolean750);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class536.method30823(Class49.aClass49_1, local13.aString65, local13.anInt2424 * -299853035, local13.getCause());
			this.aBoolean751 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!oy", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method29473() {
		if (this.aBoolean751) {
			return 100;
		}
		try {
			return Class629.aClass541_1.method30928(this.aString214, this.aBoolean750);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class536.method30823(Class49.aClass49_1, local13.aString65, local13.anInt2424 * -299853035, local13.getCause());
			this.aBoolean751 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!oy", name = "y", descriptor = "()I", line = 25)
	@Override
	public int method29474() {
		if (this.aBoolean751) {
			return 100;
		}
		try {
			return Class629.aClass541_1.method30928(this.aString214, this.aBoolean750);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class536.method30823(Class49.aClass49_1, local13.aString65, local13.anInt2424 * -299853035, local13.getCause());
			this.aBoolean751 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!oy", name = "v", descriptor = "()I", line = 25)
	@Override
	public int method29472() {
		if (this.aBoolean751) {
			return 100;
		}
		try {
			return Class629.aClass541_1.method30928(this.aString214, this.aBoolean750);
		} catch (@Pc(13) Exception_Sub1 local13) {
			Class536.method30823(Class49.aClass49_1, local13.aString65, local13.anInt2424 * -299853035, local13.getCause());
			this.aBoolean751 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!oy", name = "c", descriptor = "([Lclient!yp;II)Lclient!yp;", line = 34)
	public static Interface75 method29479(@OriginalArg(0) Interface75[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Interface75[] local1 = arg0;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Interface75 local11 = local1[local3];
			if (arg1 == local11.method36479()) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oy", name = "d", descriptor = "(I)Z", line = 37)
	boolean method29480() {
		return this.aBoolean751;
	}

	@OriginalMember(owner = "client!oy", name = "g", descriptor = "()Z", line = 37)
	boolean method29481() {
		return this.aBoolean751;
	}

	@OriginalMember(owner = "client!oy", name = "z", descriptor = "()Z", line = 37)
	boolean method29482() {
		return this.aBoolean751;
	}

	@OriginalMember(owner = "client!oy", name = "r", descriptor = "()Z", line = 37)
	boolean method29483() {
		return this.aBoolean751;
	}

	@OriginalMember(owner = "client!oy", name = "j", descriptor = "()Z", line = 37)
	boolean method29484() {
		return this.aBoolean751;
	}

	@OriginalMember(owner = "client!oy", name = "s", descriptor = "(I)V", line = 41)
	void method29485() {
		this.aBoolean751 = true;
	}

	@OriginalMember(owner = "client!oy", name = "i", descriptor = "()V", line = 41)
	void method29486() {
		this.aBoolean751 = true;
	}

	@OriginalMember(owner = "client!oy", name = "k", descriptor = "()V", line = 41)
	void method29487() {
		this.aBoolean751 = true;
	}

	@OriginalMember(owner = "client!oy", name = "c", descriptor = "(I)Lclient!abc;", line = 45)
	@Override
	public Class29 method29471() {
		return Class29.aClass29_4;
	}

	@OriginalMember(owner = "client!oy", name = "w", descriptor = "()Lclient!abc;", line = 45)
	@Override
	public Class29 method29476() {
		return Class29.aClass29_4;
	}

	@OriginalMember(owner = "client!oy", name = "t", descriptor = "()Lclient!abc;", line = 45)
	@Override
	public Class29 method29470() {
		return Class29.aClass29_4;
	}

	@OriginalMember(owner = "client!oy", name = "x", descriptor = "()Lclient!abc;", line = 45)
	@Override
	public Class29 method29478() {
		return Class29.aClass29_4;
	}

	@OriginalMember(owner = "client!oy", name = "q", descriptor = "()Lclient!abc;", line = 45)
	@Override
	public Class29 method29475() {
		return Class29.aClass29_4;
	}

	@OriginalMember(owner = "client!oy", name = "c", descriptor = "(I)V", line = 56)
	public static void method29488() {
		Class659.method33063();
	}

	@OriginalMember(owner = "client!oy", name = "gb", descriptor = "(Lclient!yf;S)V", line = 5638)
	static final void method29489(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class199.method25495(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!oy", name = "avy", descriptor = "(Lclient!yf;B)V", line = 13204)
	static final void method29490(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1.method15330() ? 1 : 0;
	}
}
