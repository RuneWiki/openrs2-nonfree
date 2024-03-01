package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aau")
public class Class9_Sub2 extends Class9 implements Interface7 {

	@OriginalMember(owner = "client!aau", name = "<init>", descriptor = "(Lclient!abt;I[BI)V", line = 6)
	Class9_Sub2(@OriginalArg(0) Class21_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!aau", name = "p", descriptor = "()I", line = 10)
	@Override
	public int method1129() {
		return 0;
	}

	@OriginalMember(owner = "client!aau", name = "h", descriptor = "()I", line = 10)
	@Override
	public int method1124() {
		return 0;
	}

	@OriginalMember(owner = "client!aau", name = "x", descriptor = "()I", line = 10)
	@Override
	public int method1125() {
		return 0;
	}

	@OriginalMember(owner = "client!aau", name = "l", descriptor = "()I", line = 10)
	@Override
	public int method1126() {
		return 0;
	}

	@OriginalMember(owner = "client!aau", name = "s", descriptor = "()I", line = 10)
	@Override
	public int method1130() {
		return 0;
	}

	@OriginalMember(owner = "client!aau", name = "a", descriptor = "()J", line = 14)
	@Override
	public long method1121() {
		return this.aBuffer3.a();
	}

	@OriginalMember(owner = "client!aau", name = "u", descriptor = "()J", line = 14)
	@Override
	public long method1123() {
		return this.aBuffer3.a();
	}

	@OriginalMember(owner = "client!aau", name = "q", descriptor = "()J", line = 14)
	@Override
	public long method1127() {
		return this.aBuffer3.a();
	}

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1120(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1119(arg0, arg1);
	}

	@OriginalMember(owner = "client!aau", name = "g", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1122(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1119(arg0, arg1);
	}

	@OriginalMember(owner = "client!aau", name = "v", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1128(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1119(arg0, arg1);
	}

	@OriginalMember(owner = "client!aau", name = "t", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1131(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1119(arg0, arg1);
	}

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "(I[BI)V", line = 18)
	@Override
	public void method1132(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method1119(arg0, arg1);
	}
}
