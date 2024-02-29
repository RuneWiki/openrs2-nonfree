package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amx")
public class Class143_Sub41 extends Class143 {

	@OriginalMember(owner = "client!amx", name = "x", descriptor = "I")
	public static final int anInt2308 = 3;

	@OriginalMember(owner = "client!amx", name = "t", descriptor = "I")
	public static final int anInt2309 = 1;

	@OriginalMember(owner = "client!amx", name = "q", descriptor = "I")
	static final int anInt2310 = 2;

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "I")
	public static final int anInt2311 = 0;

	@OriginalMember(owner = "client!amx", name = "d", descriptor = "I")
	public static final int anInt2312 = 4;

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "I")
	public static final int anInt2313 = 5;

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(Lclient!akq;)V", line = 15)
	public Class143_Sub41(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amx", name = "<init>", descriptor = "(ILclient!akq;)V", line = 19)
	public Class143_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amx", name = "i", descriptor = "(I)V", line = 23)
	public void method16224() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 5 || this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amx", name = "u", descriptor = "()V", line = 23)
	public void method16225() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 5 || this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amx", name = "e", descriptor = "()V", line = 23)
	public void method16226() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 5 || this.anInt2324 * 189295939 == 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amx", name = "y", descriptor = "()I", line = 27)
	@Override
	int method16259() {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "p", descriptor = "(I)I", line = 27)
	@Override
	int method16256() {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "t", descriptor = "()I", line = 27)
	@Override
	int method16257() {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "w", descriptor = "()I", line = 27)
	@Override
	int method16260() {
		return 0;
	}

	@OriginalMember(owner = "client!amx", name = "c", descriptor = "(II)I", line = 31)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "z", descriptor = "(I)I", line = 31)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "s", descriptor = "(I)I", line = 31)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "r", descriptor = "(I)I", line = 31)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "g", descriptor = "(I)I", line = 31)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amx", name = "d", descriptor = "(I)V", line = 35)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amx", name = "q", descriptor = "(I)V", line = 35)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amx", name = "x", descriptor = "(I)V", line = 35)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amx", name = "l", descriptor = "(II)V", line = 35)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amx", name = "k", descriptor = "(I)I", line = 39)
	public int method16227() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amx", name = "f", descriptor = "()I", line = 39)
	public int method16228() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amx", name = "o", descriptor = "()I", line = 39)
	public int method16229() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amx", name = "qy", descriptor = "(Lclient!yf;B)V", line = 7508)
	static final void method16230(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3891 * -495767299;
	}
}
