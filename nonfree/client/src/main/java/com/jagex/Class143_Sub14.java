package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alr")
public class Class143_Sub14 extends Class143 {

	@OriginalMember(owner = "client!alr", name = "q", descriptor = "I")
	static int anInt2124;

	@OriginalMember(owner = "client!alr", name = "t", descriptor = "I")
	static final int anInt2125 = 2;

	@OriginalMember(owner = "client!alr", name = "w", descriptor = "I")
	static final int anInt2126 = 0;

	@OriginalMember(owner = "client!alr", name = "<init>", descriptor = "(ILclient!akq;)V", line = 11)
	public Class143_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alr", name = "<init>", descriptor = "(Lclient!akq;)V", line = 15)
	public Class143_Sub14(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alr", name = "e", descriptor = "()V", line = 19)
	public void method15381() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alr", name = "i", descriptor = "(B)V", line = 19)
	public void method15382() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alr", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 0;
	}

	@OriginalMember(owner = "client!alr", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 0;
	}

	@OriginalMember(owner = "client!alr", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 0;
	}

	@OriginalMember(owner = "client!alr", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 0;
	}

	@OriginalMember(owner = "client!alr", name = "k", descriptor = "(I)Z", line = 27)
	public boolean method15383() {
		return true;
	}

	@OriginalMember(owner = "client!alr", name = "f", descriptor = "()Z", line = 27)
	public boolean method15384() {
		return true;
	}

	@OriginalMember(owner = "client!alr", name = "c", descriptor = "(II)I", line = 31)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!alr", name = "s", descriptor = "(I)I", line = 31)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!alr", name = "r", descriptor = "(I)I", line = 31)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!alr", name = "g", descriptor = "(I)I", line = 31)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!alr", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? 2 : 1;
	}

	@OriginalMember(owner = "client!alr", name = "q", descriptor = "(I)V", line = 36)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alr", name = "l", descriptor = "(II)V", line = 36)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alr", name = "d", descriptor = "(I)V", line = 36)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alr", name = "x", descriptor = "(I)V", line = 36)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alr", name = "b", descriptor = "()I", line = 40)
	public int method15385() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alr", name = "u", descriptor = "(B)I", line = 40)
	public int method15386() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alr", name = "o", descriptor = "()I", line = 40)
	public int method15387() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alr", name = "n", descriptor = "()I", line = 40)
	public int method15388() {
		return this.anInt2324 * 189295939;
	}
}
