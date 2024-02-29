package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adh")
public class Class74_Sub2 extends Class74 implements Interface15 {

	@OriginalMember(owner = "client!adh", name = "<init>", descriptor = "(Lclient!aeq;I[BI)V", line = 6)
	Class74_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!adh", name = "p", descriptor = "()I", line = 10)
	@Override
	public int method1833() {
		return 0;
	}

	@OriginalMember(owner = "client!adh", name = "l", descriptor = "()I", line = 10)
	@Override
	public int method1834() {
		return 0;
	}

	@OriginalMember(owner = "client!adh", name = "w", descriptor = "()J", line = 14)
	@Override
	public long method1836() {
		return this.aBuffer3.c();
	}

	@OriginalMember(owner = "client!adh", name = "y", descriptor = "()J", line = 14)
	@Override
	public long method1835() {
		return this.aBuffer3.c();
	}

	@OriginalMember(owner = "client!adh", name = "c", descriptor = "()J", line = 14)
	@Override
	public long method1831() {
		return this.aBuffer3.c();
	}

	@OriginalMember(owner = "client!adh", name = "v", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1832(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1389(arg0, arg1);
	}

	@OriginalMember(owner = "client!adh", name = "t", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1837(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1389(arg0, arg1);
	}

	@OriginalMember(owner = "client!adh", name = "q", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1838(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1389(arg0, arg1);
	}
}
