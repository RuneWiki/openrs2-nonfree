package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aag")
public class Class8_Sub1 extends Class8 implements Interface7 {

	@OriginalMember(owner = "client!aag", name = "<init>", descriptor = "(Lclient!abt;I[BIZ)V", line = 6)
	Class8_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aag", name = "p", descriptor = "()I", line = 10)
	@Override
	public int method1129() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aag", name = "s", descriptor = "()I", line = 10)
	@Override
	public int method1130() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aag", name = "h", descriptor = "()I", line = 10)
	@Override
	public int method1124() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aag", name = "x", descriptor = "()I", line = 10)
	@Override
	public int method1125() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aag", name = "l", descriptor = "()I", line = 10)
	@Override
	public int method1126() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aag", name = "a", descriptor = "()J", line = 14)
	@Override
	public long method1121() {
		return 0L;
	}

	@OriginalMember(owner = "client!aag", name = "u", descriptor = "()J", line = 14)
	@Override
	public long method1123() {
		return 0L;
	}

	@OriginalMember(owner = "client!aag", name = "q", descriptor = "()J", line = 14)
	@Override
	public long method1127() {
		return 0L;
	}

	@OriginalMember(owner = "client!aag", name = "c", descriptor = "()V", line = 18)
	@Override
	void method970() {
		this.aClass21_Sub2_14.method4063(this);
	}

	@OriginalMember(owner = "client!aag", name = "z", descriptor = "()V", line = 18)
	@Override
	void method971() {
		this.aClass21_Sub2_14.method4063(this);
	}

	@OriginalMember(owner = "client!aag", name = "y", descriptor = "()V", line = 18)
	@Override
	void method968() {
		this.aClass21_Sub2_14.method4063(this);
	}

	@OriginalMember(owner = "client!aag", name = "j", descriptor = "()V", line = 18)
	@Override
	void method964() {
		this.aClass21_Sub2_14.method4063(this);
	}

	@OriginalMember(owner = "client!aag", name = "g", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1122(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method966(arg0, arg1);
	}

	@OriginalMember(owner = "client!aag", name = "m", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1120(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method966(arg0, arg1);
	}

	@OriginalMember(owner = "client!aag", name = "v", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1128(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method966(arg0, arg1);
	}

	@OriginalMember(owner = "client!aag", name = "t", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1131(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method966(arg0, arg1);
	}

	@OriginalMember(owner = "client!aag", name = "w", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1132(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method966(arg0, arg1);
	}
}
