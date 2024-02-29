package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zj")
public class Class692 {

	@OriginalMember(owner = "client!zj", name = "p", descriptor = "I")
	int anInt5876;

	@OriginalMember(owner = "client!zj", name = "c", descriptor = "I")
	int anInt5877;

	@OriginalMember(owner = "client!zj", name = "v", descriptor = "Z")
	boolean aBoolean865;

	@OriginalMember(owner = "client!zj", name = "l", descriptor = "Z")
	boolean aBoolean866;

	@OriginalMember(owner = "client!zj", name = "y", descriptor = "Z")
	boolean aBoolean867;

	@OriginalMember(owner = "client!zj", name = "<init>", descriptor = "(IIZZZ)V", line = 10)
	Class692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5876 = arg0 * 1085439929;
		this.anInt5877 = arg1 * 1282708005;
		this.aBoolean865 = arg2;
		this.aBoolean866 = arg3;
		this.aBoolean867 = arg4;
	}

	@OriginalMember(owner = "client!zj", name = "w", descriptor = "()I", line = 19)
	public int method36351() {
		return this.anInt5876 * -1612851575;
	}

	@OriginalMember(owner = "client!zj", name = "p", descriptor = "(B)I", line = 19)
	public int method36352() {
		return this.anInt5876 * -1612851575;
	}

	@OriginalMember(owner = "client!zj", name = "q", descriptor = "()I", line = 23)
	public int method36353() {
		return this.anInt5877 * 1296251309;
	}

	@OriginalMember(owner = "client!zj", name = "c", descriptor = "(I)I", line = 23)
	public int method36354() {
		return this.anInt5877 * 1296251309;
	}

	@OriginalMember(owner = "client!zj", name = "t", descriptor = "()I", line = 23)
	public int method36355() {
		return this.anInt5877 * 1296251309;
	}

	@OriginalMember(owner = "client!zj", name = "v", descriptor = "(B)Z", line = 27)
	public boolean method36356() {
		return this.aBoolean865;
	}

	@OriginalMember(owner = "client!zj", name = "x", descriptor = "()Z", line = 27)
	public boolean method36357() {
		return this.aBoolean865;
	}

	@OriginalMember(owner = "client!zj", name = "d", descriptor = "()Z", line = 27)
	public boolean method36358() {
		return this.aBoolean865;
	}

	@OriginalMember(owner = "client!zj", name = "s", descriptor = "()Z", line = 31)
	public boolean method36359() {
		return this.aBoolean866;
	}

	@OriginalMember(owner = "client!zj", name = "l", descriptor = "(I)Z", line = 31)
	public boolean method36360() {
		return this.aBoolean866;
	}

	@OriginalMember(owner = "client!zj", name = "r", descriptor = "()Z", line = 35)
	public boolean method36361() {
		return this.aBoolean867;
	}

	@OriginalMember(owner = "client!zj", name = "y", descriptor = "(I)Z", line = 35)
	public boolean method36362() {
		return this.aBoolean867;
	}

	@OriginalMember(owner = "client!zj", name = "g", descriptor = "()Z", line = 35)
	public boolean method36363() {
		return this.aBoolean867;
	}

	@OriginalMember(owner = "client!zj", name = "z", descriptor = "()Z", line = 35)
	public boolean method36364() {
		return this.aBoolean867;
	}

	@OriginalMember(owner = "client!zj", name = "ans", descriptor = "(Lclient!yf;B)V", line = 11940)
	static final void method36365(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class252.method26181().method36479();
	}
}
