package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaq")
public class Class8_Sub2 extends Class8 implements Interface5 {

	@OriginalMember(owner = "client!aaq", name = "b", descriptor = "I")
	int anInt120;

	@OriginalMember(owner = "client!aaq", name = "<init>", descriptor = "(Lclient!abt;I[BIZ)V", line = 10)
	Class8_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt120 = arg1;
	}

	@OriginalMember(owner = "client!aaq", name = "<init>", descriptor = "(Lclient!abt;ILclient!jaclib/memory/Buffer;IZ)V", line = 15)
	Class8_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt120 = arg1;
	}

	@OriginalMember(owner = "client!aaq", name = "h", descriptor = "()I", line = 20)
	@Override
	public int method974() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aaq", name = "p", descriptor = "()I", line = 20)
	@Override
	public int method981() {
		return this.anInt117;
	}

	@OriginalMember(owner = "client!aaq", name = "a", descriptor = "()I", line = 24)
	@Override
	public int method975() {
		return this.anInt120;
	}

	@OriginalMember(owner = "client!aaq", name = "x", descriptor = "()I", line = 24)
	@Override
	public int method979() {
		return this.anInt120;
	}

	@OriginalMember(owner = "client!aaq", name = "g", descriptor = "()J", line = 28)
	@Override
	public long method976() {
		return 0L;
	}

	@OriginalMember(owner = "client!aaq", name = "s", descriptor = "()J", line = 28)
	@Override
	public long method978() {
		return 0L;
	}

	@OriginalMember(owner = "client!aaq", name = "y", descriptor = "()V", line = 32)
	@Override
	void method968() {
		this.aClass21_Sub2_14.method4134(this);
	}

	@OriginalMember(owner = "client!aaq", name = "c", descriptor = "()V", line = 32)
	@Override
	void method970() {
		this.aClass21_Sub2_14.method4134(this);
	}

	@OriginalMember(owner = "client!aaq", name = "z", descriptor = "()V", line = 32)
	@Override
	void method971() {
		this.aClass21_Sub2_14.method4134(this);
	}

	@OriginalMember(owner = "client!aaq", name = "j", descriptor = "()V", line = 32)
	@Override
	void method964() {
		this.aClass21_Sub2_14.method4134(this);
	}

	@OriginalMember(owner = "client!aaq", name = "u", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method980(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method966(arg1, arg2);
		this.anInt120 = arg0;
	}

	@OriginalMember(owner = "client!aaq", name = "l", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method977(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method966(arg1, arg2);
		this.anInt120 = arg0;
	}
}
