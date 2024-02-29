package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adt")
public class Class81_Sub2 extends Class81 implements Interface15 {

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!aeq;I[BIZ)V", line = 6)
	Class81_Sub2(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!adt", name = "p", descriptor = "()I", line = 10)
	@Override
	public int method1833() {
		return this.anInt303;
	}

	@OriginalMember(owner = "client!adt", name = "l", descriptor = "()I", line = 10)
	@Override
	public int method1834() {
		return this.anInt303;
	}

	@OriginalMember(owner = "client!adt", name = "w", descriptor = "()J", line = 14)
	@Override
	public long method1836() {
		return 0L;
	}

	@OriginalMember(owner = "client!adt", name = "c", descriptor = "()J", line = 14)
	@Override
	public long method1831() {
		return 0L;
	}

	@OriginalMember(owner = "client!adt", name = "y", descriptor = "()J", line = 14)
	@Override
	public long method1835() {
		return 0L;
	}

	@OriginalMember(owner = "client!adt", name = "j", descriptor = "()V", line = 18)
	@Override
	void method1829() {
		this.aClass86_Sub3_18.method6152(this);
	}

	@OriginalMember(owner = "client!adt", name = "k", descriptor = "()V", line = 18)
	@Override
	void method1830() {
		this.aClass86_Sub3_18.method6152(this);
	}

	@OriginalMember(owner = "client!adt", name = "v", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1832(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1822(arg0, arg1);
	}

	@OriginalMember(owner = "client!adt", name = "t", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1837(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1822(arg0, arg1);
	}

	@OriginalMember(owner = "client!adt", name = "q", descriptor = "(I[BI)V", line = 22)
	@Override
	public void method1838(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1822(arg0, arg1);
	}
}
