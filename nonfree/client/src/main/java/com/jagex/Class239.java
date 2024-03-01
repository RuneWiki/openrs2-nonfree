package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public class Class239 {

	@OriginalMember(owner = "client!im", name = "s", descriptor = "I")
	static final int anInt3751 = 4;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "I")
	static final int anInt3752 = 1;

	@OriginalMember(owner = "client!im", name = "x", descriptor = "I")
	static final int anInt3753 = 3;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "I")
	static final int anInt3754 = 2;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	static final int anInt3755 = 5;

	@OriginalMember(owner = "client!im", name = "hd", descriptor = "Lclient!ul;")
	public static Class505 aClass505_1;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "J")
	long aLong250;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "J")
	long aLong249 = -5490057664386108431L;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!wk;")
	Class553 aClass553_50 = new Class553();

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 17)
	public Class239(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method24622(arg0);
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(Lclient!ahb;)V", line = 22)
	void method24620(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aLong250 = arg0.method20371() * -5358552535020914157L;
		this.aLong249 = arg0.method20371() * 5490057664386108431L;
		for (@Pc(17) int local17 = arg0.method20269(); local17 != 0; local17 = arg0.method20269()) {
			@Pc(28) Class3_Sub40 local28;
			if (local17 == 1) {
				local28 = new Class3_Sub40_Sub5(this);
			} else if (local17 == 4) {
				local28 = new Class3_Sub40_Sub3(this);
			} else if (local17 == 3) {
				local28 = new Class3_Sub40_Sub2(this);
			} else if (local17 == 2) {
				local28 = new Class3_Sub40_Sub1(this);
			} else if (local17 == 5) {
				local28 = new Class3_Sub40_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method19099(arg0);
			this.aClass553_50.method32702(local28);
		}
	}

	@OriginalMember(owner = "client!im", name = "p", descriptor = "(Lclient!ahb;B)V", line = 22)
	void method24622(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aLong250 = arg0.method20371() * -5358552535020914157L;
		this.aLong249 = arg0.method20371() * 5490057664386108431L;
		for (@Pc(17) int local17 = arg0.method20269(); local17 != 0; local17 = arg0.method20269()) {
			@Pc(28) Class3_Sub40 local28;
			if (local17 == 1) {
				local28 = new Class3_Sub40_Sub5(this);
			} else if (local17 == 4) {
				local28 = new Class3_Sub40_Sub3(this);
			} else if (local17 == 3) {
				local28 = new Class3_Sub40_Sub2(this);
			} else if (local17 == 2) {
				local28 = new Class3_Sub40_Sub1(this);
			} else if (local17 == 5) {
				local28 = new Class3_Sub40_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			local28.method19099(arg0);
			this.aClass553_50.method32702(local28);
		}
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(Lclient!ago;)V", line = 40)
	public void method24618(@OriginalArg(0) Class3_Sub30 arg0) {
		if (arg0.aLong296 * -1930649055099428229L != this.aLong250 * 8297879078227386395L || arg0.aLong72 * -1177290447828950357L != this.aLong249 * 2158067428120355567L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class3_Sub40 local30 = (Class3_Sub40) this.aClass553_50.method32768(); local30 != null; local30 = (Class3_Sub40) this.aClass553_50.method32709()) {
			local30.method19100(arg0);
		}
		arg0.aLong72 += 8085148063233935363L;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ago;B)V", line = 40)
	public void method24619(@OriginalArg(0) Class3_Sub30 arg0) {
		if (arg0.aLong296 * -1930649055099428229L != this.aLong250 * 8297879078227386395L || arg0.aLong72 * -1177290447828950357L != this.aLong249 * 2158067428120355567L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class3_Sub40 local30 = (Class3_Sub40) this.aClass553_50.method32768(); local30 != null; local30 = (Class3_Sub40) this.aClass553_50.method32709()) {
			local30.method19100(arg0);
		}
		arg0.aLong72 += 8085148063233935363L;
	}

	@OriginalMember(owner = "client!im", name = "l", descriptor = "(Lclient!ago;)V", line = 40)
	public void method24621(@OriginalArg(0) Class3_Sub30 arg0) {
		if (arg0.aLong296 * -1930649055099428229L != this.aLong250 * 8297879078227386395L || arg0.aLong72 * -1177290447828950357L != this.aLong249 * 2158067428120355567L) {
			throw new RuntimeException("");
		}
		for (@Pc(30) Class3_Sub40 local30 = (Class3_Sub40) this.aClass553_50.method32768(); local30 != null; local30 = (Class3_Sub40) this.aClass553_50.method32709()) {
			local30.method19100(arg0);
		}
		arg0.aLong72 += 8085148063233935363L;
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(I)Z", line = 55)
	static boolean method24624() {
		return Class338.aClass448_1 != null;
	}

	@OriginalMember(owner = "client!im", name = "p", descriptor = "(I)Z", line = 66)
	static boolean method24623() {
		return !Class429.method27933(client.anInt3039 * 1115111877);
	}
}
