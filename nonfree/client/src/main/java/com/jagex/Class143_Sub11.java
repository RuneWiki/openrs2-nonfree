package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alo")
public class Class143_Sub11 extends Class143 {

	@OriginalMember(owner = "client!alo", name = "t", descriptor = "I")
	public static final int anInt2105 = 0;

	@OriginalMember(owner = "client!alo", name = "w", descriptor = "I")
	public static final int anInt2106 = 1;

	@OriginalMember(owner = "client!alo", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub11(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alo", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alo", name = "u", descriptor = "()V", line = 19)
	public void method15304() {
		if (this.anInt2324 * 189295939 != 1 && this.anInt2324 * 189295939 != 0) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alo", name = "i", descriptor = "(I)V", line = 19)
	public void method15305() {
		if (this.anInt2324 * 189295939 != 1 && this.anInt2324 * 189295939 != 0) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alo", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alo", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alo", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alo", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alo", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alo", name = "k", descriptor = "(I)I", line = 35)
	public int method15306() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alo", name = "e", descriptor = "()I", line = 35)
	public int method15307() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alo", name = "f", descriptor = "()I", line = 35)
	public int method15308() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alo", name = "p", descriptor = "(I)V", line = 40)
	public static void method15309() {
		if (15 == -1850530127 * client.anInt3390 && (!Class231.method25828() && !Class323.method27471())) {
			Class668.method33179(19);
		}
	}
}
