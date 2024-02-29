package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqz")
public abstract class Class77_Sub12_Sub1 extends Class77_Sub12 {

	@OriginalMember(owner = "client!aqz", name = "w", descriptor = "Lclient!hd;")
	Class295 aClass295_6;

	@OriginalMember(owner = "client!aqz", name = "t", descriptor = "Ljava/lang/String;")
	String aString122;

	@OriginalMember(owner = "client!aqz", name = "q", descriptor = "Ljava/lang/String;")
	String aString121;

	@OriginalMember(owner = "client!aqz", name = "x", descriptor = "I")
	int anInt3174;

	@OriginalMember(owner = "client!aqz", name = "d", descriptor = "Lclient!hd;")
	Class295 aClass295_5;

	@OriginalMember(owner = "client!aqz", name = "<init>", descriptor = "(Lclient!hf;)V", line = 15)
	Class77_Sub12_Sub1(@OriginalArg(0) Class297 arg0) {
		this.aClass295_6 = arg0.aClass295_133;
		this.aString122 = arg0.aString186;
		this.aString121 = arg0.aString185;
		this.anInt3174 = arg0.anInt4013 * -392650771;
		this.aClass295_5 = arg0.aClass295_132;
	}

	@OriginalMember(owner = "client!aqz", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
	@Override
	public String toString() {
		@Pc(13) String local13 = this.aClass295_6.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aqz", name = "rs", descriptor = "()Ljava/lang/String;", line = 26)
	public String method23549() {
		@Pc(13) String local13 = this.aClass295_6.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aqz", name = "ro", descriptor = "()Ljava/lang/String;", line = 26)
	public String method23550() {
		@Pc(13) String local13 = this.aClass295_6.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aqz", name = "c", descriptor = "(B)Ljava/lang/String;", line = 34)
	String method23551() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aqz", name = "x", descriptor = "()Ljava/lang/String;", line = 34)
	String method23552() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aqz", name = "q", descriptor = "()Ljava/lang/String;", line = 34)
	String method23553() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aqz", name = "d", descriptor = "()Lclient!hd;", line = 38)
	public Class295 method23554() {
		return this.aClass295_6;
	}

	@OriginalMember(owner = "client!aqz", name = "v", descriptor = "(I)Lclient!hd;", line = 38)
	public Class295 method23555() {
		return this.aClass295_6;
	}

	@OriginalMember(owner = "client!aqz", name = "r", descriptor = "()Lclient!hd;", line = 42)
	public Class295 method23556() {
		return this.aClass295_5;
	}

	@OriginalMember(owner = "client!aqz", name = "s", descriptor = "()Lclient!hd;", line = 42)
	public Class295 method23557() {
		return this.aClass295_5;
	}

	@OriginalMember(owner = "client!aqz", name = "l", descriptor = "(I)Lclient!hd;", line = 42)
	public Class295 method23558() {
		return this.aClass295_5;
	}

	@OriginalMember(owner = "client!aqz", name = "y", descriptor = "(I)I", line = 46)
	public int method23559() {
		if (this.aClass295_6 != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(this, this.aClass295_6.toString().toLowerCase());
		}
		return this.anInt3174 * -2082238865;
	}

	@OriginalMember(owner = "client!aqz", name = "g", descriptor = "()I", line = 46)
	public int method23560() {
		if (this.aClass295_6 != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(this, this.aClass295_6.toString().toLowerCase());
		}
		return this.anInt3174 * -2082238865;
	}

	@OriginalMember(owner = "client!aqz", name = "z", descriptor = "()I", line = 46)
	public int method23561() {
		if (this.aClass295_6 != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(this, this.aClass295_6.toString().toLowerCase());
		}
		return this.anInt3174 * -2082238865;
	}

	@OriginalMember(owner = "client!aqz", name = "j", descriptor = "()I", line = 46)
	public int method23562() {
		if (this.aClass295_6 != Class295.aClass295_9) {
			throw new IllegalArgumentException_Sub1(this, this.aClass295_6.toString().toLowerCase());
		}
		return this.anInt3174 * -2082238865;
	}

	@OriginalMember(owner = "client!aqz", name = "cb", descriptor = "(Lclient!yf;B)V", line = 4836)
	static final void method23563(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class215.method25650(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!aqz", name = "p", descriptor = "(I)Z")
	public abstract boolean method23564(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aqz", name = "w", descriptor = "(I)I")
	public abstract int method23565(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aqz", name = "t", descriptor = "(I)Z")
	public abstract boolean method23566(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aqz", name = "b", descriptor = "(I)I")
	public abstract int method23567(@OriginalArg(0) int arg0);
}
