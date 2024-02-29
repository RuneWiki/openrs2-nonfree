package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ald")
public class Class143_Sub3 extends Class143 {

	@OriginalMember(owner = "client!ald", name = "w", descriptor = "I")
	public static final int anInt2036 = 2;

	@OriginalMember(owner = "client!ald", name = "t", descriptor = "I")
	static final int anInt2037 = 1;

	@OriginalMember(owner = "client!ald", name = "q", descriptor = "I")
	public static final int anInt2038 = 0;

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(Lclient!akq;)V", line = 12)
	public Class143_Sub3(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ald", name = "<init>", descriptor = "(ILclient!akq;)V", line = 16)
	public Class143_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ald", name = "i", descriptor = "(B)V", line = 20)
	public void method14957() {
		if (this.anInt2324 * 189295939 < 0 && this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ald", name = "f", descriptor = "()V", line = 20)
	public void method14958() {
		if (this.anInt2324 * 189295939 < 0 && this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ald", name = "e", descriptor = "()V", line = 20)
	public void method14959() {
		if (this.anInt2324 * 189295939 < 0 && this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ald", name = "w", descriptor = "()I", line = 24)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!ald", name = "y", descriptor = "()I", line = 24)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!ald", name = "t", descriptor = "()I", line = 24)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!ald", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!ald", name = "k", descriptor = "(B)Z", line = 28)
	public boolean method14960() {
		return true;
	}

	@OriginalMember(owner = "client!ald", name = "b", descriptor = "()Z", line = 28)
	public boolean method14961() {
		return true;
	}

	@OriginalMember(owner = "client!ald", name = "o", descriptor = "()Z", line = 28)
	public boolean method14962() {
		return true;
	}

	@OriginalMember(owner = "client!ald", name = "c", descriptor = "(II)I", line = 32)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ald", name = "g", descriptor = "(I)I", line = 32)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ald", name = "s", descriptor = "(I)I", line = 32)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ald", name = "r", descriptor = "(I)I", line = 32)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ald", name = "z", descriptor = "(I)I", line = 32)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return arg0 == 0 || this.aClass77_Sub35_44.aClass143_Sub26_1.method15879() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!ald", name = "l", descriptor = "(II)V", line = 37)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ald", name = "q", descriptor = "(I)V", line = 37)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ald", name = "x", descriptor = "(I)V", line = 37)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ald", name = "d", descriptor = "(I)V", line = 37)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ald", name = "u", descriptor = "(I)I", line = 41)
	public int method14963() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ald", name = "n", descriptor = "()I", line = 41)
	public int method14964() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ald", name = "vt", descriptor = "(Lclient!yf;I)V", line = 8412)
	static final void method14965(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub36 local13 = (Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13.anInt1779 * 33298755;
	}
}
