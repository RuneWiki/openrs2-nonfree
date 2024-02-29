package com.jagex;

import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class Class74_Sub1 extends Class74 implements Interface14 {

	@OriginalMember(owner = "client!ada", name = "v", descriptor = "I")
	int anInt218;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!aeq;I[BI)V", line = 10)
	Class74_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt218 = arg1;
	}

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!aeq;ILclient!jaclib/memory/Buffer;)V", line = 15)
	Class74_Sub1(@OriginalArg(0) Class86_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2) {
		super(arg0, arg2);
		this.anInt218 = arg1;
	}

	@OriginalMember(owner = "client!ada", name = "w", descriptor = "()I", line = 20)
	@Override
	public int method1788() {
		return 0;
	}

	@OriginalMember(owner = "client!ada", name = "y", descriptor = "()I", line = 20)
	@Override
	public int method1786() {
		return 0;
	}

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "()I", line = 20)
	@Override
	public int method1787() {
		return 0;
	}

	@OriginalMember(owner = "client!ada", name = "c", descriptor = "()I", line = 24)
	@Override
	public int method1783() {
		return this.anInt218;
	}

	@OriginalMember(owner = "client!ada", name = "t", descriptor = "()I", line = 24)
	@Override
	public int method1792() {
		return this.anInt218;
	}

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "()I", line = 24)
	@Override
	public int method1789() {
		return this.anInt218;
	}

	@OriginalMember(owner = "client!ada", name = "x", descriptor = "()J", line = 28)
	@Override
	public long method1790() {
		return this.aBuffer3.c();
	}

	@OriginalMember(owner = "client!ada", name = "v", descriptor = "()J", line = 28)
	@Override
	public long method1784() {
		return this.aBuffer3.c();
	}

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method1785(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1389(arg1, arg2);
		this.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1389(arg1, arg2);
		this.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "d", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1389(arg1, arg2);
		this.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "r", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1389(arg1, arg2);
		this.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "g", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method1782(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1389(arg1, arg2);
		this.anInt218 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "z", descriptor = "(I[BI)V", line = 32)
	@Override
	public void method1795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		this.method1389(arg1, arg2);
		this.anInt218 = arg0;
	}
}
