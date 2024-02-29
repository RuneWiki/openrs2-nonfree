package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alb")
public class Class143_Sub2 extends Class143 {

	@OriginalMember(owner = "client!alb", name = "t", descriptor = "I")
	public static final int anInt2030 = 0;

	@OriginalMember(owner = "client!alb", name = "w", descriptor = "I")
	public static final int anInt2031 = 1;

	@OriginalMember(owner = "client!alb", name = "ay", descriptor = "J")
	static long aLong104;

	@OriginalMember(owner = "client!alb", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub2(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!alb", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!alb", name = "i", descriptor = "(B)V", line = 19)
	public void method14931() {
		if (this.anInt2324 * 189295939 != 1 && this.anInt2324 * 189295939 != 0) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alb", name = "f", descriptor = "()V", line = 19)
	public void method14932() {
		if (this.anInt2324 * 189295939 != 1 && this.anInt2324 * 189295939 != 0) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alb", name = "e", descriptor = "()V", line = 19)
	public void method14933() {
		if (this.anInt2324 * 189295939 != 1 && this.anInt2324 * 189295939 != 0) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alb", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "k", descriptor = "(I)Z", line = 27)
	public boolean method14934() {
		return true;
	}

	@OriginalMember(owner = "client!alb", name = "b", descriptor = "()Z", line = 27)
	public boolean method14935() {
		return true;
	}

	@OriginalMember(owner = "client!alb", name = "o", descriptor = "()Z", line = 27)
	public boolean method14936() {
		return true;
	}

	@OriginalMember(owner = "client!alb", name = "c", descriptor = "(II)I", line = 31)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "r", descriptor = "(I)I", line = 31)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "g", descriptor = "(I)I", line = 31)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "z", descriptor = "(I)I", line = 31)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "s", descriptor = "(I)I", line = 31)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alb", name = "d", descriptor = "(I)V", line = 35)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alb", name = "q", descriptor = "(I)V", line = 35)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alb", name = "l", descriptor = "(II)V", line = 35)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alb", name = "x", descriptor = "(I)V", line = 35)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!alb", name = "n", descriptor = "()I", line = 39)
	public int method14937() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alb", name = "u", descriptor = "(I)I", line = 39)
	public int method14938() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alb", name = "a", descriptor = "()I", line = 39)
	public int method14939() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alb", name = "lf", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6570)
	static final void method14940(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray18 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}
}
