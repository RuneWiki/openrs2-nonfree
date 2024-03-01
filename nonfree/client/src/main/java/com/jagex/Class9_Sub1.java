package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aai")
public class Class9_Sub1 extends Class9 implements Interface5 {

	@OriginalMember(owner = "client!aai", name = "g", descriptor = "I")
	int anInt92;

	@OriginalMember(owner = "client!aai", name = "<init>", descriptor = "(Lclient!abt;I[BI)V", line = 10)
	Class9_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt92 = arg1;
	}

	@OriginalMember(owner = "client!aai", name = "<init>", descriptor = "(Lclient!abt;ILclient!jaclib/memory/Buffer;)V", line = 15)
	Class9_Sub1(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt92 = arg1;
	}

	@OriginalMember(owner = "client!aai", name = "p", descriptor = "()I", line = 20)
	@Override
	public int method981() {
		return 0;
	}

	@OriginalMember(owner = "client!aai", name = "h", descriptor = "()I", line = 20)
	@Override
	public int method974() {
		return 0;
	}

	@OriginalMember(owner = "client!aai", name = "a", descriptor = "()I", line = 24)
	@Override
	public int method975() {
		return this.anInt92;
	}

	@OriginalMember(owner = "client!aai", name = "x", descriptor = "()I", line = 24)
	@Override
	public int method979() {
		return this.anInt92;
	}

	@OriginalMember(owner = "client!aai", name = "g", descriptor = "()J", line = 28)
	@Override
	public long method976() {
		return this.aBuffer3.a();
	}

	@OriginalMember(owner = "client!aai", name = "s", descriptor = "()J", line = 28)
	@Override
	public long method978() {
		return this.aBuffer3.a();
	}

	@OriginalMember(owner = "client!aai", name = "l", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method977(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1119(arg1, arg2);
		this.anInt92 = arg0;
	}

	@OriginalMember(owner = "client!aai", name = "u", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method980(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1119(arg1, arg2);
		this.anInt92 = arg0;
	}
}
