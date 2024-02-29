package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alf")
public class Class143_Sub4 extends Class143 {

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(Lclient!akq;)V", line = 9)
	public Class143_Sub4(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alf", name = "<init>", descriptor = "(ILclient!akq;)V", line = 13)
	public Class143_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alf", name = "i", descriptor = "(I)V", line = 17)
	public void method15021() {
		if (this.anInt2324 * 189295939 < Class318.aClass318_1.method36479() || this.anInt2324 * 189295939 > Class318.aClass318_2.method36479()) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alf", name = "u", descriptor = "()V", line = 17)
	public void method15022() {
		if (this.anInt2324 * 189295939 < Class318.aClass318_1.method36479() || this.anInt2324 * 189295939 > Class318.aClass318_2.method36479()) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alf", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return Class318.aClass318_1.method36479();
	}

	@OriginalMember(owner = "client!alf", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return Class318.aClass318_1.method36479();
	}

	@OriginalMember(owner = "client!alf", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return Class318.aClass318_1.method36479();
	}

	@OriginalMember(owner = "client!alf", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return Class318.aClass318_1.method36479();
	}

	@OriginalMember(owner = "client!alf", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alf", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alf", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alf", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alf", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!alf", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alf", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alf", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alf", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alf", name = "k", descriptor = "(I)I", line = 35)
	public int method15023() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alf", name = "e", descriptor = "()I", line = 35)
	public int method15024() {
		return this.anInt2324 * 189295939;
	}
}
