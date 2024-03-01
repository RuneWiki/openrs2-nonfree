package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alb")
public class Class45_Sub1_Sub1 extends Class45_Sub1 {

	@OriginalMember(owner = "client!alb", name = "t", descriptor = "[B")
	byte[] aByteArray43;

	@OriginalMember(owner = "client!alb", name = "<init>", descriptor = "()V", line = 105)
	Class45_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!alb", name = "aj", descriptor = "(III)[B", line = 109)
	byte[] method18049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray43 = new byte[arg0 * arg1 * arg2 * 2];
		this.method18246(arg0, arg1, arg2);
		return this.aByteArray43;
	}

	@OriginalMember(owner = "client!alb", name = "as", descriptor = "(III)[B", line = 109)
	byte[] method18050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray43 = new byte[arg0 * arg1 * arg2 * 2];
		this.method18246(arg0, arg1, arg2);
		return this.aByteArray43;
	}

	@OriginalMember(owner = "client!alb", name = "aa", descriptor = "(IB)V", line = 115)
	@Override
	void method18277(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray43[local10] = -1;
		this.aByteArray43[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!alb", name = "ah", descriptor = "(IB)V", line = 115)
	@Override
	void method18275(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray43[local10] = -1;
		this.aByteArray43[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!alb", name = "an", descriptor = "(IB)V", line = 115)
	@Override
	void method18276(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray43[local10] = -1;
		this.aByteArray43[local11] = (byte) (local7 * 3 >> 5);
	}
}
