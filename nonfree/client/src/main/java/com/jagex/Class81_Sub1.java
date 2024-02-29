package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!adr")
public class Class81_Sub1 extends Class81 implements Interface14 {

	@OriginalMember(owner = "client!adr", name = "d", descriptor = "I")
	int anInt296;

	@OriginalMember(owner = "client!adr", name = "<init>", descriptor = "(Lclient!aeq;I[BIZ)V", line = 10)
	Class81_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt296 = arg1;
	}

	@OriginalMember(owner = "client!adr", name = "<init>", descriptor = "(Lclient!aeq;ILclient!jaclib/memory/Buffer;IZ)V", line = 15)
	Class81_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt296 = arg1;
	}

	@OriginalMember(owner = "client!adr", name = "p", descriptor = "()I", line = 20)
	@Override
	public int method1787() {
		return this.anInt303;
	}

	@OriginalMember(owner = "client!adr", name = "y", descriptor = "()I", line = 20)
	@Override
	public int method1786() {
		return this.anInt303;
	}

	@OriginalMember(owner = "client!adr", name = "w", descriptor = "()I", line = 20)
	@Override
	public int method1788() {
		return this.anInt303;
	}

	@OriginalMember(owner = "client!adr", name = "c", descriptor = "()I", line = 24)
	@Override
	public int method1783() {
		return this.anInt296;
	}

	@OriginalMember(owner = "client!adr", name = "t", descriptor = "()I", line = 24)
	@Override
	public int method1792() {
		return this.anInt296;
	}

	@OriginalMember(owner = "client!adr", name = "q", descriptor = "()I", line = 24)
	@Override
	public int method1789() {
		return this.anInt296;
	}

	@OriginalMember(owner = "client!adr", name = "v", descriptor = "()J", line = 28)
	@Override
	public long method1784() {
		return 0L;
	}

	@OriginalMember(owner = "client!adr", name = "x", descriptor = "()J", line = 28)
	@Override
	public long method1790() {
		return 0L;
	}

	@OriginalMember(owner = "client!adr", name = "j", descriptor = "()V", line = 32)
	@Override
	void method1829() {
		this.aClass86_Sub3_18.method6148(this);
	}

	@OriginalMember(owner = "client!adr", name = "k", descriptor = "()V", line = 32)
	@Override
	void method1830() {
		this.aClass86_Sub3_18.method6148(this);
	}

	@OriginalMember(owner = "client!adr", name = "d", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1822(arg1, arg2);
		this.anInt296 = arg0;
	}

	@OriginalMember(owner = "client!adr", name = "l", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method1785(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1822(arg1, arg2);
		this.anInt296 = arg0;
	}

	@OriginalMember(owner = "client!adr", name = "s", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1822(arg1, arg2);
		this.anInt296 = arg0;
	}

	@OriginalMember(owner = "client!adr", name = "r", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1822(arg1, arg2);
		this.anInt296 = arg0;
	}

	@OriginalMember(owner = "client!adr", name = "g", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method1782(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1822(arg1, arg2);
		this.anInt296 = arg0;
	}

	@OriginalMember(owner = "client!adr", name = "z", descriptor = "(I[BI)V", line = 36)
	@Override
	public void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1822(arg1, arg2);
		this.anInt296 = arg0;
	}
}
